import java.io.IOException;

public class NHilo implements Runnable {
	
	String direccionOrigen;
	String direccionDestino;
	
	public NHilo(String direccionOrigen, String direccionDestino) {
		this.direccionOrigen=direccionOrigen;
		this.direccionDestino=direccionDestino;
	}

	@Override
	public void run() {
		
		try {
			
			String [] nombre=direccionOrigen.split("\\\\");
			
			//No olvidar cambiar la ruta de libreOffice y la de los archivos
			String libreOffice="\"C:\\Program Files\\LibreOffice\\program\\soffice.exe\"  --convert-to pdf --outdir "
					+ ""+direccionDestino+" \""+direccionOrigen+"\"";
			
			//System.out.println("\n la solicitud "+direccionOrigen+" esta utilizando el hilo "+Thread.currentThread().getName());
			System.out.print("\nEl archivo:"+nombre[nombre.length-1]+" se encuentra ubicado en la siguiente ruta:"+direccionDestino);
			Runtime.getRuntime().exec(libreOffice);
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	

}
