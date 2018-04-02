
package modelo.mantenimiento;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Ignacio
 */
public class mVehiculo {
    
    boolean its = false;
    public String path;
    
    File vehiculos;
    FileReader fr;
    FileWriter fw;
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer s ;
    
    public mVehiculo()
    {
        vehiculos = new File("C:\\RentCarSystem\\database\\mantenimiento\\vehiculos.txt");
        path = vehiculos.getPath();
    }
    
    public boolean check(String dato)
    {
        if(vehiculos.length() != 0)
        {
            try{
                
                fr = new FileReader(vehiculos);
                br = new BufferedReader(fr);
                
                String linea;
                
                while((linea = br.readLine()) != null)
                {
                    
                    s = new StringTokenizer(linea, ",");
                    
                    if(dato.equals(s.nextToken()))
                    {
                        its = true;
                    }
                    
                }
                
                fr.close();
                
            }catch(IOException ioe)
            {
                
            }
        }
        return its;
    }
    
    public boolean add(String linea_A)
    {
        
        return its;
    }
    
    
}
