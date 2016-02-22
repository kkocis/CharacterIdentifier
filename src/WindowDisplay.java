import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WindowDisplay extends Globals implements ActionListener{

	
public void frame() {
	
	characterIn.setHorizontalAlignment(JLabel.CENTER); //center the character that is to be displayed
	characterIn.setFont(new Font("Times New Roman", Font.PLAIN, 100));  //display the text reeeally big
	
	JLabel characterInLabel = new JLabel ("Enter a character, then press enter:"); // Label the text field with instructions on how to insert a character
	JLabel unicodeLabel = new JLabel ("Unicode:");//Create and Label a box for the Unicode
	JLabel hex8Label = new JLabel ("Hex UTF 8:"); //Create and Label a box for the hex UTF8 values
	JLabel hex16Label = new JLabel ("Hex UTF 16:"); //Create and Label a box for the hex UTF16 values
	JLabel javacodeLabel = new JLabel ("Java Code:");//Create and Label a box for the Unicode
	JLabel alphaEntityLabel = new JLabel ("Character Description:"); //Create and Label a box for the alpha entity
	
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
	p.add(hex8Label);
	p.add(hex8In);
	p.add(hex16Label);
	p.add(hex16In);
	p.add(alphaEntityLabel);
	p.add(alphaIn);
	p.add(javacodeLabel);
	p.add(javacodeIn);
	f.add(p); // Now we add the panel to the frame.
	
	characterInput.addActionListener(this);
	     
}

public void actionPerformed(ActionEvent e) { 
	 SearchReturn searchInformation= new SearchReturn();
	 searchInformation.getText();
	 searchInformation.getInformation();
	 searchInformation.searchCSV();
}



}
