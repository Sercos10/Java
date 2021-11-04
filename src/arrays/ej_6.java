package arrays;

public class ej_6 {
	public static void main(String[] args) {
		int tamaño=50;
		int contador=0;
		int[] miArray = new int[tamaño];
		rellenaArray(miArray);
		int[] arrayPrimos = new int[numPrimos(miArray, contador)];
		rellenaPrimos(miArray, arrayPrimos);
		muestraArray(miArray);
		System.out.println("---------------------------------------");
		muestraArray(arrayPrimos);
		
	}
	public static void muestraArray (int [] miArray) {
		for (int i = 0; i < miArray.length; i++) {
			System.out.println("El numero en la posicion "+i+" es "+miArray[i]);
		}
	}
	
	public static void rellenaArray (int miArray[]){
		
		for (int i = 0; i < miArray.length; i++) {
			miArray[i]=generaAleatorio(99, 0);
		}
	}
	
	public static int generaAleatorio (int upper, int lower) {
		int numAleatorio=0;
		numAleatorio= (int) (Math.random()*(upper-lower))+lower;
		return numAleatorio;
	}
	
	public static boolean esPrimo (int numero) {
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=numero)){
		  if (numero % contador == 0)
		    primo = false;
		  contador++;
		}
		return primo;
	}
	
	public static int numPrimos (int miArray[], int contador) {
		contador=0;
		for (int i = 0; i < miArray.length; i++) {
			if (esPrimo(miArray[i])==true) {
				contador++;
			}
		}
		return contador;
	}
	
	public static void rellenaPrimos (int miArray[],int arrayPrimos[]) {
		for (int i = 0; i < arrayPrimos.length; i++) {
			for (int j = 0; j < miArray.length; j++) {
				if (esPrimo(miArray[j])==true) {
					arrayPrimos[i]=miArray[j];
					i++;
				}
			}
		}
	}
}
