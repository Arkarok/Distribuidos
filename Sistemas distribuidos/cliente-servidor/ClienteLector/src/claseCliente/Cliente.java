package claseCliente;

public class Cliente {
	
	ClienteSocket clienteSo;
	
	public Cliente(String direccion, int puerto) {
		clienteSo= new ClienteSocket(direccion,puerto);
	}
	
	public void peticion(String info) {
		clienteSo.solicitud(info);
	}

}
