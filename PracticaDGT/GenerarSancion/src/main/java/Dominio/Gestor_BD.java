package Dominio;

import java.util.ArrayList;

import Persistencia.AgenteBBDD;

public class Gestor_BD {
	
	public  ArrayList <Integer> devolver_matricula(AgenteBBDD agente){
		ArrayList <Integer>  vehiculos = new ArrayList<Integer>();
		vehiculos= agente.get_Matriculas();
		return vehiculos;
	}
	
	public Propietario devolver_propietario(AgenteBBDD agente,int matricula){
		Propietario p;
		
		p=agente.getPropietario(matricula);
		return p;
		
	}
	

}
