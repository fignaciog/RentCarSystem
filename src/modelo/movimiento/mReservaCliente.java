
package modelo.movimiento;

import java.io.*;
import java.util.StringTokenizer;

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
