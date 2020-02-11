import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.MenuListener;

public class CalcView
{
   private final JFrame frame;
   private final JLabel conNumber, resNumber, lblRes;
   private JTextField conNumText, resNumText;
   private final JComboBox<String> numType1, numType2;
   private JPanel layer1, layer2, resultPanel;
   private final Font labelFont;
   private final Component rigidArea1, rigidArea2;
   public static final String[] SYSTEMS = {"Binary", "Octal", "Decimal", "Hexadecimal"};
   private JMenuBar menuBar;
   private JMenu menu;
   private final ImageIcon icon = new ImageIcon("images/icon.png");
   private final String infoMessage = "This convertor provides the user with the equivalent of a number in a selecten base.\n"
         + "Hint: Double-click on the Result label to see the conversion result.\nIf you want to clear the result label, double-click on the number label.";

   public CalcView() {
      this.numType1 = new JComboBox<String>(SYSTEMS);
      this.numType2 = new JComboBox<String>(SYSTEMS);
      this.numType1.setSelectedIndex(0);
      this.numType2.setSelectedIndex(0);
      this.labelFont = new Font(Font.SANS_SERIF, 2, 20);
      this.frame = new JFrame("Base Number Converter 1.0");
      this.frame.setLayout(new FlowLayout());
      this.frame.setIconImage(icon.getImage());

      menu = new JMenu("Help");
      menuBar = new JMenuBar();
      menuBar.add(menu);
      frame.setJMenuBar(menuBar);

      this.layer1 = new JPanel();
      this.layer2 = new JPanel(new FlowLayout());

      this.conNumber = new JLabel("Number:");
      this.resNumber = new JLabel("Result:");
      this.conNumber.setFont(labelFont);
      this.resNumber.setFont(labelFont);

      this.rigidArea1 = Box.createRigidArea(new Dimension(260, 10));
      this.rigidArea2 = Box.createRigidArea(new Dimension(90, 10));

      this.conNumText = new JTextField(10);
      this.resNumText = new JTextField(10);

      this.layer1.add(numType1);
      this.layer1.add(rigidArea1);
      this.layer1.add(numType2);
      this.layer2.add(conNumber);
      this.layer2.add(conNumText);
      this.layer2.add(rigidArea2);
      this.layer2.add(resNumber);
      this.layer2.add(resNumText);
      this.frame.add(layer1);
      this.frame.add(layer2);
      this.resultPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
      this.lblRes = new JLabel("Result");
      this.lblRes.setFont(new Font("Calibri", Font.BOLD, 50));
      this.resultPanel.setBackground(new Color(255, 255, 255));
      this.resultPanel.setBorder(BorderFactory.createEtchedBorder(new Color(14,164,225), new Color(45,12,142)));
      this.resultPanel.add(lblRes);
      this.frame.add(resultPanel);
      this.frame.setSize(540, 250);
      this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.frame.setLocationRelativeTo(null);
      this.frame.setVisible(true);
   }

   public void setMenuListener(MenuListener listener) {
      menu.addMenuListener(listener);
   }

   public void setMouseListener(MouseListener listener) {
      menu.addMouseListener(listener);
   }

   public void setLabelResMouseListener(MouseListener listener) {
      lblRes.addMouseListener(listener);
      conNumber.addMouseListener(listener);
   }

   public JMenu getMenu() {
      return this.menu;
   }

   public String getInfoMessage() {
      return this.infoMessage;
   }

   public JTextField getConvertNumTextField() {
      return conNumText;
   }

   public JTextField getResNumTextField() {
      return resNumText;
   }

   public JLabel getResLabel() {
      return lblRes;
   }

   public JComboBox<String> getInputSystemComboBox() {
      return numType1;
   }

   public JComboBox<String> getResultSystemComboBox() {
      return numType2;
   }

   public JLabel getConNumlbl() {
      return conNumber;
   }
}