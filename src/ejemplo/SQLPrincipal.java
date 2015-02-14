/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;
import java.sql.*;



/**
 *
 * @author EQUIPO
 */
public class SQLPrincipal {
    protected Connection conn;
    protected PreparedStatement consulta;
    protected ResultSet datos;
    
    public void conectar ()throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inven?zeroDateTimeBehavior=convertToNull","root","123456");
     };
    
    public void desconectar() throws SQLException{
        this.conn.close();
        this.consulta.close();
    };
    
    public void desconectar(ResultSet rs) throws SQLException{
        this.desconectar();
        rs.close();
    };
}
