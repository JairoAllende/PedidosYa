package ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;

import ar.edu.unlam.pb1.dominio.*;
import ar.edu.unlam.pb1.dominio.enums.*;

public class MainPedidosYa {
	
	static Scanner teclado = new Scanner(System.in);
	static Carrito carrito = new Carrito(100);
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenido!\nEl saldo de tu cuenta es de: " + Usuario.getSaldoEnLaCuenta());
		
		MenuPrincipal opcionMenuPrincipal = null;
		do {
			System.out.println("\nIngrese una opcion");
			opcionMenuPrincipal = ManagerDeMenus.ingresarOpcionDelMenu();
			
			switch(opcionMenuPrincipal) {
			case SUPERMERCADO:
				manejarMenuTiposDeSupermercados();
				break;
			case KIOSCO:
				manejarMenuTiposDeKisocos();
				break;
			case CARNICERIA:
				manejarMenuTiposDeCarniceria();
				break;
			case VERDULERIA:
				manejarMenuTiposDeVerdulerias();
				break;
			case CARRITO:
				verCarrito();
				break;
			case SALIR:
				System.out.println("Hasta la Proxima");
				break;
			}
			
		}while(opcionMenuPrincipal != MenuPrincipal.SALIR);
		
	}
	
	private static void manejarMenuTiposDeSupermercados() {
		TiposDeSupermercados opcionTiposDeSupermercado;
		do {
			opcionTiposDeSupermercado = ManagerDeMenus.ingresarOpcionTiposDeSupermercados();
			switch(opcionTiposDeSupermercado) {
			case CARREFOUR:
			case CHANGOMAS:
			case COTO:
			case DIA:
			case DISCO:
				manejarMenuSupermercado();
				break;
			case VOLVER:
				return;
			}
		}while(!opcionTiposDeSupermercado.equals(TiposDeSupermercados.VOLVER));
	}
	
	private static void manejarMenuSupermercado() {
		MenuSupermercado opcionMenuSupermercado;
		do {
			opcionMenuSupermercado = ManagerDeMenus.ingresarOpcionDelMenuSupermercado();
			switch(opcionMenuSupermercado) {
			case COMIDA:
				manejarMenuComidas();
				break;
			case BEBIDAS:
				manejarMenuBebidas();
				break;
			case LIMPIEZA:
				manejarMenuLimpieza();
				break;
			case VARIOS:
				manejarMenuVarios();
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuSupermercado.equals(MenuSupermercado.VOLVER));
	}
	
	private static void manejarMenuComidas() {
		MenuComidas opcionMenuComidas;
		do {
			opcionMenuComidas = ManagerDeMenus.ingresarOpcionMenuComidas();
			switch(opcionMenuComidas) {
			case COMIDAS_LISTAS:
				agregarProductosAlCarrito(ManagerDeMenus.manejarComidasListas());
				break;
			case GALLETITAS_Y_PANADERIAS:
				agregarProductosAlCarrito(ManagerDeMenus.manejarGalletitasYPanaderias());
				break;
			case LACTEOS_Y_QUESOS:
				agregarProductosAlCarrito(ManagerDeMenus.manejarLacteosYQuesos()); 
				break;
			case PASTAS:
				agregarProductosAlCarrito(ManagerDeMenus.manejarPastas());
				break;
			case SNACKS:
				agregarProductosAlCarrito(ManagerDeMenus.manejarSnacks()); 
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuComidas.equals(MenuComidas.VOLVER));
	}
	
	private static void manejarMenuTiposDeKisocos() {
		TiposDeKioscos opcionTipoDeKioscos;
		do {
			opcionTipoDeKioscos = ManagerDeMenus.ingresarOpcionTiposDeKioscos();
			switch(opcionTipoDeKioscos) {
			case LA_FACU:
			case MAXIKIOSCO_ALICIA:
			case MAXIKIOSCO_FEDE:
			case PARADOR66:
			case PRETTOS_RAMOS:
				manejarMenuKiosco();
				break;
			case VOLVER:
				return;
			}
		}while(!opcionTipoDeKioscos.equals(TiposDeKioscos.VOLVER));
	}
	
	private static void manejarMenuKiosco() {
		MenuKiosco opcionMenuKiosco;
		do {
			opcionMenuKiosco = ManagerDeMenus.ingresarOpcionDelMenuKiosco();
			switch(opcionMenuKiosco) {
			case ALFAJORES:
				agregarProductosAlCarrito(ManagerDeMenus.manejarAlfajores());
				break;
			case CARAMELO_Y_CHICLES: 
				agregarProductosAlCarrito(ManagerDeMenus.manejarCarameloYChicles());
				break;
			case BARRITA_DE_CEREAL:
				agregarProductosAlCarrito(ManagerDeMenus.manejarBarritasDeCereal());
				break;
			case BEBIDAS:
				agregarProductosAlCarrito(ManagerDeMenus.manejarBebidas());
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuKiosco.equals(MenuKiosco.VOLVER));
	}
	
	public static void manejarMenuTiposDeCarniceria() {
		TiposDeCarnicerias opcionDeTiposDeCarniceria;
		do {
			opcionDeTiposDeCarniceria = ManagerDeMenus.ingresarOpcionTiposDeCarniceria();
			switch(opcionDeTiposDeCarniceria) {
			case CARNES_Y_PRODUCTOS_DE_CAMPO_55:
			case CARNICERIA_CARLITOS:
			case MANDALECARNE:
				manejarMenuCarniceria();
				break;
			case VOLVER:
				return;
			}
		}while(!opcionDeTiposDeCarniceria.equals(TiposDeCarnicerias.VOLVER));
	}
	
	private static void manejarMenuCarniceria() {
		MenuCarniceria opcionMenuCarniceria;
		do {
			opcionMenuCarniceria = ManagerDeMenus.ingresarOpcionDelMenuCarniceria();
			switch(opcionMenuCarniceria) {
			case VACUNA:
				agregarProductosAlCarrito(ManagerDeMenus.manejarVacuna()); 
				break;
			case CERDO:
				agregarProductosAlCarrito(ManagerDeMenus.manejarCerdo());
				break;
			case EMBUTIDOS:
				agregarProductosAlCarrito(ManagerDeMenus.manejarEmbutidos());
				break;
			case POLLO:
				agregarProductosAlCarrito(ManagerDeMenus.manejarPollo());
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuCarniceria.equals(MenuCarniceria.VOLVER));
	}
	
	private static void manejarMenuTiposDeVerdulerias() {
		TiposDeVerdulerias opcionDeTiposDeVerdulerias;
		do {
			opcionDeTiposDeVerdulerias = ManagerDeMenus.ingresarOpcionTiposDeVerdulerias();
			switch(opcionDeTiposDeVerdulerias) {
			case MANDALEFRUTA:
			case VERDULERIA_AMERICA:
			case VERDULERIA_MARQUITOS:
			case TITO:
				manejarMenuVerduleria();
				break;
			case VOLVER:
				return;
			}
		}while(!opcionDeTiposDeVerdulerias.equals(TiposDeVerdulerias.VOLVER));
	}
	
	private static void manejarMenuVerduleria() {
		MenuVerduleria opcionMenuVerduleria;
		do {
			opcionMenuVerduleria = ManagerDeMenus.ingresarOpcionDelMenuVerduleria();
			switch(opcionMenuVerduleria) {
			case FRUTAS:
				agregarProductosAlCarrito(ManagerDeMenus.manejarFrutas());
				break;
			case VERDURAS:
				agregarProductosAlCarrito(ManagerDeMenus.manejarVerduras());
				break;
			case HUEVOS:
				agregarProductosAlCarrito(ManagerDeMenus.manejarHuevos());
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuVerduleria.equals(MenuVerduleria.VOLVER));
	}
	
	private static void manejarMenuBebidas() {
		MenuBebidas opcionMenuBebidas;
		do {
			opcionMenuBebidas = ManagerDeMenus.ingresarOpcionDelMenuBebidas();
			switch(opcionMenuBebidas) {
			case AGUA:
				agregarProductosAlCarrito(ManagerDeMenus.manejarAgua());
				break;
			case AGUA_SABORIZADA:
				agregarProductosAlCarrito(ManagerDeMenus.manejarAguaSaborizada());
				break;
			case BEBIDAS_ALCOHOLICAS:
				agregarProductosAlCarrito(ManagerDeMenus.manejarBebidasAlcoholicas());
				break;
			case GASEOSAS:
				agregarProductosAlCarrito(ManagerDeMenus.manejarGaseosas());
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuBebidas.equals(MenuBebidas.VOLVER));
	}
	
	private static void manejarMenuLimpieza() {
		MenuLimpieza opcionMenuLimpieza;
		do {
			opcionMenuLimpieza = ManagerDeMenus.ingresarOpcionDelMenuLimpieza();
			switch(opcionMenuLimpieza) {
			case ESCOBA:
				agregarProductosAlCarrito(ManagerDeMenus.manejarEscoba());
				break;
			case MOPA:
				agregarProductosAlCarrito(ManagerDeMenus.manejarMopa());
				break;
			case LAVANDINA:
				agregarProductosAlCarrito(ManagerDeMenus.manejarLavandina());
				break;
			case SUAVIZANTE:
				agregarProductosAlCarrito(ManagerDeMenus.manejarSuavizante());
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuLimpieza.equals(MenuLimpieza.VOLVER));
	}
	
	private static void manejarMenuVarios() {
		MenuVarios opcionMenuVarios;
		do {
			opcionMenuVarios = ManagerDeMenus.ingresarOpcionDelMenuVarios();
			switch(opcionMenuVarios) {
			case BAZAR:
				agregarProductosAlCarrito(ManagerDeMenus.manejarBazar());
				break;
			case JUGUETERIA:
				agregarProductosAlCarrito(ManagerDeMenus.manejarJugueteria());
				break;
			case LIBREBIA:
				agregarProductosAlCarrito(ManagerDeMenus.manejarLibreria());
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuVarios.equals(MenuVarios.VOLVER));
	}
	
	public static void verCarrito() {
		int opcion;
		do {
			System.out.println("\nEl saldo de tu cuenta es de:" + Usuario.getSaldoEnLaCuenta());
			for (int i = 0; i < carrito.getCarrito().length; i++) {
				if (carrito.getCarrito()[i] != null) {
					System.out.println((i + 1) + ". " + carrito.getCarrito()[i]);
				}
			}
			System.out.println("\nEl saldo acumulado es de: " + carrito.getSaldo());
			System.out.println(
					"\nOPCIONES DEL CARRITO:\n0. Para volver\n1. Para mostrar un producto especifico segun el indice\n2. Para ordenar precios de mayor a menor\n3. Para ordenar precios de menor a mayor \n4. Mostrar por rango de precios\n5. Pagar");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 0:
				break;
			case 1:
				manejarProductosEnPosicion();
				break;
			case 2:
				System.out.println("carrito ordenado por precio de Mayor a Menor");
				carrito.ordenarPorPrecioMayorAMenor();
				break;
			case 3:
				System.out.println("carrito ordenado por precio de Menor a Mayor");
				carrito.ordenarPorPrecioMenorAMayor();
				break;
			case 4:
				mostrarProductosEnRangoDePrecios();
				break;
			case 5:
				manejarPagar();
				break;
			default:
				System.out.println("opcion incorrecta");
				break;
			}

		} while (opcion != 0);
	}
	
	private static void agregarProductosAlCarrito(Producto[] listaDeProductosDisponibles) {
		
        int opcion;
        int cantidad;

        do {
            System.out.println("\nProductos disponibles:");
            mostrarProductos(listaDeProductosDisponibles);
            
            System.out.println("\nIngrese el numero del indice para agregar el producto al carrito o 0 para volver:");
            opcion = teclado.nextInt();

            if (opcion-1 >= 0 && opcion-1 < listaDeProductosDisponibles.length && listaDeProductosDisponibles[opcion - 1] != null) {
                System.out.println("Ingrese la cantidad:");
                cantidad = teclado.nextInt();
                if(listaDeProductosDisponibles[opcion-1].getCantidad() >= cantidad && carrito.agregarAlCarrito(listaDeProductosDisponibles[opcion-1], cantidad)) {
                	System.out.println("\nSe ha agregado el producto al carrito");
                }else if(listaDeProductosDisponibles[opcion-1].getCantidad() < cantidad && !carrito.agregarAlCarrito(listaDeProductosDisponibles[opcion-1], cantidad)) {
                	System.out.println("\nNo hay suficiente cantidad en stock");
                }
                
            } else if (opcion-1 >=listaDeProductosDisponibles.length) {
                System.out.println("Opci�n inv�lida. Intente de nuevo.");
            }

        } while (opcion != 0);
    }
	
	
	
	private static void mostrarProductosEnRangoDePrecios() {
	    System.out.print("Ingrese el precio mínimo: ");
	    double precioMinimo = teclado.nextDouble();

	    System.out.print("Ingrese el precio máximo: ");
	    double precioMaximo = teclado.nextDouble();
	    teclado.nextLine();

	    Producto[] productosEnRango = carrito.obtenerProductosEnRangoDePrecios(precioMinimo, precioMaximo);

	    if (productosEnRango.length == 0) {
	        System.out.println("\nNo hay productos en ese rango de precio");
	    } else {
	        System.out.println("\nProductos en el rango de precios " + precioMinimo + " - " + precioMaximo + ":");
	        for (Producto producto : productosEnRango) {
	            if (producto != null) {
	                System.out.println(producto);
	            }
	        }
	    }

	    System.out.println("\nIngrese 0 para volver al menú principal");
	    int volverAlMenuPrincipal = teclado.nextInt();
	    teclado.nextLine(); 

        if (volverAlMenuPrincipal == 0) {
            verCarrito();
        }
    }
	
	private static void manejarProductosEnPosicion() {
	    System.out.print("\nIngrese la posición del producto que desea mostrar: ");
	    int posicion = teclado.nextInt();
	    teclado.nextLine();

	    Producto producto = carrito.obtenerProductoEnPosicion(posicion - 1);

	    if (producto != null) {
	        System.out.println("Producto en la posición " + (posicion) + ":");
	        System.out.println(producto + "\n");
	        mostrarOpcionesProducto(producto, posicion - 1);
	    } else {
	        System.out.println("No hay producto en la posición especificada.\n");
	    }
	}

	private static void mostrarOpcionesProducto(Producto producto, int posicion) {
	    System.out.println("Ingrese 1 si desea agregar elementos de este producto");
	    System.out.println("Ingrese 2 si desea eliminar elementos de este producto");
	    System.out.println("Ingrese 0 para volver a las opciones del carrito");

	    int opcion = teclado.nextInt();
	    teclado.nextLine();

	    switch (opcion) {
	        case 1:
	        	manejarSumarElementosAlCarrito();
	            break;
	        case 2:
	        	manejarSacarDelCarrito();
	            break;
	        case 0:
	            verCarrito();
	            break;
	        default:
	            System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
	            mostrarOpcionesProducto(producto, posicion);
	            break;
	    }
	}
	
	private static void manejarSacarDelCarrito() {
	    System.out.print("\nIngrese la posición del producto que desea sacar del carrito: ");
	    int posicion = teclado.nextInt();
	    teclado.nextLine(); 

	    Producto producto = carrito.obtenerProductoEnPosicion(posicion - 1);

	    if (producto != null) {
	        System.out.println("Producto en la posición " + (posicion) + ":");
	        System.out.println(producto + "\n");

	        System.out.println("¿Cuántos elementos de este producto desea eliminar del carrito?");
	        int cantidadAEliminar = teclado.nextInt();
	        teclado.nextLine();

	        carrito.sacarDelCarrito(producto, cantidadAEliminar);

	        System.out.println("Se eliminaron " + cantidadAEliminar + " elementos de " + producto.getNombre() + "\n");
	        System.out.println("El saldo acumulado es de: " + carrito.getSaldo() + "\n");
	    } else {
	        System.out.println("No hay producto en la posición especificada en el carrito.\n");
	    }
	}
	
	private static void manejarSumarElementosAlCarrito() {

	    System.out.print("Ingrese la posición del producto que desea modificar: ");
	    int posicion = teclado.nextInt();
	    posicion = posicion - 1;

	    if (posicion >= 0 && posicion < carrito.getCarrito().length && carrito.getCarrito()[posicion] != null) {
	        Producto productoEnCarrito = carrito.getCarrito()[posicion];

	        System.out.print("¿Cuántos elementos de " + productoEnCarrito.getNombre() + " desea agregar al carrito? ");
	        int cantidadAAgregar = teclado.nextInt();

	        carrito.sumarElementosAlCarrito(productoEnCarrito, cantidadAAgregar);

	        System.out.println("Se agregaron " + cantidadAAgregar + " elementos de " + productoEnCarrito.getNombre() + "\n");
	        System.out.println("El saldo acumulado es de: " + carrito.getSaldo() + "\n");
	    } else {
	        System.out.println("No hay producto en la posición especificada.\n");
	    }
	}
		
	private static void manejarPagar() {
	    carrito.pagar();
	    if (Usuario.getSaldoEnLaCuenta() >= carrito.getSaldo()) {
	        System.out.println("EL PEDIDO SE REALIZÓ CON ÉXITO!");
	    } else {
	        System.out.println("No cuenta con saldo suficiente en la cuenta");
	    }
	}
	
	
	private static void mostrarProductos(Producto[] productos) {
		 for (int i = 0; i < productos.length; i++) {
             if (productos[i] != null) {
                 System.out.println((i + 1) + ". " + productos[i].toString());
             }
         }
	}
}

 	
	

