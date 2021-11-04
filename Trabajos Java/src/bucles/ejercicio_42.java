package bucles;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio_42 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=0;
		boolean valido=false;
		int opcion;
		int contador=0;
		do {
			try {
				System.out.println("Introduce un numero entero");
				
				numero=teclado.nextInt();
				valido=true;
			} catch (InputMismatchException exception) {
				System.out.println("El numero que has introducido es un entero no valido");
				teclado.next();
			}
		} while (!valido || numero<=0 || numero>15);
		
		do {
			System.out.println("****menu****");
			System.out.println("Introduce un 0 para salir del programa");
			System.out.println("Introduce un 1 para hacer el factorial del numero que hayas introducido");
			System.out.println("Introduce un 2 para hacer la tabla de ese numero");
			System.out.println("Introduce un 3 para hacer la serie Fibonacci del numero");
			System.out.println("Introduce un 4 para cambiar el numero");
			Scanner teclado2=new Scanner(System.in);
			opcion=teclado2.nextInt();
			
			switch (opcion) {
			case 1:
				contador=numero-1;
				int factorial=numero;
				while (contador>0) {
					factorial=factorial*contador;
					contador--;
				}
				System.out.println("El factorial de tu numero es: "+factorial);
				break;
			case 2:
				contador=1;
				int tabla=0;
				while (contador<11) {
					tabla=numero*contador;
					System.out.println(numero+" * "+contador+" = "+tabla);
					contador++;
				}
				break;
			case 3:
				contador=0;
				int contador2=1;
				int resultado=0;
				while (resultado<numero) {
					resultado=contador+contador2;
					contador=contador2;
					contador2=resultado;
					if (resultado<=numero) {
						System.out.println(resultado);
					}
				}
				break;
			case 4:
				do {
					try {
						System.out.println("Introduce un numero entero");
						
						numero=teclado.nextInt();
						valido=true;
					} catch (InputMismatchException exception) {
						System.out.println("El numero que has introducido es un entero no valido");
						teclado.next();
					}
				} while (!valido || numero<=0 || numero>15);
				break;
			default:
				System.out.println("Adios socio");
				break;
			}
		} while (opcion!=0);
	}
}
