import java.util.Scanner;
public class notas {
	public static void main(String[] args) {
		int nota;
		System.out.println("Introduce tu nota de curso (Siempre un numero entero");
		Scanner sc= new Scanner(System.in);
		nota=sc.nextInt();
		
		switch (nota) {
			case 1, 2, 3, 4:
				System.out.println("Estas suspenso sosio");
				break;
			
			case 5:
				System.out.println("Estas aprobado por los pelos");
				break;
			case 6:
				System.out.println("Tienes buena nota pero puedes mejorar");
				break;
			case 7:
				System.out.println("Tienes un notable bajo");
				break;
			case 8:
				System.out.println("Tienes un notable alto");
				break;
			case 9:
				System.out.println("Tienes un sobresaliente, nada mal chaval bien hecho");
				break;
			case 10:
				System.out.println("Ole tu polla que has sacadao una matricula, ahora eres tu propio jefe");
				break;
			default:
				System.out.println("introduceme una nota del 0 al 10");
				break;
		}
	}
}
