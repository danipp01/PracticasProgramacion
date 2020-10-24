package Tema2;
import javax.swing.JOptionPane;

public class Tema2Cap4{

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		String str1 = JOptionPane.showInputDialog("Introduzca un número");
		String str2 = JOptionPane.showInputDialog("Introduzca un número");
		String str3 = JOptionPane.showInputDialog("Introduzca un número");
		String str4 = JOptionPane.showInputDialog("Introduzca un número");
		String str5 = JOptionPane.showInputDialog("Introduzca un número");

		n1 = Integer.parseInt(str1);
		n2 = Integer.parseInt(str2);
		n3 = Integer.parseInt(str3);
		n4 = Integer.parseInt(str4);
		n5 = Integer.parseInt(str5);

		if ((n1 > n2 && n1 > n3) && (n1 > n4 && n1 > n5)) {
			System.out.printf("%d\t Es el mayor", n1);

		} else if ((n2 > n1 && n2 > n3) && (n2 > n4 && n2 > n5)) {
			System.out.printf("%d\t Es el mayor", n2);

		} else if ((n3 > n1 && n3 > n2) && (n3 > n4 && n3 > n5)) {
			System.out.printf("%d\t Es el mayor\n", n3);

		} else if ((n4 > n1 && n4 > n2) && (n4 > n3 && n4 > n5)) {
			System.out.printf("%d\t Es el mayor\n", n4);

		} else if ((n5 > n1 && n5 > n2) && (n5 > n3 && n5 > n4)) {
			System.out.printf("%d\t Es el mayor\n", n5);
		}
		if ((n1 < n2 && n1 < n3) && (n1 < n4 && n1 < n5)) {
			System.out.printf("%d\t Es el menor", n1);

		} else if ((n2 < n1 && n2 < n3) && (n2 < n4 && n2 < n5)) {
			System.out.printf("%d\t Es el menor", n2);

		} else if ((n3 < n1 && n3 < n2) && (n3 < n4 && n3 < n5)) {
			System.out.printf("%d\t Es el menor\n", n3);

		} else if ((n4 < n1 && n4 < n2) && (n4 < n3 && n4 < n5)) {
			System.out.printf("%d\t Es el menor\n", n4);

		} else if ((n5 < n1 && n5 < n2) && (n5 < n3 && n5 < n4)) {
			System.out.printf("%d\t Es el menor\n", n5);
		}

	}

}
