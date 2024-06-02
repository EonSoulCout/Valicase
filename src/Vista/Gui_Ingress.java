package Vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.LogicaIngreso;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Gui_Ingress extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textContraseña;
	public JTextField textUsuario;
	public JButton btn_Ingreso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_Ingress frame = new Gui_Ingress();
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
	public Gui_Ingress() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 30, 30));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBounds(0, 10, 436, 253);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textContraseña = new JTextField();
		textContraseña.setBounds(143, 116, 162, 26);
		panel.add(textContraseña);
		textContraseña.setColumns(10);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(143, 80, 162, 26);
		panel.add(textUsuario);
		textUsuario.setColumns(10);
		
		JButton btnNewButton = new JButton("Recuperar");
		btnNewButton.setBounds(253, 174, 85, 21);
		panel.add(btnNewButton);
		
		JLabel lbl_usuario = new JLabel("Usuario");
		lbl_usuario.setBounds(66, 86, 45, 13);
		panel.add(lbl_usuario);
		
		JLabel lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setBounds(52, 122, 59, 13);
		panel.add(lblNewLabel);
		
		btn_Ingreso = new JButton("Ingresar");
		btn_Ingreso.setBounds(158, 174, 85, 21);
		btn_Ingreso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btn_Ingreso);
		
		Gui_MenuMain menu=new Gui_MenuMain();
		LogicaIngreso log=new LogicaIngreso(this,menu);
	}
}
