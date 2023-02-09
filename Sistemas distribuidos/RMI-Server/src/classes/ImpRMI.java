package classes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImpRMI extends UnicastRemoteObject implements iRMI {
	
	protected ImpRMI() throws RemoteException {
	}

	private static final long serialVersionUID = 1L;
	
	/* (non-Javadoc)
	 * @see classes.iRMI#sumar(int, int)
	 */
	@Override
	public int sumar(int a) throws RemoteException {
		return a + 5;
	}
	@Override
	public int restar(int a) throws RemoteException {
		return a - 5;
	}

}
