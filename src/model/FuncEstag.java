package model;

public class FuncEstag extends Funcionario  {
	private String instParceira;

    
	
	public String getInstParceira() {
		return instParceira;
	}



	public void setInstParceira(String instParceira) {
		this.instParceira = instParceira;
	}



	@Override
	public String toString() {
		return "FuncEstag [instParceira=" + instParceira + ",getId()=" + getId() + ", getNome()=" + 
	            getNome() +", getSalario()=" + getSalario() + ", getTipoFunc()=" + getTipoFunc() + "]";
	}

}
