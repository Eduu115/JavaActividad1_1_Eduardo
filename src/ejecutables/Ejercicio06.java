package ejecutables;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		/*
		 * Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
		 *  Recordamos que de las 23:59:59 se pasa a las 00:00:00. Se hace con enteros, y se muestra con enteros.
		 */
		
		// Definir 
		
		int horas = 0, minutos = 0, segundos = 0;
		Scanner leer = new Scanner(System.in);
 
		// Algoritmo
		
		System.out.println("Escribe la hora que es, primero las horas, luego los minutos y los segundos, pulsando INTRO despues de introducir cada uno de estos campos");
		horas = leer.nextInt();
		minutos = leer.nextInt();
		segundos = leer.nextInt();
		
		segundos++;
		
		if (minutos <= 59 && horas <= 23 && segundos<=59) {
		
			System.out.println("la hora introducida es "+horas+":"+minutos+":"+segundos);
			
			if(segundos > 59) {
				
				segundos = 0;
				minutos ++;
				
				if(minutos>59) {
					
					minutos = 0;
					horas ++;
					
					if(horas>23) {
						
						horas = 0;
						
					}
					
				}
			}
			System.out.println("La hora, pero en el segundo siguiente a esa hora seria "+ horas+":"+minutos+":"+segundos);
			
		}else {
			System.out.println("La hora introducida no es una hora valida");
			}
		
		
		// Estadistica
		
	}
	
}
