import java.util.ArrayList;

public class ColourPalette
{
   private int numberOfColours;
   private ArrayList<Colour> colours;

   public ColourPalette(int maxNumberOfColours) {
      this.numberOfColours = maxNumberOfColours;
      ArrayList<Colour> colourList = new ArrayList<>(maxNumberOfColours);
      this.colours = colourList;
   }

   public int getNumberOfColours() {
      return colours.size();
   }

   public void add(Colour colour) {
      colours.add(colour);
   }

   public Colour get(int index) {
      return colours.get(index).copy();
   }

   public int getNumberOfGrayColours() {
      int counter = 0;
      for (Colour colour : colours) {
         if (colour.isGray()) {
            counter++;
         }
      }
      return counter;
   }

   public void mixColour(int index, Colour colour2) {
      colours.get(index).mixWith(colour2);
   }

   public boolean equals(Object o) {
      if (!(o instanceof ColourPalette)) {
         return false;
      } else {
         ColourPalette other = (ColourPalette) o;
         boolean equal = false;
         for (int i = 0; i < colours.size(); i++) {
            if (colours.get(i).getRed() == ((ColourPalette) o).get(i).getRed() && colours.get(i).getGreen() == ((ColourPalette) o).get(i).getGreen() && colours.get(i).getBlue() == ((ColourPalette) o).get(i).getBlue()) {
               equal = true;
            } else {
               equal = false;
            }
         }
         return numberOfColours == other.numberOfColours && equal == true ;
      }
   }

   public String toString() {
      return "\nColourPalette [\nnumberOfColours = " + getNumberOfColours() + ". \nColours = "
            + colours + "]";
   }
}