
package bluques_for;


import java.util.Scanner;
import java.util.InputMismatchException;

public class TrianguloMC {
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

        nColumnas=nFilas*2 - 1;
        pos=nColumnas/2 + 1;
        
        //el primer for es el que imprime las filas
        for(int i=0; i<nFilas;i++){
        	//este for controla los espacios que hay que poner
           for(int j=0;j<pos;j++){
                System.out.print(" ");  
           }
           
           for(int j=0;j<contador/2 + 1;j++)
           {
               System.out.print(num++);
           }

           num--;

           for(int j=contador/2 + 1;j<contador;j++){
            System.out.print(--num);
           }

           num=1;
           pos--;
           contador+=2;
           System.out.print("\n");
        }

        sc.close();
    }
}

