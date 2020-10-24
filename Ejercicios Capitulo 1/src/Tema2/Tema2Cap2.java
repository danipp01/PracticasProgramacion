package Tema2;
import java.lang.runtime.ObjectMethods;
import javax.swing.JOptionPane;
public class Tema2Cap2 extends ObjectMethods {

	public static void main(String[] args) {
		int numeroEntero1;
		int numeroEntero2;
		String str = JOptionPane.showInputDialog("Introduzca un número");
		numeroEntero1 = Integer.parseInt(str);
		String str1 = JOptionPane.showInputDialog("Introduzca otro número");
		numeroEntero2 = Integer.parseInt(str1);
		if (numeroEntero1 < numeroEntero2) {
			System.out.println("El número menor es: " + numeroEntero1);
		} else {
			System.out.println("El número menor es: " + numeroEntero2);
		}

	}

}
