package Servicio;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;

public class mainCinefilo {

	public static void main(String[] args) {
		
		try {
			
			Scanner entrada=new Scanner(System.in);
			vmServicio service =  (vmServicio) Naming.lookup("rmi://127.0.0.1:1802/service");
			
			int salida=1;
			
			while(salida==1) {
				
				System.out.println("Seleccione alguna de las siguientes opciones");
				System.out.println("1. buscar pelicula por titulo");
				System.out.println("2. buscar pelicula por año");
				System.out.println("3. dejar de buscar peliculas");
				
				int opciones=entrada.nextInt();
				
				if(opciones==1) {
					
					System.out.println("escribe el titulo de la pelicula");
					String nombreP=entrada.next();
					
					if(service.nombrePelicula(nombreP)==null) {
						System.out.println("no se pudo encontrar una pelicula con el titulo: "+nombreP);
					}else {
						System.out.println(service.nombrePelicula(nombreP));
					}
					
				}else if(opciones==2) {
					System.out.println("escribe el año");
					int yearP=entrada.nextInt();
					
					if(service.yearPelicula(yearP).isEmpty()) {
						System.out.println("no fueron encontradas peliculas que sean del año: "+yearP);
					}else {
						System.out.println(service.yearPelicula(yearP));
					}
					
				}else if(opciones==3){
					salida=0;
					System.out.println("salio con exito del sistema");
					
				}else {System.out.println("opcion invalida, intente de nuevo");}
				
			}
		
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}

	}

}
