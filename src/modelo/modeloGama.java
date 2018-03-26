
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author Ignacio
 */
public class modeloGama {
    
    private int idGama = 0;
    private String descGama = "";
    private Double precioGama = 0.0;
    
    private File gama;
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private PrintWriter pw = null;
    
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
        
        try{
            
            fr = new FileReader(gama);
            br = new BufferedReader(fr);
            
            String linea;
            StringTokenizer s;
            
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, ",");
                
                idGama = Integer.valueOf(s.nextToken());
                descGama = s.nextToken();
                precioGama = Double.valueOf(s.nextToken());
                
                if(dato.equals(String.valueOf(idGama)))
                {
                    ver = true;
                }
                
            }
            
        }catch(IOException ioe){
            ver = false;
        }
        return ver;
    }
    
    
    
}
