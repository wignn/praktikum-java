package pertemuan9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
    private JPanel calculator;
    private JButton koma;
    private JButton no4;
    private JButton no8;
    private JButton no7;
    private JButton no5;
    private JButton no9;
    private JButton no6;
    private JButton clearButton;
    private JButton plus;
    private JButton kali;
    private JButton mines;
    private JButton backspace;
    private JButton eksponen;
    private JTextField textDis;
    private JButton no0;
    private JButton bagi;
    private JButton no2;
    private JButton no1;
    private JButton no3;
    private JButton samadengan;
    private JButton modulus;

    double a, b, result;
    String op;

    public calculator() {
        no1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDis.setText(textDis.getText() + no1.getText());
            }
        });
        no2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDis.setText(textDis.getText() + no2.getText());
            }
        });
        no3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDis.setText(textDis.getText() + no3.getText());
            }
        });
        no4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDis.setText(textDis.getText() + no4.getText());
            }
        });
        no5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDis.setText(textDis.getText() + no5.getText());
            }
        });
        no6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDis.setText(textDis.getText() + no6.getText());
            }
        });
        no7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDis.setText(textDis.getText() + no7.getText());
            }
        });
        no8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDis.setText(textDis.getText() + no8.getText());
            }
        });
        no9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDis.setText(textDis.getText() + no9.getText());
            }
        });
        no0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDis.setText(textDis.getText() + no0.getText());
            }
        });
        koma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDis.setText(textDis.getText() + koma.getText());
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDis.setText("");
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDis.getText());
                op = "+";
                textDis.setText(textDis.getText() + op);
            }
        });

        mines.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDis.getText());
                op = "-";
                textDis.setText(textDis.getText() + op);
            }
        });

        kali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDis.getText());
                op = "*";
                textDis.setText(textDis.getText() + op);
            }
        });

        bagi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDis.getText());
                op = "/";
                textDis.setText(textDis.getText() + op);
            }
        });

        modulus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDis.getText());
                op = "%";
                textDis.setText(textDis.getText() + op);
            }
        });

        eksponen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDis.getText());
                op = "^";
                textDis.setText(textDis.getText() + op);
            }
        });

        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = textDis.getText();
                if (currentText.length() > 0) {
                    String updatedText = currentText.substring(0, currentText.length() - 1);
                    textDis.setText(updatedText);
                }
            }
        });

        samadengan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] parts = textDis.getText().split("[-+*/%^]");
                if (parts.length == 2) {
                    b = Double.parseDouble(parts[1]);
                    switch (op) {
                        case "+":
                            result = a + b;
                            break;
                        case "-":
                            result = a - b;
                            break;
                        case "*":
                            result = a * b;
                            break;
                        case "/":
                            if (b != 0) {
                                result = a / b;
                            } else {
                                textDis.setText("Error");
                                return;
                            }
                            break;
                        case "%":
                            result = a % b;
                            break;
                        case "^":
                            result = Math.pow(a, b);
                            break;
                        default:
                            result = 0;
                            break;
                    }
                    textDis.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new calculator().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
