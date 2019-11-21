package id.ac.its.patrick.swingmovingsprites;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class MainApp extends JFrame {

    public MainApp() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setResizable(false);
        pack();
        
        setTitle("Collision");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
        	MainApp ex = new MainApp();
            ex.setVisible(true);
        });
    }
}
    