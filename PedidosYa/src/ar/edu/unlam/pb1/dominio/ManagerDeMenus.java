package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

import ar.edu.unlam.pb1.dominio.enums.*;

public class ManagerDeMenus {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void manejarMenuPrincipal() {
		MenuPrincipal opcion;
		do {
			mostrarMenuPrincipal();
			opcion = ingresarOpcionDelMenu();
			switch(opcion) {
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
			case SALIR:
				System.out.println("nos vemos");
				break;
			}
		}while(!opcion.equals(MenuPrincipal.SALIR));
	}
	
	private static void mostrarMenuPrincipal() {
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < MenuPrincipal.values().length; i++) {
			System.out.println((i+1) + ". " + MenuPrincipal.values()[i]);
		}
	}
	
	private static MenuPrincipal ingresarOpcionDelMenu() {
		return MenuPrincipal.values()[teclado.nextInt() - 1];
	}
	
	private static void manejarMenuTiposDeSupermercados() {
		TiposDeSupermercados opcionTiposDeSupermercado;
		do {
			mostrarMenuTiposDeSupermercados();
			opcionTiposDeSupermercado = ingresarOpcionTiposDeSupermercados();
			switch(opcionTiposDeSupermercado) {
			case CARREFOUR:
			case COTO:
			case CHANGOMAS:
			case DISCO:
			case DIA:
			case DIARCO:
				manejarMenuSupermercado();
				break;
			case VOLVER:
				return;
			}
		}while(!opcionTiposDeSupermercado.equals(TiposDeSupermercados.VOLVER));
	}
	
	private static void mostrarMenuTiposDeSupermercados() {
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < TiposDeSupermercados.values().length; i++) {
			System.out.println((i+1) + ". " + TiposDeSupermercados.values()[i]);
		}
	}
	
	private static TiposDeSupermercados ingresarOpcionTiposDeSupermercados() {
		return TiposDeSupermercados.values()[teclado.nextInt() - 1]; 
	}
	
	private static void manejarMenuSupermercado() {
		MenuSupermercado opcionMenuSupermercado;
		do {
			mostrarMenuSupermercado();
			opcionMenuSupermercado = ingresarOpcionDelMenuSupermercado();
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
			case PROMOCIONES:
				System.out.println("Promociones");
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuSupermercado.equals(MenuSupermercado.VOLVER));
	}
	
	private static void mostrarMenuSupermercado() {
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < MenuSupermercado.values().length; i++) {
			System.out.println((i+1) + ". " + MenuSupermercado.values()[i]);
		}
	}
	
	private static MenuSupermercado ingresarOpcionDelMenuSupermercado() {
		return MenuSupermercado.values()[teclado.nextInt() - 1];
	}
	
	private static void manejarMenuComidas() {
		MenuComidas opcionMenuComidas;
		do {
			mostarMenuComidas();
			opcionMenuComidas = ingresarOpcionMenuComidas();
			switch(opcionMenuComidas) {
			case COMIDAS_LISTAS:
			case GALLETITAS_Y_PANADERIAS:
			case LACTEOS_Y_QUESOS:
			case PASTAS:
			case SNACKS:
				System.out.println("Tipos de comidas");
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuComidas.equals(MenuComidas.VOLVER));
	}
	
	private static void mostarMenuComidas() {
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < MenuComidas.values().length ; i++) {
			System.out.println((i+1) + ". " + MenuComidas.values()[i]);
		}
	}
	
	private static MenuComidas ingresarOpcionMenuComidas() {
		return MenuComidas.values()[teclado.nextInt() - 1];
	}
	
	private static void manejarMenuBebidas() {
		MenuBebidas opcionMenuBebidas;
		do {
			mostrarMenuBebidas();
			opcionMenuBebidas = ingresarOpcionDelMenuBebidas();
			switch(opcionMenuBebidas) {
			case AGUA:
			case AGUA_SABORIZADA:
			case BEBIDAS_ALCOHOLICAS:
			case GASEOSAS:
				System.out.println("bebidas");
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuBebidas.equals(MenuBebidas.VOLVER));
	}
	
	private static void mostrarMenuBebidas() {
		System.out.println("\nIngrese una opcion...");
		for (int i = 0; i < MenuBebidas.values().length; i++) {
			System.out.println((i+1) + ". " + MenuBebidas.values()[i]);
		}
	}
	
	private static MenuBebidas ingresarOpcionDelMenuBebidas(){
		return MenuBebidas.values()[teclado.nextInt() - 1];
	}
	
	private static void manejarMenuLimpieza() {
		MenuLimpieza opcionMenuLimpieza;
		do {
			mostrarMenuLimpieza();
			opcionMenuLimpieza = ingresarOpcionDelMenuLimpieza();
			switch(opcionMenuLimpieza) {
			case ESCOBA:
			case MOPA:
			case LAVANDINA:
			case SUAVIZANTE:
				System.out.println("Limpieza");
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuLimpieza.equals(MenuLimpieza.VOLVER));
	}
	
	private static void mostrarMenuLimpieza() {
		System.out.println("\nIngrese una opcion...");
		for (int i = 0; i < MenuLimpieza.values().length; i++) {
			System.out.println((i+1) + ". " + MenuLimpieza.values()[i]);
		}
	}
	
	private static MenuLimpieza ingresarOpcionDelMenuLimpieza(){
		return MenuLimpieza.values()[teclado.nextInt() - 1];
	}
	
	private static void manejarMenuVarios() {
		MenuVarios opcionMenuVarios;
		do {
			mostrarMenuVarios();
			opcionMenuVarios = ingresarOpcionDelMenuVarios();
			switch(opcionMenuVarios) {
			case BAZAR:
			case JUGUETERIA:
			case LIBREBIA:
				System.out.println("Varios");
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuVarios.equals(MenuVarios.VOLVER));
	}
	
	private static void mostrarMenuVarios() {
		System.out.println("\nIngrese una opcion...");
		for (int i = 0; i < MenuVarios.values().length; i++) {
			System.out.println((i+1) + ". " + MenuVarios.values()[i]);
		}
	}
	
	private static MenuVarios ingresarOpcionDelMenuVarios(){
		return MenuVarios.values()[teclado.nextInt() - 1];
	}
	
	private static void manejarMenuTiposDeKisocos() {
		TiposDeKioscos opcionTipoDeKioscos;
		do {
			mostrarMenuTiposDeKioscos();
			opcionTipoDeKioscos = ingresarOpcionTiposDeKioscos();
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
	
	private static void mostrarMenuTiposDeKioscos() {
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < TiposDeKioscos.values().length; i++) {
			System.out.println((i+1) +  ". " + TiposDeKioscos.values()[i]);
		}
	}

	private static TiposDeKioscos ingresarOpcionTiposDeKioscos() {
		return TiposDeKioscos.values()[teclado.nextInt() - 1];
	}
	
	private static void manejarMenuKiosco() {
		MenuKiosco opcionMenuKiosco;
		do {
			mostrarMenuKiosco();
			opcionMenuKiosco = ingresarOpcionDelMenuKiosco();
			switch(opcionMenuKiosco) {
			case ALFAJORES: 
			case CARAMELO_Y_CHICLES: 
			case BARRITA_DE_CEREAL: 
			case BEBIDAS:
			case PROMOCIONES:
				System.out.println("COMIDASKIOSCO");
			case VOLVER:
				return;
			}
		}while(!opcionMenuKiosco.equals(MenuKiosco.VOLVER));
	}
	
	private static void mostrarMenuKiosco() {
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < MenuKiosco.values().length; i++) {
			System.out.println((i+1) + ". " + MenuKiosco.values()[i]);
		}
	}
	
	private static MenuKiosco ingresarOpcionDelMenuKiosco() {
		return MenuKiosco.values()[teclado.nextInt() - 1];
	}
	
	private static void manejarMenuTiposDeCarniceria() {
		TiposDeCarnicerias opcionDeTiposDeCarniceria;
		do {
			mostrarMenuTiposDeCarniceria();
			opcionDeTiposDeCarniceria = ingresarOpcionTiposDeCarniceria();
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
	
	private static void mostrarMenuTiposDeCarniceria() {
		System.out.println("Ingrese una opcion...");
		for(int i = 0; i < TiposDeCarnicerias.values().length ; i++) {
			System.out.println((i+1) + ". " + TiposDeCarnicerias.values()[i]);
		}
	}
	
	private static TiposDeCarnicerias ingresarOpcionTiposDeCarniceria() {
		return TiposDeCarnicerias.values()[teclado.nextInt() - 1];
	}
	
	private static void manejarMenuCarniceria() {
		MenuCarniceria opcionMenuCarniceria;
		do {
			mostrarMenuCarniceria();
			opcionMenuCarniceria = ingresarOpcionDelMenuCarniceria();
			switch(opcionMenuCarniceria) {
			case ASADO:
				break;
			case CHURRASCO:
				break;
			case CHORIZO:
				break;
			case POLLO:
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuCarniceria.equals(MenuCarniceria.VOLVER));
	}
	
	private static void mostrarMenuCarniceria() {
		System.out.println("Ingrese una opcion...");
		for(int i = 0; i < MenuCarniceria.values().length; i++) {
			System.out.println((i+1) + ". " + MenuCarniceria.values()[i]);
		}
	}
	
	private static MenuCarniceria ingresarOpcionDelMenuCarniceria() {
		return MenuCarniceria.values()[teclado.nextInt() - 1];
	}
	
	private static void manejarMenuTiposDeVerdulerias() {
		TiposDeVerdulerias opcionDeTiposDeVerdulerias;
		do {
			mostrarMenuTiposDeVerdulerias();
			opcionDeTiposDeVerdulerias = ingresarOpcionTiposDeVerdulerias();
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
	
	private static void mostrarMenuTiposDeVerdulerias() {
		System.out.println("Ingrese una opcion...");
		for(int i = 0; i < TiposDeVerdulerias.values().length ; i++) {
			System.out.println((i+1) + ". " + TiposDeVerdulerias.values()[i]);
		}
	}
	
	private static TiposDeVerdulerias ingresarOpcionTiposDeVerdulerias() {
		return TiposDeVerdulerias.values()[teclado.nextInt() - 1];
	}
	
	private static void manejarMenuVerduleria() {
		MenuVerduleria opcionMenuVerduleria;
		do {
			mostrarMenuVerduleria();
			opcionMenuVerduleria = ingresarOpcionDelMenuVerduleria();
			switch(opcionMenuVerduleria) {
			case PAPA:
			case LECHUGA:
			case TOMATE:
			case ZANAHORIA:
				System.out.println("ok");
				break;
			case VOLVER:
				return;
			}
		}while(!opcionMenuVerduleria.equals(MenuVerduleria.VOLVER));
	}
	
	private static void mostrarMenuVerduleria() {
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < MenuVerduleria.values().length ; i++) {
			System.out.println((i+1) +  ". " + MenuVerduleria.values()[i]);
		}
	}
	
	private static MenuVerduleria ingresarOpcionDelMenuVerduleria() {
		return MenuVerduleria.values()[teclado.nextInt() - 1];
	}
}
