package progii.juegotablero.gui;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainAjedrez {
    public MainAjedrez() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new FrameAjedrez(); 
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                	ex.printStackTrace(); 
                }
            }
        });
    }
    
    public static void main(String[] args) {
		new MainAjedrez(); 
	}
}
