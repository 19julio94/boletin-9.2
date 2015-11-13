package boletin.pkg92;

/**
 *
 * @author jpatriciodasilva
 */
public class Calcula {
    
    int suma=0;
    double multiplicacion=1;
    
    public String enviaResultado(){
    
        for(int x=10;x<90;x++){
         suma=suma+x;
         multiplicacion=multiplicacion*x;
         
        
                
        
        
        }
    
    
     String resultado="La suma es: "+suma+"\nLa multiplicacion es "+multiplicacion;
     return resultado;
}
}
    

