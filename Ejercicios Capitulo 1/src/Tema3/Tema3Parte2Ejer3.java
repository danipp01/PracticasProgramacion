package Tema3;

import javax.swing.JOptionPane;

public class Tema3Parte2Ejer3 {

	public static void main(String[] args) {
		int num;
		String str = JOptionPane.showInputDialog("Introduzca el número del que quiera conseguir sus múltiplos: ");
		num = Integer.parseInt(str);

		for (int i = num; i <= 100; i += num) {
			System.out.println("Los múltiplos son: " + i);

		}

	}
}
