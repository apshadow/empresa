package br.com.fiap.shift.empresa.model;

public class Empregado {

	private double salario;

	public Empregado() {
		super();
	}

	public Empregado(double salario) {
		super();
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado [salario=" + salario + "]";
	}

	public double getProventos() {
		return salario;

	}

}
