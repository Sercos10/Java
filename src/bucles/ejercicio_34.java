package bucles;

import java.util.Scanner;

public class ejercicio_34 {
	public static void main(String[] args) {
		int edad=1;
		int suma=0,media=0,numtotal=0,mayoredad=0;
		while (edad>0) {
			System.out.println("Introduce la edad de un alumno");
			System.out.println("Si deseas salir del programa escribe en la edad 0 o un numero negativo");
			Scanner teclado=new Scanner(System.in);
			edad=teclado.nextInt();
			if (edad>0) {
				suma=suma+edad;
				numtotal=numtotal+1;
				media=suma/numtotal;
				if (edad>=18) {
					mayoredad=mayoredad+1;
				}
			}
			
		}
		System.out.println("La suma de todas las edades es de: "+suma);
		System.out.println("La media aritmetica de las edades es de: "+media);
		System.out.println("El numero total de alumnos introducidos es de: "+numtotal);
		System.out.println("La cantidad de alumnos mayores de edad es de: "+mayoredad);
	}
}
