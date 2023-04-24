/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab11_2;

/**
 *
 * @author natta
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CalculatorSample implements  ActionListener {
    private JFrame fr;
    private JPanel pn;
    private JTextField tf;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn10, bn11, bn12, bn13, bn14, bn16, bn17;
    private double num;
    private String operator;
    
    public CalculatorSample() {
        fr = new JFrame("My Calculator");
        pn = new JPanel();
        tf = new JTextField();
        bn1 = new JButton("1");
        bn2 = new JButton("2");
        bn3 = new JButton("3");
        bn4 = new JButton("4");
        bn5 = new JButton("5");
        bn6 = new JButton("6");
        bn7 = new JButton("7");
        bn8 = new JButton("8");
        bn9 = new JButton("9");
        bn10 = new JButton("0");
        bn11 = new JButton("c");
        bn12 = new JButton("=");
        bn13 = new JButton("+");
        bn14 = new JButton("-");
        bn16 = new JButton("x");
        bn17 = new JButton("/");
        
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        bn4.addActionListener(this);
        bn5.addActionListener(this);
        bn6.addActionListener(this);
        bn7.addActionListener(this);
        bn8.addActionListener(this);
        bn9.addActionListener(this);
        bn10.addActionListener(this);
        bn11.addActionListener(this);
        bn12.addActionListener(this);
        bn13.addActionListener(this);
        bn14.addActionListener(this);
        bn16.addActionListener(this);
        bn17.addActionListener(this);
        tf.setHorizontalAlignment(JTextField.RIGHT);
        fr.setLayout(new BorderLayout());
        pn.setLayout(new GridLayout(4, 4));
        pn.add(bn7);
        pn.add(bn8);
        pn.add(bn9);
        pn.add(bn13);
        pn.add(bn4);
        pn.add(bn5);
        pn.add(bn6);
        pn.add(bn14);
        pn.add(bn1);
        pn.add(bn2);
        pn.add(bn3);
        pn.add(bn16);
        pn.add(bn10);
        pn.add(bn11);
        pn.add(bn12);
        pn.add(bn17);
        
        fr.add(tf, BorderLayout.NORTH);
        fr.add(pn);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(350, 300);
        fr.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(bn1)) {
                System.out.println("bn1");
                tf.setText(tf.getText() + "1");
            } else if (e.getSource().equals(bn2)) {
                tf.setText(tf.getText() + "2");
            } else if (e.getSource().equals(bn3)) {
                tf.setText(tf.getText() + "3");
            } else if (e.getSource().equals(bn4)) {
                tf.setText(tf.getText() + "4");
            } else if (e.getSource().equals(bn5)) {
                tf.setText(tf.getText() + "5");
            } else if (e.getSource().equals(bn6)) {
                tf.setText(tf.getText() + "6");
            } else if (e.getSource().equals(bn7)) {
                tf.setText(tf.getText() + "7");
            } else if (e.getSource().equals(bn8)) {
                tf.setText(tf.getText() + "8");
            } else if (e.getSource().equals(bn9)) {
                tf.setText(tf.getText() + "9");
            } else if (e.getSource().equals(bn10)) {
                tf.setText(tf.getText() + "0");
            } else if (e.getSource().equals(bn11)) {
                tf.setText("");
                num = 0;
            } else if (e.getSource().equals(bn12)) {
                if (operator.equals("+")) {
                    num += Double.parseDouble(tf.getText());
                } else if (operator.equals("-")) {
                    num -= Double.parseDouble(tf.getText());
                } else if (operator.equals("*")) {
                    num *= Double.parseDouble(tf.getText());
                } else if (operator.equals("/")){
                    num /= Double.parseDouble(tf.getText());
                } else {
                    num = 0;
                }
                tf.setText(String.valueOf(num));
            } else if (e.getSource().equals(bn13)) {
                num = Double.parseDouble(tf.getText());
                operator = "+";
                tf.setText("");
            } else if (e.getSource().equals(bn14)) {
                num = Double.parseDouble(tf.getText());
                operator = "-";
                tf.setText("");
            } else if (e.getSource().equals(bn16)) {
                num = Double.parseDouble(tf.getText());
                operator = "*";
                tf.setText("");
            } else if (e.getSource().equals(bn17)) {
                num = Double.parseDouble(tf.getText());
                operator = "/";
                tf.setText("");
            }
    }
}
