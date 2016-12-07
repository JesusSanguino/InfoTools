package Persistencia;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import Dominio.Propietario;
import Dominio.Sancion;
import Dominio.Vehiculo;

import java.sql.*;
public class AgenteBBDD {
	
	private Connection con;
	private Statement estado;
	private ResultSet resultado;
	private PreparedStatement ps,ps2;

	public AgenteBBDD(){
		
	}
	public void conexion(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/radardgt","root","");
			
			estado = (Statement) con.createStatement();
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	

	
	public ArrayList<Integer> get_Matriculas(){
		
		ArrayList <Integer>  vehiculos = null;
		
		try{
			vehiculos=new ArrayList<Integer>();
			String consulta = "SELECT * FROM vehiculo";			
			
			resultado = ((java.sql.Statement) estado).executeQuery(consulta);		
			
			
			while(resultado.next()){
				
			vehiculos.add(resultado.getInt("Matricula"));
			
			}
		
			
			
		}catch(Exception e){
			System.out.println("Error en entrar a la Tabla vehiculo");
		}
		
		return vehiculos;
		
		
		
	}

	
public Propietario getPropietario(int matricula){
		
		
		Propietario propietario = null;
		String DNI=null;
		String rel;
		try{
						
				
			resultado =  estado.executeQuery("SELECT *  FROM vehiculo");
			while(resultado.next()){
				if (matricula == resultado.getInt("Matricula")) DNI=resultado.getString("DNI");
				
			}
			
			
			resultado = estado.executeQuery("SELECT *  FROM propietario");
			while(resultado.next()){
				rel=resultado.getString("DNI"); 
				if (DNI.equals(rel)){
					propietario = new Propietario(resultado.getString("DNI"),resultado.getString("Nombre"),resultado.getString("Apellidos"));
					}
				
			}
			
		}catch(Exception e){
			System.out.println("No se ha podido obtener un Propietario");
		}
		return propietario;
		
		
	}
	
public void Insertar_Sancion(Sancion s){
	
	try{
		ps= con.prepareStatement("INSERT INTO sancion(idsancion, matricula, puntos, precioSancion) VALUES(?,?,?,?)");
		ps.setInt(1, s.getId_sancion());
		ps.setInt(2, s.getMatricula());
		ps.setInt(3, s.getPuntos());
		ps.setDouble(4, s.getPrecio_sancion());
		ps.executeUpdate();
		
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	
}
public void InsertarMatriculayPropietario(int matricula,Propietario propietario){
	
	try{
		
		ps= con.prepareStatement("INSERT INTO vehiculo(Matricula, DNI) VALUES (?,?)");
		ps.setInt(1, matricula);
		ps.setString(2, propietario.getDNI());
		ps.executeUpdate();
		ps2= con.prepareStatement("INSERT INTO propietario(DNI, Nombre, Apellidos) VALUES (?,?,?)");
		ps2.setString(1,propietario.getDNI());
		ps2.setString(2,propietario.getNombre());
		ps2.setString(3,propietario.getApellidos());
		ps2.executeUpdate();
		
		
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	
}
/*public Propietario getPropietario(){
		
		
		Propietario propietario = null;
	
		try{
			
			String consulta = "SELECT * FROM propietario";			
				
			resultado = ((java.sql.Statement) estado).executeQuery(consulta);		
			
			
			while(resultado.next()){
			propietario = new Propietario(resultado.getString("DNI"),resultado.getString("Nombre"),resultado.getString("Apellidos"));
				
				//System.out.println(resultado.getString("DNI"));
			}
		}catch(Exception e){
			System.out.println("No se ha podido obtener un vehiculo aleatorio");
		}
		return propietario;
		
		
	}*/


/*public Vehiculo getCoche(){
	
	
	Vehiculo coche = null;

	try{
		
		String consulta = "SELECT * FROM vehiculo";			
			
		resultado = ((java.sql.Statement) estado).executeQuery(consulta);		
		
		
		while(resultado.next()){
		//vehiculo = new Propietario(resultado.getString("DNI"),resultado.getString("Nombre"),resultado.getString("Apellidos"));
		coche= new Vehiculo(resultado.getInt("matricula"),getPropietario());
			//System.out.println(resultado.getString("DNI"));
		}
	}catch(Exception e){
		System.out.println("No se ha podido obtener un vehiculo aleatorio");
	}
	return coche;
	
	
}	*/

	
}
