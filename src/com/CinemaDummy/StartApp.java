package com.CinemaDummy;


public class StartApp {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		CinemaList<Pelicula>  pelis;
		CinemaList<Serie>  series;

		try {
			
			pelis = new CinemaList<Pelicula>("Peliculas").MarcarVisto();
			series= new CinemaList<Serie>("Series").MarcarVisto();
			System.out.println("");
			
			pelis.ListarVistos();
			
			series.ListarVistos();
			
			pelis.CinemaReciente();
			
			series.MaximoTemporadas();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	

}
