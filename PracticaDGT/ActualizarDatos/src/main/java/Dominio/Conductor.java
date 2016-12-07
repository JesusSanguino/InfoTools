package Dominio;

public class Conductor {
	
	private String nombre;
	private String apellidos;
	private String DNI;
	private int matricula;
	private int puntos;
	
	
	public Conductor(String nombre, String apellidos, String DNI, int matricula, int puntos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.DNI=DNI;
		this.matricula=matricula;
		this.puntos=puntos;
	}


	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String DNI) {
		this.DNI = DNI;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	
	
	

}
