package fr.diginamic.swing;

import java.awt.*;
import javax.swing.*;

// import java.awt.Font;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.SwingConstants;
// import javax.swing.SwingUtilities;

/**
 * Affiche une fenêtre contenant le message "HELLO WORLD".
 */
public class HelloFrame extends JFrame {

  /**
   * Construit la fenêtre principale.
   */
  public HelloFrame() {
    super("Demo JAR exécutable");

    JLabel label = new JLabel("HELLO WORLD !!!", SwingConstants.CENTER);
    label.setFont(new Font("Arial", Font.BOLD, 48));

    add(label);

    setSize(600, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  /**
   * Point d'entrée du programme.
   *
   * @param args arguments de la ligne de commande
   */
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      HelloFrame frame = new HelloFrame();
      frame.setVisible(true);
    });
  }
}
