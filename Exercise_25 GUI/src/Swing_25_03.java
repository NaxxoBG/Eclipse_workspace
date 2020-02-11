import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Swing_25_03
{
   private JFrame frame;
   private JTextField textField;

   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            try
            {
               Swing_25_03 window = new Swing_25_03();
               window.frame.setVisible(true);
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
      });
   }


   public Swing_25_03()
   {
      initialize();
   }


   private void initialize()
   {
      frame = new JFrame();
      frame.setBounds(100, 100, 512, 600);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      textField = new JTextField();
      textField.setBounds(0, 0, 494, 59);
      frame.getContentPane().add(textField);
      textField.setColumns(10);
      
      JButton btnNewButton = new JButton("7");
      btnNewButton.setBounds(0, 57, 125, 125);
      frame.getContentPane().add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton(".");
      btnNewButton_1.setBounds(124, 428, 125, 125);
      frame.getContentPane().add(btnNewButton_1);
      
      JButton btnNewButton_2 = new JButton("-");
      btnNewButton_2.setBounds(369, 303, 125, 125);
      frame.getContentPane().add(btnNewButton_2);
      
      JButton btnNewButton_3 = new JButton("2");
      btnNewButton_3.setBounds(124, 303, 125, 125);
      frame.getContentPane().add(btnNewButton_3);
      
      JButton button = new JButton("4");
      button.setBounds(0, 179, 125, 125);
      frame.getContentPane().add(button);
      
      JButton button_1 = new JButton("1");
      button_1.setBounds(0, 303, 125, 125);
      frame.getContentPane().add(button_1);
      
      JButton button_2 = new JButton("0");
      button_2.setBounds(0, 428, 125, 125);
      frame.getContentPane().add(button_2);
      
      JButton button_3 = new JButton("8");
      button_3.setBounds(124, 57, 125, 125);
      frame.getContentPane().add(button_3);
      
      JButton button_4 = new JButton("9");
      button_4.setBounds(246, 57, 125, 125);
      frame.getContentPane().add(button_4);
      
      JButton button_5 = new JButton("5");
      button_5.setBounds(124, 179, 125, 125);
      frame.getContentPane().add(button_5);
      
      JButton button_6 = new JButton("+");
      button_6.setBounds(369, 428, 125, 125);
      frame.getContentPane().add(button_6);
      
      JButton button_7 = new JButton("6");
      button_7.setBounds(246, 179, 125, 125);
      frame.getContentPane().add(button_7);
      
      JButton button_8 = new JButton("*");
      button_8.setBounds(369, 179, 125, 125);
      frame.getContentPane().add(button_8);
      
      JButton button_9 = new JButton("=");
      button_9.setBounds(246, 428, 125, 125);
      frame.getContentPane().add(button_9);
      
      JButton button_10 = new JButton("/");
      button_10.setBounds(369, 57, 125, 125);
      frame.getContentPane().add(button_10);
      
      JButton button_11 = new JButton("3");
      button_11.setBounds(246, 303, 125, 125);
      frame.getContentPane().add(button_11);
   }
}