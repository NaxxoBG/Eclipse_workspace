import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DateGUI
{

   private JFrame frame;
   private JTextField textFieldDay;
   private JTextField textFieldYear;
   private JTextField textFieldMonth;
   private JTextField textFieldDate;
   private JButton btnStepForward;
   private MyDate date = new MyDate();

   /**
    * Launch the application.
    */
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            try
            {
               DateGUI window = new DateGUI();
               window.frame.setVisible(true);
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public DateGUI()
   {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize()
   {
      frame = new JFrame();
      frame.setBounds(100, 100, 450, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);

      JLabel lblDay = new JLabel("Day:");
      lblDay.setBounds(71, 52, 33, 16);
      frame.getContentPane().add(lblDay);

      JLabel lblMonth = new JLabel("Month:");
      lblMonth.setBounds(71, 81, 40, 16);
      frame.getContentPane().add(lblMonth);

      JLabel lblYear = new JLabel("Year:");
      lblYear.setBounds(71, 110, 33, 16);
      frame.getContentPane().add(lblYear);

      textFieldDay = new JTextField();
      textFieldDay.setBounds(127, 49, 69, 22);
      frame.getContentPane().add(textFieldDay);
      textFieldDay.setColumns(10);

      textFieldYear = new JTextField();
      textFieldYear.setBounds(127, 107, 69, 22);
      frame.getContentPane().add(textFieldYear);
      textFieldYear.setColumns(10);

      textFieldMonth = new JTextField();
      textFieldMonth.setBounds(127, 78, 69, 22);
      frame.getContentPane().add(textFieldMonth);
      textFieldMonth.setColumns(10);

      JLabel lblDate = new JLabel("Date: ");
      lblDate.setForeground(Color.RED);
      lblDate.setBounds(19, 13, 40, 16);
      frame.getContentPane().add(lblDate);

      JButton btnNewButton = new JButton("Show");

      btnNewButton.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
            String day = textFieldDay.getText();
            String month = textFieldMonth.getText();
            String year = textFieldYear.getText();
            int dayAsInt = Integer.parseInt(day);
            int monthAsInt = Integer.parseInt(month);
            int yearAsInt = Integer.parseInt(year);
            MyDate date = new MyDate(dayAsInt, monthAsInt, yearAsInt);

            if (e.getSource() == btnNewButton) {
               textFieldDay.setText(day);
               textFieldMonth.setText(month);
               textFieldYear.setText(year);
               textFieldDate.setText(date.toString());
            } 
         }
      });

      btnNewButton.setBounds(246, 77, 118, 25);
      frame.getContentPane().add(btnNewButton);

      textFieldDate = new JTextField();
      textFieldDate.setBounds(71, 10, 125, 22);
      frame.getContentPane().add(textFieldDate);
      textFieldDate.setColumns(10);

      btnStepForward = new JButton("Step forward");

      btnStepForward.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            if (e.getSource() == btnStepForward) {

               date.stepForwardOneDay();
               int dayf = date.getDay();
               int monthf = date.getMonth();
               int yearf = date.getYear();

               MyDate date2 = new MyDate(dayf, monthf, yearf);
               textFieldDate.setText(date2.toString());
            }
         }
      });


      btnStepForward.setBounds(246, 13, 118, 25);
      frame.getContentPane().add(btnStepForward);
   }
}