package Dominio;

import Persistencia.AgenteBBDD;

public class Radar_foto {
	
	public Radar_foto(){
		
		
	}

public void/*Expediente*/ crear_Expediente(AgenteBBDD agente,int m){
		
	Propietario p = null;
	Vehiculo v = null;
	
	Expediente exp =new Expediente(1,p.getNombre(),p.getNombre(),p.getDNI(),v.getMatricula(),120);
	
	}
}
