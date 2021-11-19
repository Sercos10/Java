package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InOut {
	public static void sysoln(String f) {
		System.out.println(f);
	}
	public static void syso(String f) {
		System.out.print(f);
	}
	
	public static int leeNumero() {
		Scanner teclado= new Scanner(System.in);
		int numero=0;
		boolean valido=true;
		do {
			try {
				System.out.println("Introduce el numero de la opcion a la que quieres acceder");
				numero=teclado.nextInt();
				valido=true;
			} catch (InputMismatchException exception) {
				System.out.println("El numero que has introducido es un entero no valido");
				teclado.next();
			}	
		} while (!valido || numero<0 || numero>5);
		return numero;
	}
	
	public static double leeDouble() {
		Scanner teclado= new Scanner(System.in);
		double numero=0;
		boolean valido=true;
		do {
			try {
				System.out.println("Introduce la cantidad con la que quieres aumentar su salario");
				numero=teclado.nextDouble();
				valido=true;
			} catch (InputMismatchException exception) {
				System.out.println("El numero que has introducido es un entero no valido");
				teclado.next();
			}	
		} while (!valido || numero<0);
		return numero;
	}
	
	public static int leeIncremento() {
		Scanner teclado= new Scanner(System.in);
		int numero=0;
		boolean valido=true;
		do {
			try {
				System.out.println("Introduce el porcentaje con el que le quieres aumentar el sueldo a tu Empleado");
				numero=teclado.nextInt();
				valido=true;
			} catch (InputMismatchException exception) {
				System.out.println("El numero que has introducido es un entero no valido");
				teclado.next();
			}	
		} while (!valido || numero<0);
		return numero;
	}
	
	public static String leeString() {
		Scanner teclado= new Scanner(System.in);
		String name="";
		boolean valido=true;
		do {
			try {
				name=teclado.next();
				valido=true;
			} catch (InputMismatchException exception) {
				System.out.println("El nombre que has introducido es un numero, no valido");
				teclado.next();
			}	
		} while (!valido);
		return name;
	}
	
	
}
