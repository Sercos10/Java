import java.util.Scanner;

public class Ejecutable {
	
	public static void main(String[] args) {
		int n=7;
		String frase="Hola";
		String frase2=new String("Adios");
		Scanner teclado=new Scanner(System.in);
		
		Coche micoche=new Coche();
		Coche tucoche=new Coche("5748-BMD","Fiat",9000);
		
		micoche.setModelo("Renault");
		micoche.setMatricula("6541-ABS");
		micoche.setKms(5000);
		
		tucoche.setModelo("BMW");
		tucoche.setMatricula("4875-MSN");
		tucoche.setKms(100);
		
		System.out.println(micoche.toString());
		System.out.println(tucoche);
	}
	
}
