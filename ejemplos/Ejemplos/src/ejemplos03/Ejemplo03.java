
import java.util.Scanner;

/*
 * Generar una solucion que permita sumar dos numeros a traves de un metodo,
los numeros deben ser ingresados por teclado en elnmetodo main, el metodo que 
genera la suma debve verifiar que los dos numeros sean positivos para realizar 
la operacion, caso contrario debe devolver 0
 
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1;
        int valor2;
        System.out.print("Ingrese el valor 1\n");
        valor1 = entrada.nextInt ();
        System.out.print("Ingrese el valor 2\n");
        valor2 = entrada.nextInt ();
        // 
        int valor = obtenerSuma(valor1, valor2); // se invoca al método 
                                         // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    public static int obtenerSuma(int a, int b){
        int suma;
        if(a > 0 && b >0){
            suma = a + b;
            return suma;
        }else{
               suma = 0; 
            
        }
        return suma;
        // return a + b;
    }
} 
    
