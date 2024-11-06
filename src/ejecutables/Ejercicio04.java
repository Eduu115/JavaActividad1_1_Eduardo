package ejecutables;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		/*
		 * Escribir todos los números del 100 al 0 de 7 en 7. Al final mostrar las siguientes Estadísticas.
		 * •Cuantos números has escrito
		 * •Cuanto suman los números escritos
		 * •Cuantos de estos números son pares.
		 */
		
		// Definir
		
		int contadorNumeros = 0, contadorPares = 0, sumaNumeros = 0;
		
		// Bucle
		
		for (int i = 100;i > 0;i -= 7 ){
			
			System.out.println(i);
			contadorNumeros ++;
			sumaNumeros += i;
			
			if (i%2==0) {
			
				contadorPares ++;
			
			}
			
		}
		
		// Estadisticas
		
		System.out.println("Los numeros que has escrito son una cantidad de "+contadorNumeros);
		System.out.println(contadorPares+ " de estos numeros son pares");
		System.out.println("La suma de estos numeros es "+ sumaNumeros);
		
			// Salen 15 numeros porque estoy contando el 100 como el primer numero

	}
	
}
