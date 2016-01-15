package Preguntas1;

import java.util.Scanner;

public class Preguntan1 {

	public static void main(String[] args) {
		
		Scanner ing = new Scanner(System.in);
		
		double por = 0;
		System.out.println("ingrese el monto de venta alcanzado: ");
		double a = ing.nextDouble();
		
		if (a>0 && a< 1000) 
			System.out.println("su valor es: "+a+" no recibe bonificacion");
		else if (a>=1000 && a< 5000){
			por = a*3/100;
		}else if (a>=5000 && a< 20_000){
			por = a*5/100;
		}else if (a>20_000){
			por = a*8/100;
		}
		
		System.out.println("su valor es: "+a+" Recibe una bonificacion de : " + por);
		
	}

}
