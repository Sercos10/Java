import java.util.Scanner;

public class fecha_switch {
	public static void main(String[] args) {
		int mes,dias;
		System.out.println("introduce un mes para saber cuantos dias tiene");
		Scanner numero=new Scanner(System.in);
		mes=numero.nextInt();
		String aux="";
		 switch (mes) {
		case 1:
			dias=31;
			aux="Enero";
			break;
		case 2:
			dias=28;
			aux="Febrero";
			break;
		case 3:
			dias=31;
			aux="Marzo";
			break;
		case 4:
			dias=30;
			aux="Abril";
			break;
		case 5:
			dias=31;
			aux="Mayo";
			break;
		case 6:
			dias=30;
			aux="Junio";
			break;
		case 7:
			dias=31;
			aux="Julio";
			break;
		case 8:
			dias=31;
			aux="Agosto";
			break;
		case 9:
			dias=30;
			aux="Septiembre";
			break;
		case 10:
			dias=31;
			aux="Octubre";
			break;
		case 11:
			dias=30;
			aux="Noviembre";
			break;
		case 12:
			dias=31;
			aux="Diciembre";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
		 System.out.println("El mes "+aux+" tiene "+dias);
	}
}
