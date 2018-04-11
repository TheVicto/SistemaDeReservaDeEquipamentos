package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    
    public static Connection AbrirConexao(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/equipamentos";
            con = DriverManager.getConnection(url, "root", "");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "erro na conexao com o banco");
            e.getMessage();
        }
        return con;
    }
     
    public static void FechaConexao(Connection con){
        try{
            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
