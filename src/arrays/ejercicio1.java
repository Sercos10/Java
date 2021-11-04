package arrays;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		int[] Numeros = new int[10];
		int numero=0;
		for (int i = 0; i < Numeros.length; i++) {
			System.out.println("Introduceme un numero para almacenarlo en el array");
			Scanner teclado=new Scanner(System.in);
			Numeros[i]=numero=teclado.nextInt();
		}
		for (int i = Numeros.length-1; i >=0 ; i--) {
			System.out.println("El numero en la posicion "+i+" es: "+Numeros[i]);
		}
	}
}
