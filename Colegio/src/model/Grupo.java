package model;

import java.util.Arrays;
import java.util.Iterator;

import Utils.pedir;
public class Grupo {
	private String nombre;
	private Alumno[] Grupo;
	
	public Grupo() {
		this.nombre="nada";
		this.Grupo=new Alumno[0];
	}
	
	public Grupo(String nombre, int numero) {
		this.nombre=nombre;
		this.Grupo= new Alumno[numero];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*En este metodo a�ado un alumno teniendo primero en cuenta de que no haya un alumno que tenga el mismo nombre
	 * utilizando el metodo encuentraAlum, si encuentra a un alumno con el mismo nombre encontrado se vuelve true y se sale del bucle
	 * y no mete al alumno en el grupo, en caso de que no haya ningun alumno con el mismo nombre se mete al alumno en el grupo y se sale del bucle
	 */
	public boolean anadirAlumno(Alumno a1) {
		boolean metido=false;
		boolean encontrado=false;
		if (a1!=null) {
			for (int i = 0; (i < Grupo.length && !metido) && !encontrado; i++) {
				if (Grupo[i]!=null) {
					encontrado=encuentraAlum(a1,Grupo[i]);
				}
				
				if (Grupo[i]==null && !encontrado) {
					Grupo[i]=a1;
					metido=true;
				}
			}
		}
		return metido;
	}
	
	/*
	 * Este metodo lo que hace es que recibe un alumno el metodo a�adeAlumno y compara su nombre con el alumno que le hemos pasado
	 * Al metodo a�adeAlumno para que lo meta en el grupo, en caso de que el nombre sea igual encontrado se vuelve true y devuelve true
	 */
	public boolean encuentraAlum(Alumno a1, Alumno alumnoArray) {
		boolean encontrado=false;
		
		
			if (alumnoArray.getNombre().equals(a1.getNombre())) {
				encontrado=true;
			}
		
		
		return encontrado;
	}
	
	/*
	 * En este metodo busco a un alumno en un grupo dependiendo del nombre que me hayan introducido,
	 * En caso de que encuentre al alumno, igualo eliminado a ese alumno que he encontrado y despues lo elimino del array
	 * seguidamente devuelvo el alumno eliminado
	 */
	public Alumno eliminaAlumno(String nombre) {
		boolean encontrado=false;
		Alumno eliminado=null;
		
		for (int i = 0; i < Grupo.length && encontrado!=true; i++) {
			if (Grupo[i].getNombre().equals(nombre)) {
				eliminado=Grupo[i];
				Grupo[i]=null;
				encontrado=true;
				
			}
		}
		if (encontrado) {
			return eliminado;
		}else {
			System.out.println("No se ha encontrado al alumno o no existe");
			return null;
		}
		
	}
	
	/*
	 * Este metodo busca a un alumno segun su nombre en un grupo, y si lo encuentra devuelve la posicion
	 * en la que se encuentra el alumno, en caso de que no se encuentre el alumno devolvera -1
	 */
	public int encuentraPos(String nombre) {
		int pos=-1;
		boolean encontrado=false;
		for (int i = 0; i < Grupo.length; i++) {
			if (Grupo[i].getNombre().equals(nombre)) {
				pos=i;
				encontrado=true;
			}
		}
		if (!encontrado) {
			System.out.println("Lo sentimos tu alumno no esta en este grupo o no existe");
		}
		return pos;
	}
	
	/*
	 * Aqui buscamos a un alumno por un nombre que nos han introducido, en caso de que lo encuentre mostramos su nombre y nota
	 * en caso de que no lo encontremos mostrar� un mensaje de que no se ha encontrado
	 */
	public void datosAlum(String nombre) {
		boolean encontrado=false;
		for (int i = 0; i < Grupo.length; i++) {
			if (Grupo[i].getNombre().equals(nombre)) {
				encontrado=true;
				System.out.println("El alumno: "+Grupo[i].getNombre()+"tiene una nota de: "+Grupo[i].getNota());
			}
		}
		if (!encontrado) {
			System.out.println("Lo sentimos tu alumno no esta en este grupo o no existe");
		}
	}
	
	/*
	 * En este metodo modifico la nota de un alumno dependiendo del nombre que me hayan pasado por teclado
	 * en caso de que se encuentre ese alumno se le cambiar� la nota, en caso de que no se haya encontrado el alumno
	 * se mostrar� un mensaje de que no se ha encontrado el alumno o no existe
	 */
	public void modificaNota(String nombre) {
		boolean encontrado=false;
		double antiguanota=0;
		
		for (int i = 0; i < Grupo.length; i++) {
			if (Grupo[i].getNombre().equals(nombre)) {
				encontrado=true;
				antiguanota=Grupo[i].getNota();
				Grupo[i].setNota(pedir.leeDouble("Introduce la nueva nota"));
				
				//aqui compruebo que se ha cambiado la nota con respecto a la que tenia anteriormente
				if (antiguanota!=Grupo[i].getNota()) {
					System.out.println("La nota se ha cambiado correctamente");
				}else {
					System.out.println("No has cambiado la nota o no se ha podido cambiar la nota");
				}
			}
		}
		
		if (!encontrado) {
			System.out.println("Lo sentimos tu alumno no esta en este grupo o no existe");
		}
	}
	
	/*
	 * Aqui calculo la media del grupo 
	 */
	public double calculaMedia() {
		double mediatotal=0;
		double nota=0;
		
		for (int i = 0; i < Grupo.length; i++) {
			nota=Grupo[i].getNota();
			mediatotal+=nota;
		}
		
		mediatotal=mediatotal/Grupo.length;
		return mediatotal;
	}
	
	/*
	 * En este metodo busco la nota m�s alta que haya en el grupo y devuelvo el alumno con dicha nota m�s alta
	 */
	
	public Alumno notaMayor() {
		double mayor=0;
		Alumno Alum= new Alumno();
		for (int i = 0; i < Grupo.length; i++) {
			if (mayor<Grupo[i].getNota()) {
				mayor=Grupo[i].getNota();
				Alum=Grupo[i];
			}
		}
		return Alum;
	}
	
	/*
	 * En este metodo busco la nota m�s baja que haya en el grupo y devuelvo el alumno con dicha nota m�s baja
	 */
	public Alumno notaMenor() {
		double menor=10;
		Alumno Alum= new Alumno();
		for (int i = 0; i < Grupo.length; i++) {
			if (menor>Grupo[i].getNota()) {
				menor=Grupo[i].getNota();
				Alum=Grupo[i];
			}
		}
		return Alum;
	}
	
	//Esto es simplemente el toString
	@Override
	public String toString() {
		return "El grupo " + nombre +":\n"+ Arrays.toString(Grupo);
	}
	
	
}
