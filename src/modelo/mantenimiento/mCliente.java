
package modelo.mantenimiento;

import java.io.*;
import java.util.StringTokenizer;
import vista.mantenimientos.formCliente;

/**
 *
 * @author Ignacio
 */
public class mCliente {
    
    private String ID_cedula;
    private String Nombre_Cte;
    private String Apellidos_Cte;
    private String Direccion_Cte;
    private String Email_Cte;
    private String Telefono;
    public String path;
    
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
                    
                    ID_cedula = s.nextToken();
                    Nombre_Cte = s.nextToken();
                    Apellidos_Cte = s.nextToken();
                    Direccion_Cte = s.nextToken();
                    Email_Cte = s.nextToken();
                    Telefono = s.nextToken();
                    
                    if(dato.equals(ID_cedula))
                    {
                        formCliente.txtNombre.setText(Nombre_Cte);
                        formCliente.txtApellidos.setText(Apellidos_Cte);
                        formCliente.txtDireccion.setText(Direccion_Cte);
                        formCliente.txtEmail.setText(Email_Cte);
                        formCliente.txtTelefono.setText(Telefono);
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
    
    public boolean crear(String linea)
    {
        boolean its = false;
        try{
            
            fw = new FileWriter(cliente);
            pw = new PrintWriter(fw);
            
            pw.write(linea+"\n");
            
            fw.close();
            
            its = true;
            
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        return its;
    }
    
}
