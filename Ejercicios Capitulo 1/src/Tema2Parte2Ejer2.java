import javax.swing.JOptionPane;

public class Tema2Parte2Ejer2 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;

		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		
		String str1 = JOptionPane.showInputDialog("Introduzca un número entero:"); 
		numero1 = Integer.parseInt(str1); // Convierto la variable número 1 en un número entero
		
		String str2 = JOptionPane.showInputDialog("Introduzca otro número entero:"); 
		numero2 = Integer.parseInt(str2); // Convierto la variable número 2 en un número entero
		
		String str3 = JOptionPane.showInputDialog("Introduzca otro número entero:"); 
		numero3 = Integer.parseInt(str3); // Convierto la variable número 3 en un número entero
		
		String str4 = JOptionPane.showInputDialog("Introduzca otro número entero:"); 
		numero4 = Integer.parseInt(str4); // Convierto la variable número 4 en un número entero
		
		String str5 = JOptionPane.showInputDialog("Introduzca otro número entero:"); 
		numero5 = Integer.parseInt(str5); // Convierto la variable número 5 en un número entero

		if (numero1 >= 0 & numero1 <= 25) {
			contador1++;
		}
		if (numero2 >= 0 & numero2 <= 25) {
			contador1++;
		}
		if (numero3 >= 0 & numero3 <= 25) {
			contador1++;
		}
		if (numero4 >= 0 & numero4 <= 25) {
			contador1++;
		}
		if (numero5 >= 0 & numero5 <= 25) {
			contador1++;
		}
		System.out.println("la cantidad de números pequeños es: " + contador1);

		if (numero1 >= 26 & numero1 <= 250) {
			contador2++;
		}
		if (numero2 >= 26 & numero2 <= 250) {
			contador2++;
		}
		if (numero3 >= 26 & numero3 <= 250) {
			contador2++;

		}
		if (numero4 >= 26 & numero4 <= 250) {
			contador2++;
		}
		if (numero5 >= 26 & numero5 <= 250) {
			contador2++;
		}
		System.out.println("La cantidad de números medianos es: " + contador2);

		if (numero1 > 250) {
			contador3++;
		}
		if (numero2 > 250) {
			contador3++;
		}
		if (numero3 > 250) {
			contador3++;
		}
		if (numero4 > 250) {
			contador3++;
		}
		if (numero5 > 250) {
			contador3++;
		}
		System.out.println("La cantidad de números grandes es: " + contador3);

	}

}
