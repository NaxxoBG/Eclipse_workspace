public class CalcModel
{
   //Binary to rest
   public String binaryToOctal(String op1) {
      long res = Long.parseLong(op1, 2);
      return Long.toOctalString(res);   
   }

   public String binaryToDecimal(String binaryNum) {
      int result = Integer.parseInt(binaryNum, 2);
      return Integer.toString(result);
   }

   public String binaryToHex(String op1) {
      int decimal = Integer.parseInt(op1, 2);
      return Integer.toString(decimal, 16).toUpperCase();
   }
   //------------------------------------


   //Octal to rest
   public String octalToBinary(String octal) {
      return Long.toBinaryString(Long.parseLong(octal, 8));
   }

   public String octalToDecimal(String op1) {
      return Integer.toString(Integer.parseInt(op1, 8));
   }

   public String octalToHex(String op1) {
      return Integer.toString(Integer.parseInt(op1, 16));
   }
   //----------------------------------------------


   //Decimal to rest
   public String decimalToBinary(String decimalNum) {
      Long res = new Long(decimalNum);
      return Long.toString(res, 2);
   }

   public String decimalToOctal(String op1) {
      return Integer.toOctalString(Integer.parseInt(op1));
   }

   public String decimalToHex(String op1) {
      int rem;
      int num = Integer.parseInt(op1);
      String str2 = ""; 

      char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

      while (num > 0) {
         rem = num % 16; 
         str2 = hex[rem] + str2; 
         num = num / 16;
      }
      return str2;
   }
   //---------------------------------------------------


   //Hex to rest
   public String hexToBinary(String op1) {
      int res = Integer.parseInt(op1, 16);    
      return Integer.toBinaryString(res);
   }

   public String hexToOctal(String op1) {
      int dec = Integer.parseInt(op1,16);
      return Integer.toOctalString(dec);
   }

   public String hexToDecimal(String op1) {
      long dec = 0;
      for (int i = 0; i < op1.length(); i++ ) {
         int digit = hexValue( op1.charAt(i) );
         if (digit == -1) {
            System.out.println("Error: Input is not a hexadecimal number.");
            return null;  
         }
         dec = 16 * dec + digit;
      }
      return Long.toString(dec);
   }
   //----------------------------------------------------

   private int hexValue(char ch) {
      switch (ch) {
         case '0':
            return 0;
         case '1':
            return 1;
         case '2':
            return 2;
         case '3':
            return 3;
         case '4':
            return 4;
         case '5':
            return 5;
         case '6':
            return 6;
         case '7':
            return 7;
         case '8':
            return 8;
         case '9':
            return 9;
         case 'a':
         case 'A':
            return 10;
         case 'b':
         case 'B':
            return 11;
         case 'c':
         case 'C':
            return 12;
         case 'd':
         case 'D':
            return 13;
         case 'e':
         case 'E':
            return 14;
         case 'f':
         case 'F':
            return 15;
         default:
            return -1;
      }
   }
}