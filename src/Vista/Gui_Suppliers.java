package Vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Model.Clientes;
import Model.Proovedores;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Font;

public class Gui_Suppliers extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField txtDni;
	public JTextField txtEmail;
	public JTextField txt_Nombre;
	public JTextField txtCode;
	public JLabel lblTelefono;
	public JTextField txtPhone;
	public JLabel lblRazon;
	public JButton Btn_modificar;
	public JButton btnDelete;
	public JButton btnSave;
	public JTable tblListSuppl;
	public JTextField txt_razon;
	public JButton btn_Regresar;
	public DefaultTableModel tableModel;

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
		contentPane.setBackground(new Color(203, 205, 231));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNameEmployee = new JLabel("Nombre: ");
		lblNameEmployee.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNameEmployee.setBounds(10, 10, 51, 14);
		contentPane.add(lblNameEmployee);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(10, 37, 51, 14);
		contentPane.add(lblEmail);
		
		JLabel lblDni = new JLabel("Dni:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDni.setBounds(10, 66, 51, 14);
		contentPane.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBackground(new Color(253, 249, 166));
		txtDni.setToolTipText("DNI del proovedor");
		txtDni.setColumns(10);
		txtDni.setBounds(91, 64, 149, 20);
		contentPane.add(txtDni);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(new Color(253, 249, 166));
		txtEmail.setToolTipText("email del proovedor");
		txtEmail.setColumns(10);
		txtEmail.setBounds(91, 35, 149, 20);
		contentPane.add(txtEmail);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setBackground(new Color(253, 249, 166));
		txt_Nombre.setToolTipText("Nombre del proovedor");
		txt_Nombre.setColumns(10);
		txt_Nombre.setBounds(91, 8, 149, 20);
		contentPane.add(txt_Nombre);
		
		JLabel lblCode = new JLabel("Codigo:");
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCode.setBounds(260, 10, 65, 14);
		contentPane.add(lblCode);
		
		txtCode = new JTextField();
		txtCode.setBackground(new Color(253, 249, 166));
		txtCode.setToolTipText("Codigo Unico ");
		txtCode.setColumns(10);
		txtCode.setBounds(310, 8, 149, 20);
		contentPane.add(txtCode);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefono.setBounds(10, 93, 71, 14);
		contentPane.add(lblTelefono);
		
		txtPhone = new JTextField();
		txtPhone.setBackground(new Color(253, 249, 166));
		txtPhone.setToolTipText("Telefono del proovedor");
		txtPhone.setColumns(10);
		txtPhone.setBounds(91, 90, 149, 20);
		contentPane.add(txtPhone);
		
		lblRazon = new JLabel("Razon:");
		lblRazon.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRazon.setBounds(10, 121, 40, 14);
		contentPane.add(lblRazon);
		
		txt_razon = new JTextField();
		txt_razon.setBackground(new Color(253, 249, 166));
		txt_razon.setToolTipText("Razón del Proovedor");
		txt_razon.setColumns(10);
		txt_razon.setBounds(91, 119, 149, 20);
		contentPane.add(txt_razon);
		
		Btn_modificar = new JButton("Modificar");
		Btn_modificar.setBackground(new Color(253, 249, 166));
		Btn_modificar.setToolTipText("Realizar modificaciones");
		Btn_modificar.setBounds(476, 9, 100, 21);
		contentPane.add(Btn_modificar);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.setBackground(new Color(253, 249, 166));
		btnDelete.setToolTipText("Eliminar Proveedor");
		btnDelete.setBounds(476, 41, 100, 21);
		contentPane.add(btnDelete);
		
		btnSave = new JButton("Guardar");
		btnSave.setBackground(new Color(253, 249, 166));
		btnSave.setToolTipText("Guardar cambios");
		btnSave.setBounds(476, 111, 100, 21);
		contentPane.add(btnSave);
		
		String[] columnNames = {"Nombre", "Email", "DNI", "Teléfono","Razón","Código"};
		tableModel = new DefaultTableModel(columnNames, 0) {
			@Override 
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		tblListSuppl = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(tblListSuppl);
		scrollPane.setBounds(10, 150, 579, 163);
		scrollPane.getViewport().setBackground(Color.white);
		tblListSuppl.getTableHeader().setReorderingAllowed(false);
		tblListSuppl.getTableHeader().setBackground(Color.white);;
		contentPane.add(scrollPane);

		btn_Regresar = new JButton("Cancelar");
		btn_Regresar.setBackground(new Color(253, 249, 166));
		btn_Regresar.setToolTipText("Regresarl almenu principal");
		btn_Regresar.setBounds(359, 111, 100, 21);
		contentPane.add(btn_Regresar);
	}
	public void agregarprovTabla(Proovedores pr) {
		tableModel.addRow(new Object[]{
				pr.getNames(), 
				pr.getEmail(),
				pr.getDni(),
				pr.getTelefono(),
				pr.getRazon(),
				pr.getCodigo(),
				
				
		});
	}
}
