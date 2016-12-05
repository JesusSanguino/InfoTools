package Persistencia;

import java.sql.Statement;
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
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/radardgt","root","");
			
			estado = (Statement) con.createStatement();
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	

	

public Propietario getPropietario(){
		
		
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
		
		
	}

public Vehiculo getCoche(){
	
	
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
	
	
}	

	
}
