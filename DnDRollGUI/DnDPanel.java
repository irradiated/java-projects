import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DnDPanel extends JPanel implements MouseListener {
  private JLabel displayLabel;
  private JTextField inputTextField;
  private JButton confirmButton;

   public DnDPanel() {
      setPreferredSize (new Dimension(400, 300));
      setBackground (Color.blue);

      displayLabel = new JLabel("Choose a die: d4, d6, d8, d10, d12, d20");
      inputTextField = new JTextField(20);
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
     String inputname = inputTextField.getText();
     displayLabel.setText("");
   }

   public void mouseEntered(MouseEvent e) {}
   public void mouseExited(MouseEvent e) {}
   public void mousePressed(MouseEvent e) {}
   public void mouseReleased(MouseEvent e) {}
}
