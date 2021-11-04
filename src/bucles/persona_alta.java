package bucles;

import java.util.Scanner;

public class persona_alta {
	public static void main(String[] args) {
		int altura=0;
		int altura_alto=0;
		int participantes=0;
		String DNI="";
		String DNI_alto="";
		
		while (altura!=-1) {
			System.out.println("Para salir del programa introduce como altura un -1");
				System.out.println("Introduce la altura de la persona en centimetros");
				Scanner numero= new Scanner(System.in);
				altura=numero.nextInt();
				if (altura!=-1) {
				System.out.println("Introduce el nombre y DNI de la persona");
				System.out.println("Separa el nombre del DNI con un _	");
				Scanner letra=new Scanner(System.in);
				DNI=letra.next();
				
				participantes=participantes+1;
				if (altura>altura_alto) {
					altura_alto=altura;
					DNI_alto=DNI;
				}
			}
		}
		System.out.println("La persona más alta fue: "+DNI_alto+" con una altura de: "+altura_alto+" centimetros");
		System.out.println("En total participaron "+participantes+" participantes");
	}
}
