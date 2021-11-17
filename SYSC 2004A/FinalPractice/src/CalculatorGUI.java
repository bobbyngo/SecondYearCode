// Ngo Huu Gia Bao
// 101163137

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;


public class CalculatorGUI {
    private JFrame frame;

    // create JPanels here
    private JPanel headerPanel;
    private JPanel bodyPanel;
    private JPanel footerPanel;
    private JPanel panel;

    private JLabel valueLabel1;
    private JLabel valueLabel2;
    private JLabel resultLabel;

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    private Random random;
    private int value1;
    private int value2;
    private int result;

    private JButton generateButton;
    private JButton addButton;
    private JButton subButton;

    public CalculatorGUI() {
        this.frame = new JFrame("MY CALCULATOR");

        this.headerPanel = new JPanel();
        this.bodyPanel = new JPanel();
        this.footerPanel = new JPanel();
        this.panel = new JPanel(new BorderLayout());
        this.random = new Random();

        this.valueLabel1 = new JLabel();
        this.valueLabel2 = new JLabel();
        this.resultLabel = new JLabel();

        this.label1 = new JLabel("VALUE 1");
        this.label2 = new JLabel("VALUE 2");
        this.label3 = new JLabel("RESULT");

        this.generateButton = new JButton("Generate");
        this.addButton = new JButton("Add");
        this.subButton = new JButton("Subtract");


    }

    private void addFunction(int value1, int value2) {
        this.result = value1 + value2;
    }

    private void subFunction(int value1, int value2) {
        this.result = value1 - value2;
    }


    public void displayGUI() {

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1 = random.nextInt(11);
                value2 = random.nextInt(11);
                valueLabel1.setText(String.valueOf(value1));
                valueLabel2.setText(String.valueOf(value2));
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addFunction(value1, value2);
                resultLabel.setText( value1 + "+" + value2 + "=" +String.valueOf(result));
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subFunction(value1,value2);
                resultLabel.setText( value1 + "-" + value2 + "=" +String.valueOf(result));
            }
        });

        headerPanel.add(valueLabel1);
        headerPanel.add(valueLabel2);
        headerPanel.add(resultLabel);

        bodyPanel.add(label1, BorderLayout.LINE_START);
        bodyPanel.add(label2, BorderLayout.CENTER);
        bodyPanel.add(label3, BorderLayout.LINE_END);

        footerPanel.add(generateButton, BorderLayout.LINE_START);
        footerPanel.add(addButton, BorderLayout.CENTER);
        footerPanel.add(subButton, BorderLayout.LINE_END);

        panel.add(headerPanel, BorderLayout.PAGE_START);
        panel.add(bodyPanel, BorderLayout.CENTER);
        panel.add(footerPanel, BorderLayout.PAGE_END);

        this.frame.add(panel);
        this.frame.setSize(300, 150);
        //this.frame.pack();

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

    public static void main (String[] args) {
        CalculatorGUI calculator = new CalculatorGUI();

        calculator.displayGUI();
    }

}
