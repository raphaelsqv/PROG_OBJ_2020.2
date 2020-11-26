package AV2.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import AV2.bo.Cachorro;
import AV2.jdbc.*;

public class CachorroDAO {
	
	public void create(Cachorro cachorro)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into cachorro(nome, idade ) values (?, ?)";
		
		try
		{
			stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setString(1, cachorro.getNome() ); //primeiro parametro da query
			stmt.setString(2, cachorro.getIdade());

			
			stmt.executeUpdate();
			System.out.println("[CachorroDAO] DOG incluido com sucesso");
			
			
		} catch (SQLException e)
		{
			System.out.println("Erro na tentativa de insercao: "+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
	}
   
	//READ ****************************************
	public List<Cachorro> read() {
		List<Cachorro> listaCachorros = new ArrayList<Cachorro>();
		
		//ler 
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM db_aula_prog_java.Cachorro";
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Cachorro cachorro = new Cachorro();
				cachorro.setNome(rs.getString("nome"));
				cachorro.setIdade(rs.getString("idade"));
				
				listaCachorros.add(cachorro);
			}
			
			
		}catch(SQLException e)
		{
			System.out.println("<DAO> Erro lendo banco");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		
		return listaCachorros;
	}

	
	// UPDATE *************************************
		public void update(Cachorro cachorro) {
			
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
				
		String sql = "update Cachorro set  nome = ?, idade = ? ";
			
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
            preparedStatement.setString(1, cachorro.getNome());
            preparedStatement.setString(2, cachorro.getIdade());
     
        
            preparedStatement.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }	
			
	}
	// DELETE  *****************************
		
		public void delete(Cachorro cachorro){
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement stmt = null;
			
			
			String sql = "delete from Cachorro where nome = ?";
        
			try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
        	
            preparedStatement.setString(1, cachorro.getNome());
            preparedStatement.execute();
            
        }
			catch(SQLException e){
            e.printStackTrace();
        }
			
    }

		// METODOS
		
		public void setNome(String text) {
			
			
		}
		
		public void setIdade(String text) {
			// TODO Auto-generated method stub
			
		}
		
	
}
