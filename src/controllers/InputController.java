package controllers;

import models.ComplexNumberModel;
import java.util.*;

public class InputController {
  private String input;

  public InputController() {}

  public InputController(String _input) {
    this.input = _input;
  }

  public String getInput() {
    return input;
  }

  public void setInput(String _input) {
    input = _input;
  }

  public ComplexNumberModel solveEquation() throws Exception {
    final Stack<ComplexNumberModel> operandsComplex = new Stack<ComplexNumberModel>();

    List<String> tokenizedInput = Arrays.asList(input.split(" "));

    for (String currentToken : tokenizedInput) {
      try {
        double inputAsDouble = Double.parseDouble(currentToken);
        operandsComplex.push(new ComplexNumberModel(inputAsDouble, 0));

      } catch (NumberFormatException e) {
          if (currentToken.contains("+")) {
            operandsComplex.push(new AdditionController(operandsComplex.pop(), operandsComplex.pop()).complexOperator());
          } 
          else if (currentToken.contains("-")) {
            ComplexNumberModel lastNumber = operandsComplex.pop();
            operandsComplex.push(new SubtractionController(operandsComplex.pop(), lastNumber).complexOperator());
          }
          else if (currentToken.contains("*")) {
            operandsComplex.push(new MultiplicationController(operandsComplex.pop(), operandsComplex.pop()).complexOperator());
          }
          else if (currentToken.contains("/")) {
            ComplexNumberModel lastNumber = operandsComplex.pop();
            
            if (lastNumber.getComplexPart() == 0 && lastNumber.getRealPart() == 0) {
              throw new Exception("Impossível a divisão por 0");
            }

            operandsComplex.push(new DivisionController(operandsComplex.pop(), lastNumber).complexOperator());
          }
          else if (currentToken.contains("(")) {
            String[] tokenizedComplex = currentToken.replace("(", "").replace(")", "").split(",");
            double realPart = Double.parseDouble(tokenizedComplex[0]);
            double complexPart = Double.parseDouble(tokenizedComplex[1]);

            operandsComplex.push(new ComplexNumberModel(realPart, complexPart));
          }
          else {
            throw new Exception("Caracter inválido");
          }
      }
    }

    if (operandsComplex.size() > 1) {
      throw new Exception("Sua operação não resulta em único número");
    } else {
      return operandsComplex.pop();
    }
  }
}
