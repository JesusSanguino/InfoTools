package Dominio;

public class Propietario {
	
	String DNI;
	String nombre;
	String apellidos;
	
	public Propietario(String DNI,String nombre,String apellidos){
		this.DNI=DNI;
		this.nombre=nombre;
		this.apellidos=apellidos;
		
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
	
	

}
