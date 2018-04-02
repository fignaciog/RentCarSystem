
package modelo.mantenimiento;

import java.io.*;
import java.util.StringTokenizer;
import controlador.modificar;
import vista.mantenimientos.formGama;

/**
 *
 * @author Ignacio
 */
public class mGama {
    
    public int idGama = 0;
    public String descGama = "";
    public Double precioGama = 0.0;
    
    public File gama;
    
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private PrintWriter pw = null;
    
    modificar m = new modificar();
    
    public void abrir()
    {
        gama = new File("C:\\RentCarSystem\\database\\mantenimiento\\gama.txt");
    }
    
    public void setDatos(String idGama, String descGama, String precioGama)
    {
        this.idGama = Integer.valueOf(idGama);
        this.descGama = descGama;
        this.precioGama = Double.valueOf(precioGama);
    }
    
    public boolean crear()
    {
        boolean ver;
        abrir();
        
        try{
            
            fw = new FileWriter(gama, true);
            pw = new PrintWriter(fw);
            
            
            pw.write(idGama+","+descGama+","+precioGama);
            pw.write("\n");
            
            fw.close();
            ver = true;
            
        }catch(IOException ioe)
        {
            ver = false;
        }
        
        return ver;
    }
    
    public boolean verificarID(String dato)
    {
        
        boolean ver = false;
        abrir();
        
        try{
            
            fr = new FileReader(gama);
            br = new BufferedReader(fr);
            
            String linea;
            StringTokenizer s;
            
            while((linea = br.readLine()) != null)
            {
                if(gama.length() != 0)
                {
                    s = new StringTokenizer(linea, ",");
                    
                    if(dato.equals(String.valueOf(s.nextToken())))
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
    
}
