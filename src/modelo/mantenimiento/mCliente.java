
package modelo.mantenimiento;

import java.io.*;
import java.util.StringTokenizer;
import vista.mantenimientos.formCliente;
import vista.movimiento.formReservaCliente;

/**
 *
 * @author Ignacio
 */
public class mCliente {
    
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
    
    public boolean verify(String dato)
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
                    s = new StringTokenizer(linea, "_");
                    if(dato.equals(s.nextToken()))
                    {
                        formCliente.txtNombre.setText(s.nextToken());
                        formCliente.txtApellidos.setText(s.nextToken());
                        formCliente.txtDireccion.setText(s.nextToken());
                        formCliente.txtEmail.setText(s.nextToken());
                        formCliente.txtTelefono.setText(s.nextToken());
                        isIt = true;
                    }
                    
                }
                
                fr.close();
                
            }catch(IOException ioe)
            {
                
            }
        }
        
        return isIt;
    }
    
    public boolean verify_Reserva(String dato)
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
                    s = new StringTokenizer(linea, "_");
                    if(dato.equals(s.nextToken()))
                    {
                        formReservaCliente.getFullname.setText(s.nextToken()+" "+s.nextToken());
                        formReservaCliente.getDirec.setText(s.nextToken());
                        s.nextToken();
                        formReservaCliente.getPhone.setText(s.nextToken());
                        
                        isIt = true;
                    }
                    
                }
                
                fr.close();
                
            }catch(IOException ioe)
            {
                
            }
        }
        
        return isIt;
    }
    
    public boolean add(String linea_A)
    {
        boolean its = false;
        try{
            
            fw = new FileWriter(cliente, true);
            pw = new PrintWriter(fw);
            
            pw.println(linea_A);
            
            fw.close();
            
            its = true;
            
        }catch(IOException ioe){
            
        }
        return its;
    }
    
}
