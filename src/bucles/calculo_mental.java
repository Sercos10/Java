package bucles;

import java.util.Scanner;

public class calculo_mental {
	public static void main(String[] args) {
		int acertadas=0;
		int numero;
		boolean esCorrecto=true;
		
		do {
			int numSecreto1= (int) (Math.random()*10+1);
			int numSecreto2= (int) (Math.random()*10+1);
			System.out.println("Introduce el resultado que daria la siguiente la operacion");
			System.out.println(numSecreto1+" * "+numSecreto2);
			Scanner teclado=new Scanner(System.in);
			numero=teclado.nextInt();
			if (numero==(numSecreto1*numSecreto2)) {
				System.out.println("Has acertado la operacion");
				acertadas++;
			}else {
				esCorrecto=false;
				System.out.println("Has fallado la operacion");
				System.out.println("El resutado de la operacion era: "+numSecreto1*numSecreto2);
			}
		} while (esCorrecto);
		System.out.println("Has acertado: "+acertadas+" operaciones");
	}
}
