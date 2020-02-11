package kiloboltgame;

public class Background
{
   private int bgX, bgY, speedX;

   public Background(int x, int y) {
      this.bgX = x;
      this.bgY = y;
      this.speedX = 0;
   }
   
   public void update() {
      bgX += speedX;
      
      if (bgX <= -2160) {
         bgX += 4320;
      }
   }

   public int getBgX() {
      return bgX;
   }

   public int getBgY() {
      return bgY;
   }

   public int getSpeedX() {
      return speedX;
   }

   public void setBgX(int bgX) {
      this.bgX = bgX;
   }

   public void setBgY(int bgY) {
      this.bgY = bgY;
   }

   public void setSpeedX(int speedX) {
      this.speedX = speedX;
   }
}