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
		return "[nombre=\t" + nombre + "\n apellido=\t" + apellido + "\n dni=\t" + dni + "\n email=\t" + email
				+ "\n religion=\t" + religion + "\n sexo=\t" + sexo + "\n celular=\t" + celular + "\n talla=\t" + talla + "\n fecha=\t"
				+ fecha + "\n vivo=\t" + vivo + "\n edad=\t" + edad + "]";
	}
	
}
