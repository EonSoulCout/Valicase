package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JOptionPane;

import Model.Empleados;
import Model.Ingreso;
import Vista.Gui_Client;
import Vista.Gui_Ingress;
import Vista.Gui_MenuMain;

public class LogicaIngreso implements ActionListener{

	Ingreso in;
	Gui_MenuMain menu;
	Gui_Ingress i;
	Empleados emp=new Empleados("Daniel","Dan@gmail.com",1234L,32L,Date.valueOf("2023-05-24"));
	public LogicaIngreso(Gui_Ingress ing,Gui_MenuMain menu) {
		super();
		this.i=ing;
		this.menu=menu;
		in=new Ingreso();
        this.i.btn_Ingreso.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==i.btn_Ingreso){
			if(emp.getEmail().equals(i.textUsuario.getText()) && emp.getDni()==Long.parseLong(i.textContraseña.getText())){
				i.setVisible(false);
				menu.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(i,"Usuario o contraseña erroneo!");
			}	
		}
	}
}
