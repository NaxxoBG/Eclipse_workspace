package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController
{
   private CalculatorView view;
   private CalculatorModel model;

   public CalculatorController(CalculatorView view, CalculatorModel model) {
      this.view = view;
      this.model = model;
      this.view.addCalculateListener(new CalculateListener());
   }

   class CalculateListener implements ActionListener {

      public void actionPerformed(ActionEvent e) {
         int firstNumber, secondNumber = 0;

         try {
            firstNumber = view.getFirstNumber();
            secondNumber = view.getSecondNumber();
            model.addTwoNumbers(firstNumber, secondNumber);
            view.setCalcSolution(model.getCalculationValue());
         }
         catch (NumberFormatException e1) {
            System.out.println(e1);
            view.displayErrorMessage("You need to enter two integers");
         }
      }
   }
}