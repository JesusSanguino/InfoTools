package Persistencia;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import Dominio.Propietario;
import Dominio.Vehiculo;

import java.sql.*;
public class AgenteBBDD {
	
	private Connection con;
	private Statement estado;
	private ResultSet resultado; 

	
	public AgenteBBDD(){
		
	}
public void conexion(){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		
		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/radardgt","root","");
		
		estado = (Statement) con.createStatement();
		
		System.out.println("Conectado a la bbdd");
		
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
						
				
			resultado = ((java.sql.Statement) estado).executeQuery("SELECT *  FROM vehiculo");
			while(resultado.next()){
				if (matricula == resultado.getInt("Matricula")) DNI=resultado.getString("DNI");
				
			}
			
			System.out.println(DNI);
			resultado = ((java.sql.Statement) estado).executeQuery("SELECT *  FROM propietario");
			while(resultado.next()){
				rel=resultado.getString("DNI"); 
				if (DNI.equals(rel)){
					propietario = new Propietario(resultado.getString("DNI"),resultado.getString("Nombre"),resultado.getString("Apellidos"));
					}
				
			}
			
		}catch(Exception e){
			System.out.println("No se ha podido obtener un Propietario aleatorio");
		}
		return propietario;
		
		
	}

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
