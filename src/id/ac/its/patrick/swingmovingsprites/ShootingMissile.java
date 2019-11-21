package id.ac.its.patrick.swingmovingsprites;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ShootingMissile extends JFrame {

    public ShootingMissile() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setSize(400, 300);
        setResizable(false);
        
        setTitle("Shooting missiles");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            ShootingMissile ex = new ShootingMissile();
            ex.setVisible(true);
        });
    }
}