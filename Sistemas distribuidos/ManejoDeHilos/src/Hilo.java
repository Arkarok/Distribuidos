import java.io.IOException;

public class Hilo implements Runnable{
	
	int id;
	String url;
	
	public Hilo(int id, String url) {
		this.id=id;
		this.url=url;
	}

	@Override
	public void run() {
		
		String headlessChrome = "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\""
				+ "--headless --disable-gpu --print-to-pdf=\"C:\\Users\\compumax\\Desktop\\pdfs"+"\\"+id+".pdf"+"\" "+url;
		
		System.out.println("la solicitud "+id+" esta utilizando el hilo "+Thread.currentThread().getName());
		
		try {
            Runtime.getRuntime().exec(headlessChrome);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
		
	}

}
