/*
 * Matricula: 0050010425 Raphael Vieira
 * Matricula: 0050011100 David Bastos de Souza Tinoco
 * 
 * 
 */

package projeto1;

public class Botafogo extends TimeDeFutebol implements ITime {
	private String nome;
	private int qtdVitoria;
	private int qtdEmpate;
	private int qtdDerrota;
	private int totalj;
	private int totalp;
	
	public Botafogo() {
		nome="Botafogo";
	}
	
public String getNome() {
		
		return nome;
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	
	}
	public int getQtdVitoria() {
		return qtdVitoria;
		
	}
	public void setQtdVitoria(int qtdVitoria) {
		this.qtdVitoria = qtdVitoria;
	}
	public int getQtdEmpate() {
		return qtdEmpate;
	}
	public void setQtdEmpate(int qtdEmpate) {
		this.qtdEmpate = qtdEmpate;
	}
	public int getQtdDerrota() {
		return qtdDerrota;
	}
	public void setQtdDerrota(int qtdDerrota) {
		this.qtdDerrota = qtdDerrota;
	}
	@Override
	public String printNomeTime() {
		return nome;
		
	}
	@Override
	public int adicionarVitoria() {
		
		return qtdVitoria=+qtdVitoria+1;
		
	}
	@Override
	public int adicionarEmpate() {
		return qtdEmpate=qtdEmpate +1;
	}
	@Override
	public int adicionarDerrota() {
		return qtdDerrota=+qtdDerrota+1;
		
	}
	@Override
	public int totalPontos() {
		// TODO Auto-generated method stub
		totalp=qtdEmpate+(qtdVitoria*3);
		return totalp;
	}
	@Override
	public int getVitoria() {
		// TODO Auto-generated method stub
		return qtdVitoria;
	}
	@Override
	public int getDerrota() {
		// TODO Auto-generated method stub
		return qtdDerrota;
	}
	@Override
	public int getEmpate() {
		// TODO Auto-generated method stub
		return qtdEmpate;
	}

	@Override
	public int totaljogos() {
		totalj=qtdDerrota+qtdEmpate+qtdVitoria;
		return totalj;
	}

	
	
	
}
