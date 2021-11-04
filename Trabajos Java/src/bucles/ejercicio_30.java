package bucles;
import java.util.Scanner;
public class ejercicio_30 {
	public static void main(String[] args) {
		int numero=0;
		int contador;
		do {
			System.out.println("Introduceme un numero mayor que cero");
			Scanner pedido=new Scanner(System.in);
			numero=pedido.nextInt();
			contador=0;
			int aux=numero;
			while (contador<=aux) {
				numero=numero+contador++;
				System.out.println(numero);
			}
		} while (numero<0);
		
	}
}