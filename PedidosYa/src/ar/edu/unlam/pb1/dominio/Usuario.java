package ar.edu.unlam.pb1.dominio;

public class Usuario {
	private static float saldoEnLaCuenta = (float) (Math.random() * (140000 - 70000) + 70000);

	public static float getSaldoEnLaCuenta() {
		return saldoEnLaCuenta;
	}

	public static void setSaldoEnLaCuenta(float saldoEnLaCuentaActualizado) {
		saldoEnLaCuenta = saldoEnLaCuentaActualizado;
	}
}
