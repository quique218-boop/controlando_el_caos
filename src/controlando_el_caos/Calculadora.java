package controlando_el_caos;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
        int a = 8;
        int b = 4;
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
	 System.out.println("introduzca primer valor a sumar");
	 a = scan.nextInt();
	 System.out.println("introduzca segundo valor a sumar");
	 b = scan.nextInt();
	 
        System.out.println("Suma: " + (a + b));
 }
 else if(c== 2){       System.out.println("Resta: " + (a - b));
 
 }
 else if(c== 3){ 
	 System.out.println("introduzca primer valor a multiplicar");
	 a = scan.nextInt();
	 System.out.println("introduzca segundo valor a multiplicar");
	 b = scan.nextInt();
	 
	 System.out.println("Multiplicación: " + (a * b));
 
 }
 else if(c== 4){      System.out.println("División: " + (a / b));
 
 }
    }
}
