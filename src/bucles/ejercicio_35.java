package bucles;

import java.util.Scanner;

public class ejercicio_35 {
	public static void main(String[] args) {
		int numero=1;
		int aux=0;
		int mayor=0;
		boolean primero=true;
		while (numero!=0) {
			System.out.println("Introduceme un numero entero");
			System.out.println("Si quieres salir del programa introduceme un 0");
			Scanner teclado=new Scanner(System.in);
			numero=teclado.nextInt();
			if (numero!=0) {
				if (numero>aux && numero>mayor) {
				mayor=numero;
				}else if (mayor<aux) {
					System.out.println(aux);
					mayor=aux;
					aux=numero;
					System.out.println(aux);
				}
				
				if (primero) {
					aux=numero;
					primero=false;
				}
			}
			
				
			
			
		}
		System.out.println("El numero más grande es: "+mayor);
	}
}
