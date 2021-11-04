package bucles;

import java.util.Scanner;

public class numero_secreto {
	public static void main(String[] args) {
		int numSecreto= (int) (Math.random()*100+1);
		System.out.println(numSecreto);
		int num=0;
		
		while (num!=numSecreto) {
			System.out.println("Introduce un numero");
			Scanner teclado=new Scanner(System.in);
			num=teclado.nextInt();
			if (num>numSecreto) {
				System.out.println("Tu numero es más grande que el numero secreto");
			}else if (num<numSecreto) {
				System.out.println("Tu numero es más pequeño que el numero secreto");
			}else if (num==numSecreto) {
				System.out.println("Enhorabuena, has acertado el numero secreto");
			}
		}
	}
}
