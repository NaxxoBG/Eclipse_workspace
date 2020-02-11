import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class CalcController
{
   private CalcView view;
   private CalcModel model;

   public CalcController() {
      this.view = new CalcView();
      this.model = new CalcModel();
      this.view.setMenuListener(this.returnMenuListener());
      this.view.setMouseListener(this.returnMenuMouseListener());
      this.view.setLabelResMouseListener(this.returnLabelResMouseListener());
   }

   private MenuListener returnMenuListener() {
      MenuListener listener = new MenuListener() {

         public void menuSelected(MenuEvent e) {
            JOptionPane.showMessageDialog(null, view.getInfoMessage(), "Tip",
                  JOptionPane.INFORMATION_MESSAGE);
         }

         public void menuDeselected(MenuEvent e) {
            view.getMenu().setSelected(false);
         }

         public void menuCanceled(MenuEvent e) {
         }
      };
      return listener;
   }

   private MouseListener returnMenuMouseListener() {
      MouseListener mouseAction = new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
            JMenu item = (JMenu) e.getSource();
            item.setOpaque(true);
            item.setBackground(new Color(12, 125, 251));
         };

         public void mouseExited(MouseEvent e) {
            JMenu item = (JMenu) e.getSource();
            item.setBackground(new Color(200, 200, 200));
            item.setSelected(false);
         };
      };
      return mouseAction;
   }

   private MouseListener returnLabelResMouseListener() {
      MouseListener listener = new MouseAdapter() {
         public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 3 && e.getSource() == view.getResLabel()) {
               try {
                  URI uri = new URI(
                        "https://www.youtube.com/watch?v=6jN2fnMVAKI&feature=youtu.be&t=248");
                  Desktop.getDesktop().browse(uri);
               }
               catch (URISyntaxException | IOException e1) {
                  e1.printStackTrace();
               }
            } else if (e.getClickCount() == 2 && e.getSource() == view.getResLabel()) {

               String op1 = view.getConvertNumTextField().getText();
               String selectedNum = (String) view.getInputSystemComboBox().getSelectedItem();
               String selectedRes = (String) view.getResultSystemComboBox().getSelectedItem();
               JTextField resField = view.getResNumTextField();
               JLabel resLabel = view.getResLabel();
               System.out.println("<<<------------------------>>>");
               System.out.println("Selected input " + selectedNum);
               System.out.println("Selected output " + selectedRes);
               System.out.println("<<<------------------------>>>");

               if (view.getConvertNumTextField().getText().equals("")) {
                  resLabel.setText("NaN");
                  resField.setText("");
               } else {
                  switch (selectedNum) {
                     case "Binary":
                        switch (selectedRes) {
                           case "Binary":
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           case "Octal":
                              op1 = model.binaryToOctal(op1);
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           case "Decimal":
                              op1 = model.binaryToDecimal(op1);
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           case "Hexadecimal":
                              op1 = model.binaryToHex(op1);
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           default:
                              break;
                        }
                        break;
                     case "Octal":
                        switch (selectedRes) {
                           case "Binary":
                              op1 = model.octalToBinary(op1);
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           case "Octal":
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           case "Decimal":
                              op1 = model.octalToDecimal(op1);
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           case "Hexadecimal":
                              op1 = model.octalToHex(op1);
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           default:
                              break;
                        }
                        break;
                     case "Decimal":
                        switch (selectedRes) {
                           case "Binary":
                              op1 = model.decimalToBinary(op1);
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           case "Octal":
                              op1 = model.decimalToOctal(op1);
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           case "Decimal":
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           case "Hexadecimal":
                              op1 = model.decimalToHex(op1);
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           default:
                              break;
                        }
                        break;
                     case "Hexadecimal":
                        switch (selectedRes) {
                           case "Binary":
                              op1 = model.hexToBinary(op1);
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           case "Octal":
                              op1 = model.hexToOctal(op1);
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           case "Decimal":
                              op1 = model.hexToDecimal(op1);
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           case "Hexadecimal":
                              resField.setText(op1);
                              resLabel.setText(op1);
                              break;
                           default:
                              break;
                        }
                        break;
                     default:
                        break;
                  }
               }
            } else if (e.getClickCount() == 2 && e.getSource() == view.getConNumlbl()) {
               JLabel res = view.getResLabel();
               JTextField resField = view.getResNumTextField();
               resField.setText("");
               res.setText("Result");
            }
         }
      };
      return listener;
   }

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      CalcController controller = new CalcController();
   }
}