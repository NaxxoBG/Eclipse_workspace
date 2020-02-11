import javax.swing.JFrame;

public class Snowman
{
   public static void main(String[] args) {
      JFrame frame = new JFrame("Snowman");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.getContentPane().add(new SnowmanPanel());
      frame.pack();
      frame.setVisible(true); 
   }
}