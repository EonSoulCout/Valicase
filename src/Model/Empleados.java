package Model;

import java.sql.Date;
import libreriaVersion2.generic;

public class Empleados extends Admin{

	private generic<Date,String> dex;
	
	
	public Empleados() {
		super();
		dex=new generic<>();
	}
	public Empleados(String nombres, String email, Long dni, Long codigo,Date fechai){
		super(nombres, email, dni, codigo);
		dex=new generic<>(fechai);
	}
		
	public void setname(Date fechai) {
		this.dex.setAttribute1(fechai);
		getNames();
	}
	
	

}



