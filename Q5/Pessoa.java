package Q5;

abstract public class Pessoa {

	private String nome;
	private String cpf;
	private String dt_nasc;

	public Pessoa(String nome, String cpf, String dt_nasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.dt_nasc = dt_nasc;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getDt_nasc() {
		return dt_nasc;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDt_nasc(String dt_nasc) {
		this.dt_nasc = dt_nasc;
	}
}
