
package swingareasfiguras;


public class Trapecio {
    double b1,b2,h,lado;
    
    Trapecio(double b1,double b2,double h,double lado){
        this.b1=b1;
        this.b2=b2;
        this.h=h;
        this.lado=lado;
    }
    
    double calcularArea(){
      return ((b1+b2)/2)*h;  
    }
    
    double calcularPerimetro(){
        return b1+b2+(lado*2);
    }
    
}
