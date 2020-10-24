package Tema3;

import javax.swing.JOptionPane;

public class Tema3Parte3Ejer7 {

	public static void main(String[] args) {
		int cont1 = 0, cont2 = 0;

		for (int i = 1; i <= 10000000; i++) {
			int numero;
			String str = JOptionPane.showInputDialog("Introduzca un número, si quiere terminar introduzca un 0:");
			numero = Integer.parseInt(str);
			if (numero < 0) {
				cont1++;
			}

			else if (numero > 0) {
				cont2++;
			} else {
				break;

			}

		}

		System.out.println("la cantidad de numeros positivos: " + cont1);
		System.out.println("la cantidad de numeros negativos: " + cont2);
	}

}
