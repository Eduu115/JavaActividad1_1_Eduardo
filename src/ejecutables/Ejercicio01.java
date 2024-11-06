package ejecutables;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Definimos
		
		Scanner leer = new Scanner(System.in);
		int numeroIntroducido = 0;
		
		// Pregunta
		
		System.out.println("Dime la nota que has sacado en el examen");	
		numeroIntroducido = leer.nextInt(); 
		
		// Casos
		
		switch (numeroIntroducido) {

		case 0,1,2,3,4:
			System.out.println("Estas suspenso, ponte las pilas");
			break;
		case 5:
			System.out.println("Aprobado raspado con suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7,8:
			System.out.println("Notable, muy bien");
			break;
		case 9,10:
			System.out.println("Sobresaliente, enhorabuena !");
		default:
			System.out.println("Imposible que hayas sacado un :"+numeroIntroducido);
		}
		
	}
}
