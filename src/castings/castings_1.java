package castings;

import java.util.Scanner;

public class castings_1 {
	public static void main(String[] args) {
		double num1=0.0;
		double num2=0.0;
		Scanner teclado=new Scanner(System.in);
		num1=teclado.nextDouble();
		Scanner teclado2=new Scanner(System.in);
		num2=teclado2.nextDouble();
		
		System.out.println("La division es: "+(int)(num1/num2));
	}
}
