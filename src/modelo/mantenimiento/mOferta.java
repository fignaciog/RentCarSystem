
package modelo.mantenimiento;

import java.io.*;
import java.util.StringTokenizer;
import vista.mantenimientos.formOfertas;
import vista.movimiento.formReservaCliente;

/**
 *
 * @author Ignacio
 */
public class mOferta {
    
    protected File Ofertas;
    protected FileReader fr;
    protected BufferedReader br;
    protected FileWriter fw;
    protected PrintWriter pw;
    protected StringTokenizer s;
    
    public String path;
    boolean its = false;
    
    public mOferta()
    {
        Ofertas = new File("C:\\RentCarSystem\\database\\mantenimiento\\ofertas.txt");
        path = Ofertas.getPath();
    }
    
    // Metodo para verificar si el ID oferta existe
    public boolean verify(String dato){
        if(Ofertas.length() != 0){
            try{
                fr = new FileReader(Ofertas);
                br = new BufferedReader(fr);
                String linea;
                while((linea = br.readLine()) != null){
                    s = new StringTokenizer(linea, "_");
                    if(dato.equals(s.nextToken())){
                        formOfertas.txtMatricula.setText(s.nextToken());
                        formOfertas.txtDescrip.setText(s.nextToken());
                        formOfertas.txtPorciento.setText(s.nextToken());
                        its = true;
                    }
                }
                fr.close();
            }catch(IOException ioe)
            {
                its = false;
            }
        }
        return its;
    }
    
    // Metodo para visualizar informacion en el fromulario de oferta
    public boolean verify_Reserva(String dato, int n){
        if(Ofertas.length() != 0){
            try{
                fr = new FileReader(Ofertas);
                br = new BufferedReader(fr);
                String linea, id;
                while((linea = br.readLine()) != null){
                    s = new StringTokenizer(linea, "_");
                    id = s.nextToken();
                    
                    switch(n){
                        case 1:
                            if(dato.equals(s.nextToken())){
                                formReservaCliente.txtOferta.addItem("-");
                                formReservaCliente.txtOferta.addItem(id);
                                its = true;
                            }
                            break;
                        case 2:
                            if(dato.equals(id)){
                                s.nextToken();
                                formReservaCliente.getOdesc.setText(s.nextToken());
                                s.nextToken();
                                formReservaCliente.getPrecioOferta.setText(s.nextToken());
                                its = true;
                            }
                            break;
                            default:
                            break;
                    }
                }
                fr.close();
            }catch(IOException ioe)
            {
                its = false;
            }
        }
        return its;
    }
    
    // Metodo para añadir nueva informacion
    public boolean add(String linea_A){
        try{
            fw = new FileWriter(Ofertas,true);
            pw = new PrintWriter(fw);
            pw.println(linea_A);
            fw.close();
            its = true;
        }catch(IOException ioe){
            its = false;
        }
        return its;
    }
}
