package Tema3;
import javax.swing.JOptionPane;

public class Tema3Parte2Ejer2 {

	public static void main(String[] args) {
		int CantidadNumPedir, numeroUsuario, mayor = 0, menor = 0;

		String str = JOptionPane.showInputDialog("Dame la cantidad de enteros que desee:");
		CantidadNumPedir = Integer.parseInt(str);

		for (int i = 0; i < CantidadNumPedir; i++) {
			String str2 = JOptionPane.showInputDialog("Dame un número:");
			numeroUsuario = Integer.parseInt(str2);

			if (i == 0) {
				mayor = numeroUsuario;
				menor = numeroUsuario;
			} else if (numeroUsuario < menor) {
				menor = numeroUsuario;
			} else if (numeroUsuario > mayor) {
				mayor = numeroUsuario;
			}
		}
		System.out.println("El número mayor es: " + mayor + " \nEl número menor es: " + menor);
	}

}
