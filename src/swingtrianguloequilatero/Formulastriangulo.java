package swingtrianguloequilatero;

public class Formulastriangulo {
    
    double lado,perimetro,area,altura;
    
    public void setLado(double lado){
        this.lado=lado;
    }
    
    public double calcularArea(){
        area=((Math.sqrt(3))/4)*Math.pow(lado, 2);
        return area;
    }
    
    public double calcularPerimetro(){
        perimetro=lado*3;
        return perimetro;
    }
    
    public double calcularAltura(){
        altura=Math.sqrt(3)*(lado/2);
        return altura;
    }
    
}
