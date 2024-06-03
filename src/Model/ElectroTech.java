package Model;

import java.util.ArrayList;

import libreriaVersion2.generic;

public class ElectroTech {
	
	
	private generic<String,Integer> de_inventario;
	private generic<Double,String> de_inventarioex;
	private String pro;
	
	public ElectroTech() {
		super();
		de_inventario=new generic<>();
		de_inventarioex=new generic<>();
	}
	public ElectroTech(String nombre,String descrip,int stock,double costo) {
		de_inventario=new generic<>(nombre,descrip,stock);
		de_inventarioex=new generic<>(costo);
		this.pro=pro;
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
	public String getpro() {
		return pro;
	}
	public void setpro(String prov) {
		this.pro=prov;
	}
	public boolean ventas(int cantidad) {
		int stock=getStok();
		if(stock>=cantidad) {
		int newstock=stock-cantidad;
		setStock(newstock);
		System.out.println("\nVenta realizada con éxito!!");
		return true;
		}else {
		System.out.print("\nError..Stock Insuficiente!!!\n");
		return false;
		}
	}
	public double calprecio(double costo,int cantidad) {
		costo=getCosto();
		double descuento=0;
		double ganancia=costo*0.25;
		double impuesto=(costo*0.13);
		double preciof=costo+ganancia+impuesto;
		if(cantidad<10) {
			descuento=0;
		}
		else if(cantidad>=10) {
			descuento=preciof*0.10;
		}else if(cantidad>=20){
			descuento=preciof*0.20;
		}else if(cantidad>=30){
			descuento=preciof*0.30;
		}
		
		return (preciof-descuento)*cantidad;		
	}
	
	@Override
	public String toString() {
		return "|Nombre: "+getNombre()+"| stock: "+getStok()+"| costo: "+getCosto()+"| precio: "+getCosto() ;
	}
	public String Informacion() {
		return String.format(" Nombre: %s Descripción: %s Stock: %d Costo: %.2f Proovedor: %s",getNombre(),getDescrip(),getStok(),getCosto(),getpro());
	}
	
	
	
}
