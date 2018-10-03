import java.io.*;
//import java.util.*;
//Custom Package
//import Prices.*;



public class ReadandParsePriceFile {
	public static void main(String[] args) {
		// The name of the file to open.
				//String asterisk = "*";
				String fileName = "price.txt";
		        String directoryName = "/Users/blynch63/Data/";
		        String fileDirName =  directoryName + fileName;
		        String cvsSplitBy = ",";

		        //Set Value in an instance of the PriceData class
		       //PriceData myPriceData = new PriceData();
		       //myPriceData.setPriceDate(asterisk);
		       //myPriceData.setOpenPrice(100.25);
		       //myPriceData.setHighPrice(105.0125);
		       //myPriceData.setLowPrice(90.7500);
		       //myPriceData.setClosePrice(101.25);
		       
		       //Get values form an instance of the Price Data class
		       //System.out.println("Date=" + myPriceData.getPriceDate());
		       //System.out.println("Open=" + myPriceData.getOpenPrice());
		       //System.out.println("High=" + myPriceData.getHighPrice());
		       //System.out.println("Low=" + myPriceData.getLowPrice());
		       //System.out.println("Close=" + myPriceData.getClosePrice());
		       
		       
		    	
		        // Create Object for a Price Record
		        //PriceRecord myPriceRecord = new PriceRecord ();

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
		                	String[] prices = line.split(cvsSplitBy);
		                	
		                	System.out.println("Date=" + prices[0] + ",open=" + prices[1] + ",high=" + prices[2] + ",low=" + prices[3] + ",close=" + prices[4] );
		             //PriceRecord.add(new Prices.PriceData("test", 1.0, 2.0, 3.0, 4.0));
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

