/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Calculadora {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
                System.out.println("Digite el primer numero");
        
        int  num1 = sc.nextInt();
        
        System.out.println("digite el segundo numero");
        int  num2 = sc.nextInt();
        
        
        int suma = num1 + num2 ;
        
        System.out.println("el total de la suma es: " + suma);
        
                int resta = num1 - num2 ;
        
                
        System.out.println("el total de la resta es:  " + resta);
        
                int multiplicacion = num1 * num2 ;
        
        System.out.println("el total de la multiplicacion es: " + multiplicacion);
                
                int divicion = num1 / num2 ;
        
        System.out.println("el total de la division es: " + divicion);
         
    }
}
