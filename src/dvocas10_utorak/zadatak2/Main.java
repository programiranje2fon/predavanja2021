package dvocas10_utorak.zadatak2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Imenik im = new Imenik();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("Dobrodosli u imenik");
			System.out.println("-------------------");
			System.out.println("Ponudjene opcije:");
			System.out.println("1) Unos osobe u imenik");
			System.out.println("2) Pretraga imenika");
			System.out.println("3) Ispis celog imenika");
			System.out.println("4) Izlaz iz programa");
			System.out.println("-------------------");
			System.out.print("Unesite opciju: ");
			int opcija = sc.nextInt();

			if (opcija == 1)
				im.ucitajOsobu();
			if (opcija == 2)
				im.pronadjiOsobu();
			if (opcija == 3)
				im.ispisi();
			if (opcija == 4)
				return;
		}

	}

}
