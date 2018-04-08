    
package controlador;

import java.io.*;

/**
 *
 * @author Ignacio
 */
public class modificar {
    
    public File file_A;
    public File file_B;
    private String path_A;
    private String linea_A, linea_B;
    private boolean its = false;
    
    FileReader fr;
    FileWriter fw;
    BufferedReader br;
    PrintWriter pw;
    
    public modificar()
    {
        
    }
    
    public modificar(String linea_A, String linea_B, String path_A)
    {
        this.linea_A = linea_A;
        this.linea_B = linea_B;
        this.path_A = path_A;
        
        file_A = new File(path_A);
        file_B = new File(path_A+"_");
    }
    
    public modificar(String path_A)
    {
        this.path_A = path_A;
        file_A = new File(path_A);
        file_B = new File(path_A+"_");
    }
    
    void escribir(String linea)
    {
        try{
            
            fw = new FileWriter(file_B, true);
            pw = new PrintWriter(fw);
            
            pw.println(linea);
            
            fw.close();
            
        }catch(IOException ioe){
            //ioe.printStackTrace();
        }
    }
    
    public void editar()
    {
        try{
            
            fr = new FileReader(file_A);
            br = new BufferedReader(fr);
            
            String linea_file;
            
            while((linea_file = br.readLine()) != null)
            {
                if(linea_file.equals(linea_A))
                {
                    escribir(linea_B);
                }else{
                    escribir(linea_file);
                }
            }
            fr.close();            
        }catch(IOException ioe){
            //ioe.printStackTrace();
        }
    }
    
    public void editar(String Linea_A)
    {
        try{
            
            fr = new FileReader(file_A);
            br = new BufferedReader(fr);
            
            String linea_file;
            
            while((linea_file = br.readLine()) != null)
            {
                if(!linea_file.equals(linea_A))
                {
                    escribir(linea_file);
                }
            }
            fr.close();            
        }catch(IOException ioe){
            //ioe.printStackTrace();
        }
    }
    
    public boolean reenombrar()
    {
        boolean set = false;
        //System.out.println(file_A.getPath());
        if(file_A.exists())
        {
            file_A.delete();
            set = true;
        }
        file_B.renameTo(file_A = new File(path_A));
        return set;
    }
    
    public boolean change_status(String linea_A, int tipe)
    {
        this.linea_A = linea_A;
        if(tipe == 0)
        {
            linea_B = linea_A.replaceFirst("Disponible", "Rentado");
            if(linea_B.contains("Rentado"))
            {
                its = true;
            }
        }else if(tipe == 1)
        {
            linea_B = linea_A.replaceFirst("Rentado", "Disponible");
            if(linea_B.contains("Disponible"))
            {
                its = true;
            }
        }
        
        return its;
    }
    
}
