package Model;

import libreriaVersion2.generic;

public class ElectroTech {
	
	private generic<String,Integer> de_inventario;
	private generic<Double,String> de_inventarioex;
	
	public ElectroTech() {
		super();
		de_inventario=new generic<>();
	}
	public ElectroTech(String nombre,String descrip,int stock,double costo) {
		de_inventario=new generic<>(nombre,descrip,stock);
		de_inventarioex=new generic<>(costo);
	}
	public void setNombre(String nombre) {
		this.de_inventario.setAttribute1(nombre);
	}
	public void setDescrip(String descrip) {
		this.de_inventario.setAttribute2(descrip);
	}
	public void setStock(int stock) {
		this.de_inventario.setAttribute3(stock);
	}
	public void setCosto(double costo) {
		this.de_inventarioex.setAttribute1(costo);
	}
	public String getNombre() {
		return de_inventario.getAttribute1();
	}
	public String getDescrip() {
		return de_inventario.getAttribute2();
	}
	public int getStok() {
		return de_inventario.getAttribute3();
	}
	public double getCosto() {
		return de_inventarioex.getAttribute1();
	}
	
	
}
