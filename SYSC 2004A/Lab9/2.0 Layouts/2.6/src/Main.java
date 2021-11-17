import javax.swing.*;
import java.awt.*;

import java.lang.Math;

public class Main {

   /**
    * Get colours of a certain brightness. Wow!
    * @return Color : A Color object with the generated colour.
    */
   public static Color getColour() {
      int r = (int)(Math.random()*256);
      int g = (int)(Math.random()*256);
      int b = (int)(Math.random()*256);
      double luma = (0.2126 * r) + (0.7152 * g) + (0.0722 * b);

      while (luma < 75) {
         r = (int)(Math.random()*256);
         g = (int)(Math.random()*256);
         b = (int)(Math.random()*256);
         luma = (0.2126 * r) + (0.7152 * g) + (0.0722 * b);
      }
      return new Color(r, g, b);
   }

   public static void main(String[] args) {
      // our main window
      JFrame frame = new JFrame();

      // some things you should specify when creating your JFrame
      frame.setTitle("My Frame is ?x?.");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // create your JLabels here
      JLabel headerLabel = new JLabel("HEADER");
      JLabel bodyLabel = new JLabel("BODY");
      JLabel footerLabel = new JLabel("FOOTER");

      // create JPanels here
      JPanel mainPanel = new JPanel(new BorderLayout());

      JPanel headerPanel = new JPanel(new FlowLayout());
      JPanel bodyPanel = new JPanel(new GridLayout());
      JPanel footerPanel = new JPanel(new GridBagLayout());

      // adding JLabels to the respective JPanel
      headerPanel.add(headerLabel);
      bodyPanel.add(bodyLabel);
      footerPanel.add(footerLabel);

      // set the preferred sizes and colours here
      headerPanel.setPreferredSize(new Dimension(250, 100));
      headerPanel.setBackground(getColour());

      bodyPanel.setPreferredSize(new Dimension(250, 100));
      bodyPanel.setBackground(getColour());

      footerPanel.setPreferredSize(new Dimension(250, 100));
      footerPanel.setBackground(getColour());

      // add your JLabels to the panel here
      mainPanel.add(headerPanel, BorderLayout.PAGE_START);
      mainPanel.add(bodyPanel, BorderLayout.CENTER);
      mainPanel.add(footerPanel, BorderLayout.PAGE_END);


      // pack
      frame.add(mainPanel);
      frame.pack();

      // the frame is not visible until we set it to be so
      frame.setVisible(true);
   }
}