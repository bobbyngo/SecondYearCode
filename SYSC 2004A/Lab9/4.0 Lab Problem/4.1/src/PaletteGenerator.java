// Ngo Huu Gia Bao
// 101163137

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class PaletteGenerator {

    private final JFrame frame;

    //List of Panels
    private ArrayList<JPanel> listPanels;
    private boolean[] lockOrder;

    // create your JLabels here
    private JLabel headerLabel;

    // create JPanels here
    private JPanel mainPanel;
    private JPanel headerPanel;
    private JPanel bodyPanel;
    private JPanel footerPanel;

    private JButton generateButton;


    public PaletteGenerator() {
        this.listPanels = new ArrayList<>();
        this.lockOrder = new boolean []{false, false, false, false, false, false, false, false};
        this.frame = new JFrame("Palette Generator");

        // create your JLabels here
        this.headerLabel = new JLabel("Your Palette: ");

        // create JPanels here
        this.mainPanel = new JPanel(new BorderLayout());

        this.headerPanel = new JPanel();
        this.bodyPanel = new JPanel(new GridLayout());
        this.footerPanel = new JPanel(new GridBagLayout());

        this.generateButton = new JButton("Generate Palette");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < listPanels.size() && i < lockOrder.length; i++){
                    if (!lockOrder[i]) {
                        listPanels.get(i).setBackground(getColour());
                    }
                }
            }
        });
    }

    public void displayGUI () {

        // set the preferred sizes and colours here
        this.headerPanel.setPreferredSize(new Dimension(400,100));
        this.footerPanel.setPreferredSize(new Dimension(400,100));

        // adding JLabels to the respective JPanel
        this.headerPanel.add(this.headerLabel);
        this.footerPanel.add(this.generateButton);

        for (int i = 0; i < 8; i++){
            JPanel newPanel = new JPanel(new BorderLayout());
            newPanel.setPreferredSize(new Dimension(50, 100));
            newPanel.setBackground(getColour());

            JButton lockButton = new JButton("");
            int finalI = i;
            lockButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lockOrder[finalI] = !lockOrder[finalI];
                    if (lockOrder[finalI]) {
                        lockButton.setText("X");
                    }else{
                        lockButton.setText("");
                    }
                    //System.out.println(lockOrder);
                }
            });

            newPanel.add(lockButton, BorderLayout.PAGE_END);
            bodyPanel.add(newPanel);
            listPanels.add(newPanel);
        }


        // add your JLabels to the panel here
        mainPanel.add(headerPanel, BorderLayout.PAGE_START);
        mainPanel.add(bodyPanel, BorderLayout.CENTER);
        mainPanel.add(footerPanel,BorderLayout.PAGE_END);



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
    }

    /**
     * Get colours of a certain brightness. Wow!
     * @return Color : A Color object with the generated colour.
     */
    private Color getColour() {
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
}
