/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;



    
/**
 *
 * @author Jonathan
 */
public class Circulo extends Figuras {
   /**
    * contiene las coordenadas del circulo
    */
   private Figuras cir;    
/**
 * constructor
 * @param cir 
 */
    public Circulo(Figuras cir,double x,double y){
        super(x, y);
        this.cir = cir;
    }

    public void resultadosCirculo() {
        System.out.println("El radio es: "+calcularRadio());
        System.out.println("el area es: "+calculaArea());
        System.out.println("El perimetro es: "+calculaPerimetro());
        System.out.println("El diametro es: "+calculaDiametro());
    } //resultadosCirculo
    
    private double calcularRadio(){
        return (cir.getY()-cir.getX());
        
    }//calcularRadio
    
/**
 * metodo que calcula el area 
 * @return area
 */
    private double calculaArea(){
        double area;
        area= (double) (Math.pow((cir.getY()-cir.getX()), 2)*Math.PI);
        return area;
        
    }//area
    /**
     * metodo que calcula el perimetro
     * @return perimetro
     */
    private double calculaPerimetro(){
        double perimetro;
        perimetro=(float) ((2*(cir.getY()-cir.getX()))*Math.PI);
        return perimetro;
    }//Perimetro
    /**
     * metodo que calcula el perimetro
     * @return perimetro
     */
    private double calculaDiametro(){
        double diametro;
        diametro=((cir.getY()-cir.getX())*2);
        return diametro;
    }//diametro

    public Figuras getCir() {
        return cir;
    }

    public void setCir(Figuras cir) {
        this.cir = cir;
    }

    
}//Circulo
