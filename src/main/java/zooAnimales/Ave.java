package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Ave extends Animal{
	
	// CLASS VARIABLES
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	
	// INSTANCE VARIABLES
	private String colorPlumas;

	// CONSTRUCTOS
	public Ave() {
		this("", 0, "", "", null, "");
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this(nombre, edad, habitat, genero, null, colorPlumas);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPlumas = colorPlumas;
		
		listado.add(this);
	}

	// CLASS METHODS
	public static int cantidadAves() {
		return listado.size();
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		return new Ave(nombre, edad, "montanas", genero, null, "cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		return new Ave(nombre, edad, "montanas", genero, null, "blanco y amarillo");
	}
	
	// INSTANCE METHODS
	public String movimiento() {
		return "volar";
	}
	
	// SETTERS
	public void setColorPlumas(String color) { this.colorPlumas = color; }
	
	// GETTERS
	public String getColorPlumas() { return this.colorPlumas; }
}
