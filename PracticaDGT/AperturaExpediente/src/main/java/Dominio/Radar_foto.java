package Dominio;

import Persistencia.AgenteBBDD;

public class Radar_foto {
	
	int matricula;
	int velocidad;
	public Radar_foto(){
		
		
	}

public void crear_Expediente(AgenteBBDD agente){
		
	Propietario propietario = agente.getPropietario();
	Vehiculo coche=agente.getCoche();
	//Vehiculo coche=new Vehiculo(matricula,propietario);
	System.out.println("El propietario es"+" "+propietario.nombre+" "+propietario.apellidos+" "+"cuyo DNI es "+propietario.DNI
						+" "+"su coche es"+" "+coche.getMatricula());
	
		
	}
}
