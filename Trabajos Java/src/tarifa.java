
public class tarifa {
	
	public static void main(String[] args) {
	 int nhoras=8;
	 boolean turno=false; //true significa que es de dia
	 boolean esDomingo=true;
	 int SueldoPorHoras=-1;
	 
	 	if (nhoras > 0 && nhoras <=8) {
	 		
	 		if (turno==true) {
				SueldoPorHoras=10;
				if (esDomingo==true) {
					SueldoPorHoras=SueldoPorHoras+2;
				}
			}else {
				SueldoPorHoras=13;
				if (esDomingo==true) {
					SueldoPorHoras=SueldoPorHoras+3;
				}
			}
	 		System.out.println("Has ganado "+ (nhoras*SueldoPorHoras));
	 	}else {
	 		System.out.println("Denuncialo hermano, estas trabajando de más");
	 	}
	}
}
