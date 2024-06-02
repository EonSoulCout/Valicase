package Vista;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui_MenuMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnSales;
	private JLabel lblSales;
	private JLabel lblClient;
	private JButton btnClient;
	private JButton btnProv;
	private JLabel lblProv;
	private JButton btnInventory;
	private JLabel lblInventory;
	private JLabel lblBalanceicon;
	private JButton btnBalance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_MenuMain frame = new Gui_MenuMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui_MenuMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSales = new JButton("Registro de ventas");
		btnSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSales.setBounds(10, 142, 222, 32);
		contentPane.add(btnSales);
		
		lblSales = new JLabel("Icono de Venta");
		lblSales.setBounds(61, 63, 120, 70);
		contentPane.add(lblSales);
		
		btnClient = new JButton("Registro de clientes");
		btnClient.setBounds(10, 316, 222, 32);
		contentPane.add(btnClient);
		
		lblClient = new JLabel("Icono de Clientes");
		ImageIcon inventoryIcon2 = new ImageIcon(Gui_MenuMain.class.getResource("/Vista/Multimedia/cliente.png"));
		Image img2 = inventoryIcon2.getImage();
		Image scaledImg2 = img2.getScaledInstance(120, 100, Image.SCALE_SMOOTH);
		lblClient.setIcon(new ImageIcon(scaledImg2));
		lblClient.setBounds(61, 212, 120, 100);
		contentPane.add(lblClient);
		
		btnProv = new JButton("Registro de proovedores");
		btnProv.setBounds(262, 316, 222, 32);
		contentPane.add(btnProv);
		
		lblProv = new JLabel("Icono de Proovedores");
		lblProv.setBounds(313, 227, 120, 70);
		contentPane.add(lblProv);
		
		btnInventory = new JButton("Registro de Inventario");
		btnInventory.setBounds(262, 142, 222, 32);
		contentPane.add(btnInventory);
		
		lblInventory = new JLabel("Icono de Inventario");
	    ImageIcon inventoryIcon = new ImageIcon(Gui_MenuMain.class.getResource("/Vista/Multimedia/inventario-disponible.png"));
	    Image img = inventoryIcon.getImage();
	    Image scaledImg = img.getScaledInstance(120, 100, Image.SCALE_SMOOTH);
	    lblInventory.setIcon(new ImageIcon(scaledImg));
	    lblInventory.setBounds(313, 37, 120, 100);
	    contentPane.add(lblInventory);
		
		lblBalanceicon = new JLabel("BalanceIcon");
		lblBalanceicon.setBounds(517, 96, 117, 99);
		contentPane.add(lblBalanceicon);
		
		btnBalance = new JButton("Balance");
		btnBalance.setBounds(517, 204, 117, 32);
		contentPane.add(btnBalance);
	}
}
