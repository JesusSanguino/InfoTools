package Persistencia;

import java.util.ArrayList;

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
	
	public ArrayList<Integer> get_Matriculas(){//echo bien
		
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
	public ArrayList<Integer> get_sanciones(){//echo bien
		
		ArrayList <Integer>  s = null;

		try{
			s=new ArrayList<Integer>();		
			
			resultado =  estado.executeQuery("SELECT * FROM sancion");		
			
			
			while(resultado.next()){
				
				s.add(resultado.getInt("idsancion"));
			
			}
		
			
			
		}catch(Exception e){
			System.out.println("Error en entrar a la Tabla sancion");
		}
		
		return s;
		
		
		
	}

	
	public Propietario getPropietario(int matricula){//?
		
		
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
					propietario = new Propietario(resultado.getString("DNI"),resultado.getString("Nombre"),resultado.getString("Apellidos"),resultado.getInt("puntos"));
					}
				
			}
			
		}catch(Exception e){
			System.out.println("No se ha podido obtener un Propietario");
		}
		return propietario;
		
		
	}
	
	public void Insertar_Sancion(Sancion s){//?
	
		boolean [] pagada ={true,false};
		int array=(int)(Math.random()*2);
	try{
		
		
		
		ps= con.prepareStatement("INSERT INTO sancion(idsancion, matricula, puntos, precioSancion,Vsancion) VALUES(?,?,?,?,?)");
		ps.setInt(1, s.getId_sancion());
		ps.setInt(2, s.getMatricula());
		ps.setInt(3, s.getPuntos());
		ps.setDouble(4, s.getPrecio_sancion());
		ps.setBoolean(5,pagada[array]);
		ps.executeUpdate();
		
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	
}
	public void InsertarMatriculayPropietario(int matricula,Propietario propietario){//?
	
	try{
		
		ps= con.prepareStatement("INSERT INTO vehiculo(Matricula, DNI) VALUES (?,?)");
		ps.setInt(1, matricula);
		ps.setString(2, propietario.getDNI());
		ps.executeUpdate();
		ps2= con.prepareStatement("INSERT INTO propietario(DNI, Nombre, Apellidos,puntos) VALUES (?,?,?,?)");
		ps2.setString(1,propietario.getDNI());
		ps2.setString(2,propietario.getNombre());
		ps2.setString(3,propietario.getApellidos());
		ps2.setInt(4,propietario.getPuntos());
		ps2.executeUpdate();
		
		
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	
}
	public int Verificar_psancion(int id){//
	int pagada=0;
	try{
		
		
		resultado =  estado.executeQuery("SELECT *  FROM sancion");
		while(resultado.next()){
			if(resultado.getInt("idsancion")==id) pagada=resultado.getInt("Vsancion");
			
		}
		
	}catch(Exception e){
		System.out.println("No se ha podido obtener un verificacion");
	}
	return pagada;
	
}
	public Sancion devolver_sancion(int id){//
	Sancion s = null;
	

		
	try{
		
		
		resultado =  estado.executeQuery("SELECT *  FROM sancion");
		while(resultado.next()){
			if(resultado.getInt("idsancion")==id)
				s=new Sancion(resultado.getInt("idsancion"),resultado.getInt("matricula"),resultado.getInt("puntos"),resultado.getDouble("precioSancion"));
			
		}
		
	}catch(Exception e){
		System.out.println("No se ha podido obtener la sancion");
	}
return s;
	
}
}
