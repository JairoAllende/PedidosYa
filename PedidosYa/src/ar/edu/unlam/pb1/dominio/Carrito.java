package ar.edu.unlam.pb1.dominio;

import java.util.Arrays;

import ar.edu.unlam.pb1.interfaz.MainPedidosYa;

public class Carrito {
	MainPedidosYa main = null;

	private Producto[] carrito = new Producto[1000];
	private double saldo;

	public Carrito(int espacioCarrito) {
		this.carrito = new Producto[espacioCarrito];
		this.saldo = 0;
	}

	// listo
	public boolean agregarAlCarrito(Producto productoAgregado, int cantidadElejida) {
		boolean agregado = false;
		
		for (int i = 0; i < carrito.length; i++) {
			if (carrito[i] == null && agregado == false) {
				if (productoAgregado.getCantidad() >= cantidadElejida) {
					productoAgregado.setCantidad(productoAgregado.getCantidad() - cantidadElejida);
					Producto productoAgregadoAlCarrito = new Producto(productoAgregado.getNombre(),
							productoAgregado.getPrecio());
					productoAgregadoAlCarrito.setCantidad(cantidadElejida);
					carrito[i] = productoAgregadoAlCarrito;
					agregado = true;
					saldoAcumulado(productoAgregadoAlCarrito, true);
				}
			}
		}
		
		return agregado;
	}

	// listo
	public void saldoAcumulado(Producto productoAgregado, boolean agregar) {
		
		double precioDelProducto = productoAgregado.getPrecio();
		int cantidad = productoAgregado.getCantidad();
		double subtotal = precioDelProducto * cantidad;
		if (agregar == true) {
			this.saldo += subtotal;
		} else {
			this.saldo -= subtotal;
		}
	}
	
	// listo
	public void sacarDelCarrito(Producto productoEnCarrito, int cantidadAEliminar) {
	    if (productoEnCarrito.getCantidad() >= cantidadAEliminar) {
	        saldoAcumulado(productoEnCarrito, false);
	        productoEnCarrito.setCantidad(productoEnCarrito.getCantidad() - cantidadAEliminar);

	        if (productoEnCarrito.getCantidad() == 0) {
	            eliminarProductoDelCarrito(productoEnCarrito);
	        }
	    }
	}

	// listo
	private void eliminarProductoDelCarrito(Producto producto) {
	   
	    for (int i = 0; i < carrito.length; i++) {
	        if (carrito[i] == producto) {
	            carrito[i] = null;
	            break;
	        }
	    }
	}

	
	// listo
	public void sumarElementosAlCarrito(Producto productoEnCarrito, int cantidadAAgregar) {
	    productoEnCarrito.setCantidad(productoEnCarrito.getCantidad() + cantidadAAgregar);
	    double precioDelProducto = productoEnCarrito.getPrecio();
	    this.saldo += precioDelProducto * cantidadAAgregar;
	}


	// listo
	public void ordenarPorPrecioMayorAMenor() {
		for (int i = 0; i < carrito.length - 1; i++) {
			for (int j = 0; j < carrito.length - 1 - i; j++) {
				if (carrito[j] != null && carrito[j + 1] != null
						&& carrito[j].getPrecio() < carrito[j + 1].getPrecio()) {
					Producto temp = carrito[j];
					carrito[j] = carrito[j + 1];
					carrito[j + 1] = temp;
				}
			}
		}
	}

	// listo
	public void ordenarPorPrecioMenorAMayor() {
		for (int i = 0; i < carrito.length - 1; i++) {
			for (int j = 0; j < carrito.length - 1 - i; j++) {
				if (carrito[j] != null && carrito[j + 1] != null
						&& carrito[j].getPrecio() > carrito[j + 1].getPrecio()) {
					Producto temp = carrito[j];
					carrito[j] = carrito[j + 1];
					carrito[j + 1] = temp;
				}
			}
		}
	} 

	// listo
	public Producto[] obtenerProductosEnRangoDePrecios(double precioMinimo, double precioMaximo) {
	    Producto[] productos = new Producto[carrito.length];
	    int contador = 0;

	    for (int i = 0; i < carrito.length; i++) {
	        Producto producto = carrito[i];
	        if (producto != null) {
	            double precio = producto.getPrecio();
	            if (precio >= precioMinimo && precio <= precioMaximo) {
	            	productos[contador] = producto;
	            	contador++;
	            }
	        }
	    }	    
	    Producto[] productosEnRangoExacto = Arrays.copyOf(productos, contador);
	    return productosEnRangoExacto;
	}
	
	// listo
	public Producto obtenerProductoEnPosicion(int posicion) {
		    if (posicion >= 0 && posicion < carrito.length && carrito[posicion] != null) {
		        return carrito[posicion];
		    } else {
		        return null;
		    }
		}
	
	// listo
	public void pagar() {
	    if (Usuario.getSaldoEnLaCuenta() >= this.saldo) {
	        Usuario.setSaldoEnLaCuenta(Usuario.getSaldoEnLaCuenta() - (float)this.saldo);
	        for (int i = 0; i < carrito.length; i++) {
	            carrito[i] = null;
	        }
	        this.saldo = 0;
	    } else {
	    }
	}
	

	public double getSaldo() {
		return this.saldo;
	}
	
	public Producto[] getCarrito() {
		return this.carrito;
	}

}
