package Model;

import java.util.ArrayList;

import libreriaVersion2.generic;

public class Clientes extends Admin {
	
	public Clientes() {
		super();
	}
	public Clientes(String nombres, String direccion,Long contacto, Long ruc){
		super(nombres,direccion,contacto,ruc);
		
	}

	@Override
	public String toString() {
		return "Nombre: "+getNames()+" RUC: "+getDni()+"Adress: "+getEmail();
	}
	public String Informacion() {
		return String.format(" Nombre: %s Dirección: %s Contacto: %d RUC: %d",getNames(),getEmail(),getCodigo(),getDni());
	}
	

}
