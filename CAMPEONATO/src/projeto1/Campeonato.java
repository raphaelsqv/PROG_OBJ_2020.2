/*
 * Matricula: 0050010425 Raphael Vieira
 * Matricula: 0050011100 David Bastos de Souza Tinoco
 * 
 * 
 */



package projeto1;

public class Campeonato {
	
	public void resultadoPartida( ITime time1,int gols1, ITime time2,int gols2)
	{
		if(gols1>gols2)
		{	
			time1.adicionarVitoria();
			time2.adicionarDerrota();
		
		}
		if(gols2>gols1)
		{
			time2.adicionarVitoria();
			time1.adicionarDerrota();
			
		}
		if(gols2==gols1)
		{
			time1.adicionarEmpate();
			time2.adicionarEmpate();
			
		}
}
	
	public void listarRank(ITime time1,ITime time2,ITime time3,ITime time4)
	{
		System.out.println("******************************************************");
		System.out.println("******Classificação campeonato Carioca****************");
		System.out.println("******************************************************");
		System.out.println("Pontos	  Nome   	Jogos  Empate  Vitória  Derrota");
		System.out.println(""+time1.totalPontos()+"         "+time1.printNomeTime()+"      "+time1.totaljogos()+"      "+time1.getEmpate()+"       "+time1.getVitoria()+"        "+time1.getDerrota());
		System.out.println(""+time2.totalPontos()+"         "+time2.printNomeTime()+"    "+time2.totaljogos()+"      "+time2.getEmpate()+"       "+time2.getVitoria()+"        "+time2.getDerrota());
		System.out.println(""+time3.totalPontos()+"         "+time3.printNomeTime()+"         "+time3.totaljogos()+"      "+time3.getEmpate()+"       "+time3.getVitoria()+"        "+time3.getDerrota());
		System.out.println(""+time4.totalPontos()+"         "+time4.printNomeTime()+"      "+time4.totaljogos()+"      "+time4.getEmpate()+"       "+time4.getVitoria()+"        "+time4.getDerrota());
		System.out.println("*******************************************************");
	}
	



}
