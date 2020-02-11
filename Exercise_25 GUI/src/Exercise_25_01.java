import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Exercise_25_01 extends JFrame
{
   public static void main(String[] args)
   {
      JFrame frame = new Exercise_25_01();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel panel = new JPanel();
      JLabel date = new JLabel("Date: ");
      JLabel day = new JLabel("Day");
      JLabel month = new JLabel("Month");

      JLabel year = new JLabel("Year");

      JTextField textDay = new JTextField();
      textDay.setColumns(5);

      JTextField textMonth = new JTextField(5);

      JTextField textYear = new JTextField(5);
      JButton show = new JButton("Show");

      panel.add(date);
      panel.add(day);
      panel.add(textDay);
      panel.add(month);
      panel.add(textMonth);
      panel.add(year);
      panel.add(textYear);
      panel.add(show);
      frame.add(panel);
      frame.pack();
   }
}