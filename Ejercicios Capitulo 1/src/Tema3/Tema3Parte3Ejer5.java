package Tema3;

import javax.swing.JOptionPane;

public class Tema3Parte3Ejer5 {

	public static void main(String[] args) {
		int mayor = 0, menor = 0, numero = 1, i;
		for (i = 0; numero != 0; i++) {
			String str = JOptionPane
					.showInputDialog("Introduzca un número, si quiere terminar introduzca un 0):");
			numero = Integer.parseInt(str);
			if (i == 0) {
				mayor = numero;
			}

			if (mayor < numero && numero != 0) {
				mayor = numero;
			}

			if (i == 0) {
				menor = numero;
			}

			if (menor > numero && numero != 0) {
				menor = numero;
			}

		}

		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);

	}

}
