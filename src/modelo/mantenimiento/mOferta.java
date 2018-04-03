
package modelo.mantenimiento;

import java.io.*;
import java.util.StringTokenizer;
import vista.mantenimientos.formOfertas;

/**
 *
 * @author Ignacio
 */
public class mOferta {
    
    File Ofertas;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;
    PrintWriter pw;
    StringTokenizer s;
    
    public String path;
    boolean its = false;
    
    public mOferta()
    {
        Ofertas = new File("C:\\RentCarSystem\\database\\mantenimiento\\ofertas.txt");
        path = Ofertas.getPath();
    }
    
    public boolean verify(String dato)
    {
        if(Ofertas.length() != 0)
        {
            try{
            
                fr = new FileReader(Ofertas);
                br = new BufferedReader(fr);

                String linea;

                while((linea = br.readLine()) != null)
                {
                    s = new StringTokenizer(linea, "_");
                    
                    if(dato.equals(s.nextToken()))
                    {
                        formOfertas.txtMatricula.setText(s.nextToken());
                        formOfertas.txtDescrip.setText(s.nextToken());
                        formOfertas.txtPrecio.setText(s.nextToken());
                        its = true;
                    }
                    
                }
                
                fr.close();

            }catch(IOException ioe)
            {

            }
        }
        return its;
    }
    
    public boolean add(String linea_A)
    {
        try{
            
            fw = new FileWriter(Ofertas,true);
            pw = new PrintWriter(fw);
            
            pw.println(linea_A);
            
            fw.close();
            
            its = true;
            
        }catch(IOException ioe){
            
        }
        
        return its;
    }
    
}
