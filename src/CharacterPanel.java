import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CharacterPanel extends JPanel implements ActionListener
{	
	  
	JLabel characterInLabel = new JLabel ("Enter a character, then press enter:"); // Label the text field with instructions on how to insert a character
	JLabel unicodeLabel = new JLabel ("Unicode:");//Create and Label a box for the Unicode
	JLabel hex8Label = new JLabel ("Hex UTF 8:"); //Create and Label a box for the hex UTF8 values
	JLabel hex16Label = new JLabel ("Hex UTF 16:"); //Create and Label a box for the hex UTF16 values
	JLabel javacodeLabel = new JLabel ("Java Code:");//Create and Label a box for the Unicode
	JLabel alphaEntityLabel = new JLabel ("Character Description:"); //Create and Label a box for the alpha entity
	JLabel emptyspace = new JLabel (""); //This creates an empty space, so the GUI looks nice.

	JTextField characterInput = new JTextField(); //make a text field so that the user can input their character
	JLabel characterIn = new JLabel (""); // This is where the character will be displayed
	JLabel unicodeIn = new JLabel (""); 
	JLabel hex8In = new JLabel (""); 
	JLabel hex16In = new JLabel (""); 
	JLabel javacodeIn = new JLabel (""); 
	JLabel alphaIn = new JLabel (""); 
	
	//Define Strings that will be used by all classes
	public static String hex = new String();
	public static String alpha= new String();
	public static String alphaReplace= new String();
	public static String hex8Out= new String();
	public static String hex16Out= new String();
	public static String inputHex= new String();
	public static String getInput= new String();
	
	public CharacterPanel()
	{
		GridLayout layout= new GridLayout(0,2);
		this.setLayout(layout);
		
		characterIn.setHorizontalAlignment(JLabel.CENTER); //center the character that is to be displayed
		characterIn.setFont(new Font("Times New Roman", Font.PLAIN, 100));  //display the text reeeally big
		
		this.add(characterInLabel); // On the panel, we add the different features (JLabel, JComboBox, JButton, etc.)
		this.add(characterInput);
		this.add(characterIn);
		this.add(emptyspace);
		this.add(unicodeLabel);
		this.add(unicodeIn);
		this.add(hex8Label);
		this.add(hex8In);
		this.add(hex16Label);
		this.add(hex16In);
		this.add(alphaEntityLabel);
		this.add(alphaIn);
		this.add(javacodeLabel);
		this.add(javacodeIn);
	
		characterInput.addActionListener(this);

		
		//this is where you add it to the screen and add action listeners 
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
			getInput= characterInput.getText();	//set the character string equal to the inputed text
		   	
		    //in case user inputs multiple characters, pull just the first one
		   	String firstCharacter= String.valueOf(getInput.charAt(0));
		   	  
		   	//Display the first Character that the user input very large
		   	characterIn.setText(firstCharacter);
		   	  
		   	 //convert from string to char
		   	 char first = firstCharacter.charAt(0);
	
			//take in the char, return its hex value
		   	 inputHex = Integer.toHexString(first);
		   	  
		   	//display the hex information about the character in the window
		   	//properly format the hex and unicode information
		   	  if (inputHex.length()==2){
		   		  hex8Out = "0x"+inputHex;
		   		  hex16Out = "0x00"+inputHex;
		   		  unicodeIn.setText("U+00"+inputHex);
		   		  javacodeIn.setText("'u\'00" + inputHex);  // This is supposed to display the java source code, but it is not printing out the \
		   	  }
		   	  if (inputHex.length()==4){
		   		  hex8Out = "0x"+inputHex;
		   		  hex16Out = "0x"+inputHex;
		   		  unicodeIn.setText("U+ "+inputHex);
		   		  javacodeIn.setText("''u''" + inputHex);// This is supposed to display the java source code, but it is not printing out the \
		   	  }
		   	  
		   	 //set the JLabels equal to the important, found information
		   	  hex8In.setText(hex8Out);
		   	  hex16In.setText(hex16Out);
		   	  
		   	//ReadCVS cvsReader = new ReadCVS();
			ReadCVS.readFile("entityfacts.csv",inputHex);  
		   	alphaIn.setText(alphaReplace);
	}
}
		   	  
	