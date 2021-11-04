package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej_5 {
	public static void main(String[] args) {
		System.out.println("Introduce el tamaño del array: ");
		int tamaño=leeNumero();
		int numero=0;
		int[] miArray= new int[tamaño];
		System.out.println("Ahora introduceme el valor más alto y bajo para generar los numeros aleatorios.");
		rellenaArray(miArray,numero=leeNumero(),numero=leeNumero());
		sumaArray(miArray);
		muestraArray(miArray);
	}
	
	public static void muestraArray (int miArray[]) {
		for (int i = 0; i < miArray.length; i++) {
			System.out.println("En la posicion "+i+" esta el numero "+miArray[i]);
		}
	}
	
	public static void sumaArray (int miArray[]) {
		int suma=0;
		for (int i = 0; i < miArray.length; i++) {
			suma+=miArray[i];
		}
		System.out.println("La suma total de los numeros del Array es: "+suma);
	}
	
	public static void rellenaArray (int miArray[], int upper, int lower){
		
		if (lower>upper) {
			int aux=lower;
			lower=upper;
			upper=aux;
		}
		
		for (int i = 0; i < miArray.length; i++) {
			int numAleatorio= (int) (Math.random()*(upper-lower))+lower;
			miArray[i]=numAleatorio;
		}
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
