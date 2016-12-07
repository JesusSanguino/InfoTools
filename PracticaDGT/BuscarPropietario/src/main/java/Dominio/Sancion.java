package Dominio;

public class Sancion {
	
	int velocidad;
	double precio_sancion;
	int puntos;
	 public Sancion(int velocidad,double precio_sancion,int puntos){
		 this.velocidad=velocidad;
		 this.precio_sancion=precio_sancion;
		 this.puntos=puntos;
	 }
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
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
	
	public void comprobar_sancion(){
		int via;
		via= (int) (Math.random()*120);
		if(velocidad>via){
			calcular_multa(via);
		}
	}
	
	
	 
	public void calcular_multa(int via){
		
		switch(via){
		case 30:
			if(velocidad>30 && velocidad <=50){
				precio_sancion=100;
			}else if(velocidad>50&&velocidad<=60)  {
				precio_sancion=300;
				puntos=puntos-2;
				  
			}else if(velocidad>60 && velocidad<=70){
				precio_sancion=400;
				puntos=puntos-4;
			}else if(velocidad>70 && velocidad <=80){
				precio_sancion=500;
				puntos=puntos-6;
			}else if(velocidad>80){
				precio_sancion=600;
				puntos=puntos-6;
			}
		break;
		
		case 40:
			if(velocidad>40 && velocidad <=60){
				precio_sancion=100;
			}else if(velocidad>60&&velocidad<=70)  {
				precio_sancion=300;
				puntos=puntos-2;
				  
			}else if(velocidad>70 && velocidad<=80){
				precio_sancion=400;
				puntos=puntos-4;
			}else if(velocidad>80 && velocidad <=90){
				precio_sancion=500;
				puntos=puntos-6;
			}else if(velocidad>90){
				precio_sancion=600;
				puntos=puntos-6;
			}
		break;
		
		case 50:
			if(velocidad>50 && velocidad <=70){
				precio_sancion=100;
			}else if(velocidad>70&&velocidad<=80)  {
				precio_sancion=300;
				puntos=puntos-2;
				  
			}else if(velocidad>80 && velocidad<=90){
				precio_sancion=400;
				puntos=puntos-4;
			}else if(velocidad>90 && velocidad <=100){
				precio_sancion=500;
				puntos=puntos-6;
			}else if(velocidad>100){
				precio_sancion=600;
				puntos=puntos-6;
			}
		break;
		
		case 60:
			if(velocidad>60 && velocidad <=90){
				precio_sancion=100;
			}else if(velocidad>90&&velocidad<=110)  {
				precio_sancion=300;
				puntos=puntos-2;
				  
			}else if(velocidad>110 && velocidad<=120){
				precio_sancion=400;
				puntos=puntos-4;
			}else if(velocidad>120 && velocidad <=130){
				precio_sancion=500;
				puntos=puntos-6;
			}else if(velocidad>130){
				precio_sancion=600;
				puntos=puntos-6;
			}
		break;
		
		case 70:
			if(velocidad>70 && velocidad <=100){
				precio_sancion=100;
			}else if(velocidad>100&&velocidad<=120)  {
				precio_sancion=300;
				puntos=puntos-2;
				  
			}else if(velocidad>120 && velocidad<=130){
				precio_sancion=400;
				puntos=puntos-4;
			}else if(velocidad>130 && velocidad <=140){
				precio_sancion=500;
				puntos=puntos-6;
			}else if(velocidad>140){
				precio_sancion=600;
				puntos=puntos-6;
			}
		break;
		
		case 80:
			if(velocidad>80 && velocidad <=110){
				precio_sancion=100;
			}else if(velocidad>110&&velocidad<=130)  {
				precio_sancion=300;
				puntos=puntos-2;
				  
			}else if(velocidad>130 && velocidad<=140){
				precio_sancion=400;
				puntos=puntos-4;
			}else if(velocidad>140 && velocidad <=150){
				precio_sancion=500;
				puntos=puntos-6;
			}else if(velocidad>150){
				precio_sancion=600;
				puntos=puntos-6;
			}
		break;
		
		case 90:
			if(velocidad>90 && velocidad <=120){
				precio_sancion=100;
			}else if(velocidad>120&&velocidad<=140)  {
				precio_sancion=300;
				puntos=puntos-2;
				  
			}else if(velocidad>140 && velocidad<=150){
				precio_sancion=400;
				puntos=puntos-4;
			}else if(velocidad>150 && velocidad <=160){
				precio_sancion=500;
				puntos=puntos-6;
			}else if(velocidad>160){
				precio_sancion=600;
				puntos=puntos-6;
			}
		break;
		
		case 100:
			if(velocidad>100 && velocidad <=130){
				precio_sancion=100;
			}else if(velocidad>130&&velocidad<=150)  {
				precio_sancion=300;
				puntos=puntos-2;
				  
			}else if(velocidad>150 && velocidad<=160){
				precio_sancion=400;
				puntos=puntos-4;
			}else if(velocidad>160 && velocidad <=1700){
				precio_sancion=500;
				puntos=puntos-6;
			}else if(velocidad>170){
				precio_sancion=600;
				puntos=puntos-6;
			}
		break;
		
		case 110:
			if(velocidad>110 && velocidad <=140){
				precio_sancion=100;
			}else if(velocidad>140&&velocidad<=160)  {
				precio_sancion=300;
				puntos=puntos-2;
				  
			}else if(velocidad>160 && velocidad<=170){
				precio_sancion=400;
				puntos=puntos-4;
			}else if(velocidad>170 && velocidad <=180){
				precio_sancion=500;
				puntos=puntos-6;
			}else if(velocidad>180){
				precio_sancion=600;
				puntos=puntos-6;
			}
		break;
		
		case 120:
			if(velocidad>120 && velocidad <=150){
				precio_sancion=100;
			}else if(velocidad>150&&velocidad<=170)  {
				precio_sancion=300;
				puntos=puntos-2;
				  
			}else if(velocidad>170 && velocidad<=180){
				precio_sancion=400;
				puntos=puntos-4;
			}else if(velocidad>180 && velocidad <=190){
				precio_sancion=500;
				puntos=puntos-6;
			}else if(velocidad>190){
				precio_sancion=600;
				puntos=puntos-6;
			}
		break;
		
		
		
		}
			
	}

}
