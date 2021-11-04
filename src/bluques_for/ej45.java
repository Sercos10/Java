package bluques_for;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ej45 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int numero=0;
		boolean valido=true;
		do {
			try {
				System.out.println("Introduceme un numero entre el 1 y 12, estos estan incluidos tambien");
				numero=teclado.nextInt();
				valido=true;
			} catch (InputMismatchException exception) {
				System.out.println("El numero que has introducido es un entero no valido");
				teclado.next();
			}
		} while (!valido || numero<=0 || numero>12);
		
		for (int i = 0; i <=10; i++) {
			System.out.println(numero+" * "+i+" = "+(numero*i));
		}
	}
}
