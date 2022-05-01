package view;




import javax.swing.JOptionPane;

import controller.ContratEstagio;
import controller.ContratIntegral;
import controller.ContratTempoParcial;
import controller.ContratTemporario;
import controller.Contratacao;
import model.Funcionario;

public class RH {
	
	
public static void main(String[] args) {
	
	Contratacao cont1 = new ContratEstagio();	
	
	String letra = JOptionPane.showInputDialog("Escolha um tipo de contratação\\n E - Estágio\\n T - Temporario\\n TI - Tempo Integral\\n TP - Tempo Parcial");
	  
		switch (letra) {
		case "E":

			
		break;
		default:
			JOptionPane.showInputDialog("Escolha um tipo de contratação");
			break;
		}
		
		
	}

}



	
