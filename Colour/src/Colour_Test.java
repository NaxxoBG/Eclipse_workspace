public class Colour_Test
{
   public static void main(String[] args)
   {
      Colour colour = new Colour(0, 0, 0);
      Colour colour1 = new Colour(145, 346, 234);
      Colour colour2 = new Colour(120, 40, 67);
      Colour colour3 = new Colour(464, 78, 15);
      Colour colour4 = new Colour(150, 150, 150);
      
      ColourPalette colourPal = new ColourPalette(2);
      ColourPalette colourPal1 = new ColourPalette(2);
      
      colourPal.add(colour);
      colourPal.add(colour1);
      colourPal.add(colour3);
      
      colourPal1.add(colour1);
      colourPal1.add(colour3);
      
      System.out.println(colourPal.getNumberOfColours());
      System.out.println(colourPal.getNumberOfGrayColours());
      System.out.println(colour4.isGray());
      System.out.println(colour3.equals(colour2));
      System.out.println(colour);
      System.out.println(colourPal1.equals(colourPal));
      System.out.println(colourPal);
      
      colourPal.mixColour(1, colour4);
      
      System.out.println(colourPal.get(1));
      System.out.println(colourPal);
   }
}