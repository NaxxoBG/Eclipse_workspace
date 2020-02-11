import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Swing_25_01
{
   private JFrame frame;

   @SuppressWarnings("unused")
   private final JLabel label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
   private JTextField textFieldDay;
   private JTextField textFieldMonth;
   private JTextField textFieldYear;

   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            try
            {
               Swing_25_01 window = new Swing_25_01();
               window.frame.setVisible(true);
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
      });
   }


   public Swing_25_01()
   {
      initialize();
   }


   private void initialize()
   {
      frame = new JFrame();
      frame.getContentPane().setLayout(null);

      textFieldDay = new JTextField();
      textFieldDay.setBounds(147, 76, 116, 22);
      frame.getContentPane().add(textFieldDay);
      textFieldDay.setColumns(10);

      textFieldMonth = new JTextField();
      textFieldMonth.setBounds(147, 111, 116, 22);
      frame.getContentPane().add(textFieldMonth);
      textFieldMonth.setColumns(10);

      textFieldYear = new JTextField();
      textFieldYear.setBounds(147, 146, 116, 22);
      frame.getContentPane().add(textFieldYear);
      textFieldYear.setColumns(10);

      JButton btnNewButton = new JButton("Show");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btnNewButton.setBounds(283, 110, 97, 25);
      frame.getContentPane().add(btnNewButton);

      JLabel lblDay = new JLabel("Day:");
      lblDay.setForeground(Color.DARK_GRAY);
      lblDay.setBounds(79, 78, 56, 19);
      frame.getContentPane().add(lblDay);

      JLabel lblMonth = new JLabel("Month:");
      lblMonth.setForeground(Color.DARK_GRAY);
      lblMonth.setBounds(79, 114, 56, 16);
      frame.getContentPane().add(lblMonth);

      JLabel lblYear = new JLabel("Year:");
      lblYear.setForeground(Color.DARK_GRAY);
      lblYear.setBounds(79, 146, 56, 16);
      frame.getContentPane().add(lblYear);
   }
}