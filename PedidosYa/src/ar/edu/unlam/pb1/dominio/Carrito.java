package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

public class Carrito {
	private static Scanner teclado = new Scanner(System.in);

	private Producto[] carrito = new Producto[1000];
	private double saldo;

	public Carrito(int espacioCarrito) {
		this.carrito = new Producto[espacioCarrito];
		this.saldo = 0;
	}

	public void agregarAlCarrito(Producto productoAgregado, int cantidadElejida) {
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
	}

	private void saldoAcumulado(Producto productoAgregado, boolean agregar) {
		double precioDelProducto = productoAgregado.getPrecio();
		int cantidad = productoAgregado.getCantidad();
		double subtotal = precioDelProducto * cantidad;
		if (agregar == true) {
			this.saldo += subtotal;
		} else {
			this.saldo -= subtotal;
		}
	}

	public void sacarDelCarrito(Producto productoEnCarrito, int opcion) {
		
		System.out.println("Cuántos elementos de este producto desea eliminar del carrito?");
		int cantidadAEliminar = teclado.nextInt();

		if (productoEnCarrito.getCantidad() >= cantidadAEliminar) {
			Producto productoAEliminar = new Producto(productoEnCarrito.getNombre(), productoEnCarrito.getPrecio());
			productoAEliminar.setCantidad(cantidadAEliminar);
			saldoAcumulado(productoAEliminar, false);

			productoEnCarrito.setCantidad(productoEnCarrito.getCantidad() - cantidadAEliminar);
			if (productoEnCarrito.getCantidad() == 0) {
				carrito[opcion] = null;
			}

			System.out.println(
					"Se eliminaron " + cantidadAEliminar + " elementos de " + productoEnCarrito.getNombre() + "\n");
			System.out.println("El saldo acumulado es de: " + getSaldo() + "\n");
		} else {
			System.out.println("Tiene menos cantidad de elementos de la que desea eliminar.");
		}
	}
	
	public void agregarElementoAlCarrito(Producto productoEnCarrito, int opcion) {
		
		System.out.println("Cuántos elementos de este producto desea agregar al carrito?");
		int cantidadAAgregar = teclado.nextInt();
		productoEnCarrito.setCantidad(productoEnCarrito.getCantidad() + cantidadAAgregar);
		
		double precioDelProducto = productoEnCarrito.getPrecio();
		this.saldo += precioDelProducto * cantidadAAgregar;
		
		System.out.println("Se agregaron " + cantidadAAgregar + " elementos de " + productoEnCarrito.getNombre() + "\n");
		
		System.out.println("El saldo acumulado es de: " + getSaldo() + "\n");
	}

	public void verCarrito() {
		int opcion;
		do {
			System.out.println("\nEl saldo de tu cuenta es de:" + Usuario.getSaldoEnLaCuenta());
			for (int i = 0; i < carrito.length; i++) {
				if (carrito[i] != null) {
					System.out.println((i + 1) + ". " + carrito[i]);
				}
			}
			System.out.println("\nEl saldo acumulado es de: " + getSaldo());
			System.out.println(
					"\nOPCIONES DEL CARRITO:\n0. Para volver\n1. Para mostrar un producto especifico segun el indice\n2. Para ordenar precios de mayor a menor\n3. Para ordenar precios de menor a mayor \n4. Mostrar por rango de precios\n5. Pagar");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 0:
				break;
			case 1:
				mostrarProductoEnPosicion();
				break;
			case 2:
				ordenarPorPrecioMayorAMenor();
				break;
			case 3:
				ordenarPorPrecioMenorAMayor();
				break;
			case 4:
				mostrarProductosEnRangoDePrecios();
				break;
			case 5:
				pagar();
				break;
			default:
				System.out.println("opcion incorrecta");
				break;
			}

		} while (opcion != 0);
	}

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

	public void mostrarProductosEnRangoDePrecios() {

		System.out.print("Ingrese el precio mínimo: ");
		double precioMinimo = teclado.nextDouble();

		System.out.print("Ingrese el precio máximo: ");
		double precioMaximo = teclado.nextDouble();

		boolean hayProductosEnRango = false;

		System.out.println("\nProductos en el rango de precios " + precioMinimo + " - " + precioMaximo + ":");
		for (int i = 0; i < carrito.length; i++) {
			if (carrito[i] != null) {
				double precio = carrito[i].getPrecio();
				if (precio >= precioMinimo && precio <= precioMaximo) {
					System.out.println(carrito[i]);
					hayProductosEnRango = true;
				}
			}
		}

		if (!hayProductosEnRango) {
			System.out.println("No hay productos en ese rango de precio");
		}

		System.out.println("\nIngrese 0 para volver a las opciones del carrito");
		int volverAOpcionesDelCarrito = teclado.nextInt();
		if (volverAOpcionesDelCarrito == 0) {
			verCarrito();
		}
	}

	public void mostrarProductoEnPosicion() {

		System.out.print("\nIngrese la posición del producto que desea mostrar: ");
		int posicion = teclado.nextInt();
		posicion = posicion - 1;

		if (posicion >= 0 && posicion < carrito.length && carrito[posicion] != null) {
			System.out.println("Producto en la posición " + (posicion + 1) + ":");
			System.out.println(carrito[posicion] + "\n");
			
			Producto productoEnCarrito = carrito[posicion];
			System.out.println("Ingrese 1 si desea agregar elementos de este producto\nIngrese 2 si desea eliminar elementos de este producto\nIngrese 0 para volver a las opciones del carrito");
			int opcion = teclado.nextInt();
			if(opcion == 1) {
				agregarElementoAlCarrito(productoEnCarrito, posicion);
			}else if(opcion == 2) {
				sacarDelCarrito(productoEnCarrito, posicion);
			}else if(opcion == 0) {
				verCarrito();
			}

		} else {
			System.out.println("No hay producto en la posición especificada.\n");
		}
	}
	
	public void pagar() {
		if(Usuario.getSaldoEnLaCuenta() >= this.saldo) {
			Usuario.setSaldoEnLaCuenta(Usuario.getSaldoEnLaCuenta() - (float)this.saldo);
			System.out.println("EL PEDIDO SE REALIZO CON EXITO!");
			for (int i = 0; i < carrito.length; i++) {
				carrito[i] = null;
			}
			this.saldo = 0;
		}else if(Usuario.getSaldoEnLaCuenta() < this.saldo) {
			System.out.println("No cuenta con saldo suficiente en la cuenta");
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

}
