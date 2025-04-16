package controller;

public class FatorialDuplo {

	public FatorialDuplo() {
		super ();
	}
	public int CalcularFatorialDuplo(int n, int i) {
		if (i == n) {
			return i;
		}
		return i * CalcularFatorialDuplo(n, i + 2);
	}
}