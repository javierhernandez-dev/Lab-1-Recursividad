
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
    
    // 1,23
    
    public int firstAvailable(int index){
        if (index >= capacidad_Asientos){
           return -1;
         }
      if(asientos[index]==null){
         return index;
    }
        return firstAvailable(index+1);
    }
    
    
    public int searchPassenger(String name, int index){
      String nombre_Actual, nombre_Buscado;
     if(index>=capacidad_Asientos){
       return -1;
     }
     
     if(asientos[index] != null){
       nombre_Buscado=name.toLowerCase().replaceAll("[^a-z0-9^]", "");
       nombre_Actual = asientos[index].getNombre().toLowerCase().replaceAll("[^a-z0-9]", "");
         if (nombre_Buscado.equals(nombre_Actual)) {
             return index; // Aqui es encontrado el pasajero
         }
     }
     return searchPassenger(name, index+1);
    }
    
    public boolean isPalindromo(String name){
        String nombreLimpio;
         if(name==null){
           return false;
         }
         
    
        nombreLimpio = name.toLowerCase().replaceAll("[áàäâ]", "a").replaceAll("[éèëê]", "e").replaceAll("[íìïî]", "i").replaceAll("[óòöô]", "o").replaceAll("[úùüû]", "u").replaceAll("[^a-z0-9^]", "");
         
         if(nombreLimpio.isEmpty()){
            return false;
          }
         
         if ( nombreLimpio.length()==1) {
            return true;
        }
         
         if (nombreLimpio.length()==2){
         return  nombreLimpio.charAt(0)== nombreLimpio.charAt(1);
       }
         
         if(nombreLimpio.charAt(0) !=  nombreLimpio.charAt( nombreLimpio.length()-1)){
          return false;
         }
         
         return isPalindromo(nombreLimpio.substring(1,nombreLimpio.length()-1));
    }
    
    
    //4,5,6
    public static boolean hayPasajeros=false;
    public void printPassengers(int index){
        if (index==0) {
            hayPasajeros=false;
        }
        if (index==asientos.length) {
            if (hayPasajeros==false) {
                System.out.println("Sin pasajeros registrados.");
            }
            return;
        }
        if (asientos[index]!=null) {
            hayPasajeros=true;
            Ticket t=asientos[index];
            System.out.println("Nombre: "+t.getNombre());
            System.out.println("Monto pagado: "+t.getMontoPagado());
            System.out.println("Monto original: "+t.getMontoOriginal());
            System.out.println("Es palindromo: "+t.isEsPalindromo());
        }
        printPassengers(index +1);    
    }
    
    public double income(int index){
        if (index==asientos.length) {
            return 0;
        }
        if (asientos[index]!= null) {
            return asientos[index].getMontoPagado()+income(index+1);
        }
        return income(index+1);
    }
    
    public void reset(int index){
        if (index==asientos.length) {
            return; 
        }
        asientos[index]=null;
        reset(index+1);
    }
    
    //7,8,9
<<<<<<< HEAD
=======
    public boolean sellTicket(String nombre){
        
    }
    

    public boolean cancelTicket(String nombre){
        
    }
    public double dispatch(){
        double totalIngresos = income(0);
        
        reset(0);
        
        return totalIngresos;
    }
>>>>>>> 66a6090fb580a8a974f089ea568f42194f0612b0

}
