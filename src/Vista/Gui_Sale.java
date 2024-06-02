package Vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Model.Ventas;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Gui_Sale extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public JButton btnVenta;
    public JComboBox<String> cmbProduct;
    public JTextField textField;
    public JSpinner spnUnits;
    public JTextField textField_1;
    public JComboBox<String> cmbProduct_1;

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

        cmbProduct = new JComboBox<>();
        cmbProduct.setToolTipText("Escojer producto");
        cmbProduct.setEditable(true);
        cmbProduct.setBounds(79, 24, 210, 24);
        contentPane.add(cmbProduct);

        JLabel lblUnits = new JLabel("Cantidad:");
        lblUnits.setBounds(10, 98, 50, 14);
        contentPane.add(lblUnits);

        spnUnits = new JSpinner();
        spnUnits.setToolTipText("Unidades");
        spnUnits.setBounds(79, 96, 30, 20);
        contentPane.add(spnUnits);

        btnVenta = new JButton("Registrar venta");
        btnVenta.setToolTipText("Registrar una venta");
        btnVenta.setBounds(299, 167, 125, 23);
        contentPane.add(btnVenta);

        cmbProduct_1 = new JComboBox<>();
        cmbProduct_1.setToolTipText("Escojer cliente");
        cmbProduct_1.setEditable(true);
        cmbProduct_1.setBounds(79, 167, 210, 24);
        contentPane.add(cmbProduct_1);

        JLabel lblProducto = new JLabel("Producto: ");
        lblProducto.setBounds(10, 28, 78, 14);
        contentPane.add(lblProducto);

        JLabel lblCliente = new JLabel("Cliente: ");
        lblCliente.setBounds(10, 171, 50, 14);
        contentPane.add(lblCliente);

        JLabel lblPrecioDeVenta = new JLabel("Precio: ");
        lblPrecioDeVenta.setBounds(10, 58, 50, 14);
        contentPane.add(lblPrecioDeVenta);

        JLabel lblProducto_1_1 = new JLabel("Descuento:");
        lblProducto_1_1.setBounds(10, 137, 78, 14);
        contentPane.add(lblProducto_1_1);

        textField = new JTextField();
        textField.setBounds(79, 58, 96, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(81, 135, 96, 20);
        contentPane.add(textField_1);

        // Load data from text files and populate combo boxes
        populateComboBoxes();

        // Action listener for the button
        btnVenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String product = (String) cmbProduct.getSelectedItem();
                double price = Double.parseDouble(textField.getText());
                int quantity = (Integer) spnUnits.getValue();
                double discount = Double.parseDouble(textField_1.getText());
                String client = (String) cmbProduct_1.getSelectedItem();

                Ventas venta = new Ventas(product, price, quantity, discount, client);

                // Save the sale
                venta.saveVenta();
            }
        });
    }

    private void populateComboBoxes() {
        
    }
}

