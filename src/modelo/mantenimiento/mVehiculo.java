
package modelo.mantenimiento;

import java.io.*;
import java.util.StringTokenizer;
import vista.mantenimientos.*;
import vista.movimiento.formReservaCliente;
import vista.consultas.vehiculo.vccMatricula;

/**
 *
 * @author Ignacio
 */
public class mVehiculo {
    
    boolean its = false;
    public String path;
    
    protected File vehiculos;
    protected FileReader fr;
    protected FileWriter fw;
    protected BufferedReader br;
    protected PrintWriter pw;
    protected StringTokenizer s ;
    
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
                    if(!linea.contains("Rentado"))
                    {
                        if(dato.equals(s.nextToken()))
                        {
                            formReservaCliente.getMarca.setText(s.nextToken());
                            s.nextToken();
                            formReservaCliente.getGama.setText(s.nextToken());
                            s.nextToken();s.nextToken();s.nextToken();
                            formReservaCliente.getDesc.setText(s.nextToken());
                            formReservaCliente.estados.setText("");
                            fr.close();
                            return (its = true);
                        }
                    }else{
                        formReservaCliente.estados.setText("El Vehiculo no esta Disponible");
                    }
                }
                
                fr.close();
                
            }catch(IOException ioe)
            {
                
            }
        }
        return its;
    }
    
    public String verify_toStatus(String dato)
    {
        String status = "";
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
                        status = linea;
                        fr.close();
                        return status;
                    }
                    
                }
                
                fr.close();
                
            }catch(IOException ioe)
            {
                
            }
        }
        return status;
    }
    
    public boolean verify_Cmatricula(String dato)
    {
        if(vehiculos.length() != 0)
        {
            try{
            
                fr = new FileReader(vehiculos);
                br = new BufferedReader(fr);
                
                String linea, m = "";
                
                while((linea = br.readLine()) != null)
                {
                    s = new StringTokenizer(linea, "_");
                    m = s.nextToken().trim();
                    //System.out.println(m);
                    if(m.equals(dato))
                    {
                        vccMatricula.vMatricula.setText(m);
                        vccMatricula.vMarca.setText(s.nextToken());
                        vccMatricula.vModelo.setText(s.nextToken());
                        vccMatricula.vGama.setText(s.nextToken());
                        vccMatricula.vTipoV.setText(s.nextToken());
                        vccMatricula.vTipoM.setText(s.nextToken());
                        vccMatricula.vTransm.setText(s.nextToken());
                        vccMatricula.vDescrip.setText(s.nextToken());
                        vccMatricula.vTecho.setText(s.nextToken());
                        vccMatricula.vInterior.setText(s.nextToken());
                        vccMatricula.vAire.setText(s.nextToken());
                        vccMatricula.vColor.setText(s.nextToken());
                        vccMatricula.vEstado.setText(s.nextToken());
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
    
  public String getGama(String dato)
    {
        String g = "";
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
                        s.nextToken();s.nextToken();
                        g = s.nextToken();
                        fr.close();
                        return g;
                    }
                    
                }
                
                fr.close();
                
            }catch(IOException ioe)
            {
                
            }
        }
        return g;
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
