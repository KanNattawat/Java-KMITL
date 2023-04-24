/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab11_3;

/**
 *
 * @author natta
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TellerGUI extends Account implements ActionListener{
    private JFrame fr;
    private JPanel pn0;
    private JPanel pn1;
    private JPanel pn2;
    private JPanel pn3;
    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    private JTextArea ta;
    private JButton bn1;
    private JButton bn2;
    private JButton bn3;
    
    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        pn0 = new JPanel();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        lb1 = new JLabel("  Balance");
        lb2 = new JLabel("  Amount");
        lb3 = new JLabel("0.0");
        ta = new JTextArea();
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        
        
        pn1.setLayout(new GridLayout(1, 2));
        pn1.add(lb1);
        pn1.add(lb3);
        
        pn2.setLayout(new GridLayout(1, 2));
        pn2.add(lb2);
        pn2.add(ta);
        
        pn3.setLayout(new FlowLayout());
        pn3.add(bn1);
        pn3.add(bn2);
        pn3.add(bn3);
        
        fr.setLayout(new GridLayout(4, 1));
        fr.add(pn1);
        fr.add(pn2);
        fr.add(pn3);
        fr.add(pn0);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(280, 200);
        fr.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(bn1)) {
            deposit(Double.parseDouble(ta.getText()));
            lb3.setText(String.valueOf(balance));
        } else if (e.getSource().equals(bn2)) {
            withdraw(Double.parseDouble(ta.getText()));
            lb3.setText(String.valueOf(balance));
        } 
    }
}
