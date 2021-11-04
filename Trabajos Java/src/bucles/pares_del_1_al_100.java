package bucles;

import java.util.Scanner;

public class pares_del_1_al_100 {
	public static void main(String[] args) {
			ejercicio2();
	}
	
	public static void ejercicio1() {
		int numero=1;
		while (numero<101) {
			int pares=numero%2;
			if (pares==0) {
				System.out.println(numero);
			}
			numero++;
		}
	}
	
	public static void ejercicio2() {
		int primero,segundo;
		System.out.println("Introduceme el primer numero para comparar");
		Scanner numero1= new Scanner(System.in);
		primero=numero1.nextInt();
		System.out.println("Introduce el segundo numero para comparar");
		Scanner numero2= new Scanner(System.in);
		segundo=numero2.nextInt();
		
		if (primero>segundo) {
			int aux=primero;
			primero=segundo;
			segundo=aux;
		}
		
		while (primero<segundo) {
			int impares=primero%2;
			if (impares==1) {
				System.out.println(primero);
			}
			primero++;
		}
		
	}
}
