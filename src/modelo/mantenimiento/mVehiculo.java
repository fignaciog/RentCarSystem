
package modelo.mantenimiento;

import java.io.*;
import java.util.StringTokenizer;
import vista.mantenimientos.*;
import vista.movimiento.formReservaCliente;
import vista.consultas.vehiculo.vcMatricula;

/**
 *
 * @author Ignacio
 */
public class mVehiculo {
    
    boolean its = false;
    public String path;
    mGama mg = new mGama();
    
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
    
    public boolean verify(String dato){
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
                        formVehiculo.sTipoVehiculo.setSelectedIndex(Integer.valueOf(s.nextToken()));
                        formVehiculo.sTipoMotor.setSelectedIndex(Integer.valueOf(s.nextToken()));
                        // Cambio Automatico
                        if(s.nextToken().equals("true"))
                        {
                            formVehiculo.sTipoTrans.setSelectedIndex(1);
                        }else{
                            formVehiculo.sTipoTrans.setSelectedIndex(2);
                        }
                        formVehiculo.txtDescrip.setText(s.nextToken());
                        // Techo
                            if(s.nextToken().equals("true"))
                            {
                                formVehiculo.sTecho.setSelectedIndex(1);
                            }else{
                                formVehiculo.sTecho.setSelectedIndex(2);
                            }
                        // Aire acondicionado
                            if(s.nextToken().equals("true"))
                            {
                                formVehiculo.sAire.setSelectedIndex(1);
                            }else{
                                formVehiculo.sAire.setSelectedIndex(2);
                            }
                        formVehiculo.txtColor.setText(s.nextToken());
                        // Interior
                            if(s.nextToken().equals("true"))
                            {
                                formVehiculo.sInterior.setSelectedIndex(1);
                            }else{
                                formVehiculo.sInterior.setSelectedIndex(2);
                            }
                        // Estado
                        if(s.nextToken().equals("true"))
                        {
                            formVehiculo.sEstado.setSelectedIndex(0);
                        }else{
                            formVehiculo.sEstado.setSelectedIndex(1);
                        }
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
        if(vehiculos.length() != 0){
            try{
                fr = new FileReader(vehiculos);
                br = new BufferedReader(fr);
                String linea;
                while((linea = br.readLine()) != null){
                    s = new StringTokenizer(linea, "_");
                    if(dato.equals(s.nextToken())){
                        formOfertas.marcaVeh.setText(s.nextToken());
                        formOfertas.modeloVeh.setText(s.nextToken());
                        formOfertas.precioGama.setText(String.valueOf(mg.getPrecio(s.nextToken())));
                        s.nextToken();s.nextToken();s.nextToken();
                        formOfertas.descVeh.setText(s.nextToken());
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
    
    public boolean verify_Reserva(String dato){
        if(vehiculos.length() != 0){
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
                            s.nextToken();s.nextToken();s.nextToken();s.nextToken();
                            formReservaCliente.getEstadoVehiculo.setText(s.nextToken());
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
    
    public boolean verifyStatus(String dato)
    {
        boolean status = false;
        if(vehiculos.length() != 0)
        {
            try{
                
                fr = new FileReader(vehiculos);
                br = new BufferedReader(fr);
                
                String linea;
                
                while((linea = br.readLine()) != null)
                {
                    
                    s = new StringTokenizer(linea, "_");
                    
                    if(dato.equals(s.nextToken()))// Matricula
                    {
                        s.nextToken();// 1
                        s.nextToken();// 2
                        s.nextToken();// 3
                        s.nextToken();// 4
                        s.nextToken();// 5
                        s.nextToken();// 6
                        s.nextToken();// 7
                        s.nextToken();// 8
                        s.nextToken();// 9
                        s.nextToken();// 10
                        s.nextToken();// 11
                        fr.close();
                        if(s.nextToken().equals("true")){
                            return (status = true);
                        }
                            
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
                        vcMatricula.vMatricula.setText(m);
                        vcMatricula.vMarca.setText(s.nextToken());
                        vcMatricula.vModelo.setText(s.nextToken());
                        vcMatricula.vGama.setText(s.nextToken());
                        vcMatricula.vTipoV.setText(s.nextToken());
                        vcMatricula.vTipoM.setText(s.nextToken());
                        vcMatricula.vTransm.setText(s.nextToken());
                        vcMatricula.vDescrip.setText(s.nextToken());
                        vcMatricula.vTecho.setText(s.nextToken());
                        vcMatricula.vInterior.setText(s.nextToken());
                        vcMatricula.vAire.setText(s.nextToken());
                        vcMatricula.vColor.setText(s.nextToken());
                        vcMatricula.vEstado.setText(s.nextToken());
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
    
    public String Status(String Matricula)
    {
       String linea_A = "";
        try{
            
            fr = new FileReader(vehiculos);
            br = new BufferedReader(fr);
            
            String linea;
            
            String MATRICULA,MARCA,MODELO,GAMA,TIPO_VEHICULO,TIPO_MOTOR,TRANSMISION,
            DESCRIPCION,TECHO,AIRE,COLOR,INTERIOR,ESTADO;
            
            while((linea = br.readLine()) != null)
            {
                s = new StringTokenizer(linea, "_");
                MATRICULA = s.nextToken();
                MARCA = s.nextToken();
                MODELO = s.nextToken();
                GAMA = s.nextToken();
                TIPO_VEHICULO = s.nextToken();
                TIPO_MOTOR = s.nextToken();
                TRANSMISION = s.nextToken();
                DESCRIPCION = s.nextToken();
                TECHO = s.nextToken();
                AIRE  = s.nextToken();
                COLOR = s.nextToken();
                INTERIOR = s.nextToken();
                ESTADO = s.nextToken();
                if(MATRICULA.equals(Matricula))
                {
                    if(ESTADO.equals("true"))
                    {
                        linea_A = MATRICULA+"_"+MARCA+"_"+MODELO+"_"+GAMA+"_"+TIPO_VEHICULO+"_"+TIPO_MOTOR+"_"+TRANSMISION+"_"+
                        DESCRIPCION+"_"+TECHO+"_"+AIRE+"_"+COLOR+"_"+INTERIOR+"_"+"false";
                    }else if(ESTADO.equals("false")){
                        linea_A = MATRICULA+"_"+MARCA+"_"+MODELO+"_"+GAMA+"_"+TIPO_VEHICULO+"_"+TIPO_MOTOR+"_"+TRANSMISION+"_"+
                        DESCRIPCION+"_"+TECHO+"_"+AIRE+"_"+COLOR+"_"+INTERIOR+"_"+"true";
                    }
                    
                }
            }
            
            fr.close();

        }catch(IOException e)
        {
            
        }
        return linea_A;
    }
    
    
}
