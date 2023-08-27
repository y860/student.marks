import javax.swing.*;

public class STUDENT extends JFrame {
    private JTextField txtStdName;

    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JButton calButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("STUDENT");
        frame.setContentPane(new STUDENT().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public STUDENT() {
        calButton.addActionListener(e -> {
            // This is the code that will be executed when the button is clicked.

            boolean allFieldsFilled = !txtStdName.getText().isEmpty() && !txtMarks1.getText().isEmpty() && !txtMarks2.getText().isEmpty() && !txtMarks3.getText().isEmpty();

            if (!allFieldsFilled) {
                calButton.setEnabled(false);
                return;
            }


            int m1, m2, m3, tot;
            double avg;


            m1 = Integer.parseInt(txtMarks1.getText());
            m2 = Integer.parseInt(txtMarks2.getText());
            m3 = Integer.parseInt(txtMarks3.getText());


            tot = m1 + m2 + m3;


            txtTotal.setText(String.valueOf(tot));


            avg = (double) tot / 3;

            txtAvg.setText(String.valueOf(avg));


            if (avg >= 80) {
                txtGrade.setText("A");
            } else if (avg >= 60) {
                txtGrade.setText("B");
            } else if (avg >= 40) {
                txtGrade.setText("C");
            } else {
                txtGrade.setText("F");
            }

            calButton.setEnabled(true);
        });
    }


}
