import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchReturn extends Globals {

	public void getAlpha(){
		//String convertAlpha=alpha.trim();
		//String convertAlpha= alpha.indexOf("//w,"");
		//String convertAlpha=alpha.replaceAll("//W", "");
		System.out.println(alpha);	
	}
	
	public String getHex(char enterCharacter){	
		//take in the character, return its hex value
			String inputHex = Integer.toHexString(enterCharacter);
			System.out.println(inputHex);
			return inputHex;
			//hexIn.setText("0x00"+inputHex);  //display the hex information about the character in the window
		  // 	unicodeIn.setText("U+" + inputHex); //display the unicode information about the character in the window


	}
	
}

//System.out.println(listReturn.get(0));
//String DELIMITER = ",";
//	String[] tokens= lineIn.split(DELIMITER);
//System.out.println(listReturn.get(0));
//String lineIn = listReturn.get(0);
//String[] tokens = lineIn.split(",", 1);
//String getTokens= (String) listReturn.get(0);
//(listReturn.get(0)).toString();
//System.out.println(listReturn);
	//System.out.println(line.indexOf("input"));
//listReturn.add(line);
  //line.indexOf("input");  
 // System.out.println(tokens[0]);
//Arrays.toString(listReturn.get(0));
  //System.out.println(Arrays.toString(tokens));
//System.out.println(listReturn);
  // System.out.print(listReturn.size());
   //listReturn.add(tokens[0]);
//public static void getAlpha(ArrayList arrayin){
	//System.out.println(arrayin);