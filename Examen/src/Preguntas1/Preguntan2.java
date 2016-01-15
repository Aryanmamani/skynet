package Preguntas1;

import java.util.Scanner;

public class Preguntan2 {

	public static void main(String[] args) {
		Scanner ing = new Scanner(System.in);
		System.out.println("ingrese un valor para evaluar: ");
		int vocal;
		vocal = ing.nextInt();
				
		if (vocal == 1)System.out.println(vocal+" Su vocal es la A");
		else if (vocal == 2)System.out.println(vocal+" Su vocal es la E");
		else if (vocal == 3)System.out.println(vocal+" Su vocal es la I");
		else if (vocal == 4)System.out.println(vocal+" Su vocal es la O");
		else if (vocal == 5)System.out.println(vocal+" Su vocal es la U");
		else System.out.println("Su valor no coincide con el limite");
		

	}

}
