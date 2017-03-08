/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Menu {
    private Scanner entrada;
    /**
     * constructor
     */
    public Menu(){
        menu();
    }//constructor
    /*
        Este metodo permite seleccionar la figura geometrica que va a procesar
    */
    public void menu(){
        
        while(true){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escoja la figura geometrica:");
        System.out.println("1. Triangulo");
        System.out.println("2. Circulo");
        System.out.println("3. Rectangulo");
        System.out.println("4. Salida");
        opcion=entrada.nextInt();
        
        if(opcion == 1) {
                iniciaTriangulo();
            } else if(opcion == 2) {
                iniciaCirculo();
            } else if(opcion == 3) {
                iniciarRectangulo();
            } else if(opcion == 4) {
                break;
            } else {
                System.out.println("Opcion no valido");
            }
      }//while
    }//menu

    
    /**
     * metodo que recibe coordenadas del triangulo
     */
    private void iniciaTriangulo(){
        Scanner entrada = new Scanner(System.in);
        double x,y;
        System.out.println("digite coordenada x1: ");
        x = entrada.nextDouble();
        System.out.println("Digite coordenada y1: ");
        y=entrada.nextDouble();
        Punto coordenada1 = new Punto(x, y);
        System.out.println("digite coordenada x2: ");
        x=entrada.nextDouble();
        System.out.println("Digite coordenada y2: ");
        y=entrada.nextDouble();
        Punto coordenada2 = new Punto(x, y);
        System.out.println("digite coordenada x3: ");
        x=entrada.nextDouble();
        System.out.println("Digite coordenada y3: ");
        y=entrada.nextDouble();
        Punto coordenada3 = new Punto(x, y);
        Triangulo triangulo = new Triangulo(coordenada1,coordenada2,coordenada3);
        triangulo.resultados();
        
    }//iniciaTriangulo
        
    private void iniciaCirculo(){
        Scanner entrada = new Scanner(System.in);
        double x,y;
        System.out.println("Digite la coordenada x: ");
        x=entrada.nextDouble();
        System.out.println("Digite la coordenada y: ");
        y= entrada.nextDouble();
        Punto cir = new Punto(x, y);
        Circulo circulo = new Circulo(cir);
        circulo.resultadosCirculo();
    }   //iniciaCirculo   
    
    private void iniciarRectangulo(){
         Scanner entrada = new Scanner(System.in);
        double x,y;
        System.out.println("Digite la coordenada x1");
        x=entrada.nextDouble();
        System.out.println("Digite la coordenada y1");
        y=entrada.nextDouble();
        Punto coor1 = new Punto(x, y);
        System.out.println("Digite la coordenada x2");
        x=entrada.nextDouble();
        System.out.println("Digite la coordenada y2");
        y=entrada.nextDouble();
        Punto coor2 = new Punto(x, y);
        System.out.println("Digite la coordenada x3");
        x=entrada.nextDouble();
        System.out.println("Digite la coordenada y3");
        y=entrada.nextDouble();
        Punto coor3 = new Punto(x, y);
        System.out.println("Digite la coordenada x4");
        x=entrada.nextDouble();
        System.out.println("Digite la coordenada y4");
        y=entrada.nextDouble();
        Punto coor4 = new Punto(x, y);
        Rectangulo rectangulo = new Rectangulo(coor1,coor2,coor3,coor4);
        rectangulo.resultadosRectangulo();
    }//iniciarRectaangulo
    
}//Menu

