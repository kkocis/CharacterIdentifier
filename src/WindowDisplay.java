import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;

public class WindowDisplay {
	
public void frame() {
	
	JTextField sampleText = new JTextField(); // This makes a text field, where the user can some sample text they want to test their options with
	JLabel sampleText_q = new JLabel ("Enter some sample text here:"); // This displays text, we ask questions with this.

	JLabel unicodeLabel = new JLabel ("Unicode");// Label the Desired Box
	JLabel hexLabel = new JLabel ("Hex");// Label the Desired Box
	JLabel alphaEntityLabel = new JLabel ("Character Description");// Label the Desired Box
	
	JButton selectOptions = new JButton("Select Options"); // This creates a button.
	
	//JLabel emptyspace = new JLabel (""); //This creates an empty space, so the GUI looks nice.
	
	JFrame f = new JFrame();
	f.setVisible(true); // The pop up window is now visible.
	f.setSize(700,500); // The pop up window has these dimensions.
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //The pop up window can be closed now by clicking close.
	
	JPanel p = new JPanel(new GridLayout(0,2)); //We must make a panel. The Gridlayout allows us to organize the features in two columns.
	p.add(sampleText_q); // On the panel, we add the different features (JLabel, JComboBox, JButton, etc.)
	p.add(sampleText);
	p.add(unicodeLabel);
	p.add(hexLabel);
	p.add(alphaEntityLabel);
	p.add(selectOptions);
	f.add(p); // Now we add the panel to the frame.

}
}

