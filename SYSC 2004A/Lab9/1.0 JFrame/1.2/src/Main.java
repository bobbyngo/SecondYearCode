import javax.swing.*;

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
      frame.setResizable(false);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // create your JLabel here
      JLabel label1 = new JLabel("This is a label");

      // add your JLabel to the frame here
      frame.add(label1);

      // the frame is not visible until we set it to be so
      frame.setVisible(true);
   }
}