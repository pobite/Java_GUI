import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;

public class GphoneStandard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GphoneStandard window = new GphoneStandard();
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
	public GphoneStandard() {
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
		
		ImageIcon gApple = new ImageIcon("gimages/GphoneStandard.jpg");
		Image chGapple = gApple.getImage();
		Image sGapple = chGapple.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon gAppleicon = new ImageIcon(sGapple);
		panel.setLayout(null);
		JLabel gphoneStandard = new JLabel(gAppleicon);
		gphoneStandard.setBounds(12, 5, 300, 300);
		panel.add(gphoneStandard);
		
		String [] colors = {"choose the color","Space Gray","Emerald Green","Bad Red","Woody Brown"}; 
		JComboBox<String> color = new JComboBox<String>(colors);
		color.setBounds(518, 80, 107, 23);
		panel.add(color);
		
		String [] capacitys = {"choose the capacity","64GB","256GB","512GB"}; 
		JComboBox<String> capacity = new JComboBox<String>(capacitys);
		capacity.setBounds(518, 150, 107, 23);
		panel.add(capacity);
		
		String [] quantities = {"0","1","2","3","4","5","6","7","8","9","10"};
		JComboBox<String> quantity = new JComboBox<String>(quantities);
		quantity.setBounds(518, 220, 107, 23);
		panel.add(quantity);
		
		JLabel colorLabel = new JLabel("Color:");
		colorLabel.setFont(new Font("????", Font.BOLD, 14));
		colorLabel.setBounds(384, 82, 82, 15);
		panel.add(colorLabel);
		
		JLabel capacityLabel = new JLabel("Capacity:");
		capacityLabel.setFont(new Font("????", Font.BOLD, 14));
		capacityLabel.setBounds(384, 154, 82, 15);
		panel.add(capacityLabel);
		
		JLabel quantityLabel = new JLabel("Quantity:");
		quantityLabel.setFont(new Font("????", Font.BOLD, 14));
		quantityLabel.setBounds(384, 226, 82, 15);
		panel.add(quantityLabel);
		
		JLabel nameLabel = new JLabel("G-Phone 13 Standard ");
		nameLabel.setFont(new Font("???? ????", Font.BOLD, 20));
		nameLabel.setBounds(15, 300, 250, 80);
		panel.add(nameLabel);
		
		JButton orderBtn = new JButton("Order");
		orderBtn.setBackground(SystemColor.text);
		orderBtn.setForeground(SystemColor.desktop);
		orderBtn.setFont(new Font("????", Font.BOLD, 18));
		orderBtn.setBounds(449, 317, 176, 44);
		panel.add(orderBtn);
	}

}
