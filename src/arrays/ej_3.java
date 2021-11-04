package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej_3 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=0;
		int[] miArray= new int[10];
		int mayor=0;
		int pos=0;
		int pos_menor=0;
		
		for (int i = 0; i < 10; i++) {
			numero=leeNumero();
			miArray[i]=numero;
		}
		int menor=miArray[0];
		for (int i = 0; i < miArray.length; i++) {
			if (miArray[i]>mayor) {
				mayor=miArray[i];
			}
			if (miArray[i]<menor) {
				menor=miArray[i];
			}
			for (int j = 0; j < miArray.length; j++) {
				if (miArray[i]==mayor) {
					pos=i;
				}
				if (miArray[i]==menor) {
					pos_menor=i;
				}
			}
		}
		
		System.out.println("El numero más grande dentro del array es: "+miArray[pos]);
		System.out.println("El numero más pequeño dentro del array es: "+miArray[pos_menor]);
	}
	
	public static int leeNumero() {
		Scanner teclado= new Scanner(System.in);
		int numero=0;
		boolean valido=true;
		do {
			try {
				System.out.println("Introduceme un numero mayor que cero");
				numero=teclado.nextInt();
				valido=true;
			} catch (InputMismatchException exception) {
				System.out.println("El numero que has introducido es un entero no valido");
				teclado.next();
			}	
		} while (!valido || numero<0);
		return numero;
	}
}
