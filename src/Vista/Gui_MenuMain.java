package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
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
		
		btnSales = new JButton("Registro_Ventas");
		btnSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSales.setBounds(10, 142, 222, 32);
		contentPane.add(btnSales);
		
		lblSales = new JLabel("Icono de Venta");
		lblSales.setBounds(10, 11, 222, 120);
		contentPane.add(lblSales);
		
		btnClient = new JButton("Registro_Clientes");
		btnClient.setBounds(10, 316, 222, 32);
		contentPane.add(btnClient);
		
		lblClient = new JLabel("Icono de Clientes");
		lblClient.setBounds(10, 185, 222, 120);
		contentPane.add(lblClient);
		
		btnProv = new JButton("Registro_Proovedores");
		btnProv.setBounds(262, 316, 222, 32);
		contentPane.add(btnProv);
		
		lblProv = new JLabel("Icono de Proovedores");
		lblProv.setBounds(262, 185, 222, 120);
		contentPane.add(lblProv);
		
		btnInventory = new JButton("Registro_ Inventario");
		btnInventory.setBounds(262, 142, 222, 32);
		contentPane.add(btnInventory);
		
		lblInventory = new JLabel("Icono de Inventario");
		lblInventory.setBounds(262, 11, 222, 120);
		contentPane.add(lblInventory);
		
		lblBalanceicon = new JLabel("BalanceIcon");
		lblBalanceicon.setBounds(517, 109, 117, 99);
		contentPane.add(lblBalanceicon);
		
		btnBalance = new JButton("Balance");
		btnBalance.setBounds(517, 204, 117, 32);
		contentPane.add(btnBalance);
	}
}
