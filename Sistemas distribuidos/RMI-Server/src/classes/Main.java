package classes;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			iRMI service = new ImpRMI();
			LocateRegistry.createRegistry(1802);
			Naming.rebind("//127.0.0.1:1802/service", service);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
