package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui_Employees extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JTable tblListEmployees = new JTable();
	private JTextField txtNameEmployee;
	private JTextField txtCode;
	private JTextField txtEmail;
	private JTextField txtDni;
	private JButton btnSearch;
	private JButton btnDelete;
	private JButton btnSave;
	private JLabel lblFechaResgistro;
	private JLabel lblAutoDate;

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		tblListEmployees.setBounds(10, 112, 523, 173);
		contentPane.add(tblListEmployees);
		
		JLabel lblNameEmployee = new JLabel("Nombre: ");
		lblNameEmployee.setBounds(10, 10, 51, 14);
		contentPane.add(lblNameEmployee);
		
		txtNameEmployee = new JTextField();
		txtNameEmployee.setToolTipText("Nombre del producto");
		txtNameEmployee.setColumns(10);
		txtNameEmployee.setBounds(71, 10, 149, 20);
		contentPane.add(txtNameEmployee);
		
		JLabel lblCode = new JLabel("Dni:");
		lblCode.setBounds(252, 10, 29, 14);
		contentPane.add(lblCode);
		
		txtCode = new JTextField();
		txtCode.setToolTipText("Ingresar Dni del empleado");
		txtCode.setColumns(10);
		txtCode.setBounds(289, 8, 149, 20);
		contentPane.add(txtCode);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 35, 51, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(71, 34, 149, 20);
		contentPane.add(txtEmail);
		
		JLabel lblDni = new JLabel("Dni:");
		lblDni.setBounds(10, 62, 51, 14);
		contentPane.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(71, 59, 149, 20);
		contentPane.add(txtDni);
		
		btnSearch = new JButton("Buscar");
		btnSearch.setToolTipText("Buscar empleado por Dni");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(448, 7, 85, 21);
		contentPane.add(btnSearch);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setToolTipText("Eliminar Empleado");
		btnDelete.setBounds(353, 81, 85, 21);
		contentPane.add(btnDelete);
		
		btnSave = new JButton("Guardar");
		btnSave.setToolTipText("Guardar cambios del empleado");
		btnSave.setBounds(448, 81, 85, 21);
		contentPane.add(btnSave);
		
		lblFechaResgistro = new JLabel("Fecha: ");
		lblFechaResgistro.setBounds(10, 88, 51, 14);
		contentPane.add(lblFechaResgistro);
		
		lblAutoDate = new JLabel("Autodate");
		lblAutoDate.setBounds(71, 88, 51, 14);
		contentPane.add(lblAutoDate);
	}
}
