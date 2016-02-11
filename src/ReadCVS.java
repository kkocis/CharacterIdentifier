import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
 
public class ReadCVS
{
    public static void main(String[] args)
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
             
            //Read the file line by line
            while ((line = fileReader.readLine()) != null) 
            {
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



/*
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadCVS {

	public static void main(String[] args) {
		try {
			
			ReadCVS characterStuff = new ReadCVS("entityfacts.csv");
		
			characterStuff.readHeaders();

			while (entityfacts.readRecord())
			{
				String productID = products.get("ProductID");
				String productName = products.get("ProductName");
				String supplierID = products.get("SupplierID");
				String categoryID = products.get("CategoryID");
				String quantityPerUnit = products.get("QuantityPerUnit");
				String unitPrice = products.get("UnitPrice");
				String unitsInStock = products.get("UnitsInStock");
				String unitsOnOrder = products.get("UnitsOnOrder");
				String reorderLevel = products.get("ReorderLevel");
				String discontinued = products.get("Discontinued");
				
				// perform program logic here
				System.out.println(productID + ":" + productName);
			}
	
			products.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
*/
