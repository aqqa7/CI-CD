
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AZ
 */
public class Calculator {
    Scanner in = new Scanner(System.in);
    
      
    public void sum(){
        System.out.println("Ingrese los números a sumar");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int res = n1+n2;
        System.out.println("El resultado es :"+res);
    }
    
    public void subs(){
      System.out.println("Ingrese los números a restar");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int res = n1-n2;
        System.out.println("El resultado es :"+res);      
    }    
  
    public void mul(){
        System.out.println("Ingrese los números a multiplicar");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int res = n1*n2;
        System.out.println("El resultado es: "+res);
    }
  
    public void div(){
       System.out.println("Ingrese los números a dividir");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        if (n2 == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
        int res = n1/n2;
        System.out.println("El resultado es: "+res);
        }
    }
}

