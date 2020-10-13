import javax.swing.JOptionPane;
public class cap7 {

	public static void main(String[] args) {
		int numentero;
		String str = JOptionPane.showInputDialog("Introduzca un número entero:");
		numentero = Integer.parseInt(str);
		System.out.println("\nOperación lógica NOT: " + ~numentero + 1);

	}

}
