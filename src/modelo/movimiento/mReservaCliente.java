
package modelo.movimiento;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import vista.movimiento.*;

/**
 *
 * @author Ignacio
 */
public class mReservaCliente {
    
    public String path;
    private boolean its = false;
    
    protected File reservacliente;
    protected FileReader fr;
    protected FileWriter fw;
    protected BufferedReader br;
    protected PrintWriter pw;
    protected StringTokenizer s;
    protected Date frec = null;
    
    public mReservaCliente()
    {
        reservacliente = new File("C:\\RentCarSystem\\database\\movimiento\\reservacliente.txt");
        this.path = reservacliente.getPath();
    }
    
    public boolean verify(String ID)
    {
        if(reservacliente.length() != 0)
        {
            try{
                
                fr = new FileReader(reservacliente);
                br = new BufferedReader(fr);
                
                String linea, sa, en, id, tr;
                
                while((linea = br.readLine()) != null)
                {
                    s = new StringTokenizer(linea, "_");
                    id = s.nextToken();
                    if(ID.equals(id))
                    {
                        formReservaCliente.txtMatricula.setText(s.nextToken());
                        formReservaCliente.txtCliente.setText(s.nextToken());
                        tr = s.nextToken();
                        s.nextToken();
                        if(tr.equals("0")){
                            formReservaCliente.txtOferta.setSelectedItem(tr);
                        }
                        sa = s.nextToken();
                        formReservaCliente.dateSalida.setDate(setDate(sa));
                        en = s.nextToken();
                        formReservaCliente.dateEntrada.setDate(setDate(en));
                        formReservaCliente.txtObservacion.setText(s.nextToken());
                        formReservaCliente.getDiasReservas.setText(s.nextToken());
                        formReservaCliente.totalReservaSO.setText(s.nextToken());
                        formReservaCliente.linea_A = linea;
                        fr.close();
                        return (its = true);
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
    
    public boolean verify_Recepcion(String dato)
    {
        if(reservacliente.length() != 0){
            try{
                fr = new FileReader(reservacliente);
                br = new BufferedReader(fr);
                String linea, id, fe, m;
                while((linea = br.readLine()) != null){
                    s = new StringTokenizer(linea, "_");
                    id = s.nextToken();
                    if(dato.equals(id)){
                        m = s.nextToken();
                        formRecepcionVehiculo.getIDM.setText(m);
                        formRecepcionVehiculo.getIDC.setText(s.nextToken());
                        formRecepcionVehiculo.getIDO.setText(s.nextToken());
                        formRecepcionVehiculo.getFR.setText(s.nextToken());
                        formRecepcionVehiculo.getFS.setText(s.nextToken());
                        fe = s.nextToken();
                        formRecepcionVehiculo.getFE.setText(fe);  
                        formRecepcionVehiculo.dateRecepcion.setMinSelectableDate(setDate(fe));
                        formRecepcionVehiculo.getO.setText(s.nextToken());
                        formRecepcionVehiculo.getDR.setText(s.nextToken());
                        formRecepcionVehiculo.getP.setText(s.nextToken());
                        formRecepcionVehiculo.txtIDMatricula.setText(m);
                        formRecepcionVehiculo.txtIDMatricula.setEnabled(false);
                        fr.close();
                        return (its = true);
                    }
                }
                fr.close();
            }catch(IOException ioe)
            {
                
            }
        }
        
        return its;
    }
    
    Date setDate(String f)
    {
        SimpleDateFormat fm = new SimpleDateFormat("dd / MM / yyyy");
        try{
            frec = fm.parse(f);
        }catch(ParseException pe)
        {
            
        }
        return frec;
    }
    
    public boolean add(String linea_A)
    {
        
        try{
            
            fw = new FileWriter(reservacliente, true);
            pw = new PrintWriter(fw);
                       
            pw.println(linea_A);
            
            fw.close();
            
        }catch(IOException ioe)
        {
            its = false;
        }
        
        return its;
    }
}
