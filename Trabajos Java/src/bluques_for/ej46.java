package bluques_for;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej46 {
	public static void main(String[] args) {
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
			
			
		} while (!valido || numero<=0);
		
		for (int i = 1; i <=numero; i++) {
				if (numero%i==0) {
					System.out.println(i);
				}
			}
		
	}
}
