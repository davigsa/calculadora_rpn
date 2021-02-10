package view;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    private Screen screen = new Screen();
    private Keyboard keyboard = new Keyboard();

    public Calculator(){
        JPanel container  = new JPanel();

        this.setTitle("Calculadora RPN de Números Reais e Complexos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(460, 410);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        container.add(screen, BorderLayout.NORTH);
        container.add(keyboard, BorderLayout.CENTER);
        container.setBackground(Color.LIGHT_GRAY);

        this.setContentPane(container);
        this.setVisible(true);
    }

    public Screen getScreen() { 
      return screen; 
    }

    public Keyboard getKeyboard() { 
      return keyboard; 
    }
}
