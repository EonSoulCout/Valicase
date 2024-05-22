package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui_Client extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAdress;
	private JTextField txtName;
	private JTextField txtNumber;
	private JTextField txtDni;
	private final JTable tblClients = new JTable();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_Client frame = new Gui_Client();
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
	public Gui_Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNameProduct = new JLabel("Nombre: ");
		lblNameProduct.setBounds(10, 50, 51, 14);
		contentPane.add(lblNameProduct);
		
		JLabel lblAdress = new JLabel("Dirección: ");
		lblAdress.setBounds(10, 80, 51, 14);
		contentPane.add(lblAdress);
		
		txtAdress = new JTextField();
		txtAdress.setColumns(10);
		txtAdress.setBounds(71, 77, 149, 20);
		contentPane.add(txtAdress);
		
		txtName = new JTextField();
		txtName.setToolTipText("Nombre del producto");
		txtName.setColumns(10);
		txtName.setBounds(71, 50, 149, 20);
		contentPane.add(txtName);
		
		txtNumber = new JTextField();
		txtNumber.setColumns(10);
		txtNumber.setBounds(71, 105, 149, 20);
		contentPane.add(txtNumber);
		
		JLabel lblContacto = new JLabel("Contacto:");
		lblContacto.setBounds(10, 108, 51, 14);
		contentPane.add(lblContacto);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(71, 136, 149, 20);
		contentPane.add(txtDni);
		
		JLabel lblDni = new JLabel("C.I. :");
		lblDni.setBounds(10, 139, 51, 14);
		contentPane.add(lblDni);
		
		JButton btnRegister = new JButton("Registrar");
		btnRegister.setBounds(10, 167, 89, 23);
		contentPane.add(btnRegister);
		tblClients.setBounds(266, 50, 305, 140);
		contentPane.add(tblClients);
		
		JComboBox cmbClients = new JComboBox();
		cmbClients.setBounds(10, 15, 305, 20);
		contentPane.add(cmbClients);
		
		JButton btnRefrescar = new JButton("Refrescar");
		btnRefrescar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRefrescar.setBounds(482, 14, 89, 23);
		contentPane.add(btnRefrescar);
	}
}
