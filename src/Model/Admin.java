package Model;

import java.sql.Date;

import libreriaVersion2.generic;

public class Admin {
	private generic<String,Long> dp;
	
	
	public Admin() {
		super();
		dp=new generic<>();
	}
	
	public Admin(String nombres,String email,Long dni, Long codigo){
		dp=new generic<>(nombres,email,dni,codigo);
	}
	
	public void setNames(String name) {
		this.dp.setAttribute1(name);
	}
	public void setEmail(String email) {
		this.dp.setAttribute2(email);
	}
	public void setdni(Long dni) {
		this.dp.setAttribute3(dni);
	}
	public void setCodigo(Long codigo) {
		this.dp.setAttribute4(codigo);
	}
	public String getEmail() {
		return dp.getAttribute2();
	}
	public String getNames() {
		return dp.getAttribute1();
	}
	public Long getDni() {
		return dp.getAttribute3();
	}
	public Long getCodigo() {
		return dp.getAttribute4();
	}
	
	

}
