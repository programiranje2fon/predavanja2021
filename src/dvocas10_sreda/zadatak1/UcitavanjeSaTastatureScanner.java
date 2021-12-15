package dvocas10_sreda.zadatak1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UcitavanjeSaTastatureScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ucitaj string:");
		String nekiString = scanner.nextLine();
		System.out.println("Ucitai string:" + nekiString);

		try {
			System.out.print("Ucitaj ceo broj:");
			int ceoBroj = scanner.nextInt();
			System.out.println("Ucitani ceo broj:" + ceoBroj);

			System.out.print("Ucitaj decimalni broj:");
			double decimalniBroj = scanner.nextDouble();
			System.out.println("Ucitani dec broj:" + decimalniBroj);
		} catch (InputMismatchException ex) {
			System.out.println("Pogresan format unosa!");
		}

	}

}
