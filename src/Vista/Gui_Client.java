package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Controller.LogicaIngreso;
import Controller.LogicaMenu;
import Model.Clientes;

public class Gui_Client extends JFrame {

	public static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField txtAdress;
	public JTextField txtName;
	public JTextField txtNumber;
	public JTextField txtDni;
	public JTable tblClients;
	public JButton btnRegister;
	public JButton btnRegresar;
	public DefaultTableModel tableModel;
	public JButton btnEliminar;
	public JButton btnModificar;

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
		setBounds(100, 100, 636, 293);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(203, 205, 231));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNameProduct = new JLabel("Nombre: ");
		lblNameProduct.setBounds(10, 50, 74, 14);
		contentPane.add(lblNameProduct);

		JLabel lblAdress = new JLabel("Dirección: ");
		lblAdress.setBounds(10, 80, 74, 14);
		contentPane.add(lblAdress);

		txtAdress = new JTextField();
		txtAdress.setBackground(new Color(253, 249, 166));
		txtAdress.setToolTipText("Dirección del cliente");
		txtAdress.setColumns(10);
		txtAdress.setBounds(94, 78, 149, 20);
		contentPane.add(txtAdress);

		txtName = new JTextField();
		txtName.setBackground(new Color(253, 249, 166));
		txtName.setToolTipText("Nombre del cliente");
		txtName.setColumns(10);
		txtName.setBounds(94, 48, 149, 20);
		contentPane.add(txtName);

		txtNumber = new JTextField();
		txtNumber.setBackground(new Color(253, 249, 166));
		txtNumber.setToolTipText("Telefono del cliente");
		txtNumber.setColumns(10);
		txtNumber.setBounds(94, 108, 149, 20);
		contentPane.add(txtNumber); 
 
		JLabel lblContacto = new JLabel("Contacto:");
		lblContacto.setBounds(10, 108, 74, 14);
		contentPane.add(lblContacto);

		txtDni = new JTextField();
		txtDni.setBackground(new Color(253, 249, 166));
		txtDni.setToolTipText("Ruc del cliente");
		txtDni.setColumns(10);
		txtDni.setBounds(94, 137, 149, 20);
		contentPane.add(txtDni);

		JLabel lblDni = new JLabel("RUC:");
		lblDni.setBounds(10, 139, 51, 14);
		contentPane.add(lblDni);

		btnRegister = new JButton("Registrar");
		btnRegister.setBackground(new Color(253, 249, 166));
		btnRegister.setToolTipText("Registrar al cliente");
		btnRegister.setBounds(154, 179, 89, 23);
		contentPane.add(btnRegister);

		String[] columnNames = {"Nombre", "Dirección", "Contacto", "RUC"};
		tableModel = new DefaultTableModel(columnNames, 0) {
			@Override 
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		tblClients = new JTable(tableModel);
		tblClients.setToolTipText("");
		JScrollPane scrollPane = new JScrollPane(tblClients);
		scrollPane.setBounds(266, 50, 346, 184);
		scrollPane.getViewport().setBackground(Color.white);
		tblClients.getTableHeader().setReorderingAllowed(false);
		tblClients.getTableHeader().setBackground(Color.white);;
		contentPane.add(scrollPane);
		
		btnRegresar = new JButton("Canelar");
		btnRegresar.setBackground(new Color(253, 249, 166));
		btnRegresar.setToolTipText("Volver al menu");
		btnRegresar.setBounds(523, 17, 89, 23);
		contentPane.add(btnRegresar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(253, 249, 166));
		btnEliminar.setToolTipText("Eliminar al cliente");
		btnEliminar.setBounds(10, 179, 89, 23);
		contentPane.add(btnEliminar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBackground(new Color(253, 249, 166));
		btnModificar.setToolTipText("Modificar al cliente");
		btnModificar.setBounds(10, 220, 89, 23);
		contentPane.add(btnModificar);


	}
	public void agregarClienteATabla(Clientes cliente) {
		tableModel.addRow(new Object[]{
				cliente.getNames(), 
				cliente.getEmail(), 
				cliente.getCodigo(), 
				cliente.getDni()
		});
	}
}
