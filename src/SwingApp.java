import javax.swing.JButton;

import controllers.CalculatorController;
import controllers.InputController;
import view.*;

public class SwingApp {
  
  public static void main(String[] args) {
    Calculator view = new Calculator();
    InputController control = new InputController();
    CalculatorController calculator = new CalculatorController(view, control);

    for(JButton button : view.getKeyboard().getButtons()) {
      button.addActionListener(calculator);

    }
  }
}