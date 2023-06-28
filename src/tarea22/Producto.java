package tarea22;

public class Producto {
	
	private String nombre;
	private double Precio;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		Precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	
	
}
