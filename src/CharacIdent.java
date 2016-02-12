import java.util.Arrays;

public class CharacIdent {
	public static void main(String[]args) {
		ReadCVS cvsReader = new ReadCVS();
		WindowDisplay window = new WindowDisplay();
		
		cvsReader.readFile("entityfacts.csv");
		window.frame();
		//System.out.println(Arrays.toString(tokens));
	}

}
