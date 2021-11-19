package empleado;

import Utils.InOut;
import Vista.Menu;

public class Ejecutable {
	public static void main(String[] args) {
		Empleado emp1= new Empleado();
		System.out.println("-------------------------------");
		System.out.println(emp1);
		System.out.println("-------------------------------");
		
		Empleado emp2= new Empleado("Jesus Mruillo", 22);
		System.out.println(emp2);
		System.out.println("-------------------------------");
		
		Empleado emp3= new Empleado("Francisco Prados", 21, 1500);
		System.out.println(emp3);
		System.out.println("-------------------------------");
		
		Empleado emp4= new Empleado("Juan Maria", "Marketing", 25, 1600);
		System.out.println(emp4);
		System.out.println("-------------------------------");
		System.out.println();
		escogeOpcion(emp4);
	}
	
	public static void escogeOpcion(Empleado emp) {
		boolean salir=false;
		//Tread.sleep(3000);
		do {
			Menu.muestraMenu();
			int opcion=InOut.leeNumero();
			switch (opcion) {
			case 1:
				escogeOpcion2(emp);
				break;
			case 2:
				double quantity=InOut.leeDouble();
				emp.increaseSalary(quantity);
				System.out.println(emp);
				break;
			case 3:
				int cantidad=InOut.leeIncremento();
				emp.increaseSalary(cantidad);
				System.out.println(emp);
				break;
			case 5:
				System.out.println("Hasta la proxima <3");
				System.out.println("Saliendo del Menú...");
				salir=true;
				break;
			default:
				break;
			}
		
		} while (salir==false);
	}
	
	public static void escogeOpcion2(Empleado emp) {
		boolean salir=false;
		do {
			Menu.subMenu();
			int opcion=InOut.leeNumero();
			switch (opcion) {
			case 1:
				System.out.println("Introduce el nuevo nombre para el Empleado");
				String name=InOut.leeString();
				emp.setName(name);
				System.out.println(emp);
				break;
			case 2:
				System.out.println("Introduce el nuevo departamento para el Empleado");
				String dpto=InOut.leeString();
				emp.setDpto(dpto);
				System.out.println(emp);
				break;
			case 3:
				System.out.println("Introduce el nuevo salario para el Empleado");
				double salary=InOut.leeDouble();
				emp.setSalary(salary);
				System.out.println(emp);
				break;
			case 4:
				System.out.println("Introduce la nueva edad para el Empleado");
				int edad=InOut.leeIncremento();
				emp.setAge(edad);
				System.out.println(emp);
				break;
			case 5:
				System.out.println("Mostrando menú anterior...");
				salir=true;
			default:
				break;
			}
		} while (salir==false);
	}
}
