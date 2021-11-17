import javax.swing.*;
import java.awt.*;

public class Main {
   private static final int FRAMEWIDTH = 500;
   private static final int FRAMEHEIGHT = 500;

   public static void main(String[] args) {
      // our main window
      JFrame frame = new JFrame();

      // some things you should specify when creating your JFrame
      frame.setSize(Main.FRAMEWIDTH, Main.FRAMEHEIGHT);
      frame.setTitle(String.format(
              "My Frame is %dx%d.", Main.FRAMEWIDTH, Main.FRAMEHEIGHT
      ));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // create your JLabels here
      JLabel headerLabel = new JLabel("HEADER");
      JLabel bodyLabel = new JLabel("BODY");
      JLabel footerLabel = new JLabel("FOOTER");

      // set the preferred sizes here
      headerLabel.setPreferredSize(new Dimension(250, 100));
      bodyLabel.setPreferredSize(new Dimension(250, 100));
      footerLabel.setPreferredSize(new Dimension(250, 100));



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