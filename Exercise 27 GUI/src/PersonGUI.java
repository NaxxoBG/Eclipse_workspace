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
public class PersonGUI extends JFrame
{
   private JTextField textFieldName;
   private JTextField textFieldAge;
   private JTextField textFieldStatus;
   private JTextField textGuy;
   private JLabel labelName;
   private JLabel labelAge;
   private JLabel labelStatus;
   private JLabel labelPerson;
   private JButton button;
   private Person person;
   ButtonHandler aButtonHandler = new ButtonHandler();

   public PersonGUI()
   {
      super("Person GUI");

      createComponents();
      initializeComponents();
      registerEventHandlers();
      addComponentsToFrame();
   }

   private void createComponents()
   {
      person = null;
      textFieldName = new JTextField(6);
      textFieldAge = new JTextField(6);
      textFieldStatus = new JTextField(6);
      textGuy = new JTextField(20);
      labelName = new JLabel("Name: ");
      labelAge = new JLabel("Age: ");
      labelStatus = new JLabel("Status: ");
      labelPerson = new JLabel("Person: ");
      button = new JButton("OK");
   }

   private void initializeComponents()
   {
      setSize(560, 310); // set frame size
      setLocationRelativeTo(null); // center of the screen
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   private void addComponentsToFrame()
   {
      JPanel panelName = new JPanel(new BorderLayout());
      panelName.add(textFieldName, BorderLayout.EAST);
      panelName.add(labelName, BorderLayout.WEST);

      JPanel panelAge = new JPanel(new BorderLayout());
      panelAge.add(textFieldAge, BorderLayout.EAST);
      panelAge.add(labelAge, BorderLayout.WEST);

      JPanel panelPerson = new JPanel(new FlowLayout());
      panelPerson.add(panelName);
      panelPerson.add(panelAge);

      JPanel panelStatus = new JPanel(new FlowLayout());
      panelStatus.add(labelStatus);
      panelStatus.add(textFieldStatus);
      panelPerson.add(panelStatus);

      JPanel guy = new JPanel(new FlowLayout());
      guy.add(labelPerson);
      guy.add(textGuy);
      panelStatus.add(guy);

      panelPerson.add(button);

      JPanel contentPane = new JPanel(new GridLayout(3, 1, 5, 5));
      contentPane.add(panelPerson);

      setContentPane(contentPane);
   }

   public class ButtonHandler implements ActionListener {


      public void actionPerformed(ActionEvent e)
      {
         String name = textFieldName.getText();
         String age = textFieldAge.getText();
         int ageAsInt = Integer.parseInt(age);

         person = new Person(name, ageAsInt);

         if (e.getSource() == button) {

            textFieldName.setText(name);
            textFieldStatus.setText(person.getStatus());
            textGuy.setText(person.toString());
         }
      }
   }

   private void registerEventHandlers()
   {
      button.addActionListener(aButtonHandler);
   }

   public static void main(String[] args)
   {
      PersonGUI frame = new PersonGUI();
      frame.setVisible(true);
   }
}