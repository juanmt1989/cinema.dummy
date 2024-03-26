package com.CinemaDummy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class CinemaList<T>  extends ArrayList<T> implements ICinemaList{
	
	
	private ArrayList<T> list = new ArrayList<T>();
	private char tipo;
	
	public  CinemaList() {}
	
	@SuppressWarnings({ "unchecked", "static-access" })
	public  CinemaList(String Tipo) throws Exception {
		
		if (Tipo=="Series") {
			tipo='S';
			list = (ArrayList<T>) this.serie.ObtenerSeries();
			
			
		}
		else if (Tipo=="Peliculas") {
			tipo='P';
			list = (ArrayList<T>) this.pelicula.ObtenerPeliculas();
		}
			
		else
			throw new Exception("Tipo de Lista Incompatible, puede usar 'Series' o 'Peliculas' para obtener un resultado.");
		
		
	}

	
	@Override
	public CinemaList<T> MarcarVisto() {
		
		CinemaList<T> result= new CinemaList<T>();
		
		try {
			
			
			int total =list.size();
			Random objGenerator = new Random();
            for (int iCount = 0; iCount< total; iCount++){
            	
            	if (tipo=='S') {
            		((Serie)list.get(objGenerator.nextInt(total))).marcarVisto();;
				} 
            	else {
            		((Pelicula)list.get(objGenerator.nextInt(total))).marcarVisto();;
            	}
              
             }
            
            result.addAll(list);
            result.list = list;
            result.tipo = tipo;
            
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public void ListarVistos(){
	
		if(tipo=='S') {
			
			System.out.println("Lista de Series vistas:");	
			list.stream().filter(e -> ((Serie)e).esVisto()).forEach(x -> {
				System.out.println("-- " +((Serie)x).getTitulo()+", Duracion: "+((Serie)x).tiempoVisto());
			});
		}
		else {
			System.out.println("Lista de Peliculas vistas:");	
			list.stream().filter(e -> ((Pelicula)e).esVisto()).forEach(x -> {
				System.out.println("-- " +((Pelicula)x).getTitulo()+", Duracion: "+((Pelicula)x).tiempoVisto());
			});
		}
		System.out.println("");
	}
	
	public void MaximoTemporadas(){
		
		if(tipo=='S') {
			
			@SuppressWarnings("unchecked")
			List<Serie> tempSeries =(List<Serie>) list;

		    // then
		    var result = tempSeries
		      .stream()
		      .max(Comparator.comparing(Serie::getTemporadas))
		      .orElseThrow(NoSuchElementException::new);

		    
			
			System.out.println("La Serie con mas temporada es:");
			System.out.println(result.toString());
			System.out.println("");
		}
		else {
			System.out.println("Este tipo de Cinema no contiene temporadas.");
			System.out.println("");
		}
	}
	
	public void TopReciente(){
		
		if(tipo=='P') {
			
			@SuppressWarnings("unchecked")
			List<Pelicula> tempSeries =(List<Pelicula>) list;

		    // then
		    var result = tempSeries
		      .stream()
		      .max(Comparator.comparing(Pelicula::getAño))
		      .orElseThrow(NoSuchElementException::new);

			
			System.out.println("La Pelicula del año mas reciente es:");
			System.out.println(result.toString());
			System.out.println("");
		}
		else {
			System.out.println("Este tipo de Cinema no contiene el dato de Año.");
			System.out.println("");
		}
	}

}
