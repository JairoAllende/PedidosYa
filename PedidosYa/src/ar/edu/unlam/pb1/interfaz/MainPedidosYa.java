package ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;

import ar.edu.unlam.pb1.dominio.ManagerDeMenus;

public class MainPedidosYa {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenido!");
		ManagerDeMenus.manejarMenuPrincipal();
	}
}
