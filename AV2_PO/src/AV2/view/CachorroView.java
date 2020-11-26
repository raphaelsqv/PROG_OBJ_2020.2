/*

package AV2.view;

import java.util.Scanner;

import AV2.bo.Cachorro;
import AV2.controller.CachorroController;

public class CachorroView {

	
	
	public void create()
	{
		Scanner in = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		
		//ler os dados
		System.out.println("Entre com o nome do Cachorro:");
		cachorro.setNome(in.next());
		
		System.out.println("Entre a Idade:");
		cachorro.setIdade(in.next());
		
	//	System.out.println("Entre com a senha:");
	//	cachorro.setPassword(in.next());
		
		//passar aluno para o controller
		CachorroController controller = new CachorroController();
		controller.create(cachorro);

	}
	
	public void read()
	{
		CachorroController controller = new CachorroController();
		System.out.println("Listagem de Alunos");
		System.out.println("############################");
		for(Cachorro cachorro:controller.read())
		{
			System.out.println("Username: " + aluno.getUsername());
			System.out.println("Email: " + aluno.getEmail());
			System.out.println("-----------------------------------");
		}
		
	}
	
	private void update() {
		
		Scanner in = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		//ler os dados
		System.out.println("Entre com o nome do usuario para atualizar:");
		aluno.setUsername(in.next());
		
		
		System.out.println("Entre com o email novo :");
		aluno.setEmail(in.next());
		
		
		
		System.out.println("Entre com a senha nova:");
		aluno.setPassword(in.next());
		
		
		//passar aluno para o controller
		CachorroController controller = new CachorroController();
		controller.update(aluno);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

			AlunoView crud = new AlunoView();
			
			int continuar = 1;
			while(continuar !=0 )
			{
				System.out.println("Menu");
				System.out.println("-----");
				System.out.println("1 - create");
				System.out.println("2 - read");
				System.out.println("3 - update");
				System.out.println("4 - delete");
				System.out.println("0 - sair");
				
				Scanner in = new Scanner(System.in);
				continuar = in.nextInt();
				
				if(continuar ==1 ) crud.create();
				else if (continuar == 2) crud.read();
				else if (continuar == 3) crud.update();
				//crud.update();
				//crud.delete();
				
			}
			System.out.println("Fim de cadastro!");
			
		
		
		
		
	}

	

}



*/