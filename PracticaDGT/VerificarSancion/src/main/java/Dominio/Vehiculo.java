package Dominio;

public class Vehiculo {
	
	int matricula;
	Propietario propietario;
	
	public Vehiculo(int matricula, Propietario propietario){
		this.matricula=matricula;
		this.propietario=propietario;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	

}
