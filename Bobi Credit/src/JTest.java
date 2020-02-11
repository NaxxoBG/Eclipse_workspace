import org.junit.Test;

public class JTest
{
   @Test
   public void testInterestFormula() throws Exception {
      LoanShark loanShark = new LoanShark(0.01, 800, 150, 3);
      loanShark.profit();     
   }
}