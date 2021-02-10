package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Screen extends JLabel {

  public Screen(){
      this.setPreferredSize(new Dimension(450, 100));
      this.setOpaque(true);
      this.setHorizontalAlignment(RIGHT);
      this.setBorder(new EmptyBorder(10, 10, 10, 10));
      this.setFont(new Font("Sans-Sarif", Font.PLAIN, 24));
  }
}
