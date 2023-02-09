package claseServidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

public class ServidorSocket {
	
	private int puerto;
	private ServerSocket servidor;
	private Socket cliente;
	private ObjectOutputStream datosSalida;
	private ObjectInputStream datosEntrada;
	
	ArrayList<String> libros = new ArrayList<>( Arrays.asList("Las mil y una noches", "Crimen y castigo", "Cien años de soledad"
			,"El viejo y el mar","La montaña mágica","Ensayo sobre la ceguera","Guerra y paz","La iliada","Odisea"));
	
	
	public ServidorSocket(int puerto) {
		try {
			this.puerto = puerto;
			this.servidor = new ServerSocket(puerto, 100);
			this.datosSalida = null;
			this.datosEntrada = null;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void escuchar() {
		
		try {
			String libro;
			System.out.println("El servidor esta a la espera de que un cliente se conecte.");
			this.cliente = this.servidor.accept();
			this.datosSalida = new ObjectOutputStream(this.cliente.getOutputStream());
			this.datosSalida.flush();
			this.datosEntrada = new ObjectInputStream(this.cliente.getInputStream());
			System.out.println("El servidor fue capaz de establecer una conexion con un cliente.");
			while(true) {
				try {
					libro = (String) this.datosEntrada.readObject();
					System.out.println("EL CLIENTE SOLICITO EL SIGUIENTE LIBRO: "+libros.get(Integer.valueOf(libro)-1));
					if(libro==null) {
						cerrarServicio();
					}else {
						enviarInfo("El cliente solicito el prestamo del siguiente libro: "+libros.get(Integer.valueOf(libro)-1));
					}
					
				} catch (Exception e) {
					System.out.println("El servidor no ha podido recibir la informacion enviada por el cliente.");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void enviarInfo(String info) {
		try {
			this.datosSalida.writeObject("MENSAJE DEL SERVIDOR: " + info);
			this.datosSalida.flush();
		} catch (Exception e) {
			System.out.println("El servidor no ha podido enviar informacion al cliente.");
		}
	}
	
	private void cerrarServicio() {
		try {
			this.datosEntrada.close();
			this.datosSalida.close();
			this.cliente.close();
			this.servidor.close();
			System.out.println("El servidor ha finalizado la conexion con el cliente.");
		} catch (Exception e) {
			System.out.println("El servidor no ha podido finalizar la conexion con el cliente.");
		}
	}
	
	public int getPuerto() {
		return puerto;
	}

	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}

}
