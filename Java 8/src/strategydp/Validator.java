package strategydp;

public class Validator
{
   private final ValidationStrategy strategy;

   public Validator(ValidationStrategy strategy) {
      this.strategy = strategy;
   }

   public boolean validate(String s) {
      return strategy.execute(s);
   }

   public static void main(String[] args) {
      final String stringToVal = "asdaadsryewx";

      Validator numVal = new Validator(new IsNumeric());
      boolean isNum = numVal.validate(stringToVal);

      Validator isLowerCase = new Validator(new IsAllLowerCase());
      boolean isLower = isLowerCase.validate(stringToVal);

      Validator isUpperCase = new Validator(s -> s.matches("[A-Z]+")); // passing lambda expressions for different validations
      boolean isUpper = isUpperCase.validate("ASDASGAGTHR");

      System.out.println(isNum);
      System.out.println(isLower);
      System.out.println(isUpper);
   }
}