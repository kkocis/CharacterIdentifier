//This creates a class that reads the CSV 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
 
public class ReadCVS extends Globals {
	//http://howtodoinjava.com/core-java/related-concepts/parse-csv-files-in-java/
   		
	//Input file which needs to be parsed (fileToParse), and a hex value to search for (input)
	public static void readFile(String fileToParse, String input){
    {

        BufferedReader fileReader = null;
      
        final String DELIMITER = ",";
        try
        {
            String line = "";
            
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileToParse));
         
            
             //Read the file line by line, searching for the input value
            while ((line = fileReader.readLine()) != null) 
            {
            	
                //Get all tokens available in line
               String[] tokens = line.split(DELIMITER);
               if (line.contains(input)){
            	   
                		alpha=tokens[4];
                	
                }
               
                }
            }
        catch (IOException e) { } 
    }    
		
	}
}