package AV2.controller;

import java.util.ArrayList;
import java.util.List;

import AV2.bo.Cachorro;
import AV2.model.CachorroDAO;

public class CachorroController {
	
	// CREATE
	public void create(Cachorro cachorro)
	{
		CachorroDAO model = new CachorroDAO();
		model.create(cachorro);
	}
		
		public List<Cachorro> read() {
		List<Cachorro> listaDeCachorros = new ArrayList<Cachorro>();
		
		try
		{
			CachorroDAO model = new CachorroDAO();
			
			listaDeCachorros = model.read();
			
		}catch(Exception e)
		{
			System.out.println("<Controller> Erro ao tentar ler alunos!");
		}

		return listaDeCachorros;
	}
		
		public void update(Cachorro cachorro) {
		
		CachorroDAO model = new CachorroDAO();
		
		model.update(cachorro);
		
	}
		
		public void delete(Cachorro cachorro) {
		
		CachorroDAO model = new CachorroDAO();
		
		model.delete(cachorro);
                        }
	
}
