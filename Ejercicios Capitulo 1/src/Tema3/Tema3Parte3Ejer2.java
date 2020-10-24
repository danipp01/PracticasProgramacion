package Tema3;

import javax.swing.JOptionPane;

public class Tema3Parte3Ejer2 {

	public static void main(String[] args) {
		int sumatorio = 0;
		float suma = 0, media = 0, num1;
		do {
			String str = JOptionPane.showInputDialog("Introduzca los número para sumar:");
			num1 = Float.parseFloat(str);
			if (sumatorio == 0) {
				suma += num1;
				sumatorio++;
			} else {
				suma += num1;
				media = suma / sumatorio;
				sumatorio++;
			}

		} while (num1 != 0);

		System.out.println("El valor de la suma es: " + media);

	}

}
