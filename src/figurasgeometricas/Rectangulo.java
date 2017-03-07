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
public class Rectangulo {
    Scanner entrada=new Scanner(System.in);
    public Rectangulo() {
        Rectangulo();
    }//constructor
    
    
    public void Rectangulo(){
        byte opcion;
        System.out.println("Seleccione la operacion que desea realizar");
        System.out.println("1. Hallar el area");
        System.out.println("2. Hallar el perimetro");
        opcion=entrada.nextByte();
        
        switch(opcion){
            case 1:{
                area();
                break;
            }//case1
            case 2:{
                perimetro();
                break;
            }//case2
            default:{
                System.out.println("Opcion invalida");
                break;
            }//default
        }//switch
        
    }//rectangulo
    
    public void area(){
        byte lado1,lado2,area;
        System.out.println("Ingrese el valor de un lado: ");
        lado1=entrada.nextByte();
        System.out.println("Ingrese el valor del segundo lado: ");
        lado2=entrada.nextByte();
        
        area=(byte) (lado1*lado2);
        System.out.println("El area es: "+area);
        Pregunta();
    }//area
    
    public void perimetro(){
        byte lado1,lado2,perimetro;
        System.out.println("Ingrese el valor del primer lado: ");
        lado1=entrada.nextByte();
        System.out.println("Ingrese el valor del segundo lado: ");
        lado2=entrada.nextByte();
        perimetro= (byte) ((2*lado1)+(2*lado2));
        System.out.println("El perimetro es de: "+perimetro);
        Pregunta();
    }//perimetro
    
    public void Pregunta(){
        byte respuesta;
        System.out.println("¿Que desea realizar? \n 1. Calcular otro rectangulo \n 2. Volver al menu principal \n 3. Salir");
        respuesta=entrada.nextByte();
        if(respuesta==1){
            Rectangulo();
        }//if
        if(respuesta==2){
            Menu Menu = new Menu();
        }//if
    }//pregunta
}//Rectangulo
