package Controller;
import java.sql.*;
public class insert {
	public static void inserer(testJs.Livre li) {
		try {
			   DbConn.connecter();
			   String requete =String.format("INSERT IGNORE INTO book (`titre`,`auteur`,`isbn`,`qt`,`prix`) VALUES ('%s','%s','%s','%d','%.0f')",li.getTitre(),li.getAuteur(),li.getIsbn(),li.getQt(),(double)li.getPrice());
			   Statement stmt = DbConn.con.createStatement();
			   int resultats = stmt.executeUpdate(requete);
			   System.out.println(requete);
			   DbConn.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
		}
	}
}
