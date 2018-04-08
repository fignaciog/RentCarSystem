
package modelo.consulta;

import java.io.*;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import vista.consultas.cliente.*;
import modelo.mantenimiento.mCliente;
import java.util.StringTokenizer;

/**
 *
 * @author Ignacio
 */
public class mcClientes extends mCliente{
    
    DefaultTableModel md = null;
    Object[] fila = null;
    mCliente mc = null;
    
    public mcClientes()
    {
        
    }
    
    void jTable()
    {
        md = (DefaultTableModel)vcCliente.vistaResultado.getModel();
        fila = new Object[6];
    }
    
    public boolean Cedula(String dato)
    {
        boolean its = false;
        mc = new mCliente();
        try{
            
            fr = new FileReader(cliente);
            br = new BufferedReader(fr);
            String linea, c;
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, "_");
                c = s.nextToken();
                if(dato.equals(c))
                {
                    vcID.getID.setText(c);
                    vcID.getN.setText(s.nextToken());
                    vcID.getA.setText(s.nextToken());
                    vcID.getD.setText(s.nextToken());
                    vcID.getC.setText(s.nextToken());
                    vcID.getT.setText(s.nextToken());
                    fr.close();
                    return (its = true);
                }
            }
            fr.close();
        }catch(IOException ioe)
        {
            
        }
        return its;
    }
    
    public void Nombre(String dato)
    {
        mc = new mCliente();
        jTable();
        try{
            fr = new FileReader(cliente);
            br = new BufferedReader(fr);
            String linea,c, n;
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, "_");
                
                c = s.nextToken();
                n = s.nextToken();
                if(n.toUpperCase().contains(dato.toUpperCase()))
                {
                    fila[0] = c;
                    fila[1] = n;
                    fila[2] = s.nextToken();
                    fila[3] = s.nextToken();
                    fila[4] = s.nextToken();
                    fila[5] = s.nextToken();
                    md.addRow(fila);                    
                }
            }
            fr.close();
        }catch(IOException ioe)
        {
            
        }
    }
    
    public void Apellidos(String dato)
    {
        jTable();
        mc = new mCliente();
        jTable();
        try{
            fr = new FileReader(cliente);
            br = new BufferedReader(fr);
            String linea, c, n, a;
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, "_");
                c = s.nextToken();
                n = s.nextToken();
                a = s.nextToken();
                if(dato.toUpperCase().trim().contains(a.toUpperCase().trim()))
                {
                    fila[0] = c;
                    fila[1] = n;
                    fila[2] = a;
                    fila[3] = s.nextToken();
                    fila[4] = s.nextToken();
                    fila[5] = s.nextToken();
                    md.addRow(fila);                    
                }
            }
            fr.close();
        }catch(IOException ioe)
        {
            
        }
    }
    
    public void Telefono(String dato)
    {
        mc = new mCliente();
        jTable();
        try{
            fr = new FileReader(cliente);
            br = new BufferedReader(fr);
            String linea, c, n, a, d, e, t, T;
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, "_");
                c = s.nextToken();
                n = s.nextToken();
                a = s.nextToken();
                d = s.nextToken();
                e = s.nextToken();
                t = s.nextToken();
                T = t.replace("-", "");
                System.out.println(T);
                if(t.contains(dato))
                {
                    fila[0] = c;
                    fila[1] = n;
                    fila[2] = a;
                    fila[3] = d;
                    fila[4] = e;
                    fila[5] = t;
                    md.addRow(fila);                    
                }
            }
            fr.close();
        }catch(IOException ioe)
        {
            
        }
        jTable();
    }
    
    public void clearTable()
    {
        jTable();
        for(int i = 0; i<vcCliente.vistaResultado.getRowCount();i++)
        {
            md.removeRow(i);
            i-=1;
        }
    }
    
}
