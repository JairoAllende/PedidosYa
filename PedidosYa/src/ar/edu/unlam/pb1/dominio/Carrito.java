package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

public class Carrito {
	private static Scanner teclado = new Scanner(System.in);
	
	private Producto[] carrito;
	private double saldo;
	
	public Carrito(int espacioCarrito) {
		this.carrito = new Producto[espacioCarrito];
		this.saldo = 0;
	}

	public void agregarAlCarrito(Producto productoAgregado, int cantidadElejida) {
		boolean agregado = false;
		for (int i = 0; i < carrito.length; i++) {
			if(carrito[i] == null && agregado == false) {
				if(productoAgregado.getCantidad() >= cantidadElejida) {
					productoAgregado.setCantidad(productoAgregado.getCantidad() - cantidadElejida);
					Producto productoAgregadoAlCarrito = new Producto(productoAgregado.getNombre(), productoAgregado.getPrecio());
					productoAgregadoAlCarrito.setCantidad(cantidadElejida);
					carrito[i] = productoAgregadoAlCarrito;
					agregado = true;
					saldoAcumulado(productoAgregadoAlCarrito);
				}
			}
		}
	}
	
	private void saldoAcumulado(Producto productoAgregado) {
		double precioDelProducto = productoAgregado.getPrecio();
		int cantidad = productoAgregado.getCantidad();
		double subtotal = precioDelProducto * cantidad;
		this.saldo += subtotal;
	}
	
	public void verCarrito() {
		int opcion;
		do {
			for (int i = 0; i < carrito.length; i++) {
				if(carrito[i] != null) {
					System.out.println((i+1) +  ". " + carrito[i]);
				}
			}
			System.out.println("\nIngrese 0 para volver o 1 para elimiar elementos del carrito");
			opcion = teclado.nextInt();
			if(opcion == 1) {
				sacarDelCarrito();
			}
			
		}while(opcion != 0);
	}
	
	public void sacarDelCarrito() { 
		int opcion;
		System.out.println("Ingrese el indice del producto que desea sacar");
		opcion = teclado.nextInt();
		if(carrito[opcion - 1] != null) {
			System.out.println("Cuantos elementos de este producto desea eliminar del carrito?");
			opcion = teclado.nextInt();
			if(carrito[opcion - 1].getCantidad() > opcion) {
				carrito[opcion - 1].setCantidad(carrito[opcion - 1].getCantidad() - opcion); // ingreso la opcion como indice 
				System.out.println("Se eliminaron " + opcion + " elementos");
			}else if(carrito[opcion - 1].getCantidad() == opcion) {
				
				System.out.println("Se eliminaron todos los elementos de tipo " + carrito[opcion - 1].getNombre());
				carrito[opcion - 1] = null;
			}else {
				System.out.println("Tiene menos cantdad de elementos de la que desea eliminar");
			}
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public Producto[] getCarrito() {
		return this.carrito;
	}	
	
}
