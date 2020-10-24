package Tema3;

import javax.swing.JOptionPane;

public class Tema3Parte3Ejer6 {

	public static void main(String[] args) {
		for (int i = 1; i < 10000000; i++) {
			int factor = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número, si quiere terminar introduzca un 0: "));
			;
			if (factor == 0) {
				break;
			}
			for (int j = 1; j < 11; j++) {
				System.out.println(j + " x " + factor + " = " + (j * factor));
			}
		}

	}

}
