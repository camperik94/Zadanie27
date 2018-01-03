import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Podaj wyrazenie do sprawdzenia");
		
		String wyrazenie = in.nextLine();
		
		Klasa kla = new Klasa(wyrazenie);
		
		kla.funkcja();
	}
}
