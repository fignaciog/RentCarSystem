
package modelo.consulta;

import java.io.*;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;
import modelo.mantenimiento.mVehiculo;
import vista.consultas.vehiculo.vccVehiculo;

/**
 *
 * @author Ignacio
 */
public class mcVehiculo extends mVehiculo {
    
    DefaultTableModel md = null;
    Object[] fila = null;
    mVehiculo mv = null;
    
    public mcVehiculo()
    {
        
    }
    
    void jTable()
    {
        md = (DefaultTableModel)vccVehiculo.vistaResultado.getModel();
        fila = new Object[13];
    }
    
    public void tipoVehiculo(String Dato)
    {
        mv = new mVehiculo();
        jTable();
        try{
            fr = new FileReader(vehiculos);
            br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, "_");
                
            }
            fr.close();
        }catch(IOException ioe){
            
        }
    }
    
}
