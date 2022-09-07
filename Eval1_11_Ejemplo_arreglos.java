/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author moviles
 */
public class Eval1_11_Ejemplo_arreglos {   
    public static void main(String[]args){
        
        //Pedir número de grupos
        //pedir número de alumnos por grupo
        //capturar calificaciones
        //imprimir calificaciones
        Scanner teclado = new Scanner(System.in);
        
        

       
        int arregloCali[][];
        //PRIMERA DIMENSION -> grupos
        //segunda dimension -> estudiantes x grupo
        System.out.println("Ingrese numero de grupos: ");
        int grupos = teclado.nextInt();
        int calif= teclado.nextInt();
        arregloCali= new int[grupos][calif];
        
        
        for (int i = 0; i < arregloCali.length; i++) {
            System.out.println("Ingrese numero de Alumnos del grupo "+(i+1));           
            int grupo1 = teclado.nextInt();
            for (int j = 0; j < arregloCali[1].length; j++) {
                System.out.println("Ingrese calificacion del Alumno "+(j+1));           
                int calificaciones = teclado.nextInt();
                arregloCali[i]=new int[calificaciones];
            }
                       
            arregloCali[i]=new int[grupo1];
            System.out.println(arregloCali[i].length);

        }
        

    }
}
