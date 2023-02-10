package br.com.fiap.shift.empresa;

import br.com.fiap.shift.empresa.model.*;

public class App {

	public static void main(String[] args) {

		var e = new Empregado(10000);

		var g = new Gerente(10000, 10);

		System.out.println(e);
		System.out.println("Proventos do Empregado: " + e.getProventos());
		System.out.println(g);
		System.out.println("Proventos do Gerente " + g.getProventos());

		g.setBonus(20);

		System.out.println(g);
		System.out.println("Proventos do Gerente " + g.getProventos());

	}

}
