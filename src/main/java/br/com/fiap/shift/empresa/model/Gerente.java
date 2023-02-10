package br.com.fiap.shift.empresa.model;

public class Gerente extends Empregado {

	private double bonus;

	public Gerente() {
		super();
	}

	public Gerente(double salario, double bonus) {
		super(salario);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Gerente [bonus=" + bonus + ", " + super.toString() + "]";
	}

	@Override
	public double getProventos() {
		return super.getSalario() * (1 + (this.getBonus() / 100));

	}

}
