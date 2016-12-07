package Dominio;

public class Propietario {
	
	private String DNI;
	private String nombre;
	private String apellidos;
	private int puntos;
	
	public Propietario(String DNI,String nombre,String apellidos, int p){
		this.DNI=DNI;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.puntos =p;
		
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
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
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	
	

}
