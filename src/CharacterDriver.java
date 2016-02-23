public class CharacterDriver{

  public static void main(String[] args){
    DisplayWindow d = new DisplayWindow();
    CharacterPanel p = new CharacterPanel();
    d.addPanel(p);
    d.showFrame();
  }
}