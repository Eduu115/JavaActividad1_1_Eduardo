package ejecutables;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Diseñar un programa que muestre el producto y la suma de los 10
		//primeros números impares
		
		// Definir
		int contadorImpares = 0, contadorNumeros = 0, contadorSuma = 0, contadorProducto = 1;	
		
		// Bucle
		
		 while (contadorImpares < 10){
			 
			 contadorNumeros ++;
			
			 if (contadorNumeros%2 != 0){
				 System.out.println("El numero"+ contadorNumeros+" es impar");
				 contadorImpares ++; 
				 contadorSuma += contadorNumeros; 
				 contadorProducto *= contadorNumeros;
			 }
		 }
		 
		 System.out.println("El producto es "+ contadorProducto);
		 System.out.println("La suma es " + contadorSuma);
	}
}
