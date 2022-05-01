package model;

public class FuncTP extends Funcionario  {

	private int horaEntrada;
	private int horaSaida;
	public int getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public int getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}
	
	@Override
	public String toString() {
		return "FuncTP[horaEntrada="+ horaEntrada + ",horaSaida="+horaSaida+",getId()=" + getId() + ", getNome()=" + 
	            getNome() +", getSalario()=" + getSalario() + "]";
	}
	
}
