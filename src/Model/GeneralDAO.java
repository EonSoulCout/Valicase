package Model;

import java.io.File;
import java.io.IOException;

import libreriaVersion2.files;

public class GeneralDAO implements Configurable{
	
	private files file;
	
	public GeneralDAO() {
		file=new files(mainpath);
		file.create(0);
	}
	public boolean writeClientes(Clientes cl) throws IOException {
		file.setFile(new File(mainpath,clientes));
		return file.writerFile(cl.Informacion(), false);
	}
	public boolean writeProductos(ElectroTech et) throws IOException {
		file.setFile(new File(mainpath,productos));
		return file.writerFile(et.Informacion(), false);
	}
	public boolean writeProductos(Proovedores pr) throws IOException {
		file.setFile(new File(mainpath,proveedores));
		return file.writerFile(pr.Informacion(), false);
	}
	public boolean writeEmpleado(Admin a) throws IOException {
		file.setFile(new File(mainpath,empleados));
		return file.writerFile(a.toString(), false);
	}

	public boolean writeVenta(Ventas v) throws IOException {
		file.setFile(new File(mainpath,ventas));
		return file.writerFile(v.toString(), false);
	}
}
