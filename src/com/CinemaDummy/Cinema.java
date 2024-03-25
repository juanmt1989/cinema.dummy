package com.CinemaDummy;

public class Cinema implements IVisualizable {
	
	private String titulo;
	private String genero;
	private String creador;	
	private double duracion;
	private boolean visto ;

	
	public Cinema() {
		titulo = "";
		genero = "";
		creador = "";
		duracion = 0.0;
		visto = false;	
				
	}
	
	public Cinema( String titulo, String creador) {
		this.titulo = titulo;
		genero = "";
		this.creador = creador;
		duracion = 0.0;
		visto = false;	
	}
	
	public Cinema( String titulo, String creador,String genero,double duracion) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.duracion =  duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}


	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		visto = true;
		
	}

	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return visto;
	}

	@Override
	public String tiempoVisto() {
		// TODO Auto-generated method stub
		String[] x = Double.toString(duracion).split("\\.");
				
		return x[0]+"m "+x[1]+"s";
	}	

}
