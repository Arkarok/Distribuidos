package main;

import claseServidor.Servidor;

public class Sbiblioteca {

	public static void main(String[] args) {
		
		Servidor serv= new Servidor(1802);
		
		serv.arrancarServidor();
		
	}

}
