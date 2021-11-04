package bucles;
import java.util.Scanner;
public class ejercicio_31 {
	public static void main(String[] args) {
		int numero;
		System.out.println("Introduceme un numero mayor que cero");
		Scanner teclado=new Scanner(System.in);
		numero=teclado.nextInt();
		
		while (numero>0) {
			System.out.println(numero--);
			
		}
	}
}
