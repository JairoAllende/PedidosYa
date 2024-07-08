package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

import ar.edu.unlam.pb1.dominio.enums.*;

public class ManagerDeMenus {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static MenuPrincipal ingresarOpcionDelMenu() {
		mostrarMenuPrincipal();
		return MenuPrincipal.values()[teclado.nextInt() - 1];
	}
	
	private static void mostrarMenuPrincipal() {
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < MenuPrincipal.values().length; i++) {
			System.out.println((i+1) + ". " + MenuPrincipal.values()[i]);
		}
	}
	
	public static TiposDeSupermercados ingresarOpcionTiposDeSupermercados() {
		mostrarMenuTiposDeSupermercados();
		return TiposDeSupermercados.values()[teclado.nextInt() - 1]; 
	}
	
	public static void  mostrarMenuTiposDeSupermercados(){
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < TiposDeSupermercados.values().length; i++) {
			System.out.println((i+1) + ". " + TiposDeSupermercados.values()[i]);
		}
	}
	
	public static MenuSupermercado ingresarOpcionDelMenuSupermercado() {
		mostrarMenuSupermercado();
		return MenuSupermercado.values()[teclado.nextInt() - 1];
	}
	
	private static void mostrarMenuSupermercado() {
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < MenuSupermercado.values().length; i++) {
			System.out.println((i+1) + ". " + MenuSupermercado.values()[i]);
		}
	}

	public static MenuComidas ingresarOpcionMenuComidas() {
		mostarMenuComidas();
		return MenuComidas.values()[teclado.nextInt() - 1];
	}
	
	private static void mostarMenuComidas() {
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < MenuComidas.values().length ; i++) {
			System.out.println((i+1) + ". " + MenuComidas.values()[i]);
		}
	}
	
	public static MenuBebidas ingresarOpcionDelMenuBebidas(){
		mostrarMenuBebidas();
		return MenuBebidas.values()[teclado.nextInt() - 1];
	}
	
	private static void mostrarMenuBebidas() {
		System.out.println("\nIngrese una opcion...");
		for (int i = 0; i < MenuBebidas.values().length; i++) {
			System.out.println((i+1) + ". " + MenuBebidas.values()[i]);
		}
	}
	
	public static MenuLimpieza ingresarOpcionDelMenuLimpieza(){
		mostrarMenuLimpieza();
		return MenuLimpieza.values()[teclado.nextInt() - 1];
	}
	
	private static void mostrarMenuLimpieza() {
		System.out.println("\nIngrese una opcion...");
		for (int i = 0; i < MenuLimpieza.values().length; i++) {
			System.out.println((i+1) + ". " + MenuLimpieza.values()[i]);
		}
	}
	
	
	public static MenuVarios ingresarOpcionDelMenuVarios(){
		mostrarMenuVarios();
		return MenuVarios.values()[teclado.nextInt() - 1];
	}
	
	
	private static void mostrarMenuVarios() {
		System.out.println("\nIngrese una opcion...");
		for (int i = 0; i < MenuVarios.values().length; i++) {
			System.out.println((i+1) + ". " + MenuVarios.values()[i]);
		}
	}
	
	public static TiposDeKioscos ingresarOpcionTiposDeKioscos() {
		mostrarMenuTiposDeKioscos();
		return TiposDeKioscos.values()[teclado.nextInt() - 1];
	}
	
	private static void mostrarMenuTiposDeKioscos() {
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < TiposDeKioscos.values().length; i++) {
			System.out.println((i+1) +  ". " + TiposDeKioscos.values()[i]);
		}
	}
	
	public static MenuKiosco ingresarOpcionDelMenuKiosco() {
		mostrarMenuKiosco();
		return MenuKiosco.values()[teclado.nextInt() - 1];
	}
	
	private static void mostrarMenuKiosco() {
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < MenuKiosco.values().length; i++) {
			System.out.println((i+1) + ". " + MenuKiosco.values()[i]);
		}
	}
	
	public static TiposDeCarnicerias ingresarOpcionTiposDeCarniceria() {
		mostrarMenuTiposDeCarniceria();
		return TiposDeCarnicerias.values()[teclado.nextInt() - 1];
	}
	
	private static void mostrarMenuTiposDeCarniceria() {
		System.out.println("Ingrese una opcion...");
		for(int i = 0; i < TiposDeCarnicerias.values().length ; i++) {
			System.out.println((i+1) + ". " + TiposDeCarnicerias.values()[i]);
		}
	}
	
	public static MenuCarniceria ingresarOpcionDelMenuCarniceria() {
		mostrarMenuCarniceria();
		return MenuCarniceria.values()[teclado.nextInt() - 1];
	}
	
	private static void mostrarMenuCarniceria() {
		System.out.println("Ingrese una opcion...");
		for(int i = 0; i < MenuCarniceria.values().length; i++) {
			System.out.println((i+1) + ". " + MenuCarniceria.values()[i]);
		}
	}
	
	public static TiposDeVerdulerias ingresarOpcionTiposDeVerdulerias() {
		mostrarMenuTiposDeVerdulerias();
		return TiposDeVerdulerias.values()[teclado.nextInt() - 1];
	}
	
	private static void mostrarMenuTiposDeVerdulerias() {
		System.out.println("Ingrese una opcion...");
		for(int i = 0; i < TiposDeVerdulerias.values().length ; i++) {
			System.out.println((i+1) + ". " + TiposDeVerdulerias.values()[i]);
		}
	}
	
	public static MenuVerduleria ingresarOpcionDelMenuVerduleria() {
		mostrarMenuVerduleria();
		return MenuVerduleria.values()[teclado.nextInt() - 1];
	}
	
	private static void mostrarMenuVerduleria() {
		System.out.println("\nIngrese una opcion...");
		for(int i = 0; i < MenuVerduleria.values().length ; i++) {
			System.out.println((i+1) +  ". " + MenuVerduleria.values()[i]);
		}
	}
	
	/////////////
	
	public static Producto[] manejarComidasListas() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto burrito = new Producto("Burritos Integrales", 4825);
		Producto tarta = new Producto("Tarta De Zapallito", 5070);
		Producto sopaMaruchan = new Producto("Sopa Maruchan", 2600);
		listaDeProductosDisponibles[0] = burrito;
		listaDeProductosDisponibles[1] = tarta;
		listaDeProductosDisponibles[2] = sopaMaruchan;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarGalletitasYPanaderias() {
		Producto[] listaDeProductosDisponibles = new Producto[4];
		Producto galletitasOreo = new Producto("Galletitas Oreos", 1060);
		Producto galletitasPepitos = new Producto("Galletitas Pepitos", 900);
		Producto panDeHamburguesas = new Producto("Pan de Hamburguesa", 2360);
		Producto budinDeLimons = new Producto("Budin de Limon", 2190);
		listaDeProductosDisponibles[0] = galletitasOreo;
		listaDeProductosDisponibles[1] = galletitasPepitos;
		listaDeProductosDisponibles[2] = panDeHamburguesas;
		listaDeProductosDisponibles[3] = budinDeLimons;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarLacteosYQuesos() {
		Producto[] listaDeProductosDisponibles = new Producto[5];
		Producto lecheLaSerenisimaDescremada = new Producto("Leche LaSerenisima Descremada 1Lt", 1979);
		Producto lecheChocolatadaCindor = new Producto("Leche Chocolatada Cindor 1Lt", 3698);
		Producto huevosColorDocena = new Producto("Huevos Color x12", 3400);
		Producto actimel = new Producto("Actimel Fruttilla", 1230);
		Producto quesoFeteado = new Producto("Queso Feteado 200g", 2590);
		listaDeProductosDisponibles[0] = lecheLaSerenisimaDescremada;
		listaDeProductosDisponibles[1] = lecheChocolatadaCindor;
		listaDeProductosDisponibles[2] = huevosColorDocena;
		listaDeProductosDisponibles[3] = actimel;
		listaDeProductosDisponibles[4] = quesoFeteado;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarPastas() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto raviolesDeVerduraYQueso = new Producto("Ravioles de Verdula y Queso", 1600);
		Producto nioquis = new Producto("�oquis 500g", 1885);
		Producto zorrentinos = new Producto("Zorrentinos 500g", 2265);
		listaDeProductosDisponibles[0] = raviolesDeVerduraYQueso;
		listaDeProductosDisponibles[1] = nioquis;
		listaDeProductosDisponibles[2] = zorrentinos;
		return listaDeProductosDisponibles;
	}
		
	
	public static Producto[] manejarSnacks() {
		Producto[] listaDeProductosDisponibles = new Producto[5];
		Producto papasFritasLays = new Producto("Papas Fritas Lays 85g", 2435);
		Producto saladix = new Producto("Saladix 30g", 680);
		Producto rex = new Producto("Galletitas Rex", 1030);
		Producto palitosSalados = new Producto("Palitos Salados", 1590);
		Producto maniSalado = new Producto("Mani Salado 500g", 2900);
		listaDeProductosDisponibles[0] = papasFritasLays;
		listaDeProductosDisponibles[1] = saladix;
		listaDeProductosDisponibles[2] = rex;
		listaDeProductosDisponibles[3] = palitosSalados;
		listaDeProductosDisponibles[4] = maniSalado;
		return listaDeProductosDisponibles;
	}
	
	//////////
	
	public static Producto[] manejarAgua() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto aguaVillavicencio = new Producto("Agua Villaviencio", 1200);
		Producto aguaSmartWater = new Producto("Agua SmartWater", 900);
		Producto aguaConGas = new Producto("Agua Con Gas Villaviencio", 1000);
		listaDeProductosDisponibles[0] = aguaVillavicencio;
		listaDeProductosDisponibles[1] = aguaSmartWater;
		listaDeProductosDisponibles[2] = aguaConGas;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarAguaSaborizada() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto aquarius = new Producto("Aquarius", 1650);
		Producto levite = new Producto("Levite", 1740);
		Producto h2oh = new Producto("Agua Saborizada H2Oh!", 2285);
		listaDeProductosDisponibles[0] = aquarius;
		listaDeProductosDisponibles[1] = levite;
		listaDeProductosDisponibles[2] = h2oh;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarBebidasAlcoholicas() {
		Producto[] listaDeProductosDisponibles = new Producto[4];
		Producto cerveza = new Producto("Cerveza Quilmes 340ml", 2200);
		Producto fernetBranca = new Producto("Fernet Branca 750ml", 9300);
		Producto absolutVodka = new Producto("Absolut Vodka 700ml", 15900);
		Producto drLemon = new Producto("Dr. Lemon 1Lt", 1600);
		listaDeProductosDisponibles[0] = cerveza;
		listaDeProductosDisponibles[1] = fernetBranca;
		listaDeProductosDisponibles[2] = absolutVodka;
		listaDeProductosDisponibles[3] = drLemon;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarGaseosas() {
		Producto[] listaDeProductosDisponibles = new Producto[4];
		Producto coca = new Producto("Coca-Cola", 3100);
		Producto sevenUp = new Producto("7Up", 2300);
		Producto manaosCola = new Producto("Manaos Cola", 2000);
		Producto cunningtonLima = new Producto("Cunnington Lima Limon", 2100);
		listaDeProductosDisponibles[0] = coca;
		listaDeProductosDisponibles[1] = sevenUp;
		listaDeProductosDisponibles[2] = manaosCola;
		listaDeProductosDisponibles[3] = cunningtonLima;
		return listaDeProductosDisponibles;
	}
	
	//////////
	
	public static Producto[] manejarEscoba() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto escoba = new Producto("Escoba" , 1900);
		Producto escobillon = new Producto("Escobillon" , 3000);
		listaDeProductosDisponibles[0] = escoba;
		listaDeProductosDisponibles[1] = escobillon;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarMopa() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto mopa = new Producto("Mopa" , 11000);
		Producto mopaYBalde = new Producto("Mopa + Balde" , 25000);
		listaDeProductosDisponibles[0] = mopa;
		listaDeProductosDisponibles[1] = mopaYBalde;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarLavandina() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto lavandinaChico = new Producto("Lavandina 1Lt" , 2000);
		Producto lavandinaGrande = new Producto("Lavandina 4Lt" , 5300);
		listaDeProductosDisponibles[0] = lavandinaChico;
		listaDeProductosDisponibles[1] = lavandinaGrande;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarSuavizante() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto suavizanteChico = new Producto("Suavizante 500ml", 2380);
		Producto suavizanteGrande = new Producto("Suavizante 3Lt" , 7600);
		listaDeProductosDisponibles[0] = suavizanteChico;
		listaDeProductosDisponibles[1] = suavizanteGrande;
		return listaDeProductosDisponibles;
	}
	
	//////////
	
	public static Producto[] manejarBazar() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto platos = new Producto("Set de platos x4", 7200);
		Producto cubiertos = new Producto("Set cubiertos x24", 20000);
		Producto escarbadientes = new Producto("Escarbadientes", 890);
		listaDeProductosDisponibles[0] = platos;
		listaDeProductosDisponibles[1] = cubiertos;
		listaDeProductosDisponibles[2] = escarbadientes;
		return listaDeProductosDisponibles;
	}				
	
	public static Producto[] manejarJugueteria() {
		Producto[] listaDeProductosDisponibles = new Producto[4];
		Producto peluche = new Producto("Peluche Pikachu", 12300);
		Producto soldadito = new Producto("Soldadito", 5000);
		Producto monopoly = new Producto("Monopoly", 35000);
		Producto packHotWheels = new Producto("Pack Hot Wheels x5", 29000);
		listaDeProductosDisponibles[0] = peluche;
		listaDeProductosDisponibles[1] = soldadito;
		listaDeProductosDisponibles[2] = monopoly;
		listaDeProductosDisponibles[3] = packHotWheels;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarLibreria() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto libroHp = new Producto("Coleccion Saga Harry Potter", 32500);
		Producto historieta = new Producto("Historieta", 9000);
		Producto manga = new Producto("Manga Evangelion", 6400);
		listaDeProductosDisponibles[0] = libroHp;
		listaDeProductosDisponibles[1] = historieta;
		listaDeProductosDisponibles[2] = manga;
		return listaDeProductosDisponibles;
	}
	
	//////////
	
	public static Producto[] manejarAlfajores() {
		Producto[] listaDeProductosDisponibles = new Producto[4];
		Producto alfajorCapitanDelEspacio = new Producto("Capitan Del Espacio", 1000);
		Producto alfajorGuaymallen = new Producto("Guaymallen", 800);
		Producto alfajorJorgito = new Producto("Jorgito", 900);
		Producto alfajorTerrabusi = new Producto("Terrabusi", 1200);
		listaDeProductosDisponibles[0] = alfajorCapitanDelEspacio;
		listaDeProductosDisponibles[1] = alfajorGuaymallen;
		listaDeProductosDisponibles[2] = alfajorJorgito;
		listaDeProductosDisponibles[3] = alfajorTerrabusi;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarCarameloYChicles() {
		Producto[] listaDeProductosDisponibles = new Producto[4];
		Producto caramelo = new Producto("Butter Toffee", 100);
		Producto chicleBeldent = new Producto("Chicle Beldent", 600);
		Producto chupetin = new Producto("Chupetin Pico Dulce", 500);
		Producto mentas = new Producto("Mentas Halls", 400);
		listaDeProductosDisponibles[0] = caramelo;
		listaDeProductosDisponibles[1] = chicleBeldent;
		listaDeProductosDisponibles[2] = chupetin;
		listaDeProductosDisponibles[3] = mentas;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarBarritasDeCereal() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto barrita = new Producto("CerealMix", 1140);
		Producto barritaCerealFort = new Producto("CerealFort", 750);
		Producto turron = new Producto("Turron de mani", 550);
		listaDeProductosDisponibles[0] = barrita;
		listaDeProductosDisponibles[1] = barritaCerealFort;
		listaDeProductosDisponibles[2] = turron;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarBebidas() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto latitaCoca = new Producto("Latita Coca-Cola", 1200);
		Producto latitaFanta = new Producto("Latita Fanta", 1200);
		Producto latitaPepsi = new Producto("Latita Pepsi", 1000);
		listaDeProductosDisponibles[0] = latitaCoca;
		listaDeProductosDisponibles[1] = latitaFanta;
		listaDeProductosDisponibles[2] = latitaPepsi;
		return listaDeProductosDisponibles;
	}
	
	///////////////
	
	public static Producto[] manejarVacuna() {
		Producto[] listaDeProductosDisponibles = new Producto[5];
		Producto lomo = new Producto("Lomo 0.5Kg", 7105);
		Producto bifeDeChorizo = new Producto("Bife de Chorizo 0.5Kg", 6975);
		Producto paleta = new Producto("Paleta 0.5Kg", 5650);
		Producto asado = new Producto("Asado 1Kg", 8700);
		Producto tapaDeAsado = new Producto("Tapa De Asado 1Kg", 7800);
		listaDeProductosDisponibles[0] = lomo;
		listaDeProductosDisponibles[1] = bifeDeChorizo;
		listaDeProductosDisponibles[2] = paleta;
		listaDeProductosDisponibles[3] = asado;
		listaDeProductosDisponibles[4] = tapaDeAsado;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarCerdo() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto solomillo = new Producto("Solomillo 0.5Kg", 3500);
		Producto pechitoDeCerdo = new Producto("Pechito de Cerdo 0.5Kg", 2100);
		Producto costillaDeCerdo = new Producto("Costilla de Cerdo 1Kg", 6500);
		listaDeProductosDisponibles[0] = solomillo;
		listaDeProductosDisponibles[1] = pechitoDeCerdo;
		listaDeProductosDisponibles[2] = costillaDeCerdo;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarEmbutidos() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto chorizoColorado = new Producto("Chorizo Colorado 0.5Kg", 4150);
		Producto salchichaParrillera = new Producto("Salchicha Parrillera 0.5Kg", 4850);
		Producto morcilla = new Producto("Morcilla 0.5Kg", 1900);
		listaDeProductosDisponibles[0] = chorizoColorado;
		listaDeProductosDisponibles[1] = salchichaParrillera;
		listaDeProductosDisponibles[2] = morcilla;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarPollo() {
		Producto[] listaDeProductosDisponibles = new Producto[3];
		Producto alitaDePollo = new Producto("Alita de Pollo 0.5Kg", 1050);
		Producto supremaDePollo = new Producto("Suprema de Pollo 0.5Kg", 4945);
		Producto polloEntero = new Producto("Pollo Entero 2.5Kg", 9750);
		listaDeProductosDisponibles[0] = alitaDePollo;
		listaDeProductosDisponibles[1] = supremaDePollo;
		listaDeProductosDisponibles[2] = polloEntero;
		return listaDeProductosDisponibles;
	}
	
	////////////////
	
	public static Producto[] manejarFrutas() {
		Producto[] listaDeProductosDisponibles = new Producto[5];
		Producto pera = new Producto("Pera xKg", 900);
		Producto kiwi = new Producto("Kiwi x kg", 7000);
		Producto manzana = new Producto("Manzana xKg", 3200);
		Producto mandarina = new Producto("Mandarina xKg", 2200);
		Producto palta = new Producto("Palta c/u", 2500);
		listaDeProductosDisponibles[0] = pera;
		listaDeProductosDisponibles[1] = kiwi;
		listaDeProductosDisponibles[2] = manzana;
		listaDeProductosDisponibles[3] = mandarina;
		listaDeProductosDisponibles[4] = palta;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarVerduras() {
		Producto[] listaDeProductosDisponibles = new Producto[5];
		Producto tomate = new Producto("Tomate xKg", 4120);
		Producto lechuga = new Producto("Lechuga xkg", 3050);
		Producto zanahoria = new Producto("Zanahoria xKg", 1200);
		Producto tomateCherry = new Producto("Tomate Cherry x1/2Kg", 4000);
		Producto zapallitoRedondo = new Producto("Zapallito Redondo xKg", 3800);
		listaDeProductosDisponibles[0] = tomate;
		listaDeProductosDisponibles[1] = lechuga;
		listaDeProductosDisponibles[2] = zanahoria;
		listaDeProductosDisponibles[3] = tomateCherry;
		listaDeProductosDisponibles[4] = zapallitoRedondo;
		return listaDeProductosDisponibles;
	}
	
	public static Producto[] manejarHuevos() {
		Producto[] listaDeProductosDisponibles = new Producto[2];
		Producto mapleDeHuevo = new Producto("Maple de Huevo", 5600);
		Producto docenaDeHuevo = new Producto("Huevo Blanco Grande x12", 3500);
		listaDeProductosDisponibles[0] = mapleDeHuevo;
		listaDeProductosDisponibles[1] = docenaDeHuevo;
		return listaDeProductosDisponibles;
	}
	
	
}
