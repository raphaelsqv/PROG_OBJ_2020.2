package AV2.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import AV2.bo.Fabricante;
import AV2.jdbc.*;

public class FabricanteDAO {
	
	public void create(Fabricante fabricante)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into Fabricante(nome, cnpj,  create_time ) values (?, ?,  CURRENT_TIMESTAMP )";
		
		try
		{
			stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setString(1, fabricante.getNome() ); //primeiro parametro da query
			stmt.setString(2, fabricante.getCnpj());

			
			stmt.executeUpdate();
			System.out.println("[FabricanteDAO] FAB incluido com sucesso");
			
			
		} catch (SQLException e)
		{
			System.out.println("Erro na tentativa de insercao: "+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
	}
   
	//READ ****************************************
	public List<Fabricante> read() {
		List<Fabricante> listaFabricante = new ArrayList<Fabricante>();
		
		//ler 
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM db_aula_prog_java.Fabricante";
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Fabricante fabricante = new Fabricante();
				fabricante.setNome(rs.getString("nome"));
				fabricante.setCnpj(rs.getString("cnpj"));
				
				listaFabricante.add(fabricante);
			}
			
			
		}catch(SQLException e)
		{
			System.out.println("<DAO> Erro lendo banco");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		
		return listaFabricante;
	}

	
	// UPDATE *************************************
		public void update(Fabricante fabricante) {
			
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
				
		String sql = "update Fabricante set  nome = ?, Cnpj = ? ";
			
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
            preparedStatement.setString(1, fabricante.getNome());
            preparedStatement.setString(2, fabricante.getCnpj());
     
        
            preparedStatement.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }	
			
	}
	// DELETE  *****************************
		
		public void delete(Fabricante fabricante){
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement stmt = null;
			
			
			String sql = "delete from Fabricante where cnpj = ?";
        
			try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
        	
				
				// VOLTAR E OLHAR
            preparedStatement.setString(2, fabricante.getCnpj());
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
