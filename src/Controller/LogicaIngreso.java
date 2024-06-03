package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Admin;
import Model.Ingreso;
import Vista.Gui_Client;
import Vista.Gui_Employees;
import Vista.Gui_Ingress;
import Vista.Gui_MenuMain;
import libreriaVersion2.files;

public class LogicaIngreso implements ActionListener{
	private ArrayList<Admin> empleados=new ArrayList<>();
	Ingreso in;
	Gui_MenuMain menu;
	Gui_Ingress i;
	Gui_Employees empl;
	
	public LogicaIngreso(Gui_Ingress ing,Gui_MenuMain menu,Gui_Employees empl) {
		super();
		this.i=ing;
		this.menu=menu;
		this.empl=empl;
		in=new Ingreso();
        this.i.btn_Ingreso.addActionListener(this);
        this.i.btn_recuperar.addActionListener(this);
        this.empl.btnBuscar.addActionListener(this);
        this.empl.btn_Regresar.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==i.btn_Ingreso){
			boolean estate=false;
			files file= new files("C:/DataTienda");
			file.setFile(new File("C:/DataTienda","Empleados.txt"));
			try {
				String [] lines=file.readerFile().split("\n");
				for(String line:lines) {
					String []datos=line.split(";");
					String usuario=datos[0];
					String contraseña=datos[1];
					if(usuario.equals(i.textUsuario.getText())&&contraseña.equals(i.textContraseña.getText())) {
						i.textContraseña.setText("");
						i.textUsuario.setText("");
						i.setVisible(false);
						menu.setVisible(true);
						estate=true;
						return;
					}
				}
				if (estate) {
					JOptionPane.showMessageDialog(i, "Ingreso correcto");
				}else {
					JOptionPane.showMessageDialog(i, "Ingreso incorrecto");
				}
				
					
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
		}if(e.getSource()==i.btn_recuperar){
			String cAdmin=JOptionPane.showInputDialog("Ingrese clave del Administrador:" );
			if (cAdmin.equals("Admin2324")) {
				empl.setVisible(true);
				i.setVisible(false);
			}else {
				JOptionPane.showMessageDialog(i, "Clave Incorrecta");
			}
			
		}else if(e.getSource()==empl.btnBuscar) {
			Admin emp=new Admin();
			files file= new files("C:/DataTienda");
			file.setFile(new File("C:/DataTienda","Empleados.txt"));
			try {
				String[]line=file.readerFile().split("\n");
				for(String l:line) {
					String[]da=l.split(";");
					
					emp.setNames(da[2]);
					emp.setEmail(da[0]);
					emp.setCodigo(Long.parseLong(da[1]));
					emp.setdni(Long.parseLong(da[3]));
					empleados.add(emp);
					empl.agregarEmpleadoATabla(emp);	
				}
				
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (e.getSource()==empl.btn_Regresar) {
			empl.setVisible(false);
			i.setVisible(true);
		}
	}
}
