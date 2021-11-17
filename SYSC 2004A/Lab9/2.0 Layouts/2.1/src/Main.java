import javax.swing.*;
import java.awt.*;

public class Main {

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

      // add your JLabels to the frame here
      frame.add(headerLabel, BorderLayout.PAGE_START);
      frame.add(bodyLabel, BorderLayout.CENTER);
      frame.add(footerLabel, BorderLayout.PAGE_END);

      // pack
      frame.pack();

      // the frame is not visible until we set it to be so
      frame.setVisible(true);
   }
}