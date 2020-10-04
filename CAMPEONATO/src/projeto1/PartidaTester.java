/*
 * Matricula: 0050010425 Raphael Vieira
 * Matricula: 0050011100 David Bastos de Souza Tinoco
 * 
 * 
 */




package projeto1;

public class PartidaTester {

	public static void main(String[] args) {
		
		Flamengo flamengo=new Flamengo();
		Fluminense fluminense=new Fluminense();
		Vasco vasco=new Vasco();
		Botafogo botafogo=new Botafogo();
		
		Campeonato campeonato=new Campeonato();
		campeonato.resultadoPartida(flamengo, 5, vasco, 1);
		campeonato.resultadoPartida(flamengo, 5, fluminense, 2);
		campeonato.resultadoPartida(flamengo, 3, botafogo, 1);
		
		campeonato.resultadoPartida(vasco, 5, flamengo, 1);
		campeonato.resultadoPartida(vasco, 5, fluminense, 2);
		campeonato.resultadoPartida(vasco, 3, botafogo, 1);
		
		campeonato.resultadoPartida(fluminense, 5, vasco, 1);
		campeonato.resultadoPartida(fluminense, 5, flamengo, 2);
		campeonato.resultadoPartida(fluminense, 3, botafogo, 1);
		
		campeonato.resultadoPartida(botafogo, 5, vasco, 1);
		campeonato.resultadoPartida(botafogo, 5, fluminense, 2);
		campeonato.resultadoPartida(botafogo, 3, flamengo, 1);
		
		
				
		campeonato.listarRank(flamengo, fluminense, vasco, botafogo);
		
		
/*
		
				
				
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
*/	
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
