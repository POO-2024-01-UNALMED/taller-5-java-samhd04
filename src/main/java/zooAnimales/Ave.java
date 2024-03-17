package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	ArrayList<Ave> listado = new ArrayList<Ave>();
	static int halcones;
	static int aguilas;
	String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) 	{
		
	}
	
	public Ave() {
		
	}
	
	public Ave crearHalcon(String nombre, int edad, String genero) {
		Ave.halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	
	public Ave crearAguila(String nombre, int edad, String genero) {
		Ave.aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}
	
	public int cantidadAves() {
		return listado.size();
	}
}
