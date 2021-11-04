package castings;

import java.util.Scanner;

public class castings_3 {
	public static void main(String[] args) {
		int num=0;
		int num2=0;
		System.out.println("Introduceme el numero de caracteres que quieres que tenga la contraseña");
		Scanner teclado=new Scanner(System.in);
		num=teclado.nextInt();
		
		System.out.println("Introduceme cuantas contraseñas quieres sacar");
		Scanner teclado2=new Scanner(System.in);
		num2=teclado2.nextInt();
		
		for (int i = 0; i < num2; i++) { //contraseñas que se van a sacar
			
			for (int j = 0; j < num; j++) {//caracteres de la contraseña
				System.out.print((char)(Math.random()* (122-48+1)+48));
			}
			System.out.println();
		}
	}
}
