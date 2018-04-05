
package modelo.movimiento;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import vista.movimiento.formRecepcionVehiculo;

/**
 *
 * @author Ignacio
 */
public class mReservaCliente {
    
    public String path;
    private boolean its = false;
    
    File reservacliente;
    FileReader fr;
    FileWriter fw;
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer s;
    Date frec = null;
    
    public mReservaCliente()
    {
        reservacliente = new File("C:\\RentCarSystem\\database\\movimiento\\reservacliente.txt");
        path = reservacliente.getPath();
    }
    
    public boolean verify(String ID)
    {
        if(reservacliente.length() != 0)
        {
            try{
                
                fr = new FileReader(reservacliente);
                br = new BufferedReader(fr);
                
                String linea;
                
                while((linea = br.readLine()) != null)
                {
                    s = new StringTokenizer(linea, "_");
                    if(ID.equals(s.nextToken()))
                    {
                        its = true;
                    }
                }
                
                fr.close();
                
            }catch(IOException ioe)
            {
                its = false;
            }
        }
        
        return its;
    }
    
    public boolean verifay_Recepcion(String dato)
    {
        
        if(reservacliente.length() != 0)
        {
            try{
                
                fr = new FileReader(reservacliente);
                br = new BufferedReader(fr);
                
                String linea, id, fe;
                
                while((linea = br.readLine()) != null)
                {
                    s = new StringTokenizer(linea, "_");
                    id = s.nextToken();
                    if(dato.equals(id))
                    {
                        formRecepcionVehiculo.getIDM.setText(id);
                        formRecepcionVehiculo.getIDC.setText(s.nextToken());
                        formRecepcionVehiculo.getIDO.setText(s.nextToken());
                        formRecepcionVehiculo.getFR.setText(s.nextToken());
                        formRecepcionVehiculo.getFS.setText(s.nextToken());
                        fe = s.nextToken();
                        formRecepcionVehiculo.getFE.setText(fe);  
                        formRecepcionVehiculo.dateRecepcion.setMinSelectableDate(setDate(fe));
                        formRecepcionVehiculo.getO.setText(s.nextToken());
                        formRecepcionVehiculo.getDR.setText(s.nextToken());
                        formRecepcionVehiculo.getP.setText(s.nextToken());
                        fr.close();
                        return (its = true);
                    }
                }
                fr.close();
            }catch(IOException ioe)
            {
                
            }
        }
        
        return its;
    }
    
    Date setDate(String f)
    {
        SimpleDateFormat fm = new SimpleDateFormat("dd / MM / yyyy");
        try{
            frec = fm.parse(f);
        }catch(ParseException pe)
        {
            
        }
        return frec;
    }
    
    public boolean add(String linea_A)
    {
        
        try{
            
            fw = new FileWriter(reservacliente, true);
            pw = new PrintWriter(fw);
                       
            pw.println(linea_A);
            
            fw.close();
            
        }catch(IOException ioe)
        {
            its = false;
        }
        
        return its;
    }
}
