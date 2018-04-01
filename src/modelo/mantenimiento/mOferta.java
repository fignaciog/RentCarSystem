
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
    
    String id_Ofertas;
    String id_Matricula;
    String Descripcion_Ofertas;
    String Precio_Oferta;
    
    public mOferta()
    {
        Ofertas = new File("C:\\RentCarSystem\\database\\mantenimiento\\ofertas.txt");
        path = Ofertas.getPath();
    }
    
    public boolean verificar(String dato)
    {
        if(Ofertas.length() != 0)
        {
            try{
            
                fr = new FileReader(Ofertas);
                br = new BufferedReader(fr);

                String linea;

                while((linea = br.readLine()) != null)
                {
                    s = new StringTokenizer(linea, ",");
                    
                    id_Ofertas = s.nextToken();
                    id_Matricula = s.nextToken();
                    Descripcion_Ofertas = s.nextToken();
                    Precio_Oferta = s.nextToken();
                    
                    if(dato.equals(id_Ofertas))
                    {
                        formOfertas.txtMatricula.setText(id_Matricula);
                        formOfertas.txtDescrip.setText(Descripcion_Ofertas);
                        formOfertas.txtPrecio.setText(Precio_Oferta);
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
    
    public boolean crear(String linea_A)
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
