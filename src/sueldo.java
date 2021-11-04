import java.util.Scanner;

public class sueldo {
	public static void main(String[] args) {
		int sueldo,antiguedad;
		System.out.println("Introduce tu sueldo");
		Scanner dinero= new Scanner(System.in);
		sueldo=dinero.nextInt();
		System.out.println("Introduce la antiguedad que tienes en la empresa");
		Scanner viejo=new Scanner(System.in);
		antiguedad=viejo.nextInt();
		
		if (sueldo<1000&&sueldo>0&&antiguedad>=10) {
			int aumento=(sueldo*20)/100;
			System.out.println("Tu sueldo inicial es: "+sueldo);
			System.out.println("El aumento de tu sueldo es: "+aumento);
			System.out.println("Tu sueldo es: "+(sueldo+aumento));
		}else if (sueldo<1000&&sueldo>0&&antiguedad<10) {
			int aumento=(sueldo*5)/100;
			System.out.println("Tu sueldo inicial es: "+sueldo);
			System.out.println("El aumento de tu sueldo es: "+aumento);
			System.out.println("Tu sueldo final es: "+(sueldo+aumento));
		}else if (sueldo>1000) {
			System.out.println("No tienes aumento debido a que ganas más de 1000 euros");
			System.out.println("Tu suedo final es: "+sueldo);
		}else {
			System.out.println("Introduce bien los valores");
		}
		
	}
}
