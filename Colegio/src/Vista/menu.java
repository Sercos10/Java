package Vista;

public class menu {
	//Este es el men� principal y el que muestra todas las opciones disponibles a realizar
	public static void  muestraMenu() {
		System.out.println("Bienvenido al programa de gestion de alumnos");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Introduzca el numero correspondiente a la opcion que desea acceder");
		System.out.println("0.- Para salir del programa");
		System.out.println("1.- Mostrar las notas medias de los 2 grupos");
		System.out.println("2.- El nombre y la nota del alumno con mas nota de los 2 grupos por separado");
		System.out.println("3.- El nombre y la nota del alumno con menos nota de los 2 grupos por separado");
		System.out.println("4.- Modificar la nota de un alumno en funci�n a su nombre y grupo");
		System.out.println("5.- Eliminar a un alumno de su grupo mediante su nombre habiendo mostrado antes su nombre y nota");
		System.out.println("6.- Mostras los 2 Grupos con sus alumnos y notas");
		System.out.println("-----------------------------------------------------------------------------------------------------");
	}
	
	//Este es un submen� que utilizo para que el usuario escoga entre buscar un grupo u otro
	public static void escogeGrupo() {
		System.out.println("1.- Para buscar al alumno en PrimeroSMR");
		System.out.println("2.- Para buscar al alumno en SegundoSMR");
	}
}
