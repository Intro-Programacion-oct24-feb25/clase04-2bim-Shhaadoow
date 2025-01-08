/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

import java.util.Scanner;



/**
 *
 * @author reroes
 */

public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
        int limite;
        int tabla;
        int opcion;
        String mensajeSuma;
        String mensajeMulti;
   
        System.out.print("Introduce el límite de la tabla:\n");
        limite = entrada.nextInt();
        
        System.out.print("Introduce el número de la tabla:\n");
        tabla = entrada.nextInt();

        
        System.out.println("Elige una opción: 1 para sumar o 2 para multiplicar"
                + "");
        
        opcion = entrada.nextInt();

      
        switch (opcion) {
            case 1:
                mensajeSuma = obtenerTablaSumar(limite, tabla);
                System.out.printf("%s\n", mensajeSuma);
                break;
            case 2:
                mensajeMulti = obtenerTablaMultiplicar(limite, tabla);
                System.out.printf("%s\n", mensajeMulti);
                break;
            
        }

      
    }

    
    public static String obtenerTablaSumar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
    }

    
    public static String obtenerTablaMultiplicar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
    }
}

