package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal{
	
//	CLASS VARIABLES
	private static Mamifero[] listado;
	public static int caballos;
	public static int leones;
	
//	INSTANCE VARIABLES
	private boolean pelaje;
	private int patas;

	
//	CONSTRUCTORS
	public Mamifero() {
		this("", 0, "", "", null, false, 0);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero, zona);
		this.pelaje = pelaje;
		this.patas = patas;
		
		// UPDATE listado[]
		Mamifero new_arr[] = new Mamifero[listado.length + 1];
		for (int i = 0; i < listado.length; i++) {
			new_arr[i] = listado[i];
		}
		new_arr[listado.length] = this;
		listado = new_arr;
	}
	
	
//	CLASS METHODS
	public static int cantidadMamiferos() {
		return listado.length;
	}
	
	
	public static Mamifero crearCaballo(String nombre,int edad, String genero) {
		caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, null, true, 4);		
	}
	
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre, edad, "selva", genero, null, true, 4);
	}
	
	// SETTERS
	public void setPelaje(boolean pelaje) { this.pelaje = pelaje; }
	public void setPatas(int patas) { this.patas = patas; }
	
	
	// GETTERS
	public boolean getPelaje() { return this.pelaje; }
	public int getPatas() { return this.patas; }
	
}
