package main;

import java.util.Scanner;

import claseCliente.Cliente;

public class Clector {

	public static void main(String[] args) {
		

		Scanner entrada=new Scanner(System.in);
		
		Cliente lector= new Cliente("127.0.0.1", 1802);
		
		System.out.println("Bienvenido a la biblioteca \n NOTA: TENGA EN CUENTA QUE SOLO SE PUEDE PRESTAR UN LIBRO AL MISMO TIEMPO "
				+ "\n Esta es la lista de libros disponibles por el momento: "
				+ "\n\t 1) Las mil y una noches "
				+ "\n\t 2) Crimen y castigo "
				+ "\n\t 3) Cien años de soledad "
				+ "\n\t 4) El viejo y el mar "
				+ "\n\t 5) La montaña mágica "
				+ "\n\t 6) Ensayo sobre la ceguera "
				+ "\n\t 7) Guerra y paz "
				+ "\n\t 8) La iliada "
				+ "\n\t 9) Odisea");
		
		System.out.print("Ingresa el numero del libro deseado: ");
		lector.peticion(entrada.next());

	}

}
