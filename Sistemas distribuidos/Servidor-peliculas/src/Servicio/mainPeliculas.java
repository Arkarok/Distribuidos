package Servicio;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class mainPeliculas {

	public static void main(String[] args) {
		
		try {
			vmServicio service = new fmServidor();
			LocateRegistry.createRegistry(1802);
			Naming.rebind("//127.0.0.1:1802/service", service);
			
		} catch (RemoteException e) {
			e.printStackTrace();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
