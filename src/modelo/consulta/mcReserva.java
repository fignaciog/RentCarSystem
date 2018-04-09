
package modelo.consulta;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;
import modelo.movimiento.mReservaCliente;
import vista.consultas.reserva.vcReserva;

/**
 *
 * @author Ignacio
 */
public class mcReserva extends mReservaCliente {
    
    DefaultTableModel md = null;
    Object[] fila = null;
    mReservaCliente mrv = null;
    
    public mcReserva()
    {
        
    }
    
    public mcReserva(String Dato, int Metodo)
    {
        switch(Metodo)
        {
            case 0:
                diasReserva(Dato);
                break;
            case 1:
                fecha(Dato);
                break;
            default:
                break;
        }
    }
    
    void jTable()
    {
        md = (DefaultTableModel)vcReserva.vistaResultado.getModel();
        fila = new Object[10];
    }
    
    public final void diasReserva(String Dato)
    {
        mrv = new mReservaCliente();
        jTable();
        clearTable();
        
        if(reservacliente.length() != 0)
        {
            try{
                
                fr = new FileReader(reservacliente);
                br = new BufferedReader(fr);
                String linea, r, m, c, o, fR, fS, fE, O, dR, tR;
            
                while((linea = br.readLine()) != null)
                {
                    s = new StringTokenizer(linea, "_");
                    r = s.nextToken();
                    m = s.nextToken();
                    c = s.nextToken();
                    o = s.nextToken();
                    fR = s.nextToken();
                    fS = s.nextToken();
                    fE= s.nextToken();
                    O = s.nextToken();
                    dR = s.nextToken();
                    tR = s.nextToken();
                    if(dR.contains(Dato))
                    {
                        fila[0] = r;
                        fila[1] = m;
                        fila[2] = c;
                        fila[3] = o;
                        fila[4] = fR;
                        fila[5] = fS;
                        fila[6] = fE;
                        fila[7] = O;
                        fila[8] = dR;
                        fila[9] = tR;
                        md.addRow(fila);
                    }
                }
                fr.close();
            }catch(IOException ioe)
            {
                
            }
        }
    }
    
    public final void fecha(String Dato)
    {
        mrv = new mReservaCliente();
        jTable();
        clearTable();
        
        if(reservacliente.length() != 0)
        {
            try{
                
                fr = new FileReader(reservacliente);
                br = new BufferedReader(fr);
                String linea, r, m, c, o, fR, fS, fE, O, dR, tR;
            
                while((linea = br.readLine()) != null)
                {
                    s = new StringTokenizer(linea, "_");
                    r = s.nextToken();
                    m = s.nextToken();
                    c = s.nextToken();
                    o = s.nextToken();
                    fR = s.nextToken();
                    fS = s.nextToken();
                    fE= s.nextToken();
                    O = s.nextToken();
                    dR = s.nextToken();
                    tR = s.nextToken();
                    if(fR.equals(Dato))
                    {
                        fila[0] = r;
                        fila[1] = m;
                        fila[2] = c;
                        fila[3] = o;
                        fila[4] = fR;
                        fila[5] = fS;
                        fila[6] = fE;
                        fila[7] = O;
                        fila[8] = dR;
                        fila[9] = tR;
                        md.addRow(fila);
                    }
                }
                fr.close();
            }catch(IOException ioe)
            {
                
            }
        }
    }
    
    public void clearTable()
    {
        jTable();
        for(int i = 0; i<vcReserva.vistaResultado.getRowCount();i++)
        {
            md.removeRow(i);
            i-=1;
        }
    }
    
}
