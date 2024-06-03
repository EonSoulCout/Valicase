package Controller;

public interface Parametrizable {
	
	public final String ERnames="^([A-Z][a-zá-ú]{2,}\s?){2,3}$";
	public final String ERadress="^[A-Z]\\d{3}-[A-Z][a-zá-ú]+\\s[A-Z][a-zá-ú]+$";
	public final String ERtelefono="^(09|02)\\d{8}$";
	public final String ERcedula="^[0-2][0-9]{8}[-]?[0-9]$";
	public final String ERcorreo="^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,}$";
		
		

}
