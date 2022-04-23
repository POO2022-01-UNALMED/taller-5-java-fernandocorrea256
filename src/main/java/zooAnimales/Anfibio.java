package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal{
	
	// CLASS VARIABLES
	private static Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	
	// INSTANCE VARIABLES
	private String colorPiel;
	private boolean venenoso;

	
	// CONSTRUCTORS
	public Anfibio() {
		this("", 0, "", "", null, "", true);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	
		// UPDATE listado[]
		Anfibio new_listado[] = new Anfibio[listado.length + 1];
		for (int i = 0; i < listado.length; i++) {
			new_listado[i] = listado[i];
		}
		new_listado[listado.length] = this;
	}
	
	// CLASS METHODS
	public static int cantidadAnfibios() {
		return listado.length;
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		return new Anfibio(nombre, edad, "selva", genero, null, "rojo", true);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, null, "negro y amarillo", false);
	}
	
	// INSTANCE METHODS
	public String desplazarse() {
		return "saltar";
	}
}
