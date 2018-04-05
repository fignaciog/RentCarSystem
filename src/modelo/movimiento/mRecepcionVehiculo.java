
package modelo.movimiento;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Ignacio
 */
public class mRecepcionVehiculo {
    
    boolean its = false;
    String path;
    
    File recepcionvehiculo;
    FileReader fr;
    FileWriter fw;
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer s;
    
    public mRecepcionVehiculo()
    {
        recepcionvehiculo = new File("C:\\RentCarSystem\\database\\movimiento\\recepcionvehiculo.txt");
        path = recepcionvehiculo.getPath();
    }
    
    public boolean verify(String dato)
    {
        try{
            if(recepcionvehiculo.length() != 0)
            {
                fr = new FileReader(recepcionvehiculo);
                br = new BufferedReader(fr);
                
                String linea;
                
                while((linea = br.readLine()) != null)
                {
                    s = new StringTokenizer(linea, "_");
                    if(dato.equals(s.nextToken()))
                    {
                        
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
            
            fw = new FileWriter(recepcionvehiculo);
            pw = new PrintWriter(fw);
            
            pw.println(linea_A);
            
            fw.close();
            its = true;
            
        }catch(IOException ioe)
        {
        }
        return its;
    }
    
}
