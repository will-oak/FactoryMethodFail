package model;

public class FuncTI extends Funcionario {
	
	private int bancoHoras;

	public int getBancoHoras() {
		return bancoHoras;
	}

	public void setBancoHoras(int bancoHoras) {
		this.bancoHoras = bancoHoras;
	}
	
	@Override
	public String toString() {
		return "FuncTI [bancoHoras=" + bancoHoras + ", getId()=" + getId() + ", getNome()=" + getNome()
				+ ", getSalario()=" + getSalario() + "]";
	}

}
