
package programadaniel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConectaBanco {
   public  Statement stm;
   public  ResultSet res;
   private final String drive = "com.mysql.jdbc.Driver";
   private final String caminho = "jdbc:mysql://localhost:3306/pecas";
   private final String usuario = "root"; 
   private final String senha = "vertrigo";
   public  Connection con;
   
    public void conexao (){
      
       try {
           System.setProperty("jdbc.Drivers", drive);
           con = DriverManager.getConnection(caminho, usuario, senha);
          //JOptionPane.showMessageDialog( null, "Conectado !");
       } catch (SQLException ex) {
           Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog( null, "Erro !" + ex.getMessage());
       }
   }
   
      public void executa (String sql){
        try {
            //int rs;
            stm = con.createStatement(res.TYPE_SCROLL_SENSITIVE, res.CONCUR_READ_ONLY);
            res = stm.executeQuery(sql);
          // int rs = stm.executeUpdate(sql);
            
            
           // JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException e) {
           // JOptionPane.showMessageDialog(null, "Erro no executaSQL!\nErro: " + e.getMessage());
        }   
       
   }
      
      public void desconcta (){
       try {
           con.close();
          //  JOptionPane.showMessageDialog( null, "Desconectado!");
       } catch (SQLException ex) {
           Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
          //  JOptionPane.showMessageDialog( null, "Erro ao desconectar!" + ex.getMessage());
       }
   }
      
      
      
      
}
