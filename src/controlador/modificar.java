
package controlador;

import java.io.*;

/**
 *
 * @author Ignacio
 */
public class modificar {
    
    private File file;
    private File auxfile;
    
    FileReader fr = null;
    FileWriter fw = null;
    BufferedReader br = null;
    PrintWriter pw = null;
    String ruta;
    
    public modificar(){
        
    }
    
    public void setFile(String file)
    {
        ruta = file;
        this.file = new File(file);
        this.auxfile = new File (file);
    }
    
    void escribir(String linea)
    {
        try{
            
            fw = new FileWriter(auxfile, true);
            pw = new PrintWriter(fw);
            
            pw.print("\n");
            pw.print(linea);
            
            fw.close();
            
        }catch(IOException ioe){
            
        }
    }
    
    public void editar(String linea, String nlinea)
    {
        try{
            
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            String Linea;
            
            while((Linea = br.readLine()) != null)
            {
                if(Linea.equals(linea))
                {
                    escribir(nlinea);
                }else{
                    escribir(Linea);
                }
            }
            
            fr.close();
            
        }catch(IOException ioe){
            
        }
    }
    
    public void reset()
    {
        if(file.exists())
        {
            file.delete();
        }
        auxfile.renameTo(file = new File(ruta));
    }
    
}
