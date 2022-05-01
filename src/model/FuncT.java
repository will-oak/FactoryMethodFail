package model;

public class FuncT extends Funcionario {
	
	private int dia;
	private int mes;
	private int ano;
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return "FuncT [dia=" + dia + ",mes=" + mes + ",ano=" + ano + ", getId()=" + getId() + ", getNome()=" + getNome()
				+ ", getSalario()=" + getSalario() + "]";
	}

}
