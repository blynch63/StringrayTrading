import java.io.*;

public class Stingray {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "temp.txt";
        String directoryName = "/Users/blynch63/Data/";
        String fileDirName =  directoryName + fileName;
        

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileDirName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileDirName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileDirName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
