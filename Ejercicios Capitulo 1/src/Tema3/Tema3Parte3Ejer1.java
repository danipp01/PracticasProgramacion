package Tema3;

import javax.swing.JOptionPane;

public class Tema3Parte3Ejer1 {

	public static void main(String[] args) {
		int num1, suma = 0;
		do {
			String str = JOptionPane.showInputDialog("Introduzca los número para sumar:");
			num1 = Integer.parseInt(str);
			suma = suma + num1;
		}while (num1 != 0);
		
		System.out.println("El valor de la suma es: " + suma);
		

	}

}
