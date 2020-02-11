//This class contains the frequencies needed for the Sound.playTone() method and the corresponding values
public class Sounds
{
   //Frequencies and notes            width of lines (cm)
   private static final int FL = 349; //1
   private static final int AS = 415; //3
   private static final int A = 440;  //5
   private static final int B = 494;  //7
   private static final int C = 523;  //9
   private static final int D = 587;  //11
   private static final int E = 659;  //13
   private static final int F = 698;  //15

   //Time delay (in milliseconds) between lines (centimeters)
   private static final int S = 300;  //18
   private static final int M = 400;  //20
   private static final int L = 550;  //>22

   Sounds(int FL, int AS, int A, int B, int C, int D, int E, int F, int S, int M, int L) {
   }

   public static int getFl() {
      return FL;
   }

   public static int getAs() {
      return AS;
   }

   public static int getA() {
      return A;
   }

   public static int getB() {
      return B;
   }

   public static int getC() {
      return C;
   }

   public static int getD() {
      return D;
   }

   public static int getE() {
      return E;
   }

   public static int getF() {
      return F;
   }

   public static int getS() {
      return S;
   }

   public static int getM() {
      return M;
   }

   public static int getL() {
      return L;
   }
}