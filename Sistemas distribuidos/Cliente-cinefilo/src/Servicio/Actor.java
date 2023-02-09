package Servicio;

import java.io.Serializable;

public class Actor implements Serializable{
	
	private String nombre;
	private String rol;
	
	public Actor(String nombre, String rol) {
		this.nombre = nombre;
		this.rol = rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Actor: "
				+ "Nombre:" + nombre + 
				" Rol:" + rol;
	}

}
