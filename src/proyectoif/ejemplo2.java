
package proyectoif;

import java.util.Scanner;


public class ejemplo2 {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
       int r= sumar(10,10);
        System.out.println(r);
        System.out.println("ingresar el nombre");
        String nombre=leer.nextLine();
        saludo(nombre);
    }
    public static int sumar(int numero,int numero1){
        int s=numero+numero1;
        return s;
    }
    public static void saludo(String nombre){
        System.out.println("hola"+ nombre);
    }
}
