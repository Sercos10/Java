package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Clave_Secreta {
	public static void main(String[] args) {		
		int tamaño=0;
		Bienvenida();
		tamaño=leeNumero();
		int[] Clave =new int[tamaño];
		int[] Usuario = new int[tamaño];
		rellenaArray(Clave);
		rellenaUsuario(Usuario,Clave);
		
	}
	
	/**
	 * Felicitamos al usuario con este metodo
	 */
	
	public static void Felicitacion () {
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Enhorabuena has acertado la combinacion de la Clave secreta");
		System.out.println("Eres un genio <3");
		System.out.println("------------------------------------------------");	
	}
	
	/**
	 * Esta es la bienvenida al programa
	 */
	
	public static void Bienvenida () {
		System.out.println("------------------------------------------------");
		System.out.println("Bienvenido al Juego de Adivinar la Clave Secreta");
		System.out.println("------------------------------------------------");
		System.out.println();
	}
	
	/**
	 * Este metodo compara cada valor de los 2 arrays y dependiendo del valor le doy una pista u otra
	 * @param Clave
	 * @param Usuario
	 * @param num que es la i del rellena usuario
	 * @return devuelve true o false
	 */
	
	public static int comparaArray (int[] Clave, int[] Usuario, int num, int vidas) {
		boolean correcto=false;
			do {
				if (Usuario[num]==Clave[num]) {
					System.out.println("El digito en la posicion: "+num+" es correcto");
					System.out.println();
					correcto=true;
				}else if (Usuario[num]>Clave[num]) {
					System.out.println("El digito en la posicion: "+num+" es más grande que el digito de la Clave");
					System.out.println();
					vidas--;
					System.out.println("Te quedan "+vidas+" vidas");
					Usuario[num]=leeNumeroClave();
					correcto=false;
				}else {
					System.out.println("El digito en la posicion: "+num+" es más pequeño que el digito de la Clave");
					System.out.println();
					vidas--;
					System.out.println("Te quedan "+vidas+" vidas");
					Usuario[num]=leeNumeroClave();
					correcto=false;
				}
			} while (!correcto && vidas>0);
		
		return vidas;
	}
	
	/**
	 * Este metodo introduzco los 2 Arrays porque al rellenar el Array del Usuario voy a verificar el numero sea el mismo que el del Array de Clave
	 * Entonces este metodo recibe el Array con la Clave secreta y el Array del usuario, dentro llamo al metodo comparaArray para que me compare
	 * El numero exacto que acabo de introducir y pide el numero todo el rato hasta que sea igual, cuando todos los numeros sean iguales
	 * Se termina el metodo
	 * @param miArray
	 * @param Clave
	 */
	
	public static void rellenaUsuario (int miArray[], int[] Clave){
		System.out.println("Introduce el numero de vidas que quieres tener");
		int vidas=leeNumeroClave();
		for (int i = 0; i < miArray.length; i++) {
			miArray[i]=leeNumeroClave();
			vidas=comparaArray(Clave, miArray,i,vidas);
			if (vidas<=0) {
				i=miArray.length-1;
				perdido();
			}
		}
		if (vidas>0) {
			Felicitacion();
		}
		
	}
	
	public static void perdido () {
		System.out.println("--------------------------------------");
		System.out.println("Has perdido chaval, intentalo otra vez");
		System.out.println("--------------------------------------");
	}
	
	/**
	 * En este metodo muestro el contenido de mi array por posiciones(este lo tengo para comprobar el contenido y ver si estoy haciendo las cosas bien
	 * @param miArray
	 */
	
	public static void muestraArray (int [] miArray) {
		for (int i = 0; i < miArray.length; i++) {
			System.out.println("El numero en la posicion "+i+" es "+miArray[i]);
		}
	}
	/**
	 * Mi array es el array Clave que le voy a meter numeros aleatorios del 1 al 5
	 * Respecto a lo de poner de introducir el valor maximo y minimo del math.random
	 * no lo veo del todo bien porque entonces si quieres ganar rapido pones de máximo 1 y minimo 0 y ya has ganado
	 * entonces lo voy a dejar como esta.
	 * @param miArray 
	 */
	
	public static void rellenaArray (int miArray[]){
	
		for (int i = 0; i < miArray.length; i++) {
			int numAleatorio= (int) (Math.random()*(6-1))+1;
			miArray[i]=numAleatorio;
		}
	}
	
	/**
	 * Este metodo simplemente me valida que lo que introduzca por teclado no sea una letra ni un numero negativo
	 * @return numero
	 */
	
	public static int leeNumero() {
		Scanner teclado= new Scanner(System.in);
		int numero=0;
		boolean valido=true;
		do {
			try {
				System.out.println("Introduce el tamaño de la contraseña");
				numero=teclado.nextInt();
				valido=true;
			} catch (InputMismatchException exception) {
				System.out.println("El numero que has introducido es un entero no valido");
				teclado.next();
			}	
		} while (!valido || numero<0);
		return numero;
	}
	
	/**
	 * He creado otro leeNumero porque el primero lo voy a utilizar para el tamaño de la clave
	 * y este segundo para los valores del 1 al 5 entonces las condiciones de ruptura son diferentes
	 * y por eso he creado este
	 * @return numero
	 */
	public static int leeNumeroClave() {
		Scanner teclado= new Scanner(System.in);
		int numero=0;
		boolean valido=true;
		do {
			try {
				System.out.println("Introduce un numero del 1 al 5");
				numero=teclado.nextInt();
				valido=true;
			} catch (InputMismatchException exception) {
				System.out.println("El numero que has introducido es un entero no valido");
				teclado.next();
			}	
		} while (!valido || (numero<0 || numero>5));
		return numero;
	}
}
