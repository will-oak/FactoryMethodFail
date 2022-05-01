package model;

public abstract class Funcionario {

	private int id;
	private String nome;
	private double salario;
	private String tipoFunc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getTipoFunc() {
		return tipoFunc;
	}

	public void setTipoFunc(String tipoFunc) {
		this.tipoFunc = tipoFunc;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", salario =" + salario + ", tipoFunc =" + tipoFunc + "]";
	}
	
}
