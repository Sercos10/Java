package bucles;

import java.util.Scanner;

public class ordenar {
	public static void main(String[] args) {
		int numero=1;
		while (numero!=0) {
			System.out.println("Introduce un numero para que te diga sus estadisticas");
			System.out.println();
			System.out.println("Si deseas salir del programa escribe un 0");
			Scanner teclado= new Scanner(System.in);
			numero=teclado.nextInt();
			if (numero!=0) {
				if (numero%2==0) {
				System.out.println(numero+" es par");
				}else {
					System.out.println(numero+" es impar");
				}
				if (numero>0) {
					System.out.println(numero+" es positvo");
				}else {
					System.out.println(numero+" es negativo");
				}
				System.out.println("El cuadrado de "+numero+" es: "+numero*numero);
			}
			
		}
		
	}
}
