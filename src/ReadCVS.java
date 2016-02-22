//This creates a class that reads the CSV 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCVS extends Globals {
	//http://howtodoinjava.com/core-java/related-concepts/parse-csv-files-in-java/
   		
	//Input file which needs to be parsed (fileToParse), and a hex value to search for (input)
	public static void readFile(String fileToParse, String input){
    {

        BufferedReader fileReader = null;
      
        final String DELIMITER = ",";  //Split up the line based on commas
        try
        {
            String line = "";  //take in a string
            
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileToParse));
         
            
             //Read the file line by line, searching for the input value
            while ((line = fileReader.readLine()) != null) 
            {
            	
                //Get all tokens available in line
               String[] tokens = line.split(DELIMITER);
              
               //search for where the line contains the input hex value
             if (line.contains(input)){ 
            	 //the hex value is located as the second value in the String array tokens  
            	 hex = tokens[1];
            	 //if the hex value in the csv file ends with the input hex value, then set alpha equal to the fourth value in the string array and trim extra characters            	 
            	   if (hex.endsWith("0x"+input)){
                	alpha=tokens[4];
                	alphaReplace = alpha.replace("\"", "");
            	   }
              }
               
                }
            }
        catch (IOException e) { } 
    }    
		
	}
}