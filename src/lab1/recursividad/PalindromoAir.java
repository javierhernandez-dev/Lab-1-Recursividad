
package lab1.recursividad;


public class PalindromoAir {
    public static final int capacidad_Asientos = 30;
    public static final double precio_Base = 100.00;
    public static final double porcentaje_Descuento = 0.20;
    
    private Ticket[] asientos;
    
    public PalindromoAir(){
    this.asientos = new Ticket[capacidad_Asientos];
    
    }
    
    public Ticket[] getAsientos(){
    return asientos;
    
    }
    
    
}
