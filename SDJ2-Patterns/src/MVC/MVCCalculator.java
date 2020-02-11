package MVC;

public class MVCCalculator
{
   public static void main(String[] args) {
      CalculatorView view = new CalculatorView();
      CalculatorModel model = new CalculatorModel();
      @SuppressWarnings("unused")
      CalculatorController controller = new CalculatorController(view, model);
      view.setVisible(true);
   }
}