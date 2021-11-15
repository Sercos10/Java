package miempresa;

public class Empresa {
	Persona ceo;
	Persona desarrollador;
	Persona disenador;
	String nombre;
	
	public Empresa(String nombre) {
		this.nombre=nombre;
	}

	public Persona getCeo() {
		return ceo;
	}

	public void setCeo(Persona ceo) {
		this.ceo = ceo;
	}

	public Persona getDesarrollador() {
		return desarrollador;
	}

	public void setDesarrollador(Persona desarrollador) {
		this.desarrollador = desarrollador;
	}

	public Persona getDisenador() {
		return disenador;
	}

	public void setDisenador(Persona disenador) {
		this.disenador = disenador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Calcula la suma de todos los salarios de los empleados contratados, incluyendo al jefe
	 * @return el salario total que se paga
	 */
	public float calculaSalarioTotal() {
		float total=0;
		float salario1=0;
		float salario2=0;
		float salario3=0;
		if (desarrollador!=null) {
			salario1=desarrollador.getSalario();
		}
		if (disenador!=null) {
			salario2=disenador.getSalario();
		}
		if (ceo!=null) {
			salario3=ceo.getSalario();
		}
		total=(salario1+salario2)+salario3;
		return total;
	}
	/**
	 * Contrata a un empleado en función del puesto -> 0 para desarrollador, 1 para diseñador, en caso de que todo haya ido correcto devuelve true.
	 * Si el puesto para el que se quiere contratar está ocupado no hará la contratación y devolverá false
	 * @param puesto 0 desarrollador, 1 diseñador
	 * @param acontratar la persona que ocupará el cargo indicado por puesto
	 * @return true si se ha realizado la contratación correctamente, false si no se ha podido o el puesto es erróneo
	 */
	public boolean contrataEmpleado(Persona acontratar,int puesto) {
		boolean contratado=false;
		
		if (puesto==0 && desarrollador==null) {
			desarrollador=acontratar;
			contratado=true;
		}else if(puesto==1 && disenador==null){
			disenador=acontratar;
			contratado=true;
		}else {
			contratado=false;
		}
		
		return contratado;
	}
	/**
	 * Deja vacante el puesto seleccionado por puesto
	 * @param puesto 0 desarrollador, 1 diseñador
	 * @return true si se ha podido despedir adecuadamente al empleado, false si no existía empleado a despedir o el puesto es erróneo
	 */
	public boolean despideEmpleado(int puesto) {
		boolean fired=false;
		
		if (puesto==0 && desarrollador!=null) {
			desarrollador=null;
			fired=true;
		}else if (puesto==1 && disenador!=null) {
			disenador=null;
			fired=true;
		}else {
			fired=false;
		}
		
		return fired;
	}
	
	/**
	 * Devuelve el puesto que obstenta la persona indicada por su DNI, 0 desarrollador, 1 diseñador, 2 jefe
	 * @param dni a buscar para devolver el puesto
	 * @return devuelve el puesto 0 desarrollador, 1 diseñador, 2 jefe, o -1 si no se ha encontrado a la persona
	 */
	public int extraePuesto(String dni) {
		int puesto=-1;
		
		if (desarrollador!=null && desarrollador.getDni()==dni) {
			puesto=0;
		}else if(disenador!=null && disenador.getDni()==dni) {
			puesto=1;
		}else if(ceo!=null && ceo.getDni()==dni) {
			puesto=2;
		}else {
			puesto=-1;
		}
		
		return puesto;
	}
	/**
	 * Aumenta el salario del empleado dado por dni la cantidad dada por parámetro
	 * @param dni del empleado a promocionar
	 * @param cantidad a sumar a su salario inicial
	 * @return true si se ha conseguido, false si no existe ese empleado
	 */
	public boolean promocionaEmpleado(String dni, float cantidad) {
		boolean promoted=false;
		float salario=0;
		if (desarrollador!=null && desarrollador.getDni()==dni) {
			salario=desarrollador.getSalario();
			desarrollador.setSalario(salario+cantidad);
			promoted=true;
		}else if(disenador!=null && disenador.getDni()==dni){
			salario=disenador.getSalario();
			disenador.setSalario(salario+cantidad);
			promoted=true;
		}else {
			promoted=false;
		}
		
		return promoted;
	}
	
	@Override
	public String toString() {
		return "Empresa [ceo=" + ceo + ", desarrollador=" + desarrollador + ", disenador=" + disenador + ", nombre="
				+ nombre + "]";
	}
	
	
	
	
}
