package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class Gui_Sale extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public JButton btnVenta;
    public JComboBox<String> cmbProduct;
    public JTextField txt_Precio;
    public JSpinner spnUnits;
    public JTextField txt_descuento;
    public JComboBox<String> cmb_Clientes;
    public JTextField txtstock;
    public JButton btn_Regresar;

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

    public Gui_Sale() {
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 225);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(203, 205, 231));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        cmbProduct = new JComboBox<>();
        cmbProduct.setBackground(new Color(253, 249, 166));
        cmbProduct.setToolTipText("Escojer producto");
        cmbProduct.setEditable(false);
        cmbProduct.setBounds(94, 7, 210, 24);
        contentPane.add(cmbProduct);

        JLabel lblUnits = new JLabel("Cantidad a comprar:");
        lblUnits.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblUnits.setBounds(10, 83, 125, 17);
        contentPane.add(lblUnits);

        spnUnits = new JSpinner();
        spnUnits.setForeground(new Color(253, 249, 166));
        spnUnits.setBackground(new Color(253, 249, 166));
        spnUnits.setModel(new SpinnerNumberModel(Integer.valueOf(1), null, null, Integer.valueOf(1)));
        spnUnits.setToolTipText("Unidades");
        spnUnits.setBounds(145, 82, 60, 20);
        contentPane.add(spnUnits);

        btnVenta = new JButton("Registrar venta");
        btnVenta.setBackground(new Color(253, 249, 166));
        btnVenta.setToolTipText("Registrar una venta");
        btnVenta.setBounds(308, 156, 116, 23);
        contentPane.add(btnVenta);

        cmb_Clientes = new JComboBox<>();
        cmb_Clientes.setBackground(new Color(253, 249, 166));
        cmb_Clientes.setToolTipText("Escojer cliente");
        cmb_Clientes.setEditable(false);
        cmb_Clientes.setBounds(94, 155, 195, 24);
        contentPane.add(cmb_Clientes);

        JLabel lblProducto = new JLabel("Producto: ");
        lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblProducto.setBounds(10, 11, 66, 14);
        contentPane.add(lblProducto);

        JLabel lblCliente = new JLabel("Cliente: ");
        lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblCliente.setBounds(10, 159, 50, 14);
        contentPane.add(lblCliente);

        JLabel lblPrecioDeVenta = new JLabel("Precio: ");
        lblPrecioDeVenta.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblPrecioDeVenta.setBounds(10, 44, 50, 14);
        contentPane.add(lblPrecioDeVenta);

        JLabel lblProducto_1_1 = new JLabel("Descuento:");
        lblProducto_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblProducto_1_1.setBounds(10, 122, 78, 14);
        contentPane.add(lblProducto_1_1);

        txt_Precio = new JTextField();
        txt_Precio.setBackground(new Color(253, 249, 166));
        txt_Precio.setEditable(false);
        txt_Precio.setBounds(94, 42, 96, 20);
        contentPane.add(txt_Precio);
        txt_Precio.setColumns(10);

        txt_descuento = new JTextField();
        txt_descuento.setBackground(new Color(253, 249, 166));
        txt_descuento.setEditable(false);
        txt_descuento.setColumns(10);
        txt_descuento.setBounds(94, 120, 96, 20);
        contentPane.add(txt_descuento);

        txtstock = new JTextField();
        txtstock.setBackground(new Color(253, 249, 166));
        txtstock.setEditable(false);
        txtstock.setBounds(314, 82, 43, 20);
        contentPane.add(txtstock);
        txtstock.setColumns(10);

        JLabel lblNewLabel = new JLabel("Stock:");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel.setBounds(254, 84, 50, 14);
        contentPane.add(lblNewLabel);

        // Load data into combo boxes
        
        btn_Regresar = new JButton("Cancelar");
        btn_Regresar.setBackground(new Color(253, 249, 166));
        btn_Regresar.setToolTipText("Regresar al menu principal");
        btn_Regresar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btn_Regresar.setBounds(317, 8, 107, 23);
        contentPane.add(btn_Regresar);
    }
}
