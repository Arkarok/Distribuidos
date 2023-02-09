package Servicio;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Iterator;

public class fmServidor extends UnicastRemoteObject implements vmServicio {

	protected fmServidor() throws RemoteException {
		llenadoArrays();
		System.out.println("Servidor conectado");
	}

	Actor actor1 = new Actor("Hugh Jackman", "Wolverine");
	Actor actor2 = new Actor("Dafne Keen", "X-23");
	Actor actor3 = new Actor("Keanu Reeves", "Neo");
	Actor actor4 = new Actor("Carrie-Anne Moss", "Trinity");
	Actor actor5 = new Actor("Bill Skarsgard", "Pennywise");
	Actor actor6 = new Actor("Jaeden Martell", "Bill Denbrough");
	Actor actor7 = new Actor("Anthony Gonzalez", "Miguel");
	Actor actor8 = new Actor("Gael García Bernal", "Hector");
	Actor actor9 = new Actor("Mel Gibson", "Porter");
	Actor actor10 = new Actor("Lucy Liu", "Pearl");

	ArrayList<Actor> reparto1 = new ArrayList<Actor>();
	ArrayList<Actor> reparto2 = new ArrayList<Actor>();
	ArrayList<Actor> reparto3 = new ArrayList<Actor>();
	ArrayList<Actor> reparto4 = new ArrayList<Actor>();
	ArrayList<Actor> reparto5 = new ArrayList<Actor>();
	ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

	public void llenadoArrays() {

		reparto1.add(actor1);
		reparto1.add(actor2);
		Pelicula pelicula1 = new Pelicula("logan", 2017, reparto1);
		peliculas.add(pelicula1);

		reparto2.add(actor3);
		reparto2.add(actor4);
		Pelicula pelicula2 = new Pelicula("matrix", 1999, reparto2);
		peliculas.add(pelicula2);

		reparto3.add(actor5);
		reparto3.add(actor6);
		Pelicula pelicula3 = new Pelicula("it", 2017, reparto3);
		peliculas.add(pelicula3);
		
		reparto4.add(actor7);
		reparto4.add(actor8);
		Pelicula pelicula4 = new Pelicula("coco", 2017, reparto4);
		peliculas.add(pelicula4);
		
		reparto5.add(actor9);
		reparto5.add(actor10);
		Pelicula pelicula5 = new Pelicula("revancha", 1999, reparto5);
		peliculas.add(pelicula5);

	}

	@Override
	public ArrayList<Object> nombrePelicula(String nombre) throws RemoteException {
		
		ArrayList<Object> objetos = new ArrayList<Object>();
		for (int i = 0; i < peliculas.size(); i++) {

			if (peliculas.get(i).getTitulo().equals(nombre)) {
				
				objetos.add(peliculas.get(i));
				return objetos;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Object> yearPelicula(int year) throws RemoteException {

		ArrayList<Object> objetos = new ArrayList<Object>();
		for (int i = 0; i < peliculas.size(); i++) {
			
			if (peliculas.get(i).getYear() == year) {

				objetos.add(peliculas.get(i));
			}
		}
		return objetos;
	}

}
