package Model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import libreriaVersion2.generic;

public class Admin {
	
	private generic<String,Long> dp;

	public Admin() {
		super();
		dp=new generic<>();
	}
	
	public Admin(String nombres,String email,long dni, long codigo){
		dp=new generic<>(nombres,email,dni,codigo);
	}
	
	public void setNames(String name) {
		this.dp.setAttribute1(name);
	}
	public void setEmail(String email) {
		this.dp.setAttribute2(email);
	}
	public void setdni(long dni) {
		this.dp.setAttribute3(dni);
	}
	public void setCodigo(long codigo) {
		this.dp.setAttribute4(codigo);
	}
	public String getEmail() {
		return dp.getAttribute2();
	}
	public String getNames() {
		return dp.getAttribute1();
	}
	public long getDni() {
		return dp.getAttribute3();
	}
	public long getCodigo() {
		return dp.getAttribute4();
	}

	@Override
	public String toString() {
        LocalDate currentDate=LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate=currentDate.format(formatter);

        return getEmail() + ";" + getCodigo() + ";" + getNames() + ";" + getDni() + ";" + formattedDate;
    }
	
	
	

}
