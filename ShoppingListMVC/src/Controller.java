public class Controller
{
   View view;
   Model model;

   public Controller(View view, Model model) {
      this.view = view;
      this.model = model;
   }

   public void addItem() {
      view.addName();
      String name = model.stringInput();
      view.addId();
      int id = model.intInput();
      view.addPrice();
      int price = model.intInput();
      model.addItem(name, price, id);
      view.added();
      view.updateView(model.getItem());
   } 
}