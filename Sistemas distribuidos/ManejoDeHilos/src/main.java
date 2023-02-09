import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {

	public static void main(String[] args) {
		
		ExecutorService pool=Executors.newFixedThreadPool(3);
		
		for (int i = 1; i <= 5; i++) {
			pool.execute(new Hilo(i,"https://onelinerhub.com/chrome-headless/how-to-save-web-page-to-pdf"));
		}
		
		pool.shutdown();

	}

}
