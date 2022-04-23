package gestion;

public class Zoologico {

	//	Instance variables
	private String nombre;
	private String ubicacion;
	private Zona[] zonas;

	

	//	Constructors
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion, Zona[] zonas) {
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
		Zona new_arr[] = new Zona[this.zonas.length+1];
		for (int i = 0; i < this.zonas.length; i++) {
			new_arr[i] = this.zonas[i];
		}
		new_arr[this.zonas.length] = zona;
		this.zonas = new_arr;
	}
	
}
