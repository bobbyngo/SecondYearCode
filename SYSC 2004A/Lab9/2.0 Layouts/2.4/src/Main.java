import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import java.lang.Math;

public class Main {
   private static final int FRAMEWIDTH = 500;
   private static final int FRAMEHEIGHT = 500;
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
      //frame.setSize(Main.FRAMEWIDTH, Main.FRAMEHEIGHT);
      frame.setTitle("My Frame is ?x?.");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // create your JLabels here
      JLabel headerLabel = new JLabel("HEADER");
      JLabel bodyLabel = new JLabel("BODY");
      JLabel footerLabel = new JLabel("FOOTER");

      // create JPanels here
      JPanel mainPanel = new JPanel();       // EXPERIMENT HERE
      JPanel mainPanel2 = new JPanel(new BorderLayout());
      JPanel mainPanel3 = new JPanel (new GridLayout(2,2));
      JPanel mainPanel4 = new JPanel (new GridBagLayout());

      JPanel headerPanel = new JPanel();
      JPanel bodyPanel = new JPanel();
      JPanel footerPanel = new JPanel();

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
      mainPanel.add(headerPanel);     // EXPERIMENT HERE
      mainPanel.add(bodyPanel);           // EXPERIMENT HERE
      mainPanel.add(footerPanel);       // EXPERIMENT HERE

      mainPanel2.add(headerPanel, BorderLayout.PAGE_START);
      mainPanel2.add(bodyPanel, BorderLayout.CENTER);
      mainPanel2.add(footerPanel, BorderLayout.PAGE_END);

      mainPanel3.add(headerPanel);
      mainPanel3.add(bodyPanel);
      mainPanel3.add(footerPanel);

      //Ex 4
      GridBagConstraints gbcHeader = new GridBagConstraints();
      gbcHeader.gridx = 0;
      gbcHeader.gridy = 0;
      mainPanel4.add(headerPanel, gbcHeader);

      GridBagConstraints gbcBody = new GridBagConstraints();
      gbcBody.gridx = 1;
      gbcBody.gridy = 1;
      mainPanel4.add(bodyPanel, gbcBody);

      GridBagConstraints gbcFotter = new GridBagConstraints();
      gbcFotter.gridx = 2;
      gbcFotter.gridy = 2;
      mainPanel4.add(footerPanel, gbcFotter);


      // pack
      frame.add(mainPanel);
      frame.add(mainPanel2);
      frame.add(mainPanel3);
      frame.add(mainPanel4);
      frame.pack();

      // the frame is not visible until we set it to be so
      frame.setVisible(true);
   }
}