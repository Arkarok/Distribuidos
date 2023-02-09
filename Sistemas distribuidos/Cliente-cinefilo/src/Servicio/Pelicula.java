package Servicio;

import java.io.Serializable;
import java.util.ArrayList;

public class Pelicula implements Serializable{
	
	private String titulo;
	private int year;
	ArrayList<Actor> reparto = new ArrayList<Actor>();
	
	public Pelicula(String titulo, int year, ArrayList<Actor> reparto) {
		this.titulo = titulo;
		this.year = year;
		this.reparto = reparto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public ArrayList<Actor> getReparto() {
		return reparto;
	}

	public void setReparto(ArrayList<Actor> reparto) {
		this.reparto = reparto;
	}

	@Override
	public String toString() {
		return "Pelicula: "
				+ "Titulo:" + titulo + 
				" Año:"+ year + 
				" Reparto:" + reparto;
	}

}
