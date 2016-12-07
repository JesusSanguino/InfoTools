package Dominio;

public class Sancion {
	
	private int id_sancion;
	private int matricula;
	private double precio_sancion;
	private int puntos;
	
	 public Sancion(int id,int matricula,int puntos,double precio_sancion){
		 this.id_sancion=id;
		 this.matricula=matricula;
		 this.precio_sancion=precio_sancion;
		 this.puntos=puntos;
		
	 }
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getPrecio_sancion() {
		return precio_sancion;
	}
	public void setPrecio_sancion(double precio_sancion) {
		this.precio_sancion = precio_sancion;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getId_sancion() {
		return id_sancion;
	}
	public void setId_sancion(int id_sancion) {
		this.id_sancion = id_sancion;
	}
	
	

	public boolean comprobar_sancion(int velocidad){
		boolean multado=false;
		int via=devolver_via();
		
		if(velocidad>via){
			multado=true;
			
			calcular_multa(via,velocidad);
		}
		return multado;
	}
	public int devolver_via(){
		int via;
		int d=(Math.round((int)(Math.random()*150+30)));
		int s=10-d%10;
		via=d+s;
		
		if (via>120){
			via=120;
		}
		
		return via;
		
		
	}
	 
	public void calcular_multa(int via,int velocidad){
		
		switch(via){
		case 30:
			if(velocidad>30 && velocidad <=50){
				precio_sancion=100;
				this.setPrecio_sancion(precio_sancion);
			}else if(velocidad>50&&velocidad<=60)  {
				precio_sancion=300;
				puntos=2;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				  
			}else if(velocidad>60 && velocidad<=70){
				precio_sancion=400;
				puntos=4;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>70 && velocidad <=80){
				precio_sancion=500;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>80){
				precio_sancion=600;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}
		break;
		
		case 40:
			if(velocidad>40 && velocidad <=60){
				precio_sancion=100;
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>60&&velocidad<=70)  {
				precio_sancion=300;
				puntos=2;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				  
			}else if(velocidad>70 && velocidad<=80){
				precio_sancion=400;
				puntos=4;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>80 && velocidad <=90){
				precio_sancion=500;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>90){
				precio_sancion=600;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}
		break;
		
		case 50:
			if(velocidad>50 && velocidad <=70){
				precio_sancion=100;
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>70&&velocidad<=80)  {
				precio_sancion=300;
				puntos=2;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				  
			}else if(velocidad>80 && velocidad<=90){
				precio_sancion=400;
				puntos=4;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>90 && velocidad <=100){
				precio_sancion=500;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>100){
				precio_sancion=600;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}
		break;
		
		case 60:
			if(velocidad>60 && velocidad <=90){
				precio_sancion=100;
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>90&&velocidad<=110)  {
				precio_sancion=300;
				puntos=2;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
				  
			}else if(velocidad>110 && velocidad<=120){
				precio_sancion=400;
				puntos=4;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>120 && velocidad <=130){
				precio_sancion=500;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>130){
				precio_sancion=600;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}
		break;
		
		case 70:
			if(velocidad>70 && velocidad <=100){
				precio_sancion=100;
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>100&&velocidad<=120)  {
				precio_sancion=300;
				puntos=2;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
				  
			}else if(velocidad>120 && velocidad<=130){
				precio_sancion=400;
				puntos=4;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>130 && velocidad <=140){
				precio_sancion=500;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>140){
				precio_sancion=600;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}
		break;
		
		case 80:
			if(velocidad>80 && velocidad <=110){
				precio_sancion=100;
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>110&&velocidad<=130)  {
				precio_sancion=300;
				puntos=2;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
				  
			}else if(velocidad>130 && velocidad<=140){
				precio_sancion=400;
				puntos=4;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>140 && velocidad <=150){
				precio_sancion=500;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>150){
				precio_sancion=600;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}
		break;
		
		case 90:
			if(velocidad>90 && velocidad <=120){
				precio_sancion=100;
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>120&&velocidad<=140)  {
				precio_sancion=300;
				puntos=2;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				  
			}else if(velocidad>140 && velocidad<=150){
				precio_sancion=400;
				puntos=4;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>150 && velocidad <=160){
				precio_sancion=500;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>160){
				precio_sancion=600;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}
		break;
		
		case 100:
			if(velocidad>100 && velocidad <=130){
				precio_sancion=100;
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>130&&velocidad<=150)  {
				precio_sancion=300;
				puntos=2;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				  
			}else if(velocidad>150 && velocidad<=160){
				precio_sancion=400;
				puntos=4;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>160 && velocidad <=1700){
				precio_sancion=500;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>170){
				precio_sancion=600;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}
		break;
		
		case 110:
			if(velocidad>110 && velocidad <=140){
				precio_sancion=100;
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>140&&velocidad<=160)  {
				precio_sancion=300;
				puntos=2;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
				  
			}else if(velocidad>160 && velocidad<=170){
				precio_sancion=400;
				puntos=4;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>170 && velocidad <=180){
				precio_sancion=500;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>180){
				precio_sancion=600;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}
		break;
		
		case 120:
			if(velocidad>120 && velocidad <=150){
				precio_sancion=100;
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>150&&velocidad<=170)  {
				precio_sancion=300;
				puntos=2;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>170 && velocidad<=180){
				precio_sancion=400;
				puntos=4;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>180 && velocidad <=190){
				precio_sancion=500;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}else if(velocidad>190){
				precio_sancion=600;
				puntos=6;
				this.setPuntos(puntos);
				this.setPrecio_sancion(precio_sancion);
				
			}
		break;
		
		
		
		}
			
	}

}
