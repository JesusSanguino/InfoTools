package Dominio;

import java.util.ArrayList;

import Persistencia.AgenteBBDD;

public class Gestor_BD {
	
	public  ArrayList <Integer> devolver_matricula(AgenteBBDD agente){//bien
		ArrayList <Integer>  vehiculos = new ArrayList<Integer>();
		vehiculos= agente.get_Matriculas();
		return vehiculos;
	}
	
	public  ArrayList <Integer> devolver_sanciones(AgenteBBDD agente){//bien
		ArrayList <Integer>  sanciones = new ArrayList<Integer>();
		sanciones = agente.get_sanciones();
		return sanciones;
	}
	
	public Propietario devolver_propietario(AgenteBBDD agente,int matricula){//bien
		Propietario p;
		
		p=agente.getPropietario(matricula);
		return p;
		
	}

	public boolean Verificar_psancion(AgenteBBDD agente,int id){//nuevo
		boolean pagada=false;
		if(agente.Verificar_psancion(id)==1)pagada=true;
		return pagada;
		
	}
	public Sancion devolverSancion(AgenteBBDD agente,int id){//nuevo
		Sancion s;
		s=agente.devolver_sancion(id);
		return s;
		
	}
	public  ArrayList <String> devolver_DNIs(AgenteBBDD agente){
		ArrayList <String>  dni = new ArrayList<String>();
		dni = agente.get_DNIs();
		return dni;
	}
	
	
	public void borrarVehiculo(AgenteBBDD agente,int m){
		agente.BorrarMatricula(m);
	}
	public void borrarPropietario(AgenteBBDD agente,String dni){
		agente.BorrarDni(dni);
	}
	public void InsertarVehiculo(int matricula,String Dni,AgenteBBDD agente){
		
		agente.InsertarVehiculo(matricula, Dni);
	
	}
	
	public void InsertarPropietario(Propietario p,AgenteBBDD agente){
		agente.InsertarPropietario(p);
	}
	
	public void ModificarV(int m,String dni,AgenteBBDD agente){
		agente.modificarV(m, dni);
	}
	public Propietario PmedianteDNI(String dni,AgenteBBDD agente){
		Propietario p = agente.getPropietarioDNI(dni);
		return p;
	}
	public void ModificarP(Propietario p,AgenteBBDD agente){
		agente.modificarP(p);
	}

}
