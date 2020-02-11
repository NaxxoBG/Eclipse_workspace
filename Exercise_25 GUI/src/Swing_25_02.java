import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Swing_25_02
{
   private JFrame frame;

   @SuppressWarnings("unused")
   private final JLabel label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
   private JTextField textX;
   private JTextField textY;


   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            try
            {
               Swing_25_02 window = new Swing_25_02();
               window.frame.setVisible(true);
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
      });
   }

   public Swing_25_02()
   {
      initialize();
   }

   private void initialize()
   {
      frame = new JFrame();
      frame.getContentPane().setForeground(Color.GREEN);
      frame.setBounds(100, 100, 450, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);

      JCheckBox check1 = new JCheckBox("Exit on OK");
      check1.setFont(new Font("Tahoma", Font.BOLD, 13));
      check1.setBounds(22, 70, 125, 36);
      frame.getContentPane().add(check1);

      JCheckBox check2 = new JCheckBox("Exit on Cancel");
      check2.setFont(new Font("Tahoma", Font.BOLD, 13));
      check2.setBounds(22, 110, 125, 36);
      frame.getContentPane().add(check2);

      textX = new JTextField();
      textX.setBounds(210, 77, 47, 22);
      frame.getContentPane().add(textX);
      textX.setColumns(10);

      JLabel labelX = new JLabel("X:");
      labelX.setFont(new Font("Tahoma", Font.BOLD, 13));
      labelX.setBounds(171, 80, 18, 16);
      frame.getContentPane().add(labelX);

      JLabel labelY = new JLabel("Y:");
      labelY.setForeground(SystemColor.desktop);
      labelY.setFont(new Font("Tahoma", Font.BOLD, 13));
      labelY.setEnabled(false);
      labelY.setBounds(171, 120, 18, 16);
      frame.getContentPane().add(labelY);

      textY = new JTextField();
      textY.setBounds(210, 117, 47, 22);
      frame.getContentPane().add(textY);
      textY.setColumns(10);

      JButton btnNewButton = new JButton("OK");
      btnNewButton.setBounds(295, 54, 97, 25);
      frame.getContentPane().add(btnNewButton);

      JButton btnNewButton_1 = new JButton("Cancel");
      btnNewButton_1.setBounds(295, 92, 97, 25);
      frame.getContentPane().add(btnNewButton_1);

      JButton btnNewButton_2 = new JButton("Clear");
      btnNewButton_2.setBounds(295, 130, 97, 25);
      frame.getContentPane().add(btnNewButton_2);
   }
}