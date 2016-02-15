import java.util.ArrayList;
import java.util.Arrays;

public class CharacIdent extends Globals{
	//public static String getCharacter= new String();
	
	public static void main(String[]args) {
		ReadCVS cvsReader = new ReadCVS();
		SearchReturn searchList = new SearchReturn();
		WindowDisplay window = new WindowDisplay();
		
		cvsReader.readFile("entityfacts.csv","0x20a4");

		System.out.println(inputHex);

		window.frame();
		
		
		//searchList.getAlpha();
		//searchList.getHex();
		
	
		
	}

}
