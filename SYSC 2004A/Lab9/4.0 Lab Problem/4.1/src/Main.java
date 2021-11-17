import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.Math;

public class Main {

   public static void main(String[] args) {
/*      // our main window
      JFrame frame = new JFrame();

      // some things you should specify when creating your JFrame
      frame.setTitle("My Frame is ?x?.");

      // create your JLabels here
      JLabel headerLabel = new JLabel("HEADER");
      JLabel bodyLabel = new JLabel("BODY");
      JLabel footerLabel = new JLabel("FOOTER");

      // create JPanels here
      JPanel mainPanel = new JPanel(new BorderLayout());

      JPanel headerPanel = new JPanel();
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

      // add your buttons here
      bodyPanel.add(getColourButton());
      bodyPanel.add(getColourButton());
      bodyPanel.add(getColourButton());

      footerPanel.setPreferredSize(new Dimension(250, 100));
      footerPanel.setBackground(getColour());

      // add your JLabels to the panel here
      mainPanel.add(headerPanel, BorderLayout.PAGE_START);
      mainPanel.add(bodyPanel, BorderLayout.CENTER);
      mainPanel.add(footerPanel, BorderLayout.PAGE_END);

      // pack
      frame.add(mainPanel);
      frame.pack();

      // add the window listener
      // we no longer want the frame to close immediately when we press "x"
      frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      frame.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent we) {
            if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to quit?")
                    == JOptionPane.OK_OPTION) {
               // close it down!
               frame.setVisible(false);
               frame.dispose();
            }
         }
      });

      // the frame is not visible until we set it to be so
      frame.setVisible(true);
   }*/
      PaletteGenerator pg = new PaletteGenerator();
      pg.displayGUI();
   }
}