/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JOSE JAVIER
 */
public class TablaDeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner ingreso = new Scanner(System.in);
        int numero;
        System.out.print("Ingresa un numero: ");
        numero = ingreso.nextInt();
        Tabla(numero);
       
    }//fin main
    public static void Tabla(int numero){
        int i;
        for(i = 1; i<=10; i++){
            System.out.printf("%d x %d = %d\n",numero, i, (i * numero) );
        }
    }
    
}
