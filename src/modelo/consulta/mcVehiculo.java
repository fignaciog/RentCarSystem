
package modelo.consulta;

import java.io.*;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;
import modelo.mantenimiento.mVehiculo;
import vista.consultas.vehiculo.vcVehiculo;

/**
 *
 * @author Ignacio
 */
public final class mcVehiculo extends mVehiculo {
    
    DefaultTableModel md = null;
    Object[] fila = null;
    mVehiculo mv = null;
    
    String Dato;
    
    public mcVehiculo()
    {
        
    }
    
    public mcVehiculo(String Dato, int Metodo)
    {
        this.Dato = Dato;
        switch(Metodo)
        {
            case 0:
                tipoVehiculo(Dato);
                break;
            case 1:
                Color(Dato);
                break;
            case 2:
                tipoTrans(Dato);
                break;
            case 3:
                tipoEstado(Dato);
                break;
            case 4:
                Gama(Dato);
                break;
            case 5:
                Marca(Dato);
                break;
            case 6:
                break;
            default:
                break;
        }
    }
    
    void jTable()
    {
        md = (DefaultTableModel)vcVehiculo.vistaResultado.getModel();
        fila = new Object[13];
    }
    
    public void total_Vehiculo()
    {
        mv = new mVehiculo();
        jTable();
        clearTable();
        try{
            fr = new FileReader(vehiculos);
            br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, "_");
                fila[0] = s.nextToken();
                fila[1] = s.nextToken();
                fila[2] = s.nextToken();
                fila[3] = s.nextToken();
                fila[4] = s.nextToken();
                fila[5] = s.nextToken();
                fila[6] = s.nextToken();
                fila[7] = s.nextToken();
                fila[8] = s.nextToken();
                fila[9] = s.nextToken();
                fila[10] = s.nextToken();
                fila[11] = s.nextToken();
                fila[12] = s.nextToken();
                md.addRow(fila);
            }
            fr.close();
        }catch(IOException ioe){
        }
    }
    
    public final void tipoVehiculo(String Dato)
    {
        mv = new mVehiculo();
        jTable();
        clearTable();
        try{
            fr = new FileReader(vehiculos);
            br = new BufferedReader(fr);
            String linea, M, ma, m, g, tv;
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, "_");
                M = s.nextToken();
                ma = s.nextToken();
                m = s.nextToken();
                g = s.nextToken();
                tv = s.nextToken();
                if(tv.toUpperCase().equals(Dato.toUpperCase()))
                {
                    fila[0] = M;
                    fila[1] = ma;
                    fila[2] = m;
                    fila[3] = g;
                    fila[4] = tv;
                    fila[5] = s.nextToken();
                    fila[6] = s.nextToken();
                    fila[7] = s.nextToken();
                    fila[8] = s.nextToken();
                    fila[9] = s.nextToken();
                    fila[10] = s.nextToken();
                    fila[11] = s.nextToken();
                    fila[12] = s.nextToken();
                    md.addRow(fila);
                }
            }
            fr.close();
        }catch(IOException ioe){
            
        }
    }
    
    public final void Color(String Dato)
    {
        mv = new mVehiculo();
        jTable();
        clearTable();
        try{
            fr = new FileReader(vehiculos);
            br = new BufferedReader(fr);
            String linea, M, ma, m, g, tv, tm, tt, d, t, i, a, c;
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, "_");
                M = s.nextToken();
                ma = s.nextToken();
                m = s.nextToken();
                g = s.nextToken();
                tv = s.nextToken();
                tm = s.nextToken();
                tt = s.nextToken();
                d = s.nextToken();
                t = s.nextToken();
                a = s.nextToken();
                c = s.nextToken();
                i = s.nextToken();
                //System.out.println(linea);
                if(c.toUpperCase().equals(Dato.toUpperCase()))
                {
                    fila[0] = M;
                    fila[1] = ma;
                    fila[2] = m;
                    fila[3] = g;
                    fila[4] = tv;
                    fila[5] = tm;
                    fila[6] = tt;
                    fila[7] = d;
                    fila[8] = t;
                    fila[9] = a;
                    fila[10] = c;
                    fila[11] = i;
                    fila[12] = s.nextToken();
                    md.addRow(fila);
                }
            }
            fr.close();
        }catch(IOException ioe){
            
        }
    }
    
    public final void tipoTrans(String Dato)
    {
        mv = new mVehiculo();
        jTable();
        clearTable();
        try{
            fr = new FileReader(vehiculos);
            br = new BufferedReader(fr);
            String linea, M, ma, m, g, tv, tm, tt, d, t, i, a, c;
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, "_");
                M = s.nextToken();
                ma = s.nextToken();
                m = s.nextToken();
                g = s.nextToken();
                tv = s.nextToken();
                tm = s.nextToken();
                tt = s.nextToken();
                d = s.nextToken();
                t = s.nextToken();
                a = s.nextToken();
                c = s.nextToken();
                i = s.nextToken();
                if(tt.toUpperCase().equals(Dato.toUpperCase()))
                {
                    fila[0] = M;
                    fila[1] = ma;
                    fila[2] = m;
                    fila[3] = g;
                    fila[4] = tv;
                    fila[5] = tm;
                    fila[6] = tt;
                    fila[7] = d;
                    fila[8] = t;
                    fila[9] = a;
                    fila[10] = c;
                    fila[11] = i;
                    fila[12] = s.nextToken();
                    md.addRow(fila);
                }
            }
            fr.close();
        }catch(IOException ioe){
        }
    }
    
    public final void tipoEstado(String Dato)
    {
        mv = new mVehiculo();
        jTable();
        clearTable();
        try{
            fr = new FileReader(vehiculos);
            br = new BufferedReader(fr);
            String linea, M, ma, m, g, tv, tm, tt, d, t, i, a, c, e;
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, "_");
                M = s.nextToken();
                ma = s.nextToken();
                m = s.nextToken();
                g = s.nextToken();
                tv = s.nextToken();
                tm = s.nextToken();
                tt = s.nextToken();
                d = s.nextToken();
                t = s.nextToken();
                a = s.nextToken();
                c = s.nextToken();
                i = s.nextToken();
                e = s.nextToken();
                if(e.equals(Dato))
                {
                    fila[0] = M;
                    fila[1] = ma;
                    fila[2] = m;
                    fila[3] = g;
                    fila[4] = tv;
                    fila[5] = tm;
                    fila[6] = tt;
                    fila[7] = d;
                    fila[8] = t;
                    fila[9] = a;
                    fila[10] = c;
                    fila[11] = i;
                    fila[12] = e;
                    md.addRow(fila);
                }
            }
            fr.close();
        }catch(IOException ioe){
        }
    }
        
    public final void Gama(String Dato)
    {
        mv = new mVehiculo();
        jTable();
        clearTable();
        try{
            fr = new FileReader(vehiculos);
            br = new BufferedReader(fr);
            String linea, M, ma, m, g, tv, tm, tt, d, t, i, a, c, e;
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, "_");
                M = s.nextToken();
                ma = s.nextToken();
                m = s.nextToken();
                g = s.nextToken();
                tv = s.nextToken();
                tm = s.nextToken();
                tt = s.nextToken();
                d = s.nextToken();
                t = s.nextToken();
                a = s.nextToken();
                c = s.nextToken();
                i = s.nextToken();
                e = s.nextToken();
                if(g.toUpperCase().equals(Dato.toUpperCase()))
                {
                    fila[0] = M;
                    fila[1] = ma;
                    fila[2] = m;
                    fila[3] = g;
                    fila[4] = tv;
                    fila[5] = tm;
                    fila[6] = tt;
                    fila[7] = d;
                    fila[8] = t;
                    fila[9] = a;
                    fila[10] = c;
                    fila[11] = i;
                    fila[12] = e;
                    md.addRow(fila);
                }
            }
            fr.close();
        }catch(IOException ioe){
        }
    }
    
    public final void Marca(String Dato)
    {
        mv = new mVehiculo();
        jTable();
        clearTable();
        try{
            fr = new FileReader(vehiculos);
            br = new BufferedReader(fr);
            String linea, M, ma, m, g, tv, tm, tt, d, t, i, a, c, e;
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, "_");
                M = s.nextToken();
                ma = s.nextToken();
                m = s.nextToken();
                g = s.nextToken();
                tv = s.nextToken();
                tm = s.nextToken();
                tt = s.nextToken();
                d = s.nextToken();
                t = s.nextToken();
                a = s.nextToken();
                c = s.nextToken();
                i = s.nextToken();
                e = s.nextToken();
                if(ma.toUpperCase().equals(Dato.toUpperCase()))
                {
                    fila[0] = M;
                    fila[1] = ma;
                    fila[2] = m;
                    fila[3] = g;
                    fila[4] = tv;
                    fila[5] = tm;
                    fila[6] = tt;
                    fila[7] = d;
                    fila[8] = t;
                    fila[9] = a;
                    fila[10] = c;
                    fila[11] = i;
                    fila[12] = e;
                    md.addRow(fila);
                }
            }
            fr.close();
        }catch(IOException ioe){
        }
    }
    
    public void clearTable()
    {
        jTable();
        for(int i = 0; i<vcVehiculo.vistaResultado.getRowCount();i++)
        {
            md.removeRow(i);
            i-=1;
        }
    }
    
}
