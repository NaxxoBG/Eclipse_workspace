package main;

import java.awt.Desktop;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import javax.microedition.io.StreamConnection;
import javax.swing.JOptionPane;

public class ProcessConnectionThread implements Runnable {

   private StreamConnection mConnection;

   public ProcessConnectionThread(StreamConnection connection) {
      this.mConnection = connection;
   }

   @Override
   public void run() {
      try {
         // prepare to receive data
         InputStream inputStream = mConnection.openInputStream();
         OutputStream outputStream = mConnection.openOutputStream();

         System.out.println("waiting for input");

         while (true) {
            byte[] buffer = new byte[128];
            int stringLength = inputStream.read(buffer);
            if (stringLength == -1) {
               break;
            }
            outputStream.write(buffer, 0, stringLength);
            System.out.println("received: " + new String(buffer));

            this.command(buffer, "bluetooth");

         }
      } catch (Exception e) {
         e.printStackTrace();
      } 
   }

   private void command(byte[] buffer, String command) {
      String rec = new String(buffer).trim();
      if (rec.equalsIgnoreCase(command)) {
         int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to open the browser", "Confirm", JOptionPane.OK_CANCEL_OPTION);
         if (choice == 0) {
            try {
               Desktop.getDesktop().browse(new URI("https://developer.android.com/guide/topics/connectivity/bluetooth.html"));
            } catch (Exception e) {
               e.printStackTrace();
            } 
         } else {
            return;
         }
      }
   }
}