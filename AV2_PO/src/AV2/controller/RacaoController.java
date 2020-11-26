package AV2.controller;

import java.util.ArrayList;
import java.util.List;

import AV2.bo.Racao;
import AV2.model.RacaoDAO;

public class RacaoController {
	
	// CREATE
	public void create(Racao racao)
	{
		RacaoDAO model = new RacaoDAO();
		model.create(racao);
	}
		
		public List<Racao> read() {
		List<Racao> listaDeRacao= new ArrayList<Racao>();
		
		try
		{
			RacaoDAO model = new RacaoDAO();
			
			listaDeRacao = model.read();
			
		}catch(Exception e)
		{
			System.out.println("<Controller> Erro ao tentar ler Racao!");
		}

		return listaDeRacao;
	}
		
		public void update(Racao racao) {
		
		RacaoDAO model = new RacaoDAO();
		
		model.update(racao);
		
	}
		
		public void delete(Racao racao) {
		
		RacaoDAO model = new RacaoDAO();
		
		model.delete(racao);
                        }
	
}
