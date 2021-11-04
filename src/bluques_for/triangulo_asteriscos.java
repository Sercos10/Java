package bluques_for;

import java.util.InputMismatchException;
import java.util.Scanner;

public class triangulo_asteriscos {
	public static void main(String[] args) {
		int nFilas=0,nColumnas=0, contador=1,num=1,pos=0;
        boolean valido=false;
        Scanner sc=new Scanner(System.in);
        do{
            valido=false;
            System.out.println("Introduzca  numero de filas: \n");
            try {
                nFilas=sc.nextInt();
                valido=true;
            } catch (InputMismatchException e) {
                System.out.println("Error - Introduzca un entero.");
                sc.next();
            }
            System.out.println(""); 
        }while(!valido || nFilas<3 || nFilas >9);
        
        nColumnas=nFilas*2-1;
        pos=nColumnas/2+1;
        
        for (int i = 1; i <= nFilas; i++) {
			for (int j = 0; j < pos; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= contador/2+1; j++) {
				if (i==nFilas || j==1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			
			for (int j = contador/2+1; j <= contador; j++) {
				if (i==nFilas || j==1 || j==contador) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			pos--;
			contador+=2;
			System.out.println();
		}
	}
}
