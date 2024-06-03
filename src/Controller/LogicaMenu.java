package Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import Model.Admin;
import Model.Clientes;
import Model.ElectroTech;
import Model.GeneralDAO;
import Model.Proovedores;
import Model.Ventas;
import Vista.Gui_Client;
import Vista.Gui_Employees;
import Vista.Gui_Inventory;
import Vista.Gui_MenuMain;
import Vista.Gui_Sale;
import Vista.Gui_Suppliers;
import libreriaVersion2.files;

public class LogicaMenu implements ActionListener{
	private Gui_MenuMain vm;
	private Gui_Client vc;
	private Gui_Sale vs;
	private Gui_Inventory vi;
	private Gui_Employees ve;
	private Gui_Suppliers vp;
	private ArrayList<Clientes> clientes=new ArrayList<>();
	private ArrayList<ElectroTech> Tienda=new ArrayList<>();
	private ArrayList<Proovedores> proveedores=new ArrayList<>(); 
	private ArrayList<Admin> empleados=new ArrayList<>();

	Clientes nuevo=new Clientes();
	ElectroTech et=new ElectroTech();
	Ventas sell=new Ventas();
	GeneralDAO gdao=new GeneralDAO();
	Admin ad=new Admin();
	
	public LogicaMenu(Gui_MenuMain vm,Gui_Client vc,Gui_Inventory vi,Gui_Sale vs,Gui_Suppliers vp,Gui_Employees ve) {
		this.vm=vm;
		this.vc=vc;
		this.vi=vi;
		this.vs=vs;
		this.vp=vp;
		this.ve=ve;
		vm.btnInventory.addActionListener(this);
		vm.btnClient.addActionListener(this);
		vm.btnSales.addActionListener(this);
		vm.btnProv.addActionListener(this);
		vm.btnEmpleados.addActionListener(this);
		vc.btnRegister.addActionListener(this);
		vc.btnRegresar.addActionListener(this);
		vc.btnModificar.addActionListener(this);
		vc.btnEliminar.addActionListener(this);
		vi.btnAddProduct.addActionListener(this);
		vi.btn_Regresar.addActionListener(this);
		vi.btnDeleteProduct.addActionListener(this);
		vs.btn_Regresar.addActionListener(this);
		vs.btnVenta.addActionListener(this);
		vp.btnSave.addActionListener(this);
		vp.btn_Regresar.addActionListener(this);
		vp.btnDelete.addActionListener(this);
		vp.Btn_modificar.addActionListener(this);
		ve.btn_Regresar.addActionListener(this);
		ve.btnSave.addActionListener(this);
		ve.btnDelete.addActionListener(this);
		ve.btnModificar.addActionListener(this);
		ve.btnBuscar.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {		
		if (e.getSource()==vm.btnClient) {
			vc.setVisible(true);
			vm.setVisible(false);
		}else if (e.getSource()==vc.btnRegister){

			if(validacioncl()) {
				Clientes nuevo=new Clientes();
				nuevo.setNames(vc.txtName.getText());
				nuevo.setEmail(vc.txtAdress.getText());
				System.out.println(vc.txtAdress.getText().toString());
				nuevo.setCodigo(Long.parseLong(vc.txtNumber.getText()));
				nuevo.setdni(Long.parseLong(vc.txtDni.getText()));
				clientes.add(nuevo);
				vc.agregarClienteATabla(nuevo);
				System.out.println(nuevo.toString());
				vs.cmb_Clientes.addItem(nuevo.getNames());
				try {
					gdao.writeClientes(nuevo);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				vc.txtName.setText("");
				vc.txtAdress.setText("");
				vc.txtDni.setText("");
				vc.txtNumber.setText("");
			}else {
				//JOptionPane.showMessageDialog(vc, "llene los campos correctamente");
			}


		}else if(e.getSource()==vc.btnEliminar){

			System.out.println("Clientes antes de la eliminación: " + clientes);
			String ruce=JOptionPane.showInputDialog(vc, "Ingrese el RUC del cliente a eliminar: ");
			long ruc=Long.parseLong(ruce);
			boolean clienteEncontrado=false;
			int rowIndexToRemove = -1;
			for (int i = 0; i<clientes.size(); i++) {
				Clientes c=clientes.get(i);
				if (ruc ==c.getDni()){
					clienteEncontrado=true;
					clientes.remove(c);
					rowIndexToRemove=i;
					vc.tableModel.removeRow(rowIndexToRemove);
					break;
				}
			}
			if(!clienteEncontrado) {
				JOptionPane.showMessageDialog(vc, "Cliente no encontrado!!!");
			}
			actualizarcombocl();

		}else if(e.getSource()==vc.btnModificar){

			String rucm=JOptionPane.showInputDialog(vc, "Ingrese el RUC del cliente: ");
			long ruc=Long.parseLong(rucm);
			boolean clienteEncontrado=false;
			for (int i=0;i<clientes.size();i++){
				Clientes c=clientes.get(i);
				if (ruc==c.getDni()){
					clienteEncontrado=true;
					String op=JOptionPane.showInputDialog(vc, "Eliga el campo a modificar:\n"
							+ "1. Nombre\n2. Dirección\n3. Contacto\n4. RUC");
					if(op.equals("1")){
						String n=JOptionPane.showInputDialog(vc, "Ingrese el nuevo nombre");
						c.setNames(n);
						vc.tableModel.setValueAt(n, i, 0);
						actualizarcombocl();
					}else if(op.equals("2")){
						String d=JOptionPane.showInputDialog(vc, "Ingrese la nueva dirección:");
						c.setEmail(d);
						vc.tableModel.setValueAt(d, i, 1);
					}else if(op.equals("3")){
						String co=JOptionPane.showInputDialog(vc, "Ingrese el nuevo contacto:");
						long con=Long.parseLong(co);
						c.setCodigo(con);
						vc.tableModel.setValueAt(con, i, 2);
					}else if(op.equals("4")){
						String r=JOptionPane.showInputDialog(vc, "Ingrese el nuevo RUC:");
						long ru=Long.parseLong(r);
						c.setdni(ru);
						vc.tableModel.setValueAt(ru, i, 3);
					}
					break;	
				}		
			}
			if(!clienteEncontrado){
				JOptionPane.showMessageDialog(vc, "Cliente no encontrado!!");
			}

		}else if(e.getSource()==vc.btnRegresar) {
			vc.setVisible(false);
			vm.setVisible(true);
		}else if(e.getSource()==vm.btnInventory){
			vi.setVisible(true);
			vm.setVisible(false);
		}else if(e.getSource()==vi.btnAddProduct){

			ElectroTech et=new ElectroTech();
			et.setNombre(vi.txt_Nmbre.getText());
			et.setDescrip(vi.txt_descrip.getText());
			int stockValue = (Integer) vi.spnUnits.getValue();
			et.setStock(stockValue);

			et.setCosto(Double.parseDouble(vi.txt_costo.getText()));
			Tienda.add(et);
			vi.agregarproductoATabla(et);
			try {
				gdao.writeProductos(et);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			vi.cmbProduct.addItem(et.getNombre());		
			vs.cmbProduct.addItem(et.getNombre());
			vs.cmbProduct.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					actualizarPrecio();
				}
			});
			vs.spnUnits.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {
					actualizarPrecio();
				}
			});
			vi.txt_costo.setText("");
			vi.txt_descrip.setText("");
			vi.txt_Nmbre.setText("");
			vi.spnUnits.setValue(0);
		}else if(e.getSource()==vi.btnDeleteProduct){

			System.out.println("Clientes antes de la eliminación: " + clientes);
			String na=JOptionPane.showInputDialog(vi, "Ingrese el nombre del producto a eliminar: ");
			boolean prodEncontrado=false;
			int rowIndexToRemove = -1;
			for (int i=0;i<Tienda.size();i++) {
				ElectroTech elt=Tienda.get(i);
				if (na.equals(elt.getNombre())){
					prodEncontrado=true;
					Tienda.remove(elt);
					rowIndexToRemove=i;
					vi.tableModel.removeRow(rowIndexToRemove);
					break;
				}
			}
			if(!prodEncontrado) {
				JOptionPane.showMessageDialog(vc, "Producto no encontrado!!");
			}
			vi.cmbProduct.removeAllItems();
			vs.cmbProduct.removeAllItems();
			for (ElectroTech elet:Tienda){
				vi.cmbProduct.addItem(elet.getNombre());
				vs.cmbProduct.addItem(elet.getNombre());
			}


		}else if(e.getSource()==vi.btn_Regresar) {
			vi.setVisible(false);
			vm.setVisible(true);
		}else if(e.getSource()==vm.btnSales) {
			vs.setVisible(true);
			vm.setVisible(false);		
		}else if(e.getSource()==vs.btnVenta) {

			for(ElectroTech el:Tienda) {		
				if(el.getNombre().equals(vs.cmbProduct.getSelectedItem().toString())) {
					int unidades = (int) vs.spnUnits.getValue();
					if(el.getStok()>=unidades) {
						el.ventas(unidades);
						for (int i = 0; i < vi.tableModel.getRowCount(); i++) {
							if (vi.tableModel.getValueAt(i, 0).equals(el.getNombre())) {
								vi.tableModel.setValueAt(el.getStok(), i, 2);
								break;
							}
						}
						vi.tableModel.fireTableDataChanged();
						try {
							gdao.writeVenta(sell);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else 
						JOptionPane.showConfirmDialog(vs,"Error...stock insuficiente!!");
					
					}
					

			}		
		}else if(e.getSource()==vs.btn_Regresar) {
			vs.setVisible(false);
			vm.setVisible(true);
		}else if(e.getSource()==vm.btnProv){
			vp.setVisible(true);
			vm.setVisible(false);
		}else if(e.getSource()==vp.btnSave){
			if (validacionpro()) {
				Proovedores pro= new Proovedores();
				pro.setNames(vp.txt_Nombre.getText());
				pro.setEmail(vp.txtEmail.getText());
				pro.setdni(Long.parseLong(vp.txtDni.getText()));
				pro.setCodigo(numerocodigo());
				pro.setRazon(vp.txt_razon.getText());
				pro.setTelefono(Long.parseLong(vp.txtPhone.getText()));
				proveedores.add(pro);
				vp.agregarprovTabla(pro);
				try {
					gdao.writeProductos(pro);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				vi.comboBox_Proo.addItem(pro.getRazon());				
			}
			vp.txt_Nombre.setText("");
			vp.txt_razon.setText("");
			vp.txtCode.setText("");
			vp.txtDni.setText("");
			vp.txtEmail.setText("");
			vp.txtPhone.setText("");


		}else if(e.getSource()==vp.btnDelete){

			String co=JOptionPane.showInputDialog(vc, "Ingrese el código del proveedor a eliminar: ");
			long cod=Long.parseLong(co);
			boolean prooEncontrado=false;
			int rowIndexToRemove = -1;
			for (int i = 0; i<proveedores.size(); i++) {
				Proovedores p=proveedores.get(i);
				if (cod==p.getCodigo()){
					prooEncontrado=true;
					proveedores.remove(p);
					rowIndexToRemove=i;
					vp.tableModel.removeRow(rowIndexToRemove);
					break;
				}
			}
			if(!prooEncontrado) {
				JOptionPane.showMessageDialog(vp, "Proovedor no encontrado!!!");
			}
			vi.comboBox_Proo.removeAllItems();
			for (Proovedores po:proveedores){
				vi.comboBox_Proo.addItem(po.getRazon());
			}
		}else if(e.getSource()==vp.Btn_modificar){

			String co=JOptionPane.showInputDialog(vc, "Ingrese el código del proveedor: ");
			long cod=Long.parseLong(co);
			boolean prooEncontrado=false;
			int rowIndexToRemove = -1;
			for (int i = 0; i<proveedores.size(); i++) {
				Proovedores p=proveedores.get(i);
				if (cod==p.getCodigo()){
					prooEncontrado=true;
					String op=JOptionPane.showInputDialog(vc, "Eliga el campo a modificar:\n"
							+ "1. Nombre\n2. Email\n3. Dni\n4. Teléfono\n5. Razón\n6. Código");
					if(op.equals("1")){
						String n=JOptionPane.showInputDialog(vc, "Ingrese el nuevo nombre");
						p.setNames(n);
						vp.tableModel.setValueAt(n, i, 0);
					}else if(op.equals("2")){
						String d=JOptionPane.showInputDialog(vc, "Ingrese el nuevo Email:");
						p.setEmail(d);
						vp.tableModel.setValueAt(d, i, 1);
					}else if(op.equals("3")){
						String dn=JOptionPane.showInputDialog(vc, "Ingrese el nuevo Dni:");
						long dni=Long.parseLong(dn);
						p.setdni(dni);
						vp.tableModel.setValueAt(dni, i, 2);
					}else if(op.equals("4")){
						String t=JOptionPane.showInputDialog(vc, "Ingrese el nuevo teléfono:");
						long tl=Long.parseLong(t);
						p.setTelefono(tl);
						vp.tableModel.setValueAt(tl, i, 3);
					}else if(op.equals("5")){
						String r=JOptionPane.showInputDialog(vc, "Ingrese la nueva razón:");
						p.setRazon(r);
						vp.tableModel.setValueAt(r, i, 4);
						vi.comboBox_Proo.removeAllItems();
						for (Proovedores po:proveedores){
							vi.comboBox_Proo.addItem(po.getRazon());
						}
					}else if(op.equals("6")){
						String cd=JOptionPane.showInputDialog(vc, "Ingrese el nuevo código:");
						long codi=Long.parseLong(cd);
						p.setCodigo(codi);
						vp.tableModel.setValueAt(codi, i, 5);
					}
					break;	
				}		
			}
			if(!prooEncontrado){
				JOptionPane.showMessageDialog(vp, "Proovedor no encontrado!!!");
			}
		}else if(e.getSource()==vp.btn_Regresar){
			vp.setVisible(false);
			vm.setVisible(true);
		}else if(e.getSource()==vm.btnEmpleados) {

			String cAdmin=JOptionPane.showInputDialog("Ingrese clave del Administrador:" );
			if (cAdmin.equals("Admin2324")) {
				ve.setVisible(true);
				vm.setVisible(false);
			}else {
				JOptionPane.showMessageDialog(vc, "Clave Incorrecta");
			}

		}else if(e.getSource()==ve.btn_Regresar){
			ve.setVisible(false);
			vm.setVisible(true);
		}else if (e.getSource()==ve.btnSave){

			ve.txt_codigo.setText(String.valueOf(numerocodigo()));
			if(validacionempl()) {
				Admin emp=new Admin();
				emp.setNames(ve.txtNameEmployee.getText());
				emp.setEmail(ve.txtEmail.getText());
				emp.setCodigo(Long.parseLong(ve.txt_codigo.getText()));
				emp.setdni(Long.parseLong(ve.txt_dni.getText()));
				empleados.add(emp);
				ve.agregarEmpleadoATabla(emp);

				emp.setCodigo(Long.parseLong(ve.txtEmail.getText()));
				emp.setdni(Long.parseLong(ve.txt_dni.getText()));
				emp.setEmail(ve.txtEmail.getText());
				emp.setNames(ve.txtNameEmployee.getText());
				try {
					gdao.writeEmpleado(emp);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			ve.txt_codigo.setText("");
			ve.txt_dni.setText("");
			ve.txtEmail.setText("");
			ve.txtNameEmployee.setText("");

		}else if (e.getSource()==ve.btnDelete){

			String ce=JOptionPane.showInputDialog(vc, "Ingrese el código del empleado a eliminar: ");
			long coe=Long.parseLong(ce);
			boolean emEncontrado=false;
			int rowIndexToRemove=-1;
			for (int i=0;i<empleados.size();i++) {
				Admin empl=empleados.get(i);
				if (coe==empl.getCodigo()){
					emEncontrado=true;
					empleados.remove(empl);
					rowIndexToRemove=i;
					ve.tableModel.removeRow(rowIndexToRemove);
					break;
				}
			}
			if(!emEncontrado) {
				JOptionPane.showMessageDialog(vp, "Empleado no encontrado!!!");
			}

		}else if (e.getSource()==ve.btnModificar){
			String co=JOptionPane.showInputDialog(vc, "Ingrese el código del empleado: ");
			long coe=Long.parseLong(co);
			boolean emEncontrado=false;
			int rowIndexToRemove=-1;
			for (int i=0;i<empleados.size();i++) {
				Admin empl=empleados.get(i);
				if (coe==empl.getCodigo()){
					emEncontrado=true;
					String op=JOptionPane.showInputDialog(vc, "Eliga el campo a modificar:\n"
							+ "1. Nombre\n2. Email\n3. Dni");
					if(op.equals("1")){
						String n=JOptionPane.showInputDialog(vc, "Ingrese el nuevo nombre");
						empl.setNames(n);
						ve.tableModel.setValueAt(n, i, 0);
						actualizarcombocl();
					}else if(op.equals("2")){
						String d=JOptionPane.showInputDialog(vc, "Ingrese el nuevo email:");
						empl.setEmail(d);
						ve.tableModel.setValueAt(d, i, 1);
					}else if(op.equals("3")){
						String d=JOptionPane.showInputDialog(vc, "Ingrese el nuevo Dni:");
						long con=Long.parseLong(d);
						empl.setdni(con);
						ve.tableModel.setValueAt(con, i, 2);
						break;	
					}		
				}
				if(!emEncontrado){
					JOptionPane.showMessageDialog(vc, "Empleado no encontrado!!");
				}

			}
		}else if (e.getSource()==ve.btnBuscar) {
		
			

			
		}

	}
	private void actualizarPrecio() {
		String productoSeleccionado = (String) vs.cmbProduct.getSelectedItem();
		int unidades =(int)vs.spnUnits.getValue();
		for (ElectroTech el:Tienda){
			if (el.getNombre().equals(productoSeleccionado)) {
				double nuevoPrecio=el.calprecio(el.getCosto(), unidades);
				String descuento=sell.descuento(unidades);
				vs.txt_Precio.setText(String.format("%.2f", nuevoPrecio));
				vs.txt_descuento.setText(descuento);
				vs.txtstock.setText(String.valueOf(el.getStok()));
				System.out.println(el.calprecio(el.getCosto(), unidades));
				break;
			}	
		}
	}
	private void actualizarcombocl() {
		vs.cmb_Clientes.removeAllItems();
		for (Clientes cliente:clientes){
			vs.cmb_Clientes.addItem(cliente.getNames());
		}
	}
	public boolean validacioncl() {
		boolean estado=true;
		if(Validacion.validarnombres(vc.txtName.getText())) {
			vc.txtName.setBackground(Color.green);
		}else {
			vc.txtName.setBackground(Color.red);
			estado=false;
		}
		if(Validacion.validartelefono(vc.txtNumber.getText())) {
			vc.txtNumber.setBackground(Color.green);
		}else {
			vc.txtNumber.setBackground(Color.red);
			estado=false;
		}
		if(Validacion.validarcedula(vc.txtDni.getText())) {
			vc.txtDni.setBackground(Color.green);
		}else {
			vc.txtDni.setBackground(Color.red);
			estado=false;
		}
		return estado;
	}
	public boolean validacionempl() {
		boolean estado=true;
		if (Validacion.validarnombres(ve.txtNameEmployee.getText())) {
			ve.txtNameEmployee.setBackground(Color.green);
		}else {
			ve.txtNameEmployee.setBackground(Color.red);
			estado=false;
		}
		if (Validacion.validarcorreo(ve.txtEmail.getText())) {
			ve.txtEmail.setBackground(Color.green);
		}else {
			ve.txtEmail.setBackground(Color.red);
			estado=false;
		}
		if (Validacion.validarcedula(ve.txt_dni.getText())) {
			ve.txt_dni.setBackground(Color.green);
		}else {
			ve.txt_dni.setBackground(Color.red);
			estado=false;
		}
		return estado;
	}

	public boolean validacionpro() {
		boolean estado=true;


		if (Validacion.validarnombres(vp.txt_Nombre.getText())) {
			vp.txt_Nombre.setBackground(Color.green);
		}else {
			vp.txt_Nombre.setBackground(Color.red);
			estado=false;
		}

		if (Validacion.validarcorreo(vp.txtEmail.getText())) {
			vp.txtEmail.setBackground(Color.green);
		}else {
			vp.txtEmail.setBackground(Color.red);
			estado=false;
		}

		if (Validacion.validarcedula(vp.txtDni.getText())) {
			vp.txtDni.setBackground(Color.green);
		}else {
			vp.txtDni.setBackground(Color.red);
			estado=false;
		}

		if (Validacion.validartelefono(vp.txtPhone.getText())) {
			vp.txtPhone.setBackground(Color.green);
		}else {
			vp.txtPhone.setBackground(Color.red);
			estado=false;
		}

		return estado;
	}



	public long numerocodigo() {
		long min = 1_000_000_000L; // 10^9
		long max = 9_999_999_999L; // 10^10 - 1
		return min + (long)(Math.random() * ((max - min) + 1));
	}



}



