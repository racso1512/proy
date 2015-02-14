/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;



/**
 *
 * @author EQUIPO
 */
public class Ejemplo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){   
        interfaz.archivos.PrinciPAL ejemplo;
        ejemplo = new interfaz.archivos.PrinciPAL();
        
        ejemplo.setExtendedState(ejemplo.MAXIMIZED_BOTH); 
        ejemplo.setVisible(true);
    }
    
}
