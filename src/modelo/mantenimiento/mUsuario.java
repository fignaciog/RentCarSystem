
package modelo.mantenimiento;

import java.io.*;
import vista.mantenimientos.formUsuario;
import java.util.StringTokenizer;

/**
 *
 * @author Ignacio
 */
public class mUsuario {
    
    private String i = "", u = "", p = "", no = "", a = "", e = "", salida = "";
    private int n;
    public File login;
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private PrintWriter pw = null;
    
    private boolean its = false;
    
    public mUsuario()
    {
        login = new File("C:\\RentCarSystem\\database\\mantenimiento\\usuario.txt");
        if(login.length() == 0)
        {
            admin();
        }
    }
    
    public void abrir()
    {
        login = new File("C:\\RentCarSystem\\database\\mantenimiento\\usuario.txt");
    }

// Usuario Nuevo ============================================================================
    public boolean Crear(String linea_A)
    {
        abrir();
        boolean intro = true;
        
        try{
            
            fw = new FileWriter(login, true);
            pw = new PrintWriter(fw);
            
            pw.println(linea_A);
            
            fw.close();
            
        }catch(IOException ioe)
        {
            intro = false;
        }
        return intro;
    }
    
    
    final void admin(){
    
        try{
            
            fw = new FileWriter(login, true);
            pw = new PrintWriter(fw);
            
            
            pw.write(0+","+"administrator"+","+"123456"+","+0+","+"root"+","+"user root"+","+"RentCarSystem@email.com");
            pw.write("\n");
            
            fw.close();
            
        }catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        
    }

// Varificar ID ============================================================================
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
                n = Integer.valueOf(s.nextToken());
                no = s.nextToken();
                a = s.nextToken();
                e = s.nextToken();
                
                if(d.equals(i.trim()))
                {
                    formUsuario.txtUser.setText(u);
                    formUsuario.txtPass.setText(p);
                    if(n == 0)
                    {
                        formUsuario.admin.setSelected(true);
                    }else if(n == 1)
                    {
                        formUsuario.user.setSelected(true);
                    }
                    formUsuario.txtNombre.setText(no);
                    formUsuario.txtApellidos.setText(a);
                    formUsuario.txtEmail.setText(e);
                    
                    salida = i.trim();
                }
                
            }
            
            fr.close();
            
        }catch(IOException ioe){
            //Main.msg.setText("Error de db");
        }
        return salida;
    }  

// Verificar Usuario ============================================================================
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
                n = Integer.valueOf(s.nextToken());
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

// Verificar Password ============================================================================
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
                n = Integer.valueOf(s.nextToken());
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

// Verificar Acceso ============================================================================
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
                n = Integer.valueOf(s.nextToken());
                no = s.nextToken();
                a = s.nextToken();
                e = s.nextToken();
                
                if(u.equals(this.u.trim()) && p.equals(this.p.trim()))
                {
                    salida = String.valueOf(this.n);
                }
                
            }
            
            fr.close();
            
        }catch(IOException ioe){
            //Main.msg.setText("Error de db");
        }
        return salida;
    }
     
     
    
}
