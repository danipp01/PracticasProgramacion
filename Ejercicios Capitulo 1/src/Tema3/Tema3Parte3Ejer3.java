package Tema3;

import javax.swing.JOptionPane;

public class Tema3Parte3Ejer3 {

	public static void main(String[] args) {
		int numero = 3, mayor = 0, i;
		for (i = 0; numero != 0; i++) {
			String str1 = JOptionPane.showInputDialog("Introduzca un número, si quiere terminar introduzca el 0:");
			numero = Integer.parseInt(str1);
			if (i == 0) {
				mayor = numero;
			}

			if (mayor < numero && numero != 0) {
				mayor = numero;
			}
		}
		System.out.println("El número mayor es: " + mayor);

	}

}
