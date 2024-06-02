package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;

public class Gui_Suppliers extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDni;
	private JTextField txtEmail;
	private JTextField textField_2;
	private JTextField txtCode;
	private JLabel lblTelefono;
	private JTextField txtPhone;
	private JLabel lblRazon;
	private JTextField textField_1;
	private JButton btnBuscar;
	private JButton btnDelete;
	private JButton btnSave;
	private final JTable tblListSuppl = new JTable();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_Suppliers frame = new Gui_Suppliers();
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
	public Gui_Suppliers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNameEmployee = new JLabel("Nombre: ");
		lblNameEmployee.setBounds(10, 10, 51, 14);
		contentPane.add(lblNameEmployee);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 35, 51, 14);
		contentPane.add(lblEmail);
		
		JLabel lblDni = new JLabel("Dni:");
		lblDni.setBounds(10, 62, 51, 14);
		contentPane.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(71, 59, 149, 20);
		contentPane.add(txtDni);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(71, 34, 149, 20);
		contentPane.add(txtEmail);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Nombre del producto");
		textField_2.setColumns(10);
		textField_2.setBounds(71, 10, 149, 20);
		contentPane.add(textField_2);
		
		JLabel lblCode = new JLabel("Code:");
		lblCode.setBounds(271, 12, 29, 14);
		contentPane.add(lblCode);
		
		txtCode = new JTextField();
		txtCode.setToolTipText("Ingresar Dni del empleado");
		txtCode.setColumns(10);
		txtCode.setBounds(332, 10, 149, 20);
		contentPane.add(txtCode);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 88, 51, 14);
		contentPane.add(lblTelefono);
		
		txtPhone = new JTextField();
		txtPhone.setToolTipText("Ingresar Dni del empleado");
		txtPhone.setColumns(10);
		txtPhone.setBounds(71, 86, 149, 20);
		contentPane.add(txtPhone);
		
		lblRazon = new JLabel("Razon:");
		lblRazon.setBounds(10, 114, 40, 14);
		contentPane.add(lblRazon);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Ingresar Dni del empleado");
		textField_1.setColumns(10);
		textField_1.setBounds(71, 112, 149, 20);
		contentPane.add(textField_1);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(491, 9, 85, 21);
		contentPane.add(btnBuscar);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.setBounds(396, 111, 85, 21);
		contentPane.add(btnDelete);
		
		btnSave = new JButton("Guardar");
		btnSave.setBounds(491, 111, 85, 21);
		contentPane.add(btnSave);
		tblListSuppl.setBounds(10, 150, 579, 163);
		contentPane.add(tblListSuppl);
	}
}
