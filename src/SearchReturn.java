import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchReturn extends Globals {

	public static void getAlpha(){
		//String convertAlpha=alpha.trim();
		//String convertAlpha= alpha.indexOf("//w,"");
		//String convertAlpha=alpha.replaceAll("//W", "");
		System.out.println(alpha);	
	}
	
	public static void getHex(char enterCharacter){	
		//take in the character, return its hex value
			String hex1 = String.format("%04x", (int) enterCharacter);
			System.out.println(hex1);

	}
	
}
