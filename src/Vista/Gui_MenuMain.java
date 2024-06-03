package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Controller.LogicaMenu;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui_MenuMain extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JButton btnSales;
	public JLabel lblSales;
	public JLabel lblClient;
	public JButton btnClient;
	public JButton btnProv;
	public JLabel lblProv;
	public JButton btnInventory;
	public JLabel lblInventory;
	public JLabel lblBalanceicon;
	public JButton btnEmpleados;
	

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
		contentPane.setBackground(new Color(203, 205, 231));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSales = new JButton("Registro de ventas");
		btnSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSales.setBackground(new Color(253, 249, 166));
		btnSales.setBounds(10, 142, 222, 32);
		contentPane.add(btnSales);
		
		lblSales = new JLabel("Icono de Venta");
		ImageIcon inventoryIconsale = new ImageIcon(Gui_MenuMain.class.getResource("/Vista/Multimedia/bienes.png"));
		Image imgs = inventoryIconsale.getImage();
		Image scaledImgs = imgs.getScaledInstance(120, 100, Image.SCALE_SMOOTH);
		lblSales.setIcon(new ImageIcon(scaledImgs));
		lblSales.setBounds(61, 37, 120, 100);
		contentPane.add(lblSales);
		
		btnClient = new JButton("Registro de clientes");
		btnClient.setBackground(new Color(253, 249, 166));
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
		btnProv.setBackground(new Color(253, 249, 166));
		btnProv.setBounds(262, 316, 222, 32);
		contentPane.add(btnProv);
		
		lblProv = new JLabel("Icono de Proovedores");
		ImageIcon inventoryIconp = new ImageIcon(Gui_MenuMain.class.getResource("/Vista/Multimedia/pr.png"));
		Image imgp = inventoryIconp.getImage();
		Image scaledImgp = imgp.getScaledInstance(120, 100, Image.SCALE_SMOOTH);
		lblProv.setIcon(new ImageIcon(scaledImgp));
		lblProv.setBounds(313, 212, 120, 100);
		contentPane.add(lblProv);
		
		btnInventory = new JButton("Registro de Inventario");
		btnInventory.setBackground(new Color(253, 249, 166));
		btnInventory.setBounds(262, 142, 222, 32);
		contentPane.add(btnInventory);
		
		lblInventory = new JLabel("Icono de Inventario");
	    ImageIcon inventoryIcon = new ImageIcon(Gui_MenuMain.class.getResource("/Vista/Multimedia/inventario-disponible.png"));
	    Image img = inventoryIcon.getImage();
	    Image scaledImg = img.getScaledInstance(120, 100, Image.SCALE_SMOOTH);
	    lblInventory.setIcon(new ImageIcon(scaledImg));
	    lblInventory.setBounds(313, 37, 120, 100);
	    contentPane.add(lblInventory);
		
		lblBalanceicon = new JLabel("Solo Supervisores");
		lblBalanceicon.setBounds(500, 65, 121, 19);
		contentPane.add(lblBalanceicon);
		
		btnEmpleados = new JButton("Modificar Empleados");
		btnEmpleados.setBackground(new Color(253, 249, 166));
		btnEmpleados.setBounds(477, 24, 159, 32);
		contentPane.add(btnEmpleados);
		Gui_Sale gs=new Gui_Sale();
		Gui_Client gc= new Gui_Client();
		Gui_Inventory gi=new Gui_Inventory();
		Gui_Suppliers gp=new Gui_Suppliers();
		Gui_Employees ge=new Gui_Employees();
		LogicaMenu lm=new LogicaMenu(this, gc, gi,gs,gp,ge);		
	}
}
