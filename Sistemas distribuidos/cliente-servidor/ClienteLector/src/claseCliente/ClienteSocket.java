package claseCliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteSocket {
	
	private InetAddress direccion;
	private int puerto;
	private Socket cliente;
	private ObjectOutputStream datosSalida;
	private ObjectInputStream datosEntrada;
	
	public ClienteSocket(String direccion, int puerto) {
		try {
			this.puerto = puerto;
			this.direccion = InetAddress.getByName(direccion);
			this.datosSalida = null;
			this.datosEntrada = null;
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public void solicitud(String info) {
		try {
			this.cliente = new Socket(this.direccion, this.puerto);
			this.datosSalida = new ObjectOutputStream(this.cliente.getOutputStream());
			this.datosSalida.flush();
			this.datosEntrada = new ObjectInputStream(this.cliente.getInputStream());
			System.out.println("El cliente fue capaz de establecer una conexion con el servidor.");
			enviarInfo(info);
			while(true) {
				try {
					info = (String) this.datosEntrada.readObject();
					
					if (info==null) {
						cerrarServicio();
					} else {
						System.out.println(info);
					}
				} catch (Exception e) {
					System.out.println("No se ha podido recibir la informacion que fue enviada por el servidor.");
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	private void enviarInfo(String info) {
		try {
			this.datosSalida.writeObject(info);
			this.datosSalida.flush();
		} catch (Exception e) {
			System.out.println("El cliente no ha podido enviar peticiones al servidor.");
		}
	}
	
	private void cerrarServicio() {
		try {
			this.datosEntrada.close();
			this.datosSalida.close();
			this.cliente.close();
			System.out.println("El cliente ha finalizado la conexion con el servidor.");
		} catch (Exception e) {
			System.out.println("El cliente no ha podido finalizar la conexion con el servidor.");
		}
	}

}
