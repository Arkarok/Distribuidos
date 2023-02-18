import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class mainN {

	public static void main(String[] args) {
		
		ExecutorService pool=Executors.newFixedThreadPool(3);

		Scanner en= new Scanner(System.in);
		Scanner en2= new Scanner(System.in);
		System.out.println("Digita la cantidad de archivos que desea transformar a formato pdf");
		int entradas=en.nextInt();
		System.out.println("Ingresa las direcciones de origen de los archivos seguido de la direccion de destino de los mismos");

		for (int i = 1; i <= entradas; i++) {

			String sDireccionOrigen=en2.nextLine();
			String sDireccionDestino=en2.nextLine();

			pool.execute(new NHilo(sDireccionOrigen,sDireccionDestino));
		}

		pool.shutdown();

	}

}
