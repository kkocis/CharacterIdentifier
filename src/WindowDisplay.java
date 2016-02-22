import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WindowDisplay extends Globals {

public void frame() {
	
	final JTextField characterInput = new JTextField(); //make a text field so that the user can input their character
	
	JLabel characterInLabel = new JLabel ("Enter a character, then press enter:"); // Label the text field with instructions on how to insert a character
	final JLabel characterIn = new JLabel (""); // This is where the character will be displayed
	characterIn.setHorizontalAlignment(JLabel.CENTER); //center the character that is to be displayed
	characterIn.setFont(new Font("Times New Roman", Font.PLAIN, 100));  //display the text reeeally big
	
	JLabel unicodeLabel = new JLabel ("Unicode:");//Create and Label a box for the Unicode
	final JLabel unicodeIn = new JLabel (""); 
	
	JLabel hexLabel = new JLabel ("Hex UTF 16:"); //Create and Label a box for the hex values
	final JLabel hexIn = new JLabel (""); 
	
	JLabel javacodeLabel = new JLabel ("Java Code:");//Create and Label a box for the Unicode
	final JLabel javacodeIn = new JLabel (""); 
	
	JLabel alphaEntityLabel = new JLabel ("Character Description:"); //Create and Label a box for the alpha entity
	final JLabel alphaIn = new JLabel (""); 
	
	
	JLabel emptyspace = new JLabel (""); //This creates an empty space, so the GUI looks nice.
	
	JFrame f = new JFrame();
	f.setVisible(true); // The pop up window is now visible.
	f.setSize(700,500); // The pop up window has these dimensions.
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //The pop up window can be closed now by clicking close.
	
	JPanel p = new JPanel(new GridLayout(0,2)); //We must make a panel. The Gridlayout allows us to organize the features in two columns.
	p.add(characterInLabel); // On the panel, we add the different features (JLabel, JComboBox, JButton, etc.)
	p.add(characterInput);
	p.add(characterIn);
	p.add(emptyspace);
	p.add(unicodeLabel);
	p.add(unicodeIn);
	p.add(hexLabel);
	p.add(hexIn);
	p.add(alphaEntityLabel);
	p.add(alphaIn);
	p.add(javacodeLabel);
	p.add(javacodeIn);
	f.add(p); // Now we add the panel to the frame.

	characterInput.addActionListener(new ActionListener(){  //add an action listener to the text field
	      public void actionPerformed(ActionEvent e) {   //when the enter key is hit:
	    	 
	    	  getInput= characterInput.getText();	//set the character string equal to the inputed text
	    	  //characterIn.setText(getInput);	//display the input character in the text field 
	    	  
	    	  //in case user inputs multiple characters, pull just the first one
	    	  String firstCharacter= String.valueOf(getInput.charAt(0));
	    	  
	    	  //Display the first Character that the user input very large
	    	  characterIn.setText(firstCharacter);
	    	  
	    	  //convert from string to char
	    	  char first = firstCharacter.charAt(0);
	    	  
	    	  //take in the character, return its hex value
	    	  inputHex = Integer.toHexString(first);
	    	  
	    	//display the hex information about the character in the window
	    	//properly format the hex and unicode information
	    	  if (inputHex.length()==2){
	    		  hexOut = "0x00"+inputHex;
	    		  unicodeIn.setText("U+00"+inputHex);
	    	  }
	    	  if (inputHex.length()==4){
	    		  hexOut = "0x"+inputHex;
	    		  unicodeIn.setText("U+ "+inputHex);
	    	  }
	  
	    	  ReadCVS cvsReader = new ReadCVS();
	    	  cvsReader.readFile("entityfacts.csv", hexOut);
	    	  
	    	  hexIn.setText(hexOut);
	    	  alphaIn.setText(alpha);


	      }
	    });
	  }
}	

	
