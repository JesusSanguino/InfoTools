package Dominio;

public class Expediente {
	
	private int id;
	private String Nombre;
	private String Apellidos;
	private String DNI;
	private int Matricula;
	private int velocidad;
	
	
	public Expediente(int id, String nombre, String apellidos, String dNI, int matricula, int velocidad) {
		this.id = id;
		Nombre = nombre;
		Apellidos = apellidos;
		DNI = dNI;
		Matricula = matricula;
		this.velocidad = velocidad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public int getMatricula() {
		return Matricula;
	}


	public void setMatricula(int matricula) {
		Matricula = matricula;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	
	
	
	
	
	

}
