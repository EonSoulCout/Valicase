package Model;

import java.sql.Date;
import java.util.List;

import libreriaVersion2.generic;

public class Ingreso {
		
	private generic <String,String>dt_i;

	public Ingreso() {
		super();
		dt_i=new generic<>();
	}
	public Ingreso(String usuario, String contraseña) {
		dt_i=new generic<>(usuario, contraseña);
	}
	public String getUsuario() {
		return dt_i.getAttribute1();
	}
	public String getContraseña() {
		return dt_i.getAttribute3();
	}
	public void setUsuario(String usuario_) {
		this.dt_i.setAttribute1(usuario_);
	}
	public void setContraseña(String contraseña_) {
		this.dt_i.setAttribute3(getContraseña());
	}
	public boolean validateIngreso() {
		boolean estate;
		
		if(getUsuario().equals("") && getContraseña().equals("")) {
			estate = true;
		}else {
			estate = false;
		}
		return estate;

	}

}
