import java.io.IOException;

public class Hilo implements Runnable{
	
	String nombre;
	String url;
	
	public Hilo(String nombre, String url) {
		this.nombre=nombre;
		this.url=url;
	}

	@Override
	public void run() {
		try {
			//No olvidar cambiar la ruta de google y la de los archivos
			String headlessChrome = "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\""
					+ "--headless --disable-gpu --print-to-pdf=\"C:\\Users\\compumax\\Desktop\\pdfs"+"\\"+nombre+".pdf"+"\" "+url;
			
			//System.out.println("\n la solicitud "+id+" esta utilizando el hilo "+Thread.currentThread().getName());
			System.out.print("\nEl archivo:"+nombre+".pdf se encuentra en la direccion:C:\\Users\\compumax\\Desktop\\pdfs");
            Runtime.getRuntime().exec(headlessChrome);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
		
	}

}
