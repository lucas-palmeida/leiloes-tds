import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    public Connection connectDB(){
        String url = "jdbc:mysql://127.0.0.1:3306/uc11";
        String user = "root";
        String password = "senha123";
        
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados: " + e.getMessage());
            return null;
        }
    }
}
