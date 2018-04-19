
package controlador;
import modelo.mantenimiento.*;
/**
 *
 * @author Ignacio
 */
public class reservas {
    
    private mVehiculo mv;
    private mOferta mo;
    private mCliente mc;
    
    private boolean its = false;
    
    public reservas() {
        
    }
    
    public boolean model_A(String ID)
    {
        mv = new mVehiculo();
        
        if(mv.verify_Reserva(ID))
        {
            its = true;
        }
        
        return its;
    }
    
    public boolean model_B(String ID)
    {
        mc = new mCliente();
        
        if(mc.verify_Reserva(ID))
        {
            its = true;
        }
        
        return its;
    }
    
    public Double getPrecio(String matricula)
    {
        mGama mg = new mGama();
        mv = new mVehiculo();
        return mg.getPrecio(mv.getGama(matricula));
    }
    
    public void getOfertas(){
        
    }
    
    
}
