
package bluques_for;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Triangulo {
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
        }while(!valido || nFilas<=0);

        nColumnas=nFilas*2 - 1;
        pos=nColumnas/2 + 1;

        for(int i=0; i<nFilas;i++){
           for(int j=0;j<pos;j++){
                System.out.print(" ");  
           }
           for(int j=0;j<contador;j++)
           {
               System.out.print(num);
               num++;
               if(num==10)
               {
                   num=0;
               }
           }
           num=1;
           pos--;
           contador+=2;
           System.out.print("\n");
        }

        sc.close();
    }
}
