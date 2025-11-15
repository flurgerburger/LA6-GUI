package Pizza_Order_System;

import javax.swing.*;

public class PizzaOrderSystem {
    private JPanel panel;
    private JComboBox sizeBox;
    private JLabel sizelabel;
    private JComboBox toppingBox;
    private JComboBox ExtraCheeseBox;
    private JButton calculateTotalButton;
    private JLabel Output;


    public PizzaOrderSystem(){
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Output.setVisible(false);

        calculateTotalButton.addActionListener(e -> {
            int total = 12;
            String size = sizeBox.getSelectedItem().toString();
            if(size.equals("Medium")) total += 5;
            else if(size.equals("Large")) total += 10;

            String cheez = ExtraCheeseBox.getSelectedItem().toString();
            if(cheez.equals("Yes")) total += 5;
            Output.setVisible(true);
            Output.setText("Your total is: "+ total);
        });
    }
}
