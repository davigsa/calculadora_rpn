package view;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Keyboard extends JPanel {
  private List<JButton> buttons = new LinkedList<>();

  public Keyboard() {
      String[] buttonsAsArray = {"7", "8", "9", "/", "*", "+", "4", "5", "6", "-", "(", ")", "1", "2", "3", "AC", "=", "__", ".", "0", ","};

      this.setPreferredSize(new Dimension(450, 250));
      this.setOpaque(false);
      this.setLayout(new GridLayout(4, 6));

      for(String buttonName : buttonsAsArray){
          JButton newButton = new JButton(buttonName);
          newButton.setFont(buttonName.length() == 1 ? new Font("Sans-Sarif", Font.PLAIN, 24) : new Font("Sans-Sarif", Font.PLAIN, 20));
          this.add(newButton);
          buttons.add(newButton);
      }
  }

  public List<JButton> getButtons() {
      return buttons;
  }
}
