package ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.enums.*;

public class MainPedidosYas {
	
	static Scanner teclado = new Scanner(System.in);
	static MenuPrincipal opcion;
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenido!");
		manejarMenuPrincipal();
	}
	
	private static void manejarMenuPrincipal() {
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
				System.out.println("Nos vemos!");
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
				manejarMenuPrincipal();
				break;
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
				System.out.println("Comida!");
				break;
			case BEBIDAS:
				System.out.println("Bebidas");
				break;
			case LIMPIEZA:
				System.out.println("Limpieza");
				break;
			case VARIOS:
				System.out.println("Varios");
				break;
			case VOLVER:
				mostrarMenuTiposDeSupermercados();
				break;
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
				mostrarMenuPrincipal();
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
			case CARAMELO:
				break;
			case ALFAJOR:
				break;
			case CHICLE:
				break;
			case BARRITA_DE_CEREAL:
				break;
			case VOLVER:
				mostrarMenuTiposDeKioscos();
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
				manejarMenuPrincipal();
				break;
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
				manejarMenuTiposDeCarniceria();
				break;
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
	
	private static void manejarMenuTiposDeVerdulerias() { ///////////
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
				manejarMenuPrincipal();
				break;
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
				break;
			case LECHUGA:
				break;
			case TOMATE:
				break;
			case ZANAHORIA:
				break;
			case VOLVER:
				mostrarMenuTiposDeVerdulerias();
				break;
			}
		}while(!opcionMenuVerduleria.equals(MenuVerduleria.VOLVER));
	}
	
	private static void mostrarMenuVerduleria() {
		System.out.println("Ingrese una opcion...");
		for(int i = 0; i < MenuVerduleria.values().length ; i++) {
			System.out.println((i+1) +  ". " + MenuVerduleria.values()[i]);
		}
	}
	
	private static MenuVerduleria ingresarOpcionDelMenuVerduleria() {
		return MenuVerduleria.values()[teclado.nextInt() - 1];
	}
}
