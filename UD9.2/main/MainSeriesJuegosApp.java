package main;

import models.Metodos;
import models.Serie;
import models.Videojuego;

public class MainSeriesJuegosApp {

	public static void main(String[] args) {
		//Creamos los dos vectores
		Serie [] series = new Serie [5];
		Videojuego [] videojuegos = new Videojuego [5];
		
		//Llenamos los vectores
		Metodos.llenarVectores (series, videojuegos);
		
		//Entregamos algunas series y videojuegos
		Metodos.SeriesVideojuegosEntregados(series, videojuegos);
		
		//Contar cuantas series y videojuegos hay entregados
		Metodos.contarSeriesVideojuegos(series, videojuegos);
	
		//Mostrar el videojuego que tenga m�s horas estimadas y la serie que tenga m�s temporadas
		Metodos.masHoras_temporadas(videojuegos, series);
	}
}
		
