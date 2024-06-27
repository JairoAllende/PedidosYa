package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

import ar.edu.unlam.pb1.dominio.enums.*;

public class ManagerDeMenus {
	
	static Scanner teclado = new Scanner(System.in);
	static Carrito carrito = new Carrito(100);
	
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
			case CARRITO:
				carrito.verCarrito();
				break;
			case SALIR:
				System.out.println("Hasta la Proxima");
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
				manejarComidasListas();
				break;
			case GALLETITAS_Y_PANADERIAS:
				manejarGalletitasYPanaderias();
				break;
			case LACTEOS_Y_QUESOS:
				manejarLacteosYQuesos();
				break;
			case PASTAS:
				manejarPastas();
				break;
			case SNACKS:
				manejarSnacks();
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
				manejarAgua();
				break;
			case AGUA_SABORIZADA:
				manejarAguaSaborizada();
				break;
			case BEBIDAS_ALCOHOLICAS:
				manejarBebidasAlcoholicas();
				break;
			case GASEOSAS:
				manejarGaseosas();
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
				manejarEscoba();
				break;
			case MOPA:
				manejarMopa();
				break;
			case LAVANDINA:
				manejarLavandina();
				break;
			case SUAVIZANTE:
				manejarSuavizante();
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
				manejarBazar();
				break;
			case JUGUETERIA:
				manejarJugueteria();
				break;
			case LIBREBIA:
				manejarLibreria();
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
				manejarAlfajores();
				break;
			case CARAMELO_Y_CHICLES: 
				manejarCarameloYChicles();
				break;
			case BARRITA_DE_CEREAL:
				manejarBarritasDeCereal();
				break;
			case BEBIDAS:
				manejarBebidas();
				break;
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
			case VACUNA:
				manejarVacuna();
				break;
			case CERDO:
				manejarCerdo();
				break;
			case EMBUTIDOS:
				manejarEmbutidos();
				break;
			case POLLO:
				manejarPollo();
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
			case FRUTAS:
				manejarFrutas();
				break;
			case VERDURAS:
				manejarVerduras();
				break;
			case HUEVOS:
				manejarHuevos();
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
	
	/////////////
	
	private static void manejarComidasListas() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto burrito = new Producto("Burritos Integrales", 4825);
		Producto tarta = new Producto("Tarta De Zapallito", 5070);
		listaDeProductosDisponibles[0] = burrito;
		listaDeProductosDisponibles[1] = tarta;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarGalletitasYPanaderias() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto galletitasOreo = new Producto("Galletitas Oros", 1060);
		Producto panDeHamburguesas = new Producto("Pan de Hamburguesa", 2360);
		listaDeProductosDisponibles[0] = galletitasOreo;
		listaDeProductosDisponibles[1] = panDeHamburguesas;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarLacteosYQuesos() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto lecheLaSerenisimaDescremada = new Producto("Leche LaSerenisima Descremada 1Lt", 1979);
		Producto lecheChocolatadaCindor = new Producto("Leche Chocolatada Cindor 1Lt", 3698);
		Producto huevosColorDocena = new Producto("Huevos Color x12", 3400);
		listaDeProductosDisponibles[0] = lecheLaSerenisimaDescremada;
		listaDeProductosDisponibles[1] = lecheChocolatadaCindor;
		listaDeProductosDisponibles[2] = huevosColorDocena;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarPastas() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto raviolesDeVerduraYQueso = new Producto("Ravioles de Verdula y Queso", 1600);
		Producto ñoquis = new Producto("Ñoquis 500g", 1885);
		listaDeProductosDisponibles[0] = raviolesDeVerduraYQueso;
		listaDeProductosDisponibles[1] = ñoquis;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarSnacks() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto papasFritasLays = new Producto("Papas Fritas Lays 85g", 2435);
		Producto saladix = new Producto("Saladix 30g", 680);
		Producto rex = new Producto("Galletitas Rex", 1030);
		listaDeProductosDisponibles[0] = papasFritasLays;
		listaDeProductosDisponibles[1] = saladix;
		listaDeProductosDisponibles[2] = rex;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	//////////
	
	private static void manejarAgua() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto aguaVillavicencio = new Producto("Agua Villaviencio", 1200);
		Producto aguaSmartWater = new Producto("Agua SmartWater", 900);
		listaDeProductosDisponibles[0] = aguaVillavicencio;
		listaDeProductosDisponibles[1] = aguaSmartWater;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarAguaSaborizada() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto aquarius = new Producto("Aquarius", 1650);
		Producto levite = new Producto("Levite", 1740);
		listaDeProductosDisponibles[0] = aquarius;
		listaDeProductosDisponibles[1] = levite;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarBebidasAlcoholicas() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto cerveza = new Producto("Cerveza Quilmes", 2200);
		Producto fernetBranca = new Producto("Fernet Branca", 9300);
		listaDeProductosDisponibles[0] = cerveza;
		listaDeProductosDisponibles[1] = fernetBranca;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarGaseosas() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto coca = new Producto("Coca-Cola", 3100);
		Producto sevenUp = new Producto("7Up", 2300);
		listaDeProductosDisponibles[0] = coca;
		listaDeProductosDisponibles[1] = sevenUp;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	//////////
	
	private static void manejarEscoba() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto escoba = new Producto("Escoba" , 1900);
		Producto escobillon = new Producto("Escobillon" , 3000);
		listaDeProductosDisponibles[0] = escoba;
		listaDeProductosDisponibles[1] = escobillon;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarMopa() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto mopa = new Producto("Mopa" , 11000);
		Producto mopaYBalde = new Producto("Mopa + Balde" , 25000);
		listaDeProductosDisponibles[0] = mopa;
		listaDeProductosDisponibles[1] = mopaYBalde;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarLavandina() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto lavandinaChico = new Producto("Lavandina 1Lt" , 2000);
		Producto lavandinaGrande = new Producto("Lavandina 4Lt" , 5300);
		listaDeProductosDisponibles[0] = lavandinaChico;
		listaDeProductosDisponibles[1] = lavandinaGrande;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarSuavizante() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto suavizanteChico = new Producto("Suavizante 500ml", 2380);
		Producto suavizanteGrande = new Producto("Suavizante 3Lt" , 7600);
		listaDeProductosDisponibles[0] = suavizanteChico;
		listaDeProductosDisponibles[1] = suavizanteGrande;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	//////////
	
	private static void manejarBazar() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto platos = new Producto("Set de platos", 7200);
		Producto escarbadientes = new Producto("Escarbadientes", 890);
		listaDeProductosDisponibles[0] = platos;
		listaDeProductosDisponibles[1] = escarbadientes;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarJugueteria() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto peluche = new Producto("Peluche Pikachu", 12300);
		Producto soldadito = new Producto("Soldadito", 5000);
		listaDeProductosDisponibles[0] = peluche;
		listaDeProductosDisponibles[1] = soldadito;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarLibreria() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto libroHp = new Producto("Coleccion Saga Harry Potter", 32500);
		Producto historieta = new Producto("Historieta", 9000);
		listaDeProductosDisponibles[0] = libroHp;
		listaDeProductosDisponibles[1] = historieta;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	//////////
	
	private static void manejarAlfajores() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto alfajorCapitanDelEspacio = new Producto("Capitan Del Espacio", 1000);
		Producto alfajorGuaymallen = new Producto("Guaymallen", 800);
		listaDeProductosDisponibles[0] = alfajorCapitanDelEspacio;
		listaDeProductosDisponibles[1] = alfajorGuaymallen;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarCarameloYChicles() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto caramelo = new Producto("Butter Toffee", 100);
		Producto chicleBeldent = new Producto("Chicle Beldent", 600);
		listaDeProductosDisponibles[0] = caramelo;
		listaDeProductosDisponibles[1] = chicleBeldent;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarBarritasDeCereal() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto barrita = new Producto("CerealMix", 1140);
		Producto barritaCerealFort = new Producto("CerealFort", 550);
		listaDeProductosDisponibles[0] = barrita;
		listaDeProductosDisponibles[1] = barritaCerealFort;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarBebidas() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto latitaCoca = new Producto("Latita Coca-Cola", 1200);
		Producto latitaFanta = new Producto("Latita Fanta", 1200);
		Producto latitaPepsi = new Producto("Latita Pepsi", 1000);
		listaDeProductosDisponibles[0] = latitaCoca;
		listaDeProductosDisponibles[1] = latitaFanta;
		listaDeProductosDisponibles[2] = latitaPepsi;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	///////////////
	
	private static void manejarVacuna() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto lomo = new Producto("Lomo 0.5Kg", 7105);
		Producto bifeDeChorizo = new Producto("Bife de Chorizo 0.5Kg", 6975);
		Producto paleta = new Producto("Paleta 0.5Kg", 5650);
		listaDeProductosDisponibles[0] = lomo;
		listaDeProductosDisponibles[1] = bifeDeChorizo;
		listaDeProductosDisponibles[2] = paleta;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarCerdo() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto solomillo = new Producto("Solomillo 0.5Kg", 3500);
		Producto pechitoDeCerdo = new Producto("Pechito de Cerdo 0.5Kg", 2100);
		listaDeProductosDisponibles[0] = solomillo;
		listaDeProductosDisponibles[1] = pechitoDeCerdo;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarEmbutidos() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto chorizoColorado = new Producto("Chorizo Colorado 0.5Kg", 4150);
		Producto salchichaParrillera = new Producto("Salchicha Parrillera 0.5Kg", 4850);
		listaDeProductosDisponibles[0] = chorizoColorado;
		listaDeProductosDisponibles[1] = salchichaParrillera;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarPollo() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto alitaDePollo = new Producto("Alita de Pollo 0.5Kg", 1050);
		Producto supremaDePollo = new Producto("Suprema de Pollo 0.5Kg", 4945);
		Producto polloEntero = new Producto("Pollo Entero 2.5Kg", 9750);
		listaDeProductosDisponibles[0] = alitaDePollo;
		listaDeProductosDisponibles[1] = supremaDePollo;
		listaDeProductosDisponibles[2] = polloEntero;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	////////////////
	
	private static void manejarFrutas() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto pera = new Producto("Pera xKg", 900);
		Producto kiwi = new Producto("Kiwi x kg", 7000);
		Producto manzana = new Producto("Manzana xKg", 3200);
		listaDeProductosDisponibles[0] = pera;
		listaDeProductosDisponibles[1] = kiwi;
		listaDeProductosDisponibles[2] = manzana;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarVerduras() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto tomate = new Producto("Tomate xKg", 4120);
		Producto lechuga = new Producto("Lechuga x kg", 3050);
		Producto zanahoria = new Producto("Zanahoria xKg", 1200);
		listaDeProductosDisponibles[0] = tomate;
		listaDeProductosDisponibles[1] = lechuga;
		listaDeProductosDisponibles[2] = zanahoria;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	private static void manejarHuevos() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto mapleDeHuevo = new Producto("Maple de Huevo", 5600);
		Producto docenaDeHuevo = new Producto("Huevo Blanco Grande x12", 3500);
		listaDeProductosDisponibles[0] = mapleDeHuevo;
		listaDeProductosDisponibles[1] = docenaDeHuevo;
		agregarProductosAlCarrito(listaDeProductosDisponibles);
	}
	
	
	public static void agregarProductosAlCarrito(Producto[] listaDeProductosDisponibles) {
		
	        int opcion;
	        int cantidad;

	        do {
	            System.out.println("\nProductos disponibles:");
	            for (int i = 0; i < listaDeProductosDisponibles.length; i++) {
	                if (listaDeProductosDisponibles[i] != null) {
	                    System.out.println((i + 1) + ". " + listaDeProductosDisponibles[i].toString());
	                }
	            }
	            System.out.println("\nIngrese el número del índice para añadir el producto al carrito o 0 para volver:");
	            opcion = teclado.nextInt();

	            if (opcion > 0 && opcion <= listaDeProductosDisponibles.length && listaDeProductosDisponibles[opcion - 1] != null) {
	                System.out.println("Ingrese la cantidad:");
	                cantidad = teclado.nextInt();
	                carrito.agregarAlCarrito(listaDeProductosDisponibles[opcion - 1], cantidad);
	            } else if (opcion != 0) {
	                System.out.println("Opción inválida. Intente de nuevo.");
	            }

	        } while (opcion != 0);
	    }
	
}
