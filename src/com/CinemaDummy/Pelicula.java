package com.CinemaDummy;

import java.util.ArrayList;

public  class Pelicula extends Cinema {
	
	
	private int año; 
	
	
	public Pelicula() {
		super();
		año = 0;
	}
	
	public Pelicula( String titulo, String creador) {
		super(titulo,creador);
		año = 0;
		
	}
	
	public Pelicula( String titulo, String creador,String genero,int año,double duracion) {
		super(titulo,creador, genero, duracion);
		this.año = año;
	}

	
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public static ArrayList<Pelicula> ObtenerPeliculas(){
		
		ArrayList<Pelicula> result = new ArrayList<Pelicula>();
		
		try {
			
			result.add(new Pelicula("The Killer Cat","JK Putin","Terror",2013,180.45));
			result.add(new Pelicula("The Flying Rock","Pepe Silva","Action",1989,120.13));
			result.add(new Pelicula("Black and Yellow","Lorenzo Rojas","Suspense",2013,60.32));
			result.add(new Pelicula("The Police Pig","Susana Dias","Comedy",2015,60.22));
			result.add(new Pelicula("A Cloudy Day","Robet Dias","Triller",2011,120.35));
			
		
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		finally {
			
			System.out.println("Peliculas dipsonibles: "+ result.size());
		}
		return result;

	}
	
	@Override
	public String toString() {
		return "Pelicula [titulo=" + getTitulo() + ", genero=" + getGenero() + ", creador=" + getCreador() + ", año=" + año
				+ ", duracion=" + getDuracion() + ", visto=" + esVisto() + "]";
	}

}
