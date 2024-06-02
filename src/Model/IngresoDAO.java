package Model;

import libreriaVersion2.files;

public class IngresoDAO implements settings{
	
	private files file;
	
	public IngresoDAO() {
		file=new files(main);
		file.create(0);
	}
	public boolean read() {
			
		return false;
		
	}

}
