import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DnDPanel extends JPanel implements MouseListener {
  private JLabel displayLabel;
  private JTextField inputTextField;
  private JButton confirmButton;
  private Dice dice = new Dice();

   public DnDPanel() {
      setPreferredSize (new Dimension(400, 300));
      setBackground (Color.orange);

      displayLabel = new JLabel("Choose a die: d4, d6, d8, d10, d12, d20");
      inputTextField = new JTextField(25);
      confirmButton = new JButton("Roll");

      add(inputTextField);
      add(confirmButton);
      add(displayLabel);

      confirmButton.addMouseListener(this);
   }

   public void paintComponent (Graphics page) {
      super.paintComponent(page);
   }

   public void mouseClicked(MouseEvent e) {
     String dieType = inputTextField.getText();
     int dieTypeInt = Integer.parseInt(dieType);
     Dice roll = new Dice(dieTypeInt);
     displayLabel.setText("Roll: " + Integer.toString(roll.getResult()));
   }

   public void mouseEntered(MouseEvent e) {}
   public void mouseExited(MouseEvent e) {}
   public void mousePressed(MouseEvent e) {}
   public void mouseReleased(MouseEvent e) {}
}
