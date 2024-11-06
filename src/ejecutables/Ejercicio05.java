package ejecutables;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		/*
		 * Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar. Al final mostrar las siguientes Estadísticas:
		 * •cuantos son pares e impares
		 * •cuanto suman los pares y los impares.
		 */
		
		// Definir
		
		int numeroIntroducido = 1, contadorPares= 0, sumaPares = 0, contadorImpares = 0, sumaImpares = 0;
		Scanner leer = new Scanner(System.in); 
		
		// Bucle
		
		while (numeroIntroducido != 0) {
			
			System.out.println("Dime un numero (introduce 0 para cancelar)");
			numeroIntroducido = leer.nextInt();
			
			if (numeroIntroducido%2 == 0) {
				
				System.out.println("Tu numero es par");
				contadorPares ++;
				sumaPares += numeroIntroducido;
				
			}
				else {
					
					System.out.println("Tu numero es impar");
					contadorImpares ++;
					sumaImpares += numeroIntroducido;
					
				}
		}
		
		// Estadisticas
		
		contadorPares --; // Porque el 0 es par y lo toma para la suma, entonces resto 1
		System.out.println("La cantidad de numeros pares es de : "+ +contadorPares);
		System.out.println("La cantidad de numeros impares es de : "+ contadorImpares);
		
		System.out.println("La suma de los numeros pares es : "+sumaPares);
		System.out.println("La suma de los numeros impares es : "+sumaImpares);
	}
	
}
