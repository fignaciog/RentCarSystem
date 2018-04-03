
package modelo.mantenimiento;

import java.io.*;
import java.util.StringTokenizer;
import vista.mantenimientos.formVehiculo;
import vista.mantenimientos.formOfertas;
import vista.movimiento.formReservaCliente;

/**
 *
 * @author Ignacio
 */
public class mVehiculo {
    
    boolean its = false;
    public String path;
    
    File vehiculos;
    FileReader fr;
    FileWriter fw;
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer s ;
    
    public mVehiculo()
    {
        vehiculos = new File("C:\\RentCarSystem\\database\\mantenimiento\\vehiculos.txt");
        path = vehiculos.getPath();
    }
    
    public boolean verify(String dato)
    {
        if(vehiculos.length() != 0)
        {
            try{
                
                fr = new FileReader(vehiculos);
                br = new BufferedReader(fr);
                
                String linea;
                
                while((linea = br.readLine()) != null)
                {
                    
                    s = new StringTokenizer(linea, "_");
                    
                    if(dato.equals(s.nextToken()))
                    {
                        formVehiculo.txtMarca.setText(s.nextToken());
                        formVehiculo.txtModelo.setText(s.nextToken());
                        formVehiculo.txtGama.setText(s.nextToken());
                        formVehiculo.sTipoVehiculo.setSelectedItem(s.nextToken());
                        formVehiculo.sTipoMotor.setSelectedItem(s.nextToken());
                        formVehiculo.sTipoTrans.setSelectedItem(s.nextToken());
                        formVehiculo.txtDescrip.setText(s.nextToken());
                        formVehiculo.sTecho.setSelectedItem(s.nextToken());
                        formVehiculo.sAire.setSelectedItem(s.nextToken());
                        formVehiculo.txtColor.setText(s.nextToken());
                        formVehiculo.sInterior.setSelectedItem(s.nextToken());
                        formVehiculo.sEstado.setSelectedItem(s.nextToken());
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
    
    public boolean verify_Oferta(String dato)
    {
        if(vehiculos.length() != 0)
        {
            try{
                
                fr = new FileReader(vehiculos);
                br = new BufferedReader(fr);
                
                String linea;
                
                while((linea = br.readLine()) != null)
                {
                    
                    s = new StringTokenizer(linea, "_");
                    
                    if(dato.equals(s.nextToken()))
                    {
                        formOfertas.estados.setText("Marca: "+s.nextToken()+" | Modelo: "
                        +s.nextToken()+" | Gama: "+s.nextToken());
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
    
    public boolean verify_Reserva(String dato)
    {
        if(vehiculos.length() != 0)
        {
            try{
                
                fr = new FileReader(vehiculos);
                br = new BufferedReader(fr);
                
                String linea;
                
                while((linea = br.readLine()) != null)
                {
                    
                    s = new StringTokenizer(linea, "_");
                    
                    if(dato.equals(s.nextToken()))
                    {
                        formReservaCliente.getMarca.setText(s.nextToken());
                        s.nextToken();
                        formReservaCliente.getGama.setText(s.nextToken());
                        s.nextToken();s.nextToken();s.nextToken();
                        formReservaCliente.getDesc.setText(s.nextToken());
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
            
            fw = new FileWriter(vehiculos,true);
            pw = new PrintWriter(fw);
            
            pw.println(linea_A);
            
            fw.close();
            
            its = true;
            
        }catch(IOException ioe){
            
        }
        return its;
    }
    
    
}
