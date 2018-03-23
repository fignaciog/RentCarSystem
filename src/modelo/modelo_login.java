
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import principal.login;

/**
 *
 * @author Ignacio
 */
public class modelo_login {
    
    protected File login;
    protected login Main;
    
    public modelo_login()
    {
        
    }
    
    void abrir()
    {
        login = new File("C:\\ProjectsJava\\RentCarSystem\\src\\database\\login.txt");
    }
    
    public boolean verificarUser(String d)
    {
        abrir();
        FileReader fr = null;
        BufferedReader br = null;
        boolean v = false;
        
        String admin = ",0";
        
        try{
            
            fr = new FileReader(login);
            br = new BufferedReader(fr);
            
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                if(linea.contains(d))
                {
                    
                    v = true;
                    
                    if(linea.contains(admin))
                    {
                        Main.btnRegistrar.setEnabled(true);
                    }
                }
                
                
            }
            
            fr.close();
        }catch(IOException ioe){
            
            Main.msg.setText("Error de db");
        }
        
        return v;
    }
    
    public boolean verificarPass(String d)
    {
        abrir();
        FileReader fr = null;
        BufferedReader br = null;
        boolean v = false;
        
        try{
            
            fr = new FileReader(login);
            br = new BufferedReader(fr);
            
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                if(linea.contains(d))
                {
                    v = true;
                }
            }
            
            fr.close();
        }catch(IOException ioe){
            Main.msg.setText("Error de db");
        }
        
        return v;
    }
    
    
}
