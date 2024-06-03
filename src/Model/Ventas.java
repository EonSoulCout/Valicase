package Model;

import libreriaVersion2.generic;

public class Ventas extends ElectroTech{
	
	private generic<Double,String> dv;
	public Ventas() {
		super();
		dv=new generic<>();
	}
	public Ventas(String nombre, String descrip, int cant, double precio,double descuento) {
		super(nombre,descrip,cant,precio);
		dv=new generic<>(descuento);
	}
	public void setDescuento(double descuento) {
		this.dv.setAttribute1(descuento);
	}
	public double getDescuento() {
		return dv.getAttribute1();
	}
	public double calprecio(double costo,int cantidad) {
		
		double ganancia=costo*0.35;
		double impuesto=(costo*0.13);
		double preciof=costo+ganancia+impuesto;
		return preciof*cantidad;		
	}
	public String descuento(int cantidad) {
		String descuento = "";
	    if (cantidad >=30) {
	        descuento ="30 %";
	    } else if (cantidad>=20) {
	        descuento ="20 %";
	    } else if (cantidad>=10) {
	        descuento ="10 %";
	    } else {
	        descuento ="0 %";
	    }
	    return descuento;		
	}
	
	public String info() {
		return "precio: ";
	}
	
	@Override
	public String toString() {
		return "Ventas [getNombre()=" + getNombre() + ", getDescrip()=" + getDescrip() + ", getCosto()=" + getCosto()
				+ ", Informacion()=" + Informacion() + "]";
	}
	
	
	
	
	
	
	

}
