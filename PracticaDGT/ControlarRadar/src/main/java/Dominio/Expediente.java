package Dominio;

public class Expediente {
	private int idExpediente;//
	private int matricula;//
	private String dni;//
	private String nombre;//
	private String apellidos;//
	private int id_sancion;
	private double precio_multa;
	private int puntos;//puntos de la sancion
	public Expediente(int idExpediente, int matricula, String dni, String nombre, String apellidos, int id_sancion,
			double precio_multa, int puntos) {
		this.idExpediente = idExpediente;
		this.matricula = matricula;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id_sancion = id_sancion;
		this.precio_multa = precio_multa;
		this.puntos = puntos;
	}
	public int getIdExpediente() {
		return idExpediente;
	}
	public void setIdExpediente(int idExpediente) {
		this.idExpediente = idExpediente;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public int getId_sancion() {
		return id_sancion;
	}
	public void setId_sancion(int id_sancion) {
		this.id_sancion = id_sancion;
	}
	public double getPrecio_multa() {
		return precio_multa;
	}
	public void setPrecio_multa(double precio_multa) {
		this.precio_multa = precio_multa;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	
	
	
}
