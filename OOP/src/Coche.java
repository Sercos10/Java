public class Coche {
	private String matricula;
	private String modelo;
	private int kms;
	
	public Coche() {
		System.out.println("Creando coche....");
		matricula="desconocida";
		modelo="desconocida";
		kms=0;
	}
	
	public Coche(String matricula, String modelo, int kms) {
		this.matricula=matricula;
		this.modelo=modelo;
		this.kms=kms;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	public String toString() {
		String resultado="";
		
		resultado="El coche "+this.modelo+" con matricula "+this.matricula+" y kms "+this.kms;
		
		return resultado;
	}
}