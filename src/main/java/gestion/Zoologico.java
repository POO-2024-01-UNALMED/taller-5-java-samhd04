package gestion;

import java.util.ArrayList;

public class Zoologico {
	public String nombre;
	String ubicacion;
	ArrayList<Zona> zonas = new ArrayList<Zona>();
	 
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		
	}
	
	public Zoologico() {
		
	}
	
	public int cantidadTotalAnimales() {
		int contador = 0;
		
		for(int zona = 0; zona < zonas.size(); zona++) {
			contador = contador + zonas.get(zona).animales.size();
		}
		
		return contador;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}

}
