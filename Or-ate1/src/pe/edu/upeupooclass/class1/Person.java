package pe.edu.upeupooclass.class1;

import java.util.Date;

public class Person {

	
	String nombre, apellido, dni, email, religion, sexo, celular;
	double talla;
	Date fecha;
	boolean vivo;
	int edad;
	
	public int getedad(){
		return 0;
		
	}

	@Override
	public String toString() {
		return "[nombre=\t" + nombre + "\n apellido=" + apellido + "\n dni=" + dni + "\n email=" + email
				+ "\n religion=" + religion + "\n sexo=" + sexo + "\n celular=" + celular + "\n talla=" + talla + "\n fecha="
				+ fecha + "\n vivo=" + vivo + "\n edad=" + edad + "]";
	}
	
}
