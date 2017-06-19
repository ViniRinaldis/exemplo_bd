package application;

/**
 *
 * @author vini
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DatabaseConnection 
{
		private String url = "jdbc:mysql://localhost:3306/miniprojeto";
		private ResultSet rs;
		private Statement stm;
		private Connection conn;
		
		//constructor
		public DatabaseConnection()
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				conn = DriverManager.getConnection(url,"root","admin");
				
				stm = conn.createStatement();
			}
			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
			 catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public ResultSet getRs() {
			return rs;
		}
		public void setRs(ResultSet rs) {
			this.rs = rs;
		}
		public Statement getStm() {
			return stm;
		}
		public Connection getConn() {
			return conn;
		}
		public void setConn(Connection conn) {
			this.conn = conn;
		}
		public void setStm(Statement stm) {
			this.stm = stm;
		}

}