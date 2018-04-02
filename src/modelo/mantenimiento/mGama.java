
package modelo.mantenimiento;

import java.io.*;
import java.util.StringTokenizer;
import java.awt.Color;
import vista.mantenimientos.formGama;
import vista.mantenimientos.formVehiculo;

/**
 *
 * @author Ignacio
 */
public class mGama {
    
    public File gama;
    public String path;
    
    private FileReader fr;
    private FileWriter fw;
    private BufferedReader br;
    private PrintWriter pw;
    
    public mGama()
    {
        gama = new File("C:\\RentCarSystem\\database\\mantenimiento\\gama.txt");
        path = gama.getPath();
    }
    
    public boolean add(String linea_A)
    {
        boolean ver;        
        try{
            
            fw = new FileWriter(gama, true);
            pw = new PrintWriter(fw);
            
            pw.println(linea_A);
            
            fw.close();
            
            ver = true;
            
        }catch(IOException ioe)
        {
            ver = false;
        }
        
        return ver;
    }
    
    public boolean verify(String dato)
    {
        
        boolean ver = false;
        try{
            
            fr = new FileReader(gama);
            br = new BufferedReader(fr);
            
            String linea;
            StringTokenizer s;
            
            while((linea = br.readLine()) != null)
            {
                if(gama.length() != 0)
                {
                    s = new StringTokenizer(linea, "_");
                    
                    if(dato.equals(s.nextToken()))
                    {
                        formGama.txtDescripcion.setText(s.nextToken());
                        formGama.txtPrecio.setText(s.nextToken());
                        ver = true;
                    }
                    
                }
            }
            
            fr.close();
            
        }catch(IOException ioe){
            ver = false;
        }
        
        return ver;
    }
    
    public boolean externVerify(String dato)
    {
        
        boolean ver = false;
        try{
            
            fr = new FileReader(gama);
            br = new BufferedReader(fr);
            
            String linea;
            StringTokenizer s;
            
            while((linea = br.readLine()) != null)
            {
                if(gama.length() != 0)
                {
                    s = new StringTokenizer(linea, "_");
                    
                    if(dato.equals(s.nextToken()))
                    {
                        formVehiculo.mensajes.setForeground(Color.blue);
                        formVehiculo.mensajes.setText("Tipo de Gama: "+s.nextToken()+" | Precio: RD$ "+s.nextToken());
                        ver = true;
                    }
                    
                }
            }
            
            fr.close();
            
        }catch(IOException ioe){
            ver = false;
        }
        
        return ver;
    }
    
}
