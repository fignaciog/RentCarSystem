
package modelo.consulta;

import java.io.*;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;
import modelo.mantenimiento.mOferta;
import vista.consultas.vcOfertas;

/**
 *
 * @author Ignacio
 */
public class mcOfertas extends mOferta {
    
    DefaultTableModel md = null;
    Object[] fila = null;
    mOferta mo = null;
    
    public mcOfertas()
    {
        
    }
    
    void jTable()
    {
        md = (DefaultTableModel)vcOfertas.vistaResultado.getModel();
        fila = new Object[4];
    }
    
    public void Ofertas(){
        mo = new mOferta();
        jTable();
        clearTable();
        if(Ofertas.length() != 0)
        {
            try{
                fr = new FileReader(Ofertas);
                br = new BufferedReader(fr);
                String linea;
                while((linea = br.readLine()) != null)
                {
                    s = new StringTokenizer(linea, "_");
                    fila[0] = s.nextToken();
                    fila[1] = s.nextToken();
                    fila[2] = s.nextToken();
                    fila[3] = s.nextToken();
                    md.addRow(fila);
                }
                fr.close();
            }catch(IOException ioe){
                
            }
        }
    }
    
    public void clearTable()
    {
        jTable();
        for(int i = 0; i<vcOfertas.vistaResultado.getRowCount();i++)
        {
            md.removeRow(i);
            i-=1;
        }
    }
    
}
