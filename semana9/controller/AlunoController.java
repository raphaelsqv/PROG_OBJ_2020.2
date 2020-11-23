package semana9.controller;

import java.util.ArrayList;
import java.util.List;

import semana9.bo.Aluno;
import semana9.model.AlunoDAO;

public class AlunoController {
	
	// CREATE
	public void create(Aluno aluno)
	{
		AlunoDAO model = new AlunoDAO();
		model.create(aluno);
	}
	
	// READ
	public List<Aluno> read() {
		List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
		
		try
		{
			AlunoDAO model = new AlunoDAO();
			
			listaDeAlunos = model.read();
			
		}catch(Exception e)
		{
			System.out.println("<Controller> Erro ao tentar ler alunos!");
		}

		return listaDeAlunos;
	}

	
	// UPDATE
	public void update(Aluno aluno) {
		
		AlunoDAO model = new AlunoDAO();
		
		model.update(aluno);
		
	}
	
	//DELETE
public void delete(Aluno aluno) {
		
		AlunoDAO model = new AlunoDAO();
		
		model.delete(aluno);
                        }
	
}
