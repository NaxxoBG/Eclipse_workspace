package kiloboltgame;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

public class StartingClass extends Applet implements Runnable, KeyListener
{
   private static final long serialVersionUID = 1L;
   private Robot robot;
   private Image image, currentSprite, character, characterDown, characterJumped, background;
   private URL base;
   private Graphics second;
   private static Background bg1, bg2;

   public void init() {
      setSize(800, 450);
      setBackground(Color.BLACK);
      setFocusable(true);
      Frame frame = (Frame) this.getParent().getParent();
      frame.setTitle("Q-Bot Alpha");
      addKeyListener(this);
      try {
         base = getDocumentBase();
      } catch (Exception e) {}
      character = getImage(base, "data/character.png");
      characterDown = getImage(base, "data/down.png");
      characterJumped = getImage(base, "data/jumped.png");
      currentSprite = character;
      background = getImage(base, "data/background.png");
   }

   public void start() {
      Thread thread = new Thread(this);
      bg1 = new Background(0, 0);
      bg2 = new Background(2160, 0);
      robot = new Robot();
      thread.start();
   }

   public void stop() {

   }

   public void destroy() {

   }

   public void run() {
      while (true) {
         robot.update();
         if (robot.isJumped()) {
            currentSprite = characterJumped;
         } else if (robot.isJumped() == false && robot.isDucked() == false) {
            currentSprite = character;
         }
         bg1.update();
         bg2.update();
         repaint();
         try {
            Thread.sleep(17);
         }
         catch (Exception e) {
            e.printStackTrace();
         }
      }
   }

   public void update(Graphics g) {
      if (image == null) {
         image = createImage(this.getWidth(), this.getHeight());
         second = image.getGraphics();
      }

      second.setColor(getBackground());
      second.fillRect(0, 0, getWidth(), getHeight());
      second.setColor(getForeground());
      paint(second);

      g.drawImage(image, 0, 0, this);
   }

   public void paint(Graphics g) {
      g.drawImage(background, bg1.getBgX(), bg1.getBgY(), this);
      g.drawImage(background, bg2.getBgX(), bg2.getBgY(), this);
      g.drawImage(currentSprite, robot.getCenterX()-61, robot.getCenterY()-63, this);
   }

   public void keyTyped(KeyEvent e) {
      // TODO Auto-generated method stub
   }

   public void keyPressed(KeyEvent e) {
      switch (e.getKeyCode()) {
         case KeyEvent.VK_UP:
            System.out.println("Move up");
            break;

         case KeyEvent.VK_DOWN:
            currentSprite = characterDown;
            if (robot.isJumped() == false){
               robot.setDucked(true);
               robot.setSpeedX(0);
            }
            break;

         case KeyEvent.VK_LEFT:
            robot.moveLeft();
            robot.setMovingLeft(true);
            break;

         case KeyEvent.VK_RIGHT:
            robot.moveRight();
            robot.setMovingRight(true);
            break;

         case KeyEvent.VK_SPACE:
            robot.jump();
            break;
      }
   }

   public void keyReleased(KeyEvent e) {
      switch (e.getKeyCode()) {
         case KeyEvent.VK_UP:
            System.out.println("Stop moving up");
            break;

         case KeyEvent.VK_DOWN:
            currentSprite = character;
            robot.setDucked(false);
            break;

         case KeyEvent.VK_LEFT:
            robot.stopLeft();
            break;

         case KeyEvent.VK_RIGHT:
            robot.stopRight();
            break;

         case KeyEvent.VK_SPACE:
            break;
      }
   }

   public static Background getBg1() {
      return bg1;
   }

   public static Background getBg2() {
      return bg2;
   }
}