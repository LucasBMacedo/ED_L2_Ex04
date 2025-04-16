package view;

import javax.swing.JOptionPane;

import controller.FatorialDuplo;

public class Principal {

	public static void main(String[] args) {
		FatorialDuplo fd = new FatorialDuplo();
		int i = 1;
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número ímpar positivo."));
		while (n % 2 == 0 || n < 0) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Número ínvalido, insira um número ímpar positivo."));
		}
		JOptionPane.showMessageDialog(null, "O fatorial duplo de " + n + " é: " + fd.CalcularFatorialDuplo(n, i) + ".");
		}
	}