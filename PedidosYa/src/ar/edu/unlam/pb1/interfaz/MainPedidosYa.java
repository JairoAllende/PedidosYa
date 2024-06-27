package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.ManagerDeMenus;
import ar.edu.unlam.pb1.dominio.Usuario;

public class MainPedidosYa {
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenido!\nEl saldo de tu cuenta es de: " + Usuario.getSaldoEnLaCuenta());
		
		ManagerDeMenus.manejarMenuPrincipal();
	}
}
