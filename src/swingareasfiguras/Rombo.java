
package swingareasfiguras;


public class Rombo {
    double dmayor,dmenor,lado;
    
    Rombo(double dmayor,double dmenor, double lado){
        this.dmayor=dmayor;
        this.dmenor=dmenor;
        this.lado=lado;
    }
    
    double calcularArea(){
        return ((dmayor*dmenor)/2);
    }
    
    double calcularPerimetro(){
        return lado*4;
    }
}
