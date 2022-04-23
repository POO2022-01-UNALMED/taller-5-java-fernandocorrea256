package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{
	
	// CLASS VARIABLES
	private static Ave[] listado;
	public static int halcones;
	public static int aguilas;
	
	// INSTANCE VARIABLES
	private String colorPlumas;

	// CONSTRUCTOS
	public Ave() {
		this("", 0, "", "", null, "");
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPlumas = colorPlumas;
		
		// UPDATE listado
		Ave new_listado[] = new Ave[listado.length + 1];
		for (int i = 0; i < listado.length; i++) {
			new_listado[i] = listado[i];
		}
		new_listado[listado.length] = this;
		listado = new_listado;
	}

	// CLASS METHODS
	public static int cantidadAves() {
		return listado.length;
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
	public String desplazarse() {
		return "volar";
	}
}
