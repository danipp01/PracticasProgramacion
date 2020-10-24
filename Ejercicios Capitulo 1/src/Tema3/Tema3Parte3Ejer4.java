package Tema3;

import javax.swing.JOptionPane;
public class Tema3Parte3Ejer4 {

	public static void main(String[] args) {
		int menor=1000000000;
		for(int i=1; i<=1000000000; i++) {
			int numero;
			String str = JOptionPane.showInputDialog("Introduzca un número, si quiere terminar introduzca el 0:"); 
	   		numero = Integer.parseInt(str); 
	   	
	   		if(menor > numero && numero!=0) {
			menor = numero;
			}
	   		if (numero==0) {
	   			break;
	   		}
		}
		System.out.println("El menor es: " + menor);
		
	}


}
