package pe.edu.upeupooclass.class1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.sound.midi.Track;

/**
 * @author Alumnos
 *
 */
public class Principal {

	public static void main(String[] args) {
		Person or = new Person();
		or.nombre = "Diego Fernando";
		or.apellido = "Mamani Quispe";
		or.celular = "997664875";
		or.dni = "76861221";
		or.email = "aryan.deus.13@gmail.com";
		or.talla = 1.68;
		or.vivo = true;
		or.sexo = "masculino";
		or.religion = "catolico";
		or.edad = 20;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			or.fecha = sdf.parse("13/11/1995");

		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(or);
	}

}