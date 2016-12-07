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
	
	

}
