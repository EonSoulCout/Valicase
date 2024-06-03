package Vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

import Model.Clientes;
import Model.ElectroTech;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Gui_Inventory extends JFrame {

	private static final long serialVersionUID = 1L;
	public JComboBox cmbProduct;
	public JSpinner spnUnits;
	public JTable table;
	public JTable tableInven;
	public JTextField txt_Nmbre;
	public JTextField txt_descrip;
	public JButton btnAddProduct;
	public JTextField txt_costo;
	public JButton btnDeleteProduct;
	public JPanel contentPane;
	public JButton btn_Regresar;
	public JComboBox comboBox_Proo; 
	public DefaultTableModel tableModel;

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
		setBounds(100, 100, 561, 391);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(203, 205, 231));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cmbProduct = new JComboBox();
		cmbProduct.setBackground(new Color(253, 249, 166));
		cmbProduct.setToolTipText("Escojer producto");
		cmbProduct.setBounds(17, 10, 296, 24);
		contentPane.add(cmbProduct);
		
		JLabel lblUnits = new JLabel("Unidades en Stock:");
		lblUnits.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUnits.setToolTipText("Cantidad de producto");
		lblUnits.setBounds(17, 120, 110, 14);
		contentPane.add(lblUnits);
		
		spnUnits = new JSpinner();
		spnUnits.setBackground(new Color(253, 249, 166));
		spnUnits.setToolTipText("Cantidad del producto");
		spnUnits.setBounds(141, 117, 38, 20);
		contentPane.add(spnUnits);
		
		String[] columnNames = {"Nombre", "Descripción", "Stock", "Costo","Proovedor"};
		tableModel = new DefaultTableModel(columnNames, 0) {
			@Override 
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		tableInven = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(tableInven);
		scrollPane.setBounds(10, 205, 531, 139);
		scrollPane.getViewport().setBackground(Color.white);
		tableInven.getTableHeader().setReorderingAllowed(false);
		tableInven.getTableHeader().setBackground(Color.white);;
		contentPane.add(scrollPane);

	
		btnDeleteProduct = new JButton("Eliminar Produto");
		btnDeleteProduct.setBackground(new Color(253, 249, 166));
		btnDeleteProduct.setToolTipText("Elimina un producto de la lista");
		btnDeleteProduct.setBounds(408, 42, 133, 23);
		contentPane.add(btnDeleteProduct);
		
		txt_Nmbre = new JTextField();
		txt_Nmbre.setBackground(new Color(253, 249, 166));
		txt_Nmbre.setToolTipText("Nombre del producto");
		txt_Nmbre.setBounds(141, 58, 149, 20);
		contentPane.add(txt_Nmbre);
		txt_Nmbre.setColumns(10);
		
		txt_descrip = new JTextField();
		txt_descrip.setBackground(new Color(253, 249, 166));
		txt_descrip.setToolTipText("Descripción del producto");
		txt_descrip.setBounds(141, 89, 149, 20);
		contentPane.add(txt_descrip);
		txt_descrip.setColumns(10);
		
		JLabel lblSku = new JLabel("Descripcion: ");
		lblSku.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSku.setBounds(17, 91, 86, 14);
		contentPane.add(lblSku);
		
		JLabel lblNameProduct = new JLabel("Nombre: ");
		lblNameProduct.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNameProduct.setBounds(17, 61, 66, 14);
		contentPane.add(lblNameProduct);
		
		btnAddProduct = new JButton("Agregar Produto");
		btnAddProduct.setBackground(new Color(253, 249, 166));
		btnAddProduct.setToolTipText("Agrega un producto a la lista");
		btnAddProduct.setBounds(408, 11, 133, 23);
		contentPane.add(btnAddProduct);
		
		JLabel lblCosto = new JLabel("Costo unitario:");
		lblCosto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCosto.setBounds(17, 148, 86, 14);
		contentPane.add(lblCosto);
		
		txt_costo = new JTextField();
		txt_costo.setBackground(new Color(253, 249, 166));
		txt_costo.setToolTipText("Costo del producto");
		txt_costo.setColumns(10);
		txt_costo.setBounds(141, 146, 54, 20);
		contentPane.add(txt_costo);
		
		JLabel lblPrecioP = new JLabel("Proveedor:");
		lblPrecioP.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrecioP.setBounds(17, 177, 66, 14);
		contentPane.add(lblPrecioP);
		
		comboBox_Proo = new JComboBox();
		comboBox_Proo.setBackground(new Color(253, 249, 166));
		comboBox_Proo.setToolTipText("Lista de proveedores");
		comboBox_Proo.setBounds(141, 173, 152, 21);
		contentPane.add(comboBox_Proo);
		
		btn_Regresar = new JButton("Cancelar");
		btn_Regresar.setBackground(new Color(253, 249, 166));
		btn_Regresar.setToolTipText("Regresa al menu principal");
		btn_Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Regresar.setBounds(452, 171, 89, 23);
		contentPane.add(btn_Regresar);
	}
	public void agregarproductoATabla(ElectroTech el) {
		tableModel.addRow(new Object[]{
				el.getNombre(),
				el.getDescrip(),
				el.getStok(),
				el.getCosto(),
				comboBox_Proo.getSelectedItem().toString(),
				
		});
	}
}
