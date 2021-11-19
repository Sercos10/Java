package empleado;

public class Empleado {
	private String name;
	private String dpto;
	private int age;
	private double salary;
	
	
	public Empleado () {
		this.name="nadie";
		this.dpto="nada";
		this.age=0;
		this.salary=0;
	}
	public Empleado (String name, int age) {
		this.name=name;
		this.dpto="nada";
		this.age=age;
	}
	public Empleado (String name, int age, double salary) {
		this.name=name;
		this.dpto="nada";
		this.age=age;
		this.salary=salary;
	}
	public Empleado (String name, String dpto, int age, double salary) {
		this.name=name;
		this.dpto=dpto;
		this.age=age;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDpto() {
		return dpto;
	}
	public void setDpto(String dpto) {
		this.dpto = dpto;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public boolean increaseSalary(double quantity) {
		boolean increase=false;
		if (quantity>0) {
			salary+=quantity;
			increase=true;
		}
		
		return increase;
	}
	
	public boolean increaseSalary(int quantity) {
		boolean increase=false;
		if (quantity>0) {
			salary=salary+((salary*quantity)/100);
			increase=true;
		}
		return increase;
		
	}
	
	public String toString() {
		return "Empleado: "+name+"\n"+
				"Departamento: "+dpto+"\n"+
				"Sueldo: "+salary+" Euros\n"+
				"Edad: "+age;
	}
}
