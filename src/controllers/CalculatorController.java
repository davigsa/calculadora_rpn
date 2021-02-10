package controllers;

import view.*;
import models.ComplexNumberModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {

    private Calculator view;
    private InputController control;

    public CalculatorController(Calculator _view, InputController _control){
        this.view = _view;
        this.control = _control;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();
        String buttonText = button.getText();

        if(buttonText.equals("__")) {
          view.getScreen().setText(view.getScreen().getText() + " ");

        } else if (buttonText.equals("=")) {
          String input = view.getScreen().getText();
          control.setInput(input);
          ComplexNumberModel resultAsComplex = new ComplexNumberModel(0, 0);

          try {
            resultAsComplex = control.solveEquation();

          } catch (Exception exception) {
            exception.printStackTrace();
            
          }
          String result;
          if (resultAsComplex.getComplexPart() != 0) {
             result = "(" + resultAsComplex.getRealPart() + "," + resultAsComplex.getComplexPart() + ")";
          } else {
            result = "" + resultAsComplex.getRealPart();
          }

          view.getScreen().setText(result);

        } else if (buttonText.equals("AC")) {
          view.getScreen().setText("");

        } else {
          view.getScreen().setText(view.getScreen().getText() + buttonText);
        }
    }
}
