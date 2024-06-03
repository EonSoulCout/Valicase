package Vista;

import java.awt.Color;
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
	public JButton btn_Recuperar;
	public JButton btn_recuperar;

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
		contentPane.setBackground(new Color(203, 205, 231));
		contentPane.setBorder(new EmptyBorder(5, 5, 30, 30));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(new Color(203, 205, 231));
		panel.setBounds(0, 10, 436, 253);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textContraseña = new JTextField();
		textContraseña.setBackground(new Color(253, 249, 166));
		textContraseña.setBounds(143, 116, 162, 26);
		panel.add(textContraseña);
		textContraseña.setColumns(10);
		
		textUsuario = new JTextField();
		textUsuario.setBackground(new Color(253, 249, 166));
		textUsuario.setBounds(143, 80, 162, 26);
		panel.add(textUsuario);
		textUsuario.setColumns(10);
		
		btn_recuperar = new JButton("Recuperar");
		btn_recuperar.setBackground(new Color(253, 249, 166));
		btn_recuperar.setBounds(227, 174, 97, 21);
		panel.add(btn_recuperar);
		
		JLabel lbl_usuario = new JLabel("Usuario");
		lbl_usuario.setBounds(66, 86, 45, 13);
		panel.add(lbl_usuario);
		
		JLabel lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setBounds(52, 122, 59, 13);
		panel.add(lblNewLabel);
		
		btn_Ingreso = new JButton("Ingresar");
		btn_Ingreso.setBackground(new Color(253, 249, 166));
		btn_Ingreso.setBounds(132, 174, 85, 21);
		btn_Ingreso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btn_Ingreso);
		Gui_Employees em=new Gui_Employees();
		Gui_MenuMain menu=new Gui_MenuMain();
		LogicaIngreso log=new LogicaIngreso(this,menu,em);
	}
}
