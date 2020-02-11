import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Exercise_25_02 extends JFrame
{
   public static void main(String[] args)
   {
      JFrame frame = new Exercise_25_02();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel panel = new JPanel();

      JCheckBox check1 = new JCheckBox("Exit on OK");
      check1.setMnemonic(KeyEvent.VK_C);
      check1.setSelected(true);

      JCheckBox check2 = new JCheckBox("Exit on Cancel");
      check2.setMnemonic(KeyEvent.VK_C);
      check2.setSelected(true);

      frame.add(panel);
      panel.add(check1);
      panel.add(check2);
      frame.pack();

      JLabel x = new JLabel("X:");
      JTextField textX = new JTextField(3);

      JLabel y = new JLabel("Y:");
      JTextField textY = new JTextField(3);
      panel.add(x);
      panel.add(textX);
      panel.add(y);
      panel.add(textY);

      JButton ok = new JButton("OK");
      JButton cancel = new JButton("Cancel");
      JButton clear = new JButton("Clear");

      Box buttonPanel = new Box(BoxLayout.Y_AXIS);

      buttonPanel.add(ok);
      buttonPanel.add(cancel);
      buttonPanel.add(clear);

      frame.add(buttonPanel, BorderLayout.EAST);
      frame.pack();
   }
}