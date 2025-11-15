package Number_Counter;

import org.w3c.dom.css.Counter;

import javax.swing.*;

public class NumberCounter {
    private JPanel panel;
    private JButton decreaseButton;
    private JButton increaseButton;
    private JLabel num;
    int currval;
    String curr;
    public NumberCounter(){
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        currval = 0;
        decreaseButton.addActionListener(e -> {
            curr = num.getText();
            currval = Integer.parseInt(curr);
            currval--;
            num.setText(String.valueOf(currval));
        });
        increaseButton.addActionListener(e -> {
            curr = num.getText();
            currval = Integer.parseInt(curr);
            currval++;
            num.setText(String.valueOf(currval));
        });

    }
}
