package zooAnimales;

public class Pez extends Animal{

	// CLASS VARIABLES
	private static Pez[] listado;
	public static int salmones;
	public static int bacalaos;
	
	// INSTANCE VARIABLES
	private String colorEscamas;
	private int cantidadAletas;


	// CONSTRUCTORS
	public Pez() { this("", 0, "Agua", "F", null, "", 2); }
	
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		
		// UPDATE listado[]
		Pez new_listado[] = new Pez[listado.length + 1];
		for (int i = 0; i < listado.length; i++) {
			new_listado = listado[i];
		}
		new_listado[listado.length] = this;
		listado = new_listado;
	}
	
	// CLASS METHODS
	public static int cantidadPeces() {
		return listado.length;
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre, edad, "oceano", genero, null, "rojo", 6);
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, null, "gris", 6);
	}
	
	// INSTANCE METHODS
	public String desplazarse() {
		return "nadar";
	}
}
