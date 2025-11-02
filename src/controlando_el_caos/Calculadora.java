package controlando_el_caos;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
		
		
		System.out.println("=== Calculadora Básica ===");
        Scanner scan = new Scanner(System.in);
        System.out.println("Que operacion quiere realizar?");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion ");
        System.out.println("4-Division");
        System.out.println("Introduzca numero correspondientre a la operación");
        
        c = scan.nextInt();
        
 if(c== 1){
        System.out.println("Suma: " + (a + b));
 }
 if(c== 2){       System.out.println("Resta: " + (a - b));
 
 }
 if(c== 3){       System.out.println("Multiplicación: " + (a * b));
 
 }
 if(c== 4){      System.out.println("División: " + (a / b));
 
 }
    }
}
