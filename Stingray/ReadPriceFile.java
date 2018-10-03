import java.io.*;

public class ReadPriceFile {
	public static void main(String[] args) {
		// The name of the file to open.
		String asterisk = "*";
		String fileName = "price.txt";
        String directoryName = "/Users/blynch63/Data/";
        String fileDirName =  directoryName + fileName;
        

        // This will reference one line at a time
        //String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileDirName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            boolean eof = false;
            while (!eof)  {
                String line = bufferedReader.readLine();
                if (line == null) {
                	eof = true;
                } else {
                	System.out.println(line);
                	System.out.println(asterisk);
                
                }
                }
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

