/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10_4;

/**
 *
 * @author natta
 */
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane dp;
    private JMenuBar mb;
    private JMenu mn1, mn2, mn3, mni1;
    private JMenuItem mni2, mni3, mni4, mni1_1, mni1_2;
    private JInternalFrame frame1, frame2, frame3;
    
    public MDIFromGUI() {
        dp = new JDesktopPane();
        fr = new JFrame("SubMenuItem Demo");
        mb = new JMenuBar();
        mn1 = new JMenu("File");
        mn2 = new JMenu("Edit");
        mn3 = new JMenu("View");
        mni1 = new JMenu("New");
        mni1_1 = new JMenuItem("Window");
        mni1_2 = new JMenuItem("Message");
        mni2 = new JMenuItem("Open");
        mni3 = new JMenuItem("Save");
        mni4 = new JMenuItem("Exit");
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);
        
        frame1.setVisible(true);
        frame1.setSize(200, 200);
        frame2.setVisible(true);
        frame2.setSize(200, 200);
        frame3.setVisible(true);
        frame3.setSize(300, 300);
        frame1.setLocation(300, 300);
        frame2.setLocation(600, 600);
        frame3.setLocation(900, 300);
        
        dp.add(frame1);
        dp.add(frame2);
        dp.add(frame3);
        
        fr.setJMenuBar(mb);
        fr.add(dp);
        mni1.add(mni1_1);
        mni1.add(mni1_2);
        mn1.add(mni1);
        mn1.addSeparator();
        mn1.add(mni2);
        mn1.addSeparator();
        mn1.add(mni3);
        mn1.addSeparator();
        mn1.add(mni4);
        
        mb.add(mn1);
        mb.add(mn2);
        mb.add(mn3);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1920, 1080);
        fr.setVisible(true);
        dp.add(fr);
        
        
        
    }
    
}
