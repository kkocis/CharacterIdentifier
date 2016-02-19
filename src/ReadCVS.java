//This creates a class that reads the CSV 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
 
public class ReadCVS extends Globals
{
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
             Scanner scan = new Scanner(System.in);
            
             //Read the file line by line
            while ((line = fileReader.readLine()) != null) 
            {
            	//while (matchFound=null){
            	
                //Get all tokens available in line
               String[] tokens = line.split(DELIMITER);
               if (line.contains(input)){
                	//if(tokens[0].replaceAll("\\s+","").equals(input)){
                	    hex=tokens[1];
                		alpha=tokens[4];
                		//matchFound= true;
                	//}
                System.out.println(line);
                }
               
                }
            }
           // }
        catch (IOException e) { } 
    }    
		
	}
}

//System.out.println("Press enter to see next line " );
//String input = scan.nextLine();