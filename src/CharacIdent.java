import java.util.ArrayList;
import java.util.Arrays;

public class CharacIdent {
	public static void main(String[]args) {
		ReadCVS cvsReader = new ReadCVS();
		SearchReturn searchList = new SearchReturn();
		WindowDisplay window = new WindowDisplay();
		
		cvsReader.readFile("entityfacts.csv","0x20a4");

		searchList.getAlpha();
		searchList.getHex();
		
		window.frame();
	}

}
