
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoif;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer= new Scanner(System.in);
            
        System.out.println("ingresar un opcion ");
        
        int opcion= leer.nextInt();
        switch (opcion){
            case 1: System.out.println("mostrar un mensaje indicando “La bomba es una bomba de agua”.");
            break;
            case 2: System.out.println("La bomba es una bomba de gasolina");
            break;
            case 3: System.out.println("La bomba es una bomba de hormigon");
            break;
            default:System.out.println("la opcion no es correcta");
        }
        System.out.println("ingresar la nota");
        
        int nota=leer.nextInt();
        while(nota!=0){
            if (nota <=5){
               
                System.out.println("reprobado");
               break;
            }else System.out.println("aprobado");
           break;
        }
        
            
        
        int numero2;
        int i=0;
        do{
           System.out.println("ingresar numero");
           numero2=leer.nextInt();
           i++;
           
        }while(numero2!=0 &&i<=20);
        System.out.println("ingresar numero");
        int numero3=leer.nextInt();
        int j=0;
        if(numero3>=1 ||numero3<=20){
            
            for ( j = 0; j <=20; j++) {
                System.out.println("*");
            
        }
        }
        
    }
    
   }
       
    

