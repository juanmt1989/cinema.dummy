package com.CinemaDummy;

import java.util.ArrayList;


public class Serie extends Cinema {
	
	private int	temporadas;
	
	public Serie() {
	  
	  temporadas = 1;

	}
	
	public Serie(String titulo, String creador) {
		super(titulo,creador);
		temporadas = 1;
	}
	
	public Serie(String titulo, String creador, int temporadas, String genero,double duracion)  {
		super(titulo, creador, genero, duracion);
		this.temporadas = temporadas;
	}


	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	

	public static ArrayList<Serie> ObtenerSeries(){
		
		ArrayList<Serie> result = new ArrayList<Serie>();
		
		try {
			
			result.add(new Serie("The Beast Train","Swim River",8,"Triller",35.21));
			result.add(new Serie("The Contosionist","SS River",5,"Action",60.02));
			result.add(new Serie("Villa Chica","Ana Thomas",2,"Suspense",60.20));
			result.add(new Serie("La Rana Dorada","Albert Rios",3,"Aventura",45.00));
			result.add(new Serie("SuperMan","Vadimir Sereno",8,"Action",60.13));
		
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		finally {
			
			System.out.println("Series dipsonibles: "+ result.size());
		}
		return result;

	}

	@Override
	public String toString() {
		return "Serie [titulo=" + getTitulo() + ", temporadas=" + temporadas + ", visto=" + esVisto() + ", genero=" + getGenero()
				+ ", creador=" + getCreador() + ", duracion=" + getDuracion() + "]";
	}

}
