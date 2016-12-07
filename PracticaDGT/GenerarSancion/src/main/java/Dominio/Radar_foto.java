package Dominio;

import java.util.ArrayList;

import Persistencia.AgenteBBDD;

public class Radar_foto {
	
	int matricula;
	int velocidad;
	public Radar_foto(){
		
		
	}

	
	
public void crear_Expediente(AgenteBBDD agente){
	
	for(int i=0;i<5;i++){
		Propietario p;
		Vehiculo vehiculo;
		int v= (Math.round((int)(Math.random()*150+30)));
		p=generar_Propietario();
		vehiculo=generar_Vehiculo(p);
		int id= (Math.round((int)(Math.random()*785+999)));
		Sancion s=new Sancion(id,vehiculo.getMatricula(),0,0);
		
		if (s.comprobar_sancion(v)){
			agente.InsertarMatriculayPropietario(vehiculo.getMatricula(),p);
			agente.Insertar_Sancion(s);
		}
	}
	
	
	 
	}
public Propietario generar_Propietario(){

	
		Radar_foto foto=new Radar_foto();
		String[]nombres={"Jesus","pepe","Carlos","Jose","Patricia","Javier","Rosa","Sara","Maria","Beatriz","Juan","Enrique","Ismael"
				,"Agustin","Jhon"};
		int nombreAleatorio=(int)(Math.random()*13);
		String nombre=nombres[nombreAleatorio];
		String []apellidos={"Sánchez","Pérez","Aguado","Álcazar","Avila","Rodriguez","Botella","Durán","Campo","Calderón","Castelló",
				"Castilla","Cazorla","Iniesta","Duarte","Dueñas","Elías","Fábregas","Ferrer"};
		int apellidoAleatorio1=(int)(Math.random()*19);
		int apellidoAleatorio2=(int)(Math.random()*19);
		String apellido1=apellidos[apellidoAleatorio1];
		String apellido2=apellidos[apellidoAleatorio2];
		int dnip=(int)(Math.random()*9999999+10000000);
		char[]letrasDNI={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','V','W','Y','Z'};
		int dniAleatorio=(int)(Math.random()*24);
		Propietario p=new Propietario(dnip+""+letrasDNI[dniAleatorio], nombre, apellido1+ " "+apellido2);
		return p;

}
public Vehiculo generar_Vehiculo(Propietario p){
	Vehiculo v;
	matricula=(int)(Math.random()*9999+9999);
	
	v=new Vehiculo(matricula,p);
	return v;

}


}
