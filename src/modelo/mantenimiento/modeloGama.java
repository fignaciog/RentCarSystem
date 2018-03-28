
package modelo.mantenimiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import controlador.modificar;

/**
 *
 * @author Ignacio
 */
public class modeloGama {
    
    public int idGama = 0;
    public String descGama = "";
    public Double precioGama = 0.0;
    
    private File gama;
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private PrintWriter pw = null;
    modificar m = new modificar();
    public String oldLinea = "";
    
    void abrir()
    {
        gama = new File("C:\\ProjectsJava\\RentCarSystem\\src\\database\\gama.txt");
    }
    
    public void setDatos(String idGama, String descGama, String precioGama)
    {
        this.idGama = Integer.valueOf(idGama);
        this.descGama = descGama;
        this.precioGama = Double.valueOf(precioGama);
    }
    
    public boolean crear(){
        
        boolean ver;
        
        abrir();
        
        try{
            
            fw = new FileWriter(gama, true);
            pw = new PrintWriter(fw);
            
            pw.write("\n");
            pw.write(idGama+","+descGama+","+precioGama);
            
            fw.close();
            ver = true;
            
        }catch(IOException ioe)
        {
            ver = false;
        }
        
        return ver;
    }
    
    public boolean verificarID(String dato){
        
        boolean ver = false;
        abrir();
        String d;
        int i;
        double p;
        
        try{
            
            fr = new FileReader(gama);
            br = new BufferedReader(fr);
            
            String linea;
            StringTokenizer s;
            
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, ",");
                
                i = Integer.valueOf(s.nextToken());
                d = s.nextToken();
                p = Double.valueOf(s.nextToken());
                
                if(dato.equals(String.valueOf(i)))
                {
                    idGama = i;
                    descGama = d;
                    precioGama = p;
                    ver = true;
                    oldLinea = idGama+","+descGama+","+precioGama;
                }
                
            }
            
        }catch(IOException ioe){
            ver = false;
        }
        return ver;
    }
    
    public void getDatos(String l)
    {
        abrir();
        m.setFile(gama.getPath());
        m.editar(oldLinea, l);
        //m.reset();
    }
    
    
    
}
