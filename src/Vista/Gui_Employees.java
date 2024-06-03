package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import Controller.LogicaMenu;
import Model.Admin;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Gui_Employees extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTable tblListEmployees;
	public DefaultTableModel tableModel;
	public JTextField txtNameEmployee;
	public JTextField txt_dni;
	public JTextField txtEmail;
	public JTextField txt_codigo;
	public JButton btnModificar;
	public JButton btnDelete;
	public JButton btnSave;
	public JLabel lblFechaResgistro;
	public JLabel lblAutoDate;
	public JButton btn_Regresar;
	public JButton btnBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_Employees frame = new Gui_Employees();
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
	public Gui_Employees() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 329);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(203, 205, 231));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] columnNames = {"Nombre", "Email","Dni","Código","Fecha de Ingreso"};
		tableModel = new DefaultTableModel(columnNames, 0) {
			@Override 
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		tblListEmployees = new JTable(tableModel);
		tblListEmployees.setToolTipText("");
		tblListEmployees.setBounds(10, 112, 523, 173);
		contentPane.add(tblListEmployees);
		JScrollPane scrollPane=new JScrollPane(tblListEmployees); 
		scrollPane.setBounds(10, 112, 523, 170);
		scrollPane.getViewport().setBackground(Color.white);
		tblListEmployees.getTableHeader().setReorderingAllowed(false);
		tblListEmployees.getTableHeader().setBackground(Color.white);;
		contentPane.add(scrollPane);
		
		JLabel lblNameEmployee = new JLabel("Nombre: ");
		lblNameEmployee.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNameEmployee.setBounds(10, 10, 51, 14);
		contentPane.add(lblNameEmployee);
		
		txtNameEmployee = new JTextField();
		txtNameEmployee.setBackground(new Color(253, 249, 166));
		txtNameEmployee.setToolTipText("Nombre del producto");
		txtNameEmployee.setColumns(10);
		txtNameEmployee.setBounds(71, 10, 149, 20);
		contentPane.add(txtNameEmployee);
		
		JLabel lblCode = new JLabel("Dni:");
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCode.setBounds(243, 10, 29, 14);
		contentPane.add(lblCode);
		
		txt_dni = new JTextField();
		txt_dni.setBackground(new Color(253, 249, 166));
		txt_dni.setToolTipText("Ingresar Dni del empleado");
		txt_dni.setColumns(10);
		txt_dni.setBounds(269, 8, 149, 20);
		contentPane.add(txt_dni);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(10, 35, 51, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(new Color(253, 249, 166));
		txtEmail.setColumns(10);
		txtEmail.setBounds(71, 34, 149, 20);
		contentPane.add(txtEmail);
		
		JLabel lblDni = new JLabel("Código:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDni.setBounds(10, 62, 51, 14);
		contentPane.add(lblDni);
		
		txt_codigo = new JTextField();
		txt_codigo.setBackground(new Color(253, 249, 166));
		txt_codigo.setColumns(10);
		txt_codigo.setBounds(71, 59, 149, 20);
		contentPane.add(txt_codigo);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBackground(new Color(253, 249, 166));
		btnModificar.setToolTipText("Buscar empleado por Dni");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(439, 59, 94, 21);
		contentPane.add(btnModificar);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.setBackground(new Color(253, 249, 166));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setToolTipText("Eliminar Empleado");
		btnDelete.setBounds(328, 59, 94, 21);
		contentPane.add(btnDelete);
		
		btnSave = new JButton("Guardar");
		btnSave.setBackground(new Color(253, 249, 166));
		btnSave.setToolTipText("Guardar cambios del empleado");
		btnSave.setBounds(439, 85, 94, 21);
		contentPane.add(btnSave);
		
		lblFechaResgistro = new JLabel("Fecha: ");
		lblFechaResgistro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFechaResgistro.setBounds(10, 88, 51, 14);
		contentPane.add(lblFechaResgistro);
		
		lblAutoDate = new JLabel("Autodate");
		lblAutoDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAutoDate.setBounds(71, 88, 94, 14);
		contentPane.add(lblAutoDate);
		
		btn_Regresar = new JButton("Cancelar");
		btn_Regresar.setBackground(new Color(253, 249, 166));
		btn_Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Regresar.setToolTipText("Regresar al menu principal");
		btn_Regresar.setBounds(328, 85, 94, 21);
		contentPane.add(btn_Regresar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(new Color(253, 249, 166));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setToolTipText("Guardar cambios del empleado");
		btnBuscar.setBounds(439, 7, 94, 21);
		contentPane.add(btnBuscar);
	}
	public void agregarEmpleadoATabla(Admin emp) {
		LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
		tableModel.addRow(new Object[]{
				
				emp.getNames(), 
				emp.getEmail(),
				emp.getDni(),
				emp.getCodigo(), 			
				formattedDate,
		});
	}
}
