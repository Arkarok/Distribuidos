package claseServidor;

public class Servidor {
	
	private ServidorSocket servidorSo;
	
	public Servidor(int puerto) {
		this.servidorSo=new ServidorSocket(puerto);
	}
	
	public void arrancarServidor() {
		servidorSo.escuchar();
	}

}
