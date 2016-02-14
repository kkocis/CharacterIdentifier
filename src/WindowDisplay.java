import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.EventObject;

public class WindowDisplay {
	String getCharacter="d";
public void frame() {
	
	final JTextField characterInput = new JTextField(); //make a text field so that the user can input their character
	
	JLabel characterInLabel = new JLabel ("Enter a character, then press enter:"); // Label the text field with instructions on how to insert a character
	final JLabel characterIn = new JLabel (""); // This is where the character will be displayed
	characterIn.setHorizontalAlignment(JLabel.CENTER); //center the character that is to be displayed
	characterIn.setFont(new Font("Times New Roman", Font.PLAIN, 100));  //display the text reeeally big

	
	JLabel unicodeLabel = new JLabel ("Unicode");//Create and Label a box for the Unicode
	JLabel unicodeIn = new JLabel (""); 
	
	JLabel hexLabel = new JLabel ("Hex"); //Create and Label a box for the hex values
	final JLabel hexIn = new JLabel (""); 
	
	JLabel alphaEntityLabel = new JLabel ("Character Description"); //Create and Label a box for the alpha entity
	JLabel alphaIn = new JLabel (""); 
	
	
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
	f.add(p); // Now we add the panel to the frame.

	characterInput.addActionListener(new ActionListener() {  //add an action listener to the text field
	      public void actionPerformed(ActionEvent e) {   //when the enter key is hit:
	    	  getCharacter= characterInput.getText();	//set the character string equal to the inputed text
	    	  System.out.println(getCharacter);
	    	  characterIn.setText(getCharacter);		//display the input character in the text field 
	        
	      }
	    });

	  }
}	
	
	
/* when text is entered (or button is clicked)
	unicodeIn.setText(unicode);
	hexIn.setText(hex);
	alphaIn.setText(alpha);
	
	
}
} 
*/
	
