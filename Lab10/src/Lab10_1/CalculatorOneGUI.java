package Lab10_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natta
 */
import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame jf;
    private JPanel pn;
    private TextField tf1;
    private TextField tf2;
    private TextField tf3;
    private JButton bn1;
    private JButton bn2;
    private JButton bn3;
    private JButton bn4;
    
    public CalculatorOneGUI() {
        jf = new JFrame("เครื่องคิดเลข");
        pn = new JPanel();
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        bn1 = new JButton("บวก");
        bn2 = new JButton("ลบ");
        bn3 = new JButton("คูณ");
        bn4 = new JButton("หาร");
        
        jf.setLayout(new GridLayout(4, 1));
        Font f = new Font("TH SarabunPSK", Font.BOLD, 12);
        bn1.setFont(f);
        bn2.setFont(f);
        bn3.setFont(f);
        bn4.setFont(f);
        pn.add(bn1);
        pn.add(bn2);
        pn.add(bn3);
        pn.add(bn4);
        jf.add(tf1);
        jf.add(tf2);
        jf.add(pn);
        jf.add(tf3);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300, 200);
        jf.setVisible(true);
        
    }
}
