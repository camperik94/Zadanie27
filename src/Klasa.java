
public class Klasa {
	private String wyrazenie;

	public String getWyrazenie() {
		return wyrazenie;
	}

	public void setWyrazenie(String wyrazenie) {
		this.wyrazenie = wyrazenie;
	}

	public Klasa(String wyrazenie) {
		this.wyrazenie = wyrazenie;
	}
	
	public void funkcja() {
		int licznik = 0;
		for(int i = 0; i < wyrazenie.length(); i++) {
			if(wyrazenie.charAt(i) == '(' || wyrazenie.charAt(i) == ')') {
				licznik++;
			}
		}
		if(licznik % 2 == 0) {
			System.out.println("Wyrazenie jest poprawne");
		}else {
			System.out.println("Blad");
		}
	}
}
