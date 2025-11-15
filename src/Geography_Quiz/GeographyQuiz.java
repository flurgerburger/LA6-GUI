package Geography_Quiz;

import javax.swing.*;

public class GeographyQuiz {

    private JPanel mainPanel;
    private JLabel score;
    private JTextField textField1;
    private JButton nextButton;
    private JButton backButton;
    private JLabel question;

    int scorectr = 0;
    int ctr = 1;
    String s1 = "What is the capital of France?";
    String s2 = "What is the capital of Japan?";
    String s3 = "What is the capital of Germany?";
    String s4 = "Congratulations! you have finished the Quiz";
    public GeographyQuiz(){
        JFrame frame = new JFrame();
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        backButton.setVisible(false);

        nextButton.addActionListener(e -> {
            if(ctr == 1){
                if(textField1.getText().equalsIgnoreCase("Paris")){
                    scorectr++;
                }
                question.setText(s2);
                textField1.setText("");
                backButton.setVisible(true);
            }
            else if(ctr==2){
                if(textField1.getText().equalsIgnoreCase("Tokyo")){
                    scorectr++;
                }
                question.setText(s3);
                textField1.setText("");
            }
            else if(ctr==3){
                if(textField1.getText().equalsIgnoreCase("Berlin")){
                    scorectr++;
                }
                question.setText(s4);
                textField1.setText("");
                textField1.setVisible(false);
                nextButton.setVisible(false);
            }
            score.setText("Your Score: "+scorectr+" / 3");
            ctr++;
        });

        backButton.addActionListener(e -> {
            ctr--;
            if(ctr == 1){
                question.setText(s1);
                textField1.setText("");
                backButton.setVisible(false);
            }
            else if(ctr==2){
                textField1.setText("");
                question.setText(s2);
            }
            else if(ctr==3){
                question.setText(s3);
                textField1.setText("");
                nextButton.setVisible(true);
                textField1.setVisible(true);
            }
        });

    }
}
