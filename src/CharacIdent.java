import java.util.ArrayList;
import java.util.Arrays;

public class CharacIdent extends Globals{
	//public static String getCharacter= new String();
	
	public static void main(String[]args) {
		ReadCVS cvsReader = new ReadCVS();
		SearchReturn searchList = new SearchReturn();
		WindowDisplay window = new WindowDisplay();
		String Hex1 = new String();
		cvsReader.readFile("entityfacts.csv",Hex1);
		

		window.frame();
		
		
		//searchList.getAlpha();
		//searchList.getHex();
		
	}
}