package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class Gui_Sale extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnVenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_Sale frame = new Gui_Sale();
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
	public Gui_Sale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cmbProduct = new JComboBox();
		cmbProduct.setToolTipText("Escojer producto");
		cmbProduct.setEditable(true);
		cmbProduct.setBounds(70, 23, 210, 24);
		contentPane.add(cmbProduct);
		
		JLabel lblUnits = new JLabel("Stock:");
		lblUnits.setBounds(10, 98, 50, 14);
		contentPane.add(lblUnits);
		
		JSpinner spnUnits = new JSpinner();
		spnUnits.setToolTipText("Unidades");
		spnUnits.setBounds(70, 95, 30, 20);
		contentPane.add(spnUnits);
		
		btnVenta = new JButton("Registrar venta");
		btnVenta.setToolTipText("Elimina un producto de la lista");
		btnVenta.setBounds(299, 167, 125, 23);
		contentPane.add(btnVenta);
		
		JComboBox cmbProduct_1 = new JComboBox();
		cmbProduct_1.setToolTipText("Escojer producto");
		cmbProduct_1.setEditable(true);
		cmbProduct_1.setBounds(70, 166, 210, 24);
		contentPane.add(cmbProduct_1);
		
		JLabel lblProducto = new JLabel("Producto: ");
		lblProducto.setBounds(10, 28, 50, 14);
		contentPane.add(lblProducto);
		
		JLabel lblCliente = new JLabel("Cliente: ");
		lblCliente.setBounds(10, 171, 50, 14);
		contentPane.add(lblCliente);
		
		JLabel lblPrecioDeVenta = new JLabel("Precio: ");
		lblPrecioDeVenta.setBounds(10, 58, 50, 14);
		contentPane.add(lblPrecioDeVenta);
		
		JLabel lblPrecioAuto = new JLabel("Precio");
		lblPrecioAuto.setBounds(70, 58, 92, 14);
		contentPane.add(lblPrecioAuto);
		
		JLabel lblProducto_1_1 = new JLabel("Descuento:");
		lblProducto_1_1.setBounds(10, 137, 59, 14);
		contentPane.add(lblProducto_1_1);
		
		JLabel lblDescuentoAuto = new JLabel("Discount");
		lblDescuentoAuto.setBounds(70, 137, 92, 14);
		contentPane.add(lblDescuentoAuto);
	}

}
