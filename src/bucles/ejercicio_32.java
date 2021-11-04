package bucles;
import java.util.Scanner;

public class ejercicio_32 {
	public static void main(String[] args) {
		int numero,contador;
		System.out.println("Introduceme un numero mayor que cero");
		Scanner teclado=new Scanner(System.in);
		numero=teclado.nextInt();
		contador=numero-1;
		int aux1=numero;
		
		if (contador==0) {
			aux1=1;
			System.out.println(aux1);
		}else{
			do{
				numero=numero*contador;
				System.out.println(numero);
				contador--;
			}while(contador>0); 
		}
	}
}
