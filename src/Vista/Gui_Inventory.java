package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui_Inventory extends JFrame {

	private static final long serialVersionUID = 1L;
	private JComboBox cmbProduct;
	private JSpinner spnUnits;
	private JTable table;
	private final JTable table_1 = new JTable();
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnAddProduct;
	private JTextField textField_2;
	private JButton btnChangeProduct;
	private JButton btnDeleteProduct;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_Inventory frame = new Gui_Inventory();
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
	public Gui_Inventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cmbProduct = new JComboBox();
		cmbProduct.setEditable(true);
		cmbProduct.setToolTipText("Escojer producto");
		cmbProduct.setBounds(17, 11, 210, 24);
		contentPane.add(cmbProduct);
		
		JLabel lblUnits = new JLabel("Unidades en Stock:");
		lblUnits.setBounds(17, 102, 131, 14);
		contentPane.add(lblUnits);
		
		spnUnits = new JSpinner();
		spnUnits.setToolTipText("Unidades");
		spnUnits.setBounds(118, 101, 30, 20);
		contentPane.add(spnUnits);
		
		table = new JTable();
		table.setBounds(35, 206, 160, 0);
		contentPane.add(table);
		table_1.setBounds(10, 177, 358, 103);
		contentPane.add(table_1);
		
		btnDeleteProduct = new JButton("Eliminar Produto");
		btnDeleteProduct.setToolTipText("Elimina un producto de la lista");
		btnDeleteProduct.setBounds(240, 12, 125, 23);
		contentPane.add(btnDeleteProduct);
		
		textField = new JTextField();
		textField.setToolTipText("Nombre del producto");
		textField.setBounds(78, 46, 149, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 70, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnChangeProduct = new JButton("Cambios de producto");
		btnChangeProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChangeProduct.setToolTipText("Realiza cambios del producto selecionado");
		btnChangeProduct.setBounds(235, 98, 133, 23);
		contentPane.add(btnChangeProduct);
		
		JLabel lblSku = new JLabel("Descripcion: ");
		lblSku.setBounds(17, 76, 65, 14);
		contentPane.add(lblSku);
		
		JLabel lblNameProduct = new JLabel("Nombre: ");
		lblNameProduct.setBounds(17, 46, 51, 14);
		contentPane.add(lblNameProduct);
		
		btnAddProduct = new JButton("Agregar Produto");
		btnAddProduct.setToolTipText("Agrega un producto a la lista");
		btnAddProduct.setBounds(240, 46, 125, 23);
		contentPane.add(btnAddProduct);
		
		JLabel lblCosto = new JLabel("Costo:");
		lblCosto.setBounds(17, 127, 41, 14);
		contentPane.add(lblCosto);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(78, 127, 74, 14);
		contentPane.add(textField_2);
		
		JLabel lblPrecioP = new JLabel("Proveedor:");
		lblPrecioP.setBounds(17, 152, 65, 14);
		contentPane.add(lblPrecioP);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(78, 149, 142, 21);
		contentPane.add(comboBox);
	}
}
