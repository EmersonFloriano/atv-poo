package Q5;

public class Funcionario extends Pessoa {
	private double salario;

	public Funcionario(String nome, String cpf, String dt_nasc, double salario) {
		super(nome, cpf, dt_nasc);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
