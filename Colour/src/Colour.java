public class Colour
{
   private int red;
   private int green;
   private int blue;

   public Colour(int red, int green, int blue) {
      this.red = red;
      this.green = green;
      this.blue = blue;
   }

   public void set(int red, int green, int blue) {
      this.red = red;
      this.green = green;
      this.blue = blue;
   }

   public int getRed() {
      return red;
   }

   public int getGreen() {
      return green;
   }

   public int getBlue() {
      return blue;
   }

   public boolean isGray() {
      if (red == green && red == blue &&  green == blue) {
         return true;
      } else {
         return false;
      }
   }

   public void mixWith(Colour colour2) {
      double red = 0.5 * this.red + 0.5 * colour2.red;
      double green = 0.5 * this.green + 0.5 * colour2.green;
      double blue = 0.5 * this.blue + 0.5 * colour2.blue;

      set((int) red, (int) green, (int) blue);
   }

   public Colour copy() {
      return new Colour(red, green, blue);
   }

   public boolean equals(Object o) {
      if (!(o instanceof Colour)) {
         return false;
      } else {
         Colour other = (Colour) o;
         return red == other.red && green == other.green && blue == other.blue;
      }
   }

   public String toString() {
      return "\nColour (red=" + red + ", green=" + green + ", blue=" + blue + ")";
   }
}