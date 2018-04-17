
package modelo.mantenimiento;

import java.io.*;
import vista.mantenimientos.formUsuario;
import java.util.StringTokenizer;

/**
 *
 * @author Ignacio
 */
public class mUsuario {
    
    public File login;
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private PrintWriter pw = null;
    
    public String path;
    
    private boolean its = false;
    
    public mUsuario()
    {
        login = new File("C:\\RentCarSystem\\database\\mantenimiento\\usuario.txt");
        if(login.length() == 0)
        {
            root();
        }
        this.path = login.getPath();
    }
    

// Usuario Nuevo ============================================================================
    public boolean add(String linea_A)
    {
        try{
            
            fw = new FileWriter(login, true);
            pw = new PrintWriter(fw);
            
            pw.println(linea_A);
            
            fw.close();
            
            its = true;
            
        }catch(IOException ioe)
        {
            its = false;
        }
        return its;
    }

    final void root(){
    
        try{
            
            fw = new FileWriter(login);
            pw = new PrintWriter(fw);
            
            pw.println("administrator"+"_"+"123456"+"_"+0+"_"+"root"+"_"+
                    "user root"+"_"+"RentCarSystem@email.com");
            
            fw.close();
            
        }catch(IOException ioe)
        {
            
        }
        
    }

// Varificar Usuario ============================================================================
    public boolean verify(String dato)
    {
        try{
            
            fr = new FileReader(login);
            br = new BufferedReader(fr);
            
            StringTokenizer s;
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea,"_");
                if(dato.equals(s.nextToken()))
                {
                    formUsuario.txtPass.setText(s.nextToken());
                    formUsuario.sAcceso.setSelectedIndex(Integer.valueOf(s.nextToken()));
                    formUsuario.txtNombre.setText(s.nextToken());
                    formUsuario.txtApellidos.setText(s.nextToken());
                    formUsuario.txtEmail.setText(s.nextToken());
                    its = true;
                }
                
            }
            
            fr.close();
            
        }catch(IOException ioe){
            //Main.msg.setText("Error de db");
        }
        return its;
    }  

// Verificar Usuario ============================================================================
    public boolean verify_User(String d)
    {
        try{
            
            fr = new FileReader(login);
            br = new BufferedReader(fr);
            
            StringTokenizer s;
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea,"_");
                if(d.equals(s.nextToken()))
                {
                    its = true;
                }
            }
            
            fr.close();
            
        }catch(IOException ioe)
        {
            
        }
        return its;
    }  

// Verificar Password ============================================================================
    public boolean verify_Pass(String Login_User, String Login_Pass)
    {
        try{
            
            fr = new FileReader(login);
            br = new BufferedReader(fr);
            
            StringTokenizer s;
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea,"_");
                if(Login_User.equals(s.nextToken()))
                {
                    if(Login_Pass.equals(s.nextToken()))
                    {
                       fr.close();
                       return (its = true); 
                    }
                }
                
            }
            fr.close();
        }catch(IOException ioe){
            //Main.msg.setText("Error de db");
        }
        return its;
    }

// Verificar Acceso ============================================================================
     public String verify_Acceso(String u, String p)
    {
        String set = "";
        try{
            
            fr = new FileReader(login);
            br = new BufferedReader(fr);
            
            StringTokenizer s;
            String linea;
            
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea,"_");
                if(u.equals(s.nextElement()) && p.equals(s.nextElement()))
                {
                    set = String.valueOf(s.nextElement());
                }
                
            }
            
            fr.close();
            
        }catch(IOException ioe){
            //Main.msg.setText("Error de db");
        }
        return set;
    }
     
     
    
}
