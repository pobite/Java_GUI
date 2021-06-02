import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;

public class GpadAir {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GpadAir window = new GpadAir();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GpadAir() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(panel);
		
		ImageIcon gapplePad = new ImageIcon("gimages/GpadAir.jpg");
		Image chGpadAir = gapplePad.getImage();
		Image sGpadAir = chGpadAir.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon gpadAiricon = new ImageIcon(sGpadAir);
		panel.setLayout(null);
		JLabel gPadAir = new JLabel(gpadAiricon);
		gPadAir.setBounds(12, 5, 300, 300);
		panel.add(gPadAir);
		
		String [] colors = {"choose the color","Space Gray","Silver","Woody Brown"}; 
		JComboBox<String> color = new JComboBox<String>(colors);
		color.setBounds(518, 80, 107, 23);
		panel.add(color);
		
		String [] capacitys = {"choose the capacity","128GB","256GB"}; 
		JComboBox<String> capacity = new JComboBox<String>(capacitys);
		capacity.setBounds(518, 150, 107, 23);
		panel.add(capacity);
		
		String [] quantities = {"0","1","2","3","4","5","6","7","8","9","10"};
		JComboBox<String> quantity = new JComboBox<String>(quantities);
		quantity.setBounds(518, 220, 107, 23);
		panel.add(quantity);
		
		JLabel colorLabel = new JLabel("Color:");
		colorLabel.setFont(new Font("±¼¸²", Font.BOLD, 14));
		colorLabel.setBounds(384, 82, 82, 15);
		panel.add(colorLabel);
		
		JLabel capacityLabel = new JLabel("Capacity:");
		capacityLabel.setFont(new Font("±¼¸²", Font.BOLD, 14));
		capacityLabel.setBounds(384, 154, 82, 15);
		panel.add(capacityLabel);
		
		JLabel quantityLabel = new JLabel("Quantity:");
		quantityLabel.setFont(new Font("±¼¸²", Font.BOLD, 14));
		quantityLabel.setBounds(384, 226, 82, 15);
		panel.add(quantityLabel);
		
		JLabel nameLabel = new JLabel("GPad Air ");
		nameLabel.setFont(new Font("ÇÑÄÄ °íµñ", Font.BOLD, 20));
		nameLabel.setBounds(15, 300, 250, 80);
		panel.add(nameLabel);
		
		JButton orderBtn = new JButton("Order");
		orderBtn.setBackground(SystemColor.text);
		orderBtn.setForeground(SystemColor.desktop);
		orderBtn.setFont(new Font("±¼¸²", Font.BOLD, 18));
		orderBtn.setBounds(449, 317, 176, 44);
		panel.add(orderBtn);
	}

}
