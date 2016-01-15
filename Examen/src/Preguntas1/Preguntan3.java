package Preguntas1;

import java.util.Scanner;

public class Preguntan3 {
	public static void main(String[] args) {
	
		Scanner ing = new Scanner(System.in);
		
		int num ;
		System.out.println("ingrese un valor por teclado");
		num = ing.nextInt();
		for (int i = 0 ; i <= num ;i=i+2){
			System.out.println(i);
		}
	}
}
