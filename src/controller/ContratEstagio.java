package controller;

import javax.swing.JOptionPane;

import model.FuncEstag;
import model.Funcionario;

public class ContratEstagio extends Contratacao {
	
	public Funcionario funcionariosContrat(Funcionario p) {
		if (p.getTipoFunc() == "E") {
						
			FuncEstag estagio = new FuncEstag();
			int id = (int)((Math.random() * 1001) + 1000);
			estagio.setId(id);
			estagio.setNome(JOptionPane.showInputDialog(""));
			estagio.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Digite um salario")));
			estagio.setInstParceira("");
			System.out.println(estagio.toString());
			return estagio;
			
		}
		return null;
	}

}


