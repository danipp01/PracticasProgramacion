package Tema2;
import javax.swing.JOptionPane;
public class Tema2Parte3Ejer1 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Dí la nota");
		int nota = Integer.parseInt(str);
		switch (nota) {
		case 0:
		case 1:
		case 2:
			System.out.println("Muy decifiente: "+ nota);
			break;
		case 3:
		case 4:
			System.out.println("Decifiente: "+ nota);
			break;
		case 5:
			System.out.println("Suficiente: "+ nota);
			break;
		case 6:
			System.out.println("Bien: "+ nota);
			break;
		case 7:
		case 8:
			System.out.println("Notable: "+ nota);
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente: "+ nota);
			break;
		default:
			System.out.println("Error, la nota debe ser entre 0 y 10");

		}
	}

}
