public class SearchReturn extends Globals {

	public char getText(){
		 getInput= characterInput.getText();	//set the character string equal to the inputed text
	   	  //characterIn.setText(getInput);	//display the input character in the text field 
	   	  
	   	  //in case user inputs multiple characters, pull just the first one
	   	  String firstCharacter= String.valueOf(getInput.charAt(0));
	   	  
	   	  //Display the first Character that the user input very large
	   	  characterIn.setText(firstCharacter);
	   	  
	   	  //convert from string to char
	   	  char first = firstCharacter.charAt(0);
	   	  return first;
	 }
	 
	 public void getInformation(){
		 //take in the character that is returned in getText(), return its hex value
	   	  inputHex = Integer.toHexString(getText());
	   	  
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
	   	  alphaIn.setText(alphaReplace);
	 }
	   	  
	  public void searchCSV(){
	   	  //take in the input hex value, search through the csv file to get out its character description
		  ReadCVS cvsReader = new ReadCVS();
	   	  cvsReader.readFile("entityfacts.csv", inputHex);  
	  }
}
