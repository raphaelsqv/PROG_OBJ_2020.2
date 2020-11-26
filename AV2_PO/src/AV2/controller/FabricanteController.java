package AV2.controller;

import java.util.ArrayList;
import java.util.List;

import AV2.bo.Fabricante;
import AV2.model.FabricanteDAO;

public class FabricanteController {
	
	// CREATE
	public void create(Fabricante fabricante)
	{
		FabricanteDAO model = new FabricanteDAO();
		model.create(fabricante);
	}
		
		public List<Fabricante> read() {
		List<Fabricante> listaDeFabricante= new ArrayList<Fabricante>();
		
		try
		{
			FabricanteDAO model = new FabricanteDAO();
			
			listaDeFabricante = model.read();
			
		}catch(Exception e)
		{
			System.out.println("<Controller> Erro ao tentar ler Fabricante!");
		}

		return listaDeFabricante;
	}
		
		public void update(Fabricante fabricante) {
		
		FabricanteDAO model = new FabricanteDAO();
		
		model.update(fabricante);
		
	}
		
		public void delete(Fabricante fabricante) {
		
		FabricanteDAO model = new FabricanteDAO();
		
		model.delete(fabricante);
                        }
	
}
