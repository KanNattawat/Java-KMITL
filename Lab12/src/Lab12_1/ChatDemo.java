/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12_1;

/**
 *
 * @author natta
 */
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.*;
import javax.swing.*;
import java.io.*;
public class ChatDemo implements ActionListener, WindowListener {
    private JFrame frame;
    private JPanel panel1, panel2, panel3;
    private JTextArea ta;
    private JTextField tf;
    private JButton submit, reset;
    
    private File logs;
    
    public ChatDemo() {
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        ta = new JTextArea(45, 20);
        ta.setEditable(false);
        tf = new JTextField(45);
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        submit.addActionListener(this);
        reset.addActionListener(this);
        frame.addWindowListener(this);
        frame.setLayout(new BorderLayout());
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new GridLayout(2, 1));
        panel3.add(submit);
        panel3.add(reset);
        frame.add(ta, BorderLayout.CENTER);
        panel2.add(tf);
        panel2.add(panel3);
        frame.add(panel2, BorderLayout.SOUTH);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        
        logs = new File("ChatDemo.dat");
        try {
            logs.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
            }
    @Override
        public void actionPerformed(ActionEvent ae) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            if (ae.getSource().equals(submit)) {
                if (tf.getText().equals("")) {
                    System.out.println("Can't send message");
                } else {
                    ta.setText(ta.getText() + "\n" + dtf.format(LocalDateTime.now()) + " : " + tf.getText());
                    tf.setText("");
                }
            } else if (ae.getSource().equals(reset)) {
                ta.setText("");
            }
        }

    @Override
        public void windowOpened(WindowEvent e) {
            if (logs.exists()) {
            String data = "";
            try (FileReader fr = new FileReader(logs)) {
                int chr;
                while ((chr = fr.read()) != -1) {
                    data += (char) chr;
                }
                System.out.println(data);
                ta.setText(data);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
                System.out.println("File not found.");
            }
    }

    /**
     *
     * @param e
     */
    @Override
        public void windowClosing(WindowEvent e) {
            try (FileWriter fw = new FileWriter(logs)) {
                String data = ta.getText();
                for (int i = 0; i < data.length(); i++) {
                    fw.write(data.charAt(i));
                }
                System.out.println("Save data");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    @Override
    public void windowClosed(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
