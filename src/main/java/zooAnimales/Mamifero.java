package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Mamifero extends Animal{
	
//	CLASS VARIABLES
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	
//	INSTANCE VARIABLES
	private boolean pelaje;
	private int patas;

	
//	CONSTRUCTORS
	public Mamifero() {
		this("", 0, "", "", null, false, 0);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this(nombre, edad, habitat, genero, null, pelaje, patas);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero, zona);
		this.pelaje = pelaje;
		this.patas = patas;
		
		listado.add(this);
	}
	
	
//	CLASS METHODS
	public static int cantidadMamiferos() {
		return listado.size();
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
	public boolean isPelaje() { return this.pelaje; }
	public int getPatas() { return this.patas; }
	
}
