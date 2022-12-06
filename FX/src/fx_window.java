import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.FlowLayout;

public class fx_window extends JFrame{
	
	
	public static void main(String[] args) {try{
		
		fx_window_layout layout = new fx_window_layout();
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setSize(800,300);
		layout.setVisible(true);

			
		}catch(Exception e) {
			System.out.println("ERROR: "+e);
			}
	}
}