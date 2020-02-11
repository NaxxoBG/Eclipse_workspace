
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class DateGUITeacher extends JFrame implements ActionListener
{
   private JTextField textFieldDay;
   private JTextField textFieldMonth;
   private JTextField textFieldYear;
   private JLabel labelDay;
   private JLabel labelMonth;
   private JLabel labelYear;
   private JButton buttonShow;
   private JLabel labelOutput;

   public DateGUITeacher()
   {
      createComponents();
      initializeComponents();
      registerEventHandlers();
      addComponentsToFrame();
   }

   private void registerEventHandlers()
   {

      //Your implementation here. (Hint: attach an instance of this class as the Action Listener to the the JButton "buttonShow")

   }

   private void initializeComponents()
   {
      setSize(340, 180); // set frame size
      setLocationRelativeTo(null); // center of the screen
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
   }

   private void createComponents()
   {
      textFieldDay = new JTextField(10);
      textFieldMonth = new JTextField(10);
      textFieldYear = new JTextField(10);
      labelDay = new JLabel("Day");
      labelMonth = new JLabel("Month");
      labelYear = new JLabel("Year");
      buttonShow = new JButton("Show");
      labelOutput = new JLabel("Date: ");
   }

   private void addComponentsToFrame()
   {
      JPanel panelDay = new JPanel(new BorderLayout());
      panelDay.add(textFieldDay, BorderLayout.EAST);
      panelDay.add(labelDay, BorderLayout.WEST);
      JPanel panelMonth = new JPanel(new BorderLayout());
      panelMonth.add(textFieldMonth, BorderLayout.EAST);
      panelMonth.add(labelMonth, BorderLayout.WEST);
      JPanel panelYear = new JPanel(new BorderLayout());
      panelYear.add(textFieldYear, BorderLayout.EAST);
      panelYear.add(labelYear, BorderLayout.WEST);
      JPanel panelDate = new JPanel(new GridLayout(3, 1, 5, 5));
      panelDate.add(panelDay);
      panelDate.add(panelMonth);
      panelDate.add(panelYear);

      JPanel panelSelect = new JPanel(new BorderLayout(0, 5));
      panelSelect.add(buttonShow, BorderLayout.SOUTH);

      JPanel panelOutput = new JPanel(new FlowLayout());
      panelOutput.add(panelDate);
      panelOutput.add(panelSelect);

      JPanel contentPane = new JPanel(new BorderLayout());
      contentPane.add(panelOutput, BorderLayout.CENTER);
      contentPane.add(labelOutput, BorderLayout.NORTH);

      setContentPane(contentPane);
   }

   public void actionPerformed(ActionEvent arg0)
   {

      //Your implementation here. (Hint: Specify what to do when the "buttonShow" is pressed.

   }

   public static void main(String[] args)
   {
      DateGUITeacher start = new DateGUITeacher();
      start.setVisible(true);
   }
}