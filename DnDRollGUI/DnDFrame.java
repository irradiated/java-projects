import javax.swing.*;
import java.awt.*;

public class DnDFrame {
   public static void main (String[] args) {
      JFrame frame = new JFrame ("Polyhedral Dice");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new DnDPanel());

      frame.pack();
      frame.setLocation(500, 400);
      frame.setVisible(true);
   }
}
