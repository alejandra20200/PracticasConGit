
package proyectoif;

import java.util.Scanner;


public class ejemplo1 {

   
    public static void main(String[] args) {
       int[] vector= new int[2];
       int[] producto= new int[3];
       int [][] matriz={{4,8,9},{2,1,7}};
        System.out.println("ingresar los valores del vector con tamaño " + vector.length+ ":");
        Scanner leer= new Scanner (System.in);
        for(int i=0;i<vector.length;i++){
            System.out.println("vector["+i+"]=");// accer al valor i del vector
            vector[i]=leer.nextInt();
        }
        int suma;
        for (int j = 0; j < matriz[0].length; j++) {
            suma=0;
            for (int i = 0; i <vector.length; i++) {
                 suma+=vector[i]*matriz[i][j];
            
            }
            producto[j]=suma;
           
        }
        
        String aux="";
        System.out.println("* vector");
        for(int elemento:vector){
            aux=aux+""+elemento;
            
        }
        System.out.println(aux);
        System.out.println("\n*Matriz:");
        for(int[] fila:matriz){
            aux+="";
            for(int elemento:fila){
                aux+=" "+elemento;
            }
            System.out.println(aux);
        }
        aux="";
        System.out.println("\nvector *matriz ");
        for(int elemento:producto){
            aux+=" "+ elemento;
        }
        System.out.println(aux);
    }
    
}
