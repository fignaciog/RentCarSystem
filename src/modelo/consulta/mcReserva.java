
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
    
    void jTable()
    {
        md = (DefaultTableModel)vcReserva.vistaResultado.getModel();
        fila = new Object[10];
    }
    
    public final void metodoConsulta(String Dato, int n)
    {
        mrv = new mReservaCliente();
        clearTable();
        jTable();
        if(reservacliente.length() != 0)
        {
            try{
                
                fr = new FileReader(reservacliente);
                br = new BufferedReader(fr);
                String linea, r, m, c, o, fR, fS, fE, O, dR, tR;
            
                while((linea = br.readLine()) != null){
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
                    
                    switch(n){
                        case 0:
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
                            break;
                        case 1:
                            if(dR.contains(Dato)){
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
                            break;
                        case 2:
                            if(fR.contains(Dato)){
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
                            break;
                        case 3:
                            if(fS.contains(Dato)){
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
                            break;
                        case 4:
                            if(fE.contains(Dato)){
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
                            break;
                        default:
                            break;
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
