package Servicio;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface vmServicio extends Remote{

	public ArrayList<Object> nombrePelicula(String nombre) throws RemoteException;
	public ArrayList<Object> yearPelicula(int year) throws RemoteException;
	
}
