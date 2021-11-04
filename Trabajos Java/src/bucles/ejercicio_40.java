package bucles;

import java.util.Scanner;

public class ejercicio_40 {
	public static void main(String[] args) {	
		int opcion=0;
		do {
			int numSecreto1= (int) (Math.random()*10+1);
			int numSecreto2= (int) (Math.random()*10+1);
			System.out.println("Introduce un 1 para realizar una suma");
			System.out.println("Introduce un 2 para realizar una resta");
			System.out.println("Introduce un 3 para realizar una multiplicación");
			System.out.println("Introduce un 4 para realizar una división");
			System.out.println("Introduce un 5 para salir del programa");
			Scanner teclado=new Scanner(System.in);
			opcion=teclado.nextInt();
			int operacion=0;
			
			switch (opcion) {
				case 1:
					System.out.println("Realiza la siguiente suma: "+numSecreto1+" + "+numSecreto2);
					Scanner resultado=new Scanner(System.in);
					operacion=resultado.nextInt();
					if (operacion==(numSecreto1+numSecreto2)) {
						System.out.println("Has acertado");
					}else {
						System.out.println("Has fallado, el resultado era: "+(numSecreto1+numSecreto2));
					}
				break;
				case 2:
					System.out.println("Realiza la siguiente resta: "+numSecreto1+" - "+numSecreto2);
					Scanner resultado2=new Scanner(System.in);
					operacion=resultado2.nextInt();
					if (operacion==(numSecreto1-numSecreto2)) {
						System.out.println("Has acertado");
					}else {
						System.out.println("Has fallado, el resultado era: "+(numSecreto1-numSecreto2));
					}
				break;
				case 3:
					System.out.println("Realiza la siguiente multiplicación: "+numSecreto1+" x "+numSecreto2);
					Scanner resultado3=new Scanner(System.in);
					operacion=resultado3.nextInt();
					if (operacion==(numSecreto1*numSecreto2)) {
						System.out.println("Has acertado");
					}else {
						System.out.println("Has fallado, el resultado era: "+(numSecreto1*numSecreto2));
					}
				break;
				case 4:
					System.out.println("Realiza la siguiente división: "+numSecreto1+" / "+numSecreto2);
					Scanner resultado4=new Scanner(System.in);
					operacion=resultado4.nextInt();
					if (operacion==((int)numSecreto1/numSecreto2)) {
						System.out.println("Has acertado");
					}else {
						System.out.println("Has fallado, el resultado era: "+(numSecreto1/numSecreto2));
					}
				break;
			default:
				System.out.println("Nos vemos socio");
				break;
			}
		} while (opcion!=5);
		
	}
}
