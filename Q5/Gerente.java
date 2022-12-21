package Q5;

class Gerente extends Funcionario {
	

	private String departamento;

	public Gerente(String nome, String cpf, String dt_nasc, double salario, String departamento) {
		super(nome, cpf, dt_nasc, salario);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public double getSalario() {
		return super.getSalario() + 1500;
	}
}
