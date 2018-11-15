import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

class Calculator {

        private JTextArea textArea = new JTextArea();
        private JTextArea textAreaSecond = new JTextArea();
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton buttonEquals = new JButton("=");
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonMultiply = new JButton("*");
        JButton buttonDivision = new JButton("/");
        JButton buttonClear = new JButton("<");
        JButton buttonClearAll = new JButton("C");
        JButton buttonDot = new JButton(".");
        JButton buttonPercent = new JButton("%");
        JButton buttonRevers = new JButton("-/+");
        JButton buttonSqrt = new JButton("sqrt");

        private double firstNum;
        private double secondNum;
        private double result;
        private String operations;
        private String operations2;

        Calculator() {

            JFrame frame = new JFrame("calculator");
            JLabel panel=new JLabel(new ImageIcon("C:\\Users\\Konrad\\Desktop\\11.jpg"));

            frame.setSize(185, 300);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);
            frame.add(panel);
            Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
            frame.setLocation(dim.width/2-frame.getWidth()/2,dim.height/2-frame.getHeight()/2);
            panel.add(textArea);

            Font font = new Font("Arial Rounded MT Bold", Font.ITALIC, 15);
            textArea.setFont(font);
            Font otherFont = new Font("Arial Rounded MT Bold", Font.ITALIC, 11);

            textAreaSecond.setFont(otherFont);
            textArea.setBounds(5, 35, 170, 25);
            textArea.setMargin(new Insets(0, 0, 0, 0));
            textArea.setLineWrap(true);

            panel.add(textAreaSecond);

            textAreaSecond.setBounds(5, 10, 170, 25);
            textAreaSecond.setMargin(new Insets(0, 0, 0, 0));
            textAreaSecond.setLineWrap(true);

            panel.add(button0);
            button0.setBounds(5, 210, 65, 30);
            button0.setMargin(new Insets(0, 0, 0, 0));
            button0.setBackground(Color.WHITE);
            panel.add(button1);
            button1.setBounds(5, 175, 30, 30);
            button1.setMargin(new Insets(0, 0, 0, 0));
            button1.setBackground(Color.WHITE);
            panel.add(button2);
            button2.setBounds(40, 175, 30, 30);
            button2.setMargin(new Insets(0, 0, 0, 0));
            button2.setBackground(Color.WHITE);
            panel.add(button3);
            button3.setBounds(75, 175, 30, 30);
            button3.setMargin(new Insets(0, 0, 0, 0));
            button3.setBackground(Color.WHITE);
            panel.add(button4);
            button4.setBounds(5, 140, 30, 30);
            button4.setMargin(new Insets(0, 0, 0, 0));
            button4.setBackground(Color.WHITE);
            panel.add(button5);
            button5.setBounds(40, 140, 30, 30);
            button5.setMargin(new Insets(0, 0, 0, 0));
            button5.setBackground(Color.WHITE);
            panel.add(button6);
            button6.setBounds(75, 140, 30, 30);
            button6.setMargin(new Insets(0, 0, 0, 0));
            button6.setBackground(Color.WHITE);
            panel.add(button7);
            button7.setBounds(5, 105, 30, 30);
            button7.setMargin(new Insets(0, 0, 0, 0));
            button7.setBackground(Color.WHITE);
            panel.add(button8);
            button8.setBounds(40, 105, 30, 30);
            button8.setMargin(new Insets(0, 0, 0, 0));
            button8.setBackground(Color.WHITE);
            panel.add(button9);
            button9.setBounds(75, 105, 30, 30);
            button9.setMargin(new Insets(0, 0, 0, 0));
            button9.setBackground(Color.WHITE);
            panel.add(buttonEquals);
            buttonEquals.setBounds(145, 175, 30, 65);
            buttonEquals.setMargin(new Insets(0, 0, 0, 0));
            buttonEquals.setBackground(Color.WHITE);
            panel.add(buttonDot);
            buttonDot.setBounds(75, 210, 30, 30);
            buttonDot.setMargin(new Insets(0, 0, 0, 0));
            buttonDot.setBackground(Color.WHITE);
            panel.add(buttonPlus);
            buttonPlus.setBounds(110, 210, 30, 30);
            buttonPlus.setMargin(new Insets(0, 0, 0, 0));
            buttonPlus.setBackground(Color.WHITE);
            panel.add(buttonMinus);
            buttonMinus.setBounds(110, 175, 30, 30);
            buttonMinus.setMargin(new Insets(0, 0, 0, 0));
            buttonMinus.setBackground(Color.WHITE);
            panel.add(buttonMultiply);
            buttonMultiply.setBounds(110, 140, 30, 30);
            buttonMultiply.setMargin(new Insets(0, 0, 0, 0));
            buttonMultiply.setBackground(Color.WHITE);
            panel.add(buttonDivision);
            buttonDivision.setBounds(110, 105, 30, 30);
            buttonDivision.setMargin(new Insets(0, 0, 0, 0));
            buttonDivision.setBackground(Color.WHITE);
            panel.add(buttonClear);
            buttonClear.setBounds(5, 70, 65, 30);
            buttonClear.setMargin(new Insets(0, 0, 0, 0));
            buttonClear.setBackground(Color.WHITE);
            panel.add(buttonClearAll);
            buttonClearAll.setBounds(75, 70, 65, 30);
            buttonClearAll.setMargin(new Insets(0, 0, 0, 0));
            buttonClearAll.setBackground(Color.WHITE);
            panel.add(buttonPercent);
            buttonPercent.setBounds(145, 140, 30, 30);
            buttonPercent.setMargin(new Insets(0, 0, 0, 0));
            buttonPercent.setBackground(Color.WHITE);
            panel.add(buttonRevers);
            buttonRevers.setBounds(145, 105, 30, 30);
            buttonRevers.setMargin(new Insets(0, 0, 0, 0));
            buttonRevers.setBackground(Color.WHITE);
            panel.add(buttonSqrt);
            buttonSqrt.setBounds(145, 70, 30, 30);
            buttonSqrt.setMargin(new Insets(0, 0, 0, 0));
            buttonSqrt.setBackground(Color.WHITE);

            button0.addActionListener((ae) -> {//wyrażenie lambda zastępuje public void actionPerformed
                String EnterNumber = textArea.getText() + button0.getText();
                textArea.setText(EnterNumber);
            });
            button1.addActionListener((ae) -> {
                String EnterNumber = textArea.getText() + button1.getText();
                textArea.setText(EnterNumber);
            });
            button2.addActionListener((ae) -> {
                String EnterNumber = textArea.getText() + button2.getText();
                textArea.setText(EnterNumber);
            });
            button3.addActionListener((ae) -> {
                String EnterNumber = textArea.getText() + button3.getText();
                textArea.setText(EnterNumber);
            });
            button4.addActionListener((ae) -> {
                String EnterNumber = textArea.getText() + button4.getText();
                textArea.setText(EnterNumber);
            });
            button5.addActionListener((ae) -> {
                String EnterNumber = textArea.getText() + button5.getText();
                textArea.setText(EnterNumber);
            });
            button6.addActionListener((ae) -> {
                String EnterNumber = textArea.getText() + button6.getText();
                textArea.setText(EnterNumber);
            });
            button7.addActionListener((ae) -> {
                String EnterNumber = textArea.getText() + button7.getText();
                textArea.setText(EnterNumber);
            });
            button8.addActionListener((ae) -> {
                String EnterNumber = textArea.getText() + button8.getText();
                textArea.setText(EnterNumber);
            });
            button9.addActionListener((ae) -> {
                String EnterNumber = textArea.getText() + button9.getText();
                textArea.setText(EnterNumber);
            });
            buttonPlus.addActionListener((ae) -> {
                try{
                    firstNum=Double.valueOf(textArea.getText());
                }catch(NumberFormatException e){
                    //JOptionPane.showMessageDialog(null,"error");
                    textArea.setText("empty string");
                }
                firstNum = Double.valueOf(textArea.getText());
                operations = "+";
                textAreaSecond.setText(textArea.getText() + "+");
                textArea.setText(null);
            });
            buttonMinus.addActionListener((ae) -> {
                try{
                    firstNum=Double.valueOf(textArea.getText());
                }catch(NumberFormatException e){
                    textArea.setText("empty string");
                }
                firstNum = Double.valueOf(textArea.getText());
                operations = "-";
                textAreaSecond.setText(textArea.getText() + "-");
                textArea.setText(null);
            });
            buttonMultiply.addActionListener((ae) -> {
                try{
                    firstNum=Double.valueOf(textArea.getText());
                }catch(NumberFormatException e){
                    textArea.setText("empty string");
                }
                firstNum = Double.valueOf(textArea.getText());
                operations = "*";
                textAreaSecond.setText(textArea.getText() + "*");
                textArea.setText(null);
            });
            buttonDivision.addActionListener((ae) -> {
                try{
                    firstNum=Double.valueOf(textArea.getText());
                }catch(NumberFormatException e){
                    textArea.setText("empty string");
                }
                firstNum = Double.valueOf(textArea.getText());
                operations = "/";
                textAreaSecond.setText(textArea.getText() + "/");
                textArea.setText(null);
            });
            buttonPercent.addActionListener((ae) -> {
                secondNum = Double.valueOf(textArea.getText());
                double answer = (firstNum * secondNum) / 100;
                if (answer != (int) answer) {
                    textArea.setText(String.valueOf(answer));
                } else {
                    textArea.setText(String.valueOf((int) answer));
                }
                if (firstNum == (int) firstNum) {
                    textAreaSecond.setText(secondNum + "% for number " + (int)firstNum + " is: ");
                  } else {
                    textAreaSecond.setText(secondNum + "% for number " + firstNum + " is: ");
                }
            });
            buttonDot.addActionListener(new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    textArea.setText(textArea.getText() + ".");
                }
            });
            buttonRevers.addActionListener((ae) -> {
                double revers = Double.valueOf(textArea.getText());
                double result = revers * (-1);
                if (result != (int) result) {
                    textArea.setText(String.valueOf(result));
                } else {
                    textArea.setText(String.valueOf((int) result));
                }
            });
            buttonSqrt.addActionListener((ae) -> {
                double sqrt=Double.valueOf(textArea.getText());
                sqrt=Math.sqrt(sqrt);
                if ((int)sqrt!=sqrt) {
                    textArea.setText(String.valueOf((float)sqrt));
                }else {
                    textArea.setText(String.valueOf((int) sqrt));
                }
            });
            buttonEquals.addActionListener((ae) -> {
                textAreaSecond.setText(null);
                secondNum=Double.valueOf(textArea.getText());
                double secMinus=Double.valueOf(textArea.getText())-firstNum;
                double secPlus=Double.valueOf(textArea.getText())-firstNum;
                double secMult=Double.valueOf(textArea.getText())/firstNum;
                double secDiv=Double.valueOf(textArea.getText())/firstNum;

                switch (operations) {
                    case "+":
                        operations2 = "+";
                        result = firstNum + secondNum;
                        if ((int)result!=result) {
                            textArea.setText(String.valueOf((float)result));
                        }else {
                            textArea.setText(String.valueOf((int) result));
                        }
                        break;
                    case "-":
                        operations2 = "-";
                        result = firstNum - secondNum;
                        if ((int)result!=result) {
                            textArea.setText(String.valueOf((float)result));
                        }else {
                            textArea.setText(String.valueOf((int) result));
                        }
                        break;
                    case "*":
                        operations2 = "*";
                        result = firstNum * secondNum;
                        if ((int)result!=result) {
                            textArea.setText(String.valueOf((float)result));
                        }else {
                            textArea.setText(String.valueOf((int) result));
                        }
                        break;
                    case "/":
                        operations2 = "/";
                        result = firstNum / secondNum;
                        if ((int)result!=result) {
                            textArea.setText(String.valueOf((float)result));
                        }else {
                            textArea.setText(String.valueOf((int) result));
                        }
                        break;
                }
                if (operations.equals("=")){
                    switch (operations2) {
                        case "+":
                            double result1 = secPlus + result;
                            if ((int)result1!=result1) {
                                textArea.setText(String.valueOf((float)result1));
                            }else {
                                textArea.setText(String.valueOf((int) result1));
                            }
                            break;
                        case "-":
                            double result2 =  secMinus + result;
                            if ((int)result2!=result2) {
                                textArea.setText(String.valueOf((float)result2));
                            }else {
                                textArea.setText(String.valueOf((int) result2));
                            }
                            break;
                        case "*":
                            double result3=secMult*result;
                            if ((int)result3!=result3) {
                                textArea.setText(String.valueOf((float)result3));
                            }else {
                                textArea.setText(String.valueOf((int) result3));
                            }
                            break;
                        case "/":
                            double result4=secDiv*result;
                            if ((int)result4!=result4) {
                                textArea.setText(String.valueOf((float)result4));
                            }else {
                                textArea.setText(String.valueOf((int) result4));
                            }
                            break;
                    }
                }
                operations = "=";
               // try{
               //     Double.valueOf(textArea.getText());
               // }catch (NumberFormatException e){
               //     textArea.setText("empty string");
               // }
            });
            buttonClear.addActionListener((ae) -> {
                String bp;
                if (textArea.getText().length() > 0) {
                    StringBuilder bui = new StringBuilder(textArea.getText());
                    bui.deleteCharAt(textArea.getText().length() - 1);
                    bp = bui.toString();
                    textArea.setText(bp);
                }
            });
            buttonClearAll.addActionListener((ae) -> {
                if (textArea.getText().length() > 0) {
                    textArea.setText(null);
                } else if (textAreaSecond.getText().length() > 0) {
                    textAreaSecond.setText(null);
                }
            });
            thread th = new thread();
            th.run();
        }
    }
