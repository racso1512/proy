/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author EQUIPO
 */
public class servicio extends SQLPrincipal{

    /**
     *
     * @return 
     */
    public PreparedStatement Querys(String cs){
        try {
            this.conectar();
            consulta = this.conn.prepareStatement(cs);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
        }
    //Función para Consultar sobre la base de datos 
    public ResultSet Consultar(PreparedStatement ps) throws SQLException{
            this.datos = ps.executeQuery();
            return datos; 
    }
     //Función para Insertar Actualizar y Borrar 
   public void InsBorrElim(PreparedStatement ps) throws SQLException{
            ps.executeUpdate();
   }
   
}
        
       
        
      
       
        
    

