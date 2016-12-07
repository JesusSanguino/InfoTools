package Dominio;

import java.util.ArrayList;

import Persistencia.AgenteBBDD;

public class Radar_foto {
	
	int matricula;
	int velocidad;
	Gestor_BD gestor;
	public Radar_foto(){
		
		
	}

	
	
public Expediente crear_Expediente(AgenteBBDD agente,ArrayList<Integer> vehi){
	Vehiculo v=null;
	Expediente exp=null;
	v=Vehiculo(agente,vehi);
	int velocidad= (Math.round((int)(Math.random()*150+30)));
	int id_sancion= (Math.round((int)(Math.random()*785+999)));
	Sancion s=new Sancion(id_sancion,v.getMatricula(),0,0);
	
	if (s.comprobar_sancion(velocidad)){
		agente.Insertar_Sancion(s);
		int id_Expediente= (Math.round((int)(Math.random()*785+999)));
		exp = new Expediente(id_Expediente,v.getMatricula(),v.getPropietario().getDNI(),v.getPropietario().getNombre(),v.getPropietario().getApellidos(),s.getId_sancion(),s.getPrecio_sancion(),s.getPuntos());
		agente.Insertar_Expediente(exp);
		
	}
	return exp;
}

	
	 
	
public Vehiculo Vehiculo(AgenteBBDD agente,ArrayList<Integer> v){
	Propietario p=null;
	Vehiculo vehi=null;
	int matricula= generarMatriculaRandom(v);
	

	p=agente.getPropietario(matricula);
	vehi= new Vehiculo(matricula,p);
	return vehi;
	

}
public int generarMatriculaRandom(ArrayList<Integer> v){
	
	int numero;
	int tam=v.size();
	int Random=(int) (Math.random()*tam+1);
	if (Random==v.size()){
		Random=2;
	}
	
	numero=v.get(Random);

	return numero;
}



}
