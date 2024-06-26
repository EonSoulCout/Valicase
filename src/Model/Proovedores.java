package Model;

import java.util.ArrayList;

import libreriaVersion2.generic;

public class Proovedores extends Admin{

	
	private generic<String,Long> dp_ex;

	public Proovedores() {
		super();
		dp_ex=new generic<>();
		// TODO Auto-generated constructor stub
	}
	public Proovedores(String nombres,String email,Long dni,Long codigo,String razon,Long telefono){
		super(nombres, email, dni, codigo);
		dp_ex=new generic(razon,telefono);
		
	}
	public void setRazon(String razon) {
		this.dp_ex.setAttribute1(razon);
	}
	public void setTelefono(Long telef) {
		this.dp_ex.setAttribute3(telef);
	}
	public String getRazon() {
		return dp_ex.getAttribute1();
	}
	public Long getTelefono() {
		return dp_ex.getAttribute3();
	}
	@Override
	public String toString() {
		return "Razon= " +getRazon()+ "Telefono= "+getTelefono()+"code= "+getCodigo();
	}
	public String Informacion() {
		return String.format(" Nombre: %s Email: %s Dni: %d Código: %d Razón: %s Telefono: %d",getNames(),getEmail(),getDni(),getCodigo(),getRazon(),getTelefono());
	}
	
	

}
