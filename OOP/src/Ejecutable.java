import java.util.Scanner;

public class Ejecutable {
	
	public static void main(String[] args) {
		
		Coche c1 = null;
		Coche c2 = null;
		Garaje g= new Garaje("Colon",
				new Coche("4545BBN","Ford",456),
				new Coche("6969RNG","Renault",524));
		
		System.out.println(g);
		System.out.println();
		
		System.out.println(g.cuentaCoches());
		
		Coche aux=g.sacaCoche("4545BBN");
		
		System.out.println(aux);
		
		System.out.println(g.cuentaCoches());
		
	}
	
}
