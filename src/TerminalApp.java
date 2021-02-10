import controllers.*;
import models.ComplexNumberModel;
import java.util.*;

public class TerminalApp {
  private static ComplexNumberModel result;

  public static void main(String[] args) {
    boolean flag = true;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("\n=== CALCULADORA RPN DE NÚMEROS COMPLEXOS E REAIS ===");
    System.out.printf(
        "\nauthor: @davigsa \n\n--- Regras --- \n 1- As operações a serem inseridas devem ter cada elemento separado por um blankspace \n 2- Os números complexos deverão respeitar à formatação: (REAL,IMAG) \n 3- Seu resultado será explicitado ao final do processo, podendo ser um número complexo ou não. \n\n Divirta-se!");

    while (flag) {
      try {
        System.out.printf("\n\nDigite sua operação: ");
        String input = keyboard.nextLine();
        result = new InputController(input).solveEquation();

      } catch (Exception e) {
        e.printStackTrace();
        break;

      } finally {
        
        if (result.getComplexPart() == 0) {
          System.out.printf("\n\nResultado: " + result.getRealPart());
        } else {
          System.out.println("\n\nResultado: (" + result.getRealPart() + "," + result.getComplexPart() + ")" );
        }
  
        System.out.printf("\n\nDeseja mais alguma coisa, mestre?: \n\n 1- Sim \n 2- Não, pode descansar \n\n");
        int decision = Integer.parseInt(keyboard.nextLine());
  
        if (decision != 1) {
          flag = false;
        }
      }
    }
    keyboard.close();
  }
}




