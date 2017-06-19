package application;

import application.ListaDeCompras;
import application.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vini
 */
public class ListaDeComprasDao 
{
    private DatabaseConnection conn;
    private ResultSet rs;
    
    public ListaDeComprasDao(){
        conn = new DatabaseConnection();
    }
    
    public List<ListaDeCompras> listarListaDeCompras(){
        List<ListaDeCompras> lista = new ArrayList<ListaDeCompras>();
        String query = "SELECT * FROM lista_de_compras";
        
        try{
            rs = conn.getStm().executeQuery(query);
            
            while(rs.next()){
               ListaDeCompras lstcomp = new ListaDeCompras();
               lstcomp.setNome_produto(rs.getString("nome_produto"));
               lstcomp.setQuantidade(rs.getInt("quantidade"));
               lstcomp.setId(rs.getInt("id"));
               lista.add(lstcomp);
            }
            return lista;
        }catch(Exception e){
        }
    return null;
    }
    public boolean insertListaDeCompras(String nome, int quantidade){
    String sql = "INSERT INTO lista_de_compras(nome_produto, quantidade) values (?, ?)";
		try {
			@SuppressWarnings("static-access")
			PreparedStatement ps = conn.getConn().prepareStatement(sql,conn.getStm().RETURN_GENERATED_KEYS);
			ps.setString(1, nome);
                        ps.setInt(2,quantidade);
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			if(rs.next())
			{
                            return true;
			}else
			{
				System.out.println("não retornou nada");
			}
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
    }
}