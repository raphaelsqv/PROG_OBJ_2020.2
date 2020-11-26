package AV2.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import AV2.bo.Racao;
import AV2.jdbc.*;

public class RacaoDAO {
	
	public void create(Racao racao)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into Racao(nome, tipo,  create_time ) values (?, ?,  CURRENT_TIMESTAMP )";
		
		try
		{
			stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setString(1, racao.getNome() ); //primeiro parametro da query
			stmt.setString(2, racao.getTipo());

			
			stmt.executeUpdate();
			System.out.println("[RacaoDAO] DOG incluido com sucesso");
			
			
		} catch (SQLException e)
		{
			System.out.println("Erro na tentativa de insercao: "+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
	}
   
	//READ ****************************************
	public List<Racao> read() {
		List<Racao> listaRacao = new ArrayList<Racao>();
		
		//ler 
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM db_aula_prog_java.Racao";
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Racao racao = new Racao();
				racao.setNome(rs.getString("nome"));
				racao.setTipo(rs.getString("tipo"));
				
				listaRacao.add(racao);
			}
			
			
		}catch(SQLException e)
		{
			System.out.println("<DAO> Erro lendo banco");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		
		return listaRacao;
	}

	
	// UPDATE *************************************
		public void update(Racao racao) {
			
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
				
		String sql = "update Racao set  nome = ?, tipo = ? ";
			
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
            preparedStatement.setString(1, racao.getNome());
            preparedStatement.setString(2, racao.getTipo());
     
        
            preparedStatement.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }	
			
	}
	// DELETE  *****************************
		
		public void delete(Racao racao){
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement stmt = null;
			
			
			String sql = "delete from Racao where nome = ?";
        
			try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
        	
            preparedStatement.setString(1, racao.getNome());
            preparedStatement.execute();
            
        }
			catch(SQLException e){
            e.printStackTrace();
        }
			
    }

		public void setNome(String text) {
			// TODO Auto-generated method stub
			
		}
		
	
}
