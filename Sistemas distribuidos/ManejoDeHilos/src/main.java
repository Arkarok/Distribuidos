import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {

	public static void main(String[] args) {
		
		ExecutorService pool=Executors.newFixedThreadPool(3);

		Scanner en= new Scanner(System.in);
		Scanner en2= new Scanner(System.in);
		System.out.println("Digita la cantidad de pdfs que desea crear");
		int entradas=en.nextInt();
		System.out.println("Ingresa los nombres de los archivos seguido de las urls para realizar el procedimiento de transformacion a formato pdf");

		for (int i = 1; i <= entradas; i++) {

			String solicitudesNombre=en2.nextLine();
			String solicitudesUrl=en2.nextLine();

			pool.execute(new Hilo(solicitudesNombre,solicitudesUrl));
		}

		pool.shutdown();

	}

}
