import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Action extends Calculator implements MouseListener{

    Action(){
        button0.addMouseListener(this);
        button1.addMouseListener(this);
        button2.addMouseListener(this);
        button3.addMouseListener(this);
        button4.addMouseListener(this);
        button5.addMouseListener(this);
        button6.addMouseListener(this);
        button7.addMouseListener(this);
        button8.addMouseListener(this);
        button9.addMouseListener(this);
        buttonEquals.addMouseListener(this);
        buttonPlus.addMouseListener(this);
        buttonMinus.addMouseListener(this);
        buttonMultiply.addMouseListener(this);
        buttonDivision.addMouseListener(this);
        buttonClear.addMouseListener(this);
        buttonClearAll.addMouseListener(this);
        buttonDot.addMouseListener(this);
        buttonPercent.addMouseListener(this);
        buttonRevers.addMouseListener(this);
        buttonSqrt.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e) {
    }
    public void mousePressed(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {

        if (e.getSource()==button0){
            button0.setBackground(Color.ORANGE);
        }
        if (e.getSource()==button1){
            button1.setBackground(Color.ORANGE);
        }
        if (e.getSource()==button2){
            button2.setBackground(Color.ORANGE);
        }
        if (e.getSource()==button3){
            button3.setBackground(Color.ORANGE);
        }
        if (e.getSource()==button4){
            button4.setBackground(Color.ORANGE);
        }
        if (e.getSource()==button5){
            button5.setBackground(Color.ORANGE);
        }
        if (e.getSource()==button6){
            button6.setBackground(Color.ORANGE);
        }
        if (e.getSource()==button7){
            button7.setBackground(Color.ORANGE);
        }
        if (e.getSource()==button8){
            button8.setBackground(Color.ORANGE);
        }
        if (e.getSource()==button9){
            button9.setBackground(Color.ORANGE);
        }
        if (e.getSource()==buttonEquals){
            buttonEquals.setBackground(Color.ORANGE);
        }
        if (e.getSource()==buttonPlus){
            buttonPlus.setBackground(Color.ORANGE);
        }
        if (e.getSource()==buttonMinus){
            buttonMinus.setBackground(Color.ORANGE);
        }
        if (e.getSource()==buttonMultiply){
            buttonMultiply.setBackground(Color.ORANGE);
        }
        if (e.getSource()==buttonDivision){
            buttonDivision.setBackground(Color.ORANGE);
        }
        if (e.getSource()==buttonClear){
            buttonClear.setBackground(Color.ORANGE);
        }
        if (e.getSource()==buttonClearAll){
            buttonClearAll.setBackground(Color.ORANGE);
        }
        if (e.getSource()==buttonDot){
            buttonDot.setBackground(Color.ORANGE);
        }
        if (e.getSource()==buttonPercent){
            buttonPercent.setBackground(Color.ORANGE);
        }
        if (e.getSource()==buttonRevers){
            buttonRevers.setBackground(Color.ORANGE);
        }
        if (e.getSource()==buttonSqrt){
            buttonSqrt.setBackground(Color.ORANGE);
        }
    }

    public void mouseExited(MouseEvent e) {
        if (e.getSource()==button0){
            button0.setBackground(Color.WHITE);
        }
        if (e.getSource()==button1){
            button1.setBackground(Color.WHITE);
        }
        if (e.getSource()==button2){
            button2.setBackground(Color.WHITE);
        }
        if (e.getSource()==button3){
            button3.setBackground(Color.WHITE);
        }
        if (e.getSource()==button4){
            button4.setBackground(Color.WHITE);
        }
        if (e.getSource()==button5){
            button5.setBackground(Color.WHITE);
        }
        if (e.getSource()==button6){
            button6.setBackground(Color.WHITE);
        }
        if (e.getSource()==button7){
            button7.setBackground(Color.WHITE);
        }
        if (e.getSource()==button8){
            button8.setBackground(Color.WHITE);
        }
        if (e.getSource()==button9){
            button9.setBackground(Color.WHITE);
        }
        if (e.getSource()==buttonEquals){
            buttonEquals.setBackground(Color.WHITE);
        }
        if (e.getSource()==buttonPlus){
            buttonPlus.setBackground(Color.WHITE);
        }
        if (e.getSource()==buttonMinus){
            buttonMinus.setBackground(Color.WHITE);
        }
        if (e.getSource()==buttonMultiply){
            buttonMultiply.setBackground(Color.WHITE);
        }
        if (e.getSource()==buttonDivision){
            buttonDivision.setBackground(Color.WHITE);
        }
        if (e.getSource()==buttonClear){
            buttonClear.setBackground(Color.WHITE);
        }
        if (e.getSource()==buttonClearAll){
            buttonClearAll.setBackground(Color.WHITE);
        }
        if (e.getSource()==buttonDot){
            buttonDot.setBackground(Color.WHITE);
        }
        if (e.getSource()==buttonPercent){
            buttonPercent.setBackground(Color.WHITE);
        }
        if (e.getSource()==buttonRevers){
            buttonRevers.setBackground(Color.WHITE);
        }
        if (e.getSource()==buttonSqrt){
            buttonSqrt.setBackground(Color.WHITE);
        }
    }
}

