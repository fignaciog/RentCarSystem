
package modelo.consulta;

import java.io.*;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;
import modelo.movimiento.mRecepcionVehiculo;
import vista.consultas.recepcion.vcRecepcion;
/**
 *
 * @author Ignacio
 */
public class mcRecepcion extends mRecepcionVehiculo{
    
    mRecepcionVehiculo mr = null;
    DefaultTableModel md = null;
    Object[] fila = null;
    
    /*
    ID Recepcion
    ID Reserva
    ID Matricula
    fecha Recepcion
    Observacion
    */
    
    public mcRecepcion()
    {
        
    }
    
    void jTable()
    {
        md = (DefaultTableModel)vcRecepcion.vistaResultado.getModel();
        fila = new Object[5];
    }
    
    public void fecha(String Dato)
    {
        mr = new mRecepcionVehiculo();
        jTable();
        clearTable();
        
        if(recepcionvehiculo.length() != 0)
        {
            try{
                
                fr = new FileReader(recepcionvehiculo);
                br = new BufferedReader(fr);
                
                String linea, idr, idre, idm, fe;
                
                while((linea = br.readLine()) != null)
                {
                    s = new StringTokenizer(linea, "_");
                    idr = s.nextToken();
                    idre = s.nextToken();
                    idm = s.nextToken();
                    fe = s.nextToken();
                    if(fe.equals(Dato))
                    {
                        fila[0] = idr;
                        fila[1] = idre;
                        fila[2] = idm;
                        fila[3] = fe;
                        fila[4] = s.nextToken();
                        md.addRow(fila);
                    }
                }
                
            }catch(IOException ioe)
            {
                
            }
        }
    }
    
    public void clearTable()
    {
        jTable();
        for(int i = 0; i<vcRecepcion.vistaResultado.getRowCount();i++)
        {
            md.removeRow(i);
            i-=1;
        }
    }
}
