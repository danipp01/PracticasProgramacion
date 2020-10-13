import javax.swing.JOptionPane;
public class Tema2Cap1 {

	public static void main(String[] args) {
		int numero;
		int numero1;
		String str = JOptionPane.showInputDialog("Introduzca un número:"); 
		numero = Integer.parseInt(str);
		String str1 = JOptionPane.showInputDialog("Introduzca otro número:");  
		numero1 = Integer.parseInt(str1);	
		if (numero>numero1) {
			System.out.println("El número mayor es: " + numero);
		}
		else {
			System.out.println("El número mayor es: " + numero1);
		}
	}

}
