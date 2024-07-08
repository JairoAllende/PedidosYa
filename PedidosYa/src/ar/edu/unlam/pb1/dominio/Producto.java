package ar.edu.unlam.pb1.dominio;

public class Producto {
	
	private String nombre;
	private double precio;
	private int cantidad;
	
	
	public Producto (String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = (int) (Math.random() * 10 )+ 1;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}


	


	


	
	
	

	
		
}
