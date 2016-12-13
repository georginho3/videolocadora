/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videolocadora;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class ModuloConexao {
    //metodo respnsavel por estabelecer a conexão com o BD
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        //chamando o drive
        String driver = "com.mysql.jdbc.Driver";
        
        //armazenando informações do banco
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";
        
        //estabelecendo a conexão
        try {
            Class.forName(driver);
            conexao =DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(conexao);
            return null;
        }
        
        
    }
}
