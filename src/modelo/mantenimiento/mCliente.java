
package modelo.mantenimiento;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Ignacio
 */
public class mCliente {
    
    private int ID_cedula;
    private String Nombre_Cte;
    private String Apellidos_Cte;
    private String Direccion_Cte;
    private String Email_Cte;
    private int Telefono;
    String path;
    
    File cliente;
    FileWriter fw;
    FileReader fr;
    PrintWriter pw;
    BufferedReader br;
    StringTokenizer s;
    
    public mCliente()
    {
        cliente = new File("C:\\RentCarSystem\\database\\mantenimiento\\cliente.txt");
        path = cliente.getPath();
    }
    
    public boolean verificarID(String dato)
    {
        boolean isIt = false;
        if(cliente.length() != 0)
        {
            try{
                
                fr = new FileReader(cliente);
                br = new BufferedReader(fr);
                
                String linea;
                
                while((linea = br.readLine()) != null)
                {
                    s = new StringTokenizer(linea, ",");
                    
                    ID_cedula = Integer.valueOf(s.nextToken());
                    Nombre_Cte = s.nextToken();
                    Apellidos_Cte = s.nextToken();
                    Direccion_Cte = s.nextToken();
                    Email_Cte = s.nextToken();
                    Telefono = Integer.valueOf(s.nextToken());
                    
                    if(dato.equals(ID_cedula))
                    {
                        isIt = true;
                    }
                    
                }
                
                fr.close();
                
            }catch(IOException ioe)
            {
                ioe.printStackTrace();
            }
        }
        
        return isIt;
    }
    
    void crear()
    {
        
    }
    
}
