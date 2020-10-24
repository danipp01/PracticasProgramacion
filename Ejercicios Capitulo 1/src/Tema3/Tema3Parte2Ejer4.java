package Tema3;

import javax.swing.JOptionPane;

public class Tema3Parte2Ejer4 {

	public static void main(String[] args) {
		int num, limite;
		String str = JOptionPane.showInputDialog("Introduzca el número del que quiera conseguir sus múltiplos: ");
		num = Integer.parseInt(str);
		String str2 = JOptionPane.showInputDialog("Introduzca el límite: ");
		limite = Integer.parseInt(str2);
		for (int i = num; i <= limite; i += num) {
			System.out.println("Los múltiplos son: " + i);
		}

	}
}
