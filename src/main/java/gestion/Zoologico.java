package gestion;

import java.util.ArrayList;

public class Zoologico {

	//	Instance variables
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();

	//	Constructors
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}

		
	// INSTANCE METHODS
	public int cantidadTotalAnimales() {
		int total = 0;
		for (Zona zona : this.zonas) {
			total += zona.cantidadAnimales();
		}
		return total;
	}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
	// SETTERS
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
	public void setZonas(ArrayList<Zona> zonas) { this.zonas = zonas; }
	
	// GETTERS
	public String getNombre() { return this.nombre; }
	public String getUbicacion() { return this.ubicacion; }
	public ArrayList<Zona> getZona() { return this.zonas; }
	
}
