package Tema2;
import javax.swing.JOptionPane;

public class Tema2Parte2Ejer1 {

	public static void main(String[] args) {
		int numero1, numero2, numero3, numero4, numero5, negativo = 0, bajo = 0, medio = 0, grande = 0;
		//Le doy valores a las variables con las que voy a trabajar
		String str1 = JOptionPane.showInputDialog("Introduzca el primer número: ");
		numero1 = Integer.parseInt(str1);
		if (numero1 < 0) {
			negativo = negativo + numero1;
		} else if (numero1 >= 0 && numero1 <= 25) {
			bajo = bajo + numero1;
		} else if (numero1 >= 26 && numero1 <= 250) {
			medio = medio + numero1;
		} else if (numero1 > 250) {
			grande = grande + numero1;
		}//Clasifico las categorías del numero1 

		String str2 = JOptionPane.showInputDialog("Introduzca el segundo número: ");
		numero2 = Integer.parseInt(str2);
		if (numero2 < 0) {
			negativo = negativo + numero2;
		} else if (numero2 >= 0 && numero2 <= 25) {
			bajo = bajo + numero2;
		} else if (numero2 >= 26 && numero2 <= 250) {
			medio = medio + numero2;
		} else if (numero2 > 250) {
			grande = grande + numero2;
		}//Clasifico las categorías del numero2

		String str3 = JOptionPane.showInputDialog("Introduzca el tercer número: ");
		numero3 = Integer.parseInt(str3);
		if (numero3 < 0) {
			negativo = negativo + numero3;
		}
		else if (numero3 >= 0 && numero3 <= 25) {
			bajo = bajo + numero3;
		}
		else if (numero3 >= 26 && numero3 <= 250 ) {
			medio = medio + numero3;
		}
		else if (numero3 > 250) {
			grande = grande + numero3;
		}//Clasifico las categorías del numero3
		
		String str4 = JOptionPane.showInputDialog("Introduzca el cuarto número: ");
		numero4 = Integer.parseInt(str4);
		if (numero4 < 0) {
			negativo = negativo + numero4;
		}
		else if (numero4 >= 0 && numero4 <= 25) {
			bajo = bajo + numero4;
		}
		else if (numero4 >= 26 && numero4 <= 250 ) {
			medio = medio + numero4;
		}
		else if (numero4 > 250) {
			grande = grande + numero4;
		}//Clasifico las categorías del numero4
		
		String str5 = JOptionPane.showInputDialog("Introduzca el quinto número: ");
		numero5 = Integer.parseInt(str5);
		if (numero5 < 0) {
			negativo = negativo + numero5;
		}
		else if (numero5 >= 0 && numero5 <= 25) {
			bajo = bajo + numero5;
		}
		else if (numero5 >= 26 && numero5 <= 250 ) {
			medio = medio + numero5;
		}
		else if (numero5 > 250) {
			grande = grande + numero5;
		}//Clasifico las categorías del numero5
		
		int suma;//Creo la variable suma
		suma = numero1 + numero2 + numero3 + numero4 + numero5;//Digo que suma es la operación de todos los números
		
		System.out.println("La suma de los números es: " + suma);//Imprimo el resultado se suma

	}

}
