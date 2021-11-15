
public class Garaje {
	
	private String nombre;
	private Coche plaza1;
	private Coche plaza2;
	
	public Garaje() {
		nombre="desconocido";
		plaza1=plaza2=null;
	}
	
	public Garaje(String nombre) {
		this.nombre=nombre;
		plaza1=plaza2=null;
	}
	
	public Garaje(String nombre, Coche Coche1, Coche Coche2) {
		this.nombre=nombre;
		plaza1=Coche1;
		plaza2=Coche2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Coche getPlaza1() {
		return plaza1;
	}

	public void setPlaza1(Coche plaza1) {
		this.plaza1 = plaza1;
	}

	public Coche getPlaza2() {
		return plaza2;
	}

	public void setPlaza2(Coche plaza2) {
		this.plaza2 = plaza2;
	}
	
	public int cuentaCoches() {
		int n=0;
		if (plaza1!=null) {
			n++;
		}
		if (plaza2!=null) {
			n++;
		}
		return n;
	}
	
	public boolean estaLleno () {
		boolean result=false;
		if (plaza1!=null && plaza2!=null) {
			result=true;
		}
		return result;
	}
	
	public Coche sacaCoche(String matricula) {
		Coche resultado=null;
		if (plaza1 != null && plaza1.getMatricula()==matricula) {
			resultado=plaza1;
			plaza1=null;
		}else if (plaza2 != null && plaza2.getMatricula()==matricula) {
			resultado=plaza2;
			plaza2=null;
		}else {
			System.out.println("No mientas cabron");
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "garaje [nombre=" + nombre + ", plaza1=" + plaza1 + "\n, plaza2=" + plaza2 + "]";
	}
	
	
}
