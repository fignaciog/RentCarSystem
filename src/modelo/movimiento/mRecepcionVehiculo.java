
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
public class mRecepcionVehiculo {
    
    boolean its = false;
    public String path;
    
    File recepcionvehiculo;
    FileReader fr;
    FileWriter fw;
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer s;
    SimpleDateFormat sf = new SimpleDateFormat("dd / MM / yyyy");
    Date fechar;
    
    public mRecepcionVehiculo()
    {
        recepcionvehiculo = new File("C:\\RentCarSystem\\database\\movimiento\\recepcionvehiculo.txt");
        this.path = recepcionvehiculo.getPath();
    }
    
    public boolean verify(String dato)
    {
        try{
            if(recepcionvehiculo.length() != 0)
            {
                fr = new FileReader(recepcionvehiculo);
                br = new BufferedReader(fr);
                
                String linea, d;
                
                while((linea = br.readLine()) != null)
                {
                    s = new StringTokenizer(linea, "_");
                    if(dato.equals(s.nextToken()))
                    {
                        formRecepcionVehiculo.txtIDReserva.setText(s.nextToken());
                        formRecepcionVehiculo.txtIDMatricula.setText(s.nextToken());
                        d = s.nextToken();
                        formRecepcionVehiculo.dateRecepcion.setDate(setDate(d));
                        formRecepcionVehiculo.dateRecepcion.setMinSelectableDate(setDate(d));
                        formRecepcionVehiculo.txtOb.setText(s.nextToken());
                        fr.close();
                        return (its = true);
                    }
                }
                fr.close();
            }
        }catch(IOException ioe)
        {
            
        }
        return its;
    }
    
    public boolean add(String linea_A)
    {
        try{
            
            fw = new FileWriter(recepcionvehiculo,true);
            pw = new PrintWriter(fw);
            
            pw.println(linea_A);
            
            fw.close();
            its = true;
            
        }catch(IOException ioe)
        {
        }
        return its;
    }
    
    Date setDate(String f)
    {
        try{
            fechar = sf.parse(f);
        }catch(ParseException p)
        {
            
        }
        return fechar;
    }
    
}
