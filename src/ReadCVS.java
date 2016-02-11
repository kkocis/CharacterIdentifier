import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 
public class ReadCVS
{
	//http://howtodoinjava.com/core-java/related-concepts/parse-csv-files-in-java/
    public void readFile(){
    {
    	//Input file which needs to be parsed
        String fileToParse = "entityfacts.csv";
        BufferedReader fileReader = null;
         
        //Delimiter used in CSV file
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
            	//System.out.println("Press enter to see next line " );
            	//String input = scan.nextLine();
                //Get all tokens available in line
                String[] tokens = line.split(DELIMITER);
                System.out.println(Arrays.toString(tokens));
           
                }
            }
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally
        {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
}