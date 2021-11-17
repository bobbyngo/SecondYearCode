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

      /*~~~~~~~~~~~~~~~~~~~~~BEGIN~~~~~~~~~~~~~~~~~~~~~~~~*/
      // create JPanels here
      // uncomment for BorderLayout (example 1)
//      JPanel mainPanel = new JPanel(new BorderLayout());

      // uncomment for FlowLayout (example 2)
//      JPanel mainPanel = new JPanel();

      // uncomment for GridLayout (example 3)
//      JPanel mainPanel = new JPanel(new GridLayout(2, 2);

      // uncomment for GridBagLayout (example 4)
      JPanel mainPanel = new JPanel(new GridBagLayout());

      JPanel headerPanel = new JPanel();
      JPanel bodyPanel = new JPanel();
      JPanel footerPanel = new JPanel();
      /*~~~~~~~~~~~~~~~~~~~~~~END~~~~~~~~~~~~~~~~~~~~~~~*/

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

      /*~~~~~~~~~~~~~~~~~~~~~BEGIN~~~~~~~~~~~~~~~~~~~~~~~~*/
      // add your JLabels to the panel here
      // uncomment for BorderLayout (example 1)
//      mainPanel.add(headerPanel, BorderLayout.PAGE_START);
//      mainPanel.add(bodyPanel, BorderLayout.CENTER);
//      mainPanel.add(footerPanel, BorderLayout.PAGE_END);

      // uncomment for FlowLayout (example 2)
//      mainPanel.add(headerPanel);
//      mainPanel.add(bodyPanel);
//      mainPanel.add(footerPanel);

      // uncomment for GridLayout (example 3)
//      mainPanel.add(headerPanel);
//      mainPanel.add(bodyPanel);
//      mainPanel.add(footerPanel);

      // uncomment for GridBagLayout (example 4)
      GridBagConstraints gbagConstraintsHeader = new GridBagConstraints();
      gbagConstraintsHeader.gridx = 0;
      gbagConstraintsHeader.gridy = 0;
      mainPanel.add(headerPanel, gbagConstraintsHeader);

      GridBagConstraints gbagConstraintsBody = new GridBagConstraints();
      gbagConstraintsBody.gridx = 1;
      gbagConstraintsBody.gridy = 1;
      mainPanel.add(bodyPanel, gbagConstraintsBody);

      GridBagConstraints gbagConstraintsFooter = new GridBagConstraints();
      gbagConstraintsFooter.gridx = 2;
      gbagConstraintsFooter.gridy = 2;
      mainPanel.add(footerPanel, gbagConstraintsFooter);
      /*~~~~~~~~~~~~~~~~~~~~~~END~~~~~~~~~~~~~~~~~~~~~~~*/



      // pack
      frame.add(mainPanel);
      frame.pack();

      // the frame is not visible until we set it to be so
      frame.setVisible(true);
   }
}