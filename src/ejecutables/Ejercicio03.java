package ejecutables;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
		
		// Definimos
		
		Scanner leer = new Scanner(System.in);
		int numeroIntroducido = 0;
		
		// Bucle

		while (true){
			
			System.out.println("introduce un numero y te doy su cuadrado");
			numeroIntroducido = leer.nextInt();
			
			if(numeroIntroducido<0) {
				break;
			}
			
			System.out.println("El cuadrado es "+ numeroIntroducido*numeroIntroducido);
			
			/*
			 * Hago un break y no pongo la condicion en el while porque si la pongo en el while, cuando teclee un numero negativo
			 * primero hace el cuadrado y lo escribe(del negativo) y luego sale del bucle, con el break, en cuanto se escriba el negativo
			 * termina el bucle
			 */
		
		}
		
		System.out.println("FIN DEL PROGRAMA");
		
	}

}
