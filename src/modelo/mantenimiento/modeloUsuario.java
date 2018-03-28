
package modelo.mantenimiento;

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
public class modeloUsuario {
    
    private String i = "", u = "", p = "", n = "", no = "", a = "", e = "", salida = "";
    private File login;
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private PrintWriter pw = null;
    
    public modeloUsuario()
    {
        
    }
    
    void abrir()
    {
        login = new File("C:\\ProjectsJava\\RentCarSystem\\src\\database\\mantenimiento\\usuario.txt");
    }
    
    public boolean Crear(String i, String u, String p, int n, String no, String a, String e)
    {
        abrir();
        boolean intro = true;
        
        try{
            
            fw = new FileWriter(login, true);
            pw = new PrintWriter(fw);
            
            pw.write("\n");
            pw.write(i+","+u+","+p+","+n+","+no+","+a+","+e);
            
            fw.close();
            
        }catch(IOException ioe)
        {
            intro = false;
        }
        return intro;
    }
    
    public String verificarID(String d)
    {
        abrir();
        
        try{
            
            fr = new FileReader(login);
            br = new BufferedReader(fr);
            
            StringTokenizer s;
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea,",");
                
                i = s.nextToken();
                u = s.nextToken();
                p = s.nextToken();
                n = s.nextToken();
                no = s.nextToken();
                a = s.nextToken();
                e = s.nextToken();
                
                if(d.equals(i.trim()))
                {
                    salida = i.trim();
                }
                
            }
            
            fr.close();
            
        }catch(IOException ioe){
            //Main.msg.setText("Error de db");
        }
        return salida;
    }  
    
    public String verificarUser(String d)
    {
        abrir();
        
        try{
            
            fr = new FileReader(login);
            br = new BufferedReader(fr);
            
            StringTokenizer s;
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea,",");
                
                i = s.nextToken();
                u = s.nextToken();
                p = s.nextToken();
                n = s.nextToken();
                no = s.nextToken();
                a = s.nextToken();
                e = s.nextToken();
                
                if(d.equals(u.trim()))
                {
                    salida = u.trim();
                }
                
            }
            
            fr.close();
            
        }catch(IOException ioe){
            //Main.msg.setText("Error de db");
        }
        return salida;
    }  
    
    public String verificarPass(String d)
    {
        abrir();
        
        try{
            
            fr = new FileReader(login);
            br = new BufferedReader(fr);
            
            StringTokenizer s;
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea,",");
                
                i = s.nextToken();
                u = s.nextToken();
                p = s.nextToken();
                n = s.nextToken();
                no = s.nextToken();
                a = s.nextToken();
                e = s.nextToken();
                
                if(d.equals(p.trim()))
                {
                    salida = p.trim();
                }
                
            }
            
            fr.close();
            
        }catch(IOException ioe){
            //Main.msg.setText("Error de db");
        }
        return salida;
    }
    
     public String verificarAcceso(String u, String p)
    {
        abrir();
        
        try{
            
            fr = new FileReader(login);
            br = new BufferedReader(fr);
            
            StringTokenizer s;
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea,",");
                
                i = s.nextToken();
                this.u = s.nextToken();
                this.p = s.nextToken();
                n = s.nextToken();
                no = s.nextToken();
                a = s.nextToken();
                e = s.nextToken();
                
                if(u.equals(this.u.trim()) && p.equals(this.p))
                {
                    salida = this.n.trim();
                }
                
            }
            
            fr.close();
            
        }catch(IOException ioe){
            //Main.msg.setText("Error de db");
        }
        return salida;
    }
     
     
    
}
