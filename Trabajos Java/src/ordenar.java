import java.util.Scanner;

public class ordenar {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner numero= new Scanner(System.in);
		a=numero.nextInt();
		Scanner numero2= new Scanner(System.in);
		b=numero2.nextInt();
		Scanner numero3= new Scanner(System.in);
		c=numero3.nextInt();
		
		if (a>b&&a>c) {
			if (b>c) {
				System.out.println("El orden de mayor a menor es: "+a+" "+b+" "+c);
			}else {
				System.out.println("El orden de mayor a menor es: "+a+" "+c+" "+b);
			}
		}else if (b>a&&b>c) {
			if (a>c) {
				System.out.println("El orden de mayor a menor es: "+b+" "+a+" "+c);
			}else {
				System.out.println("El orden de mayor a menor es: "+b+" "+c+" "+a);
			}
		}else if (c>a&&c>b) {
			if (a>b) {
				System.out.println("El orden de mayor a menor es: "+c+" "+a+" "+b);
			}else {
				System.out.println("El orden de mayor a menor es: "+c+" "+b+" "+a);
			}
		}
	}
}
