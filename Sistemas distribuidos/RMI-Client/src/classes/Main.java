package classes;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			iRMI service =  (iRMI) Naming.lookup("rmi://127.0.0.1:1802/service");			
			System.out.println(service.sumar(20));			
			System.out.println(service.restar(15));			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		

	}

}
