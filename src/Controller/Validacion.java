package Controller;

public class Validacion implements Parametrizable{
	
	public static boolean validarnombres(String names){
		return names.matches(ERnames);
	}
	public static boolean validaradress(String adress) {
		return adress.matches(ERadress);
	}
	public static boolean validartelefono(String cell) {
		return String.valueOf(cell).matches(ERtelefono);
	}
	public static boolean validarcedula(String dni) {
		return String.valueOf(dni).matches(ERcedula);
	}
	public static boolean validarcorreo(String correo) {
		return correo.matches(ERcorreo);
	}

}
