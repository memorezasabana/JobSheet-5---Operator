/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatoraritmatika;

/**
 *
 * @author TUF
 */
public class OperatorAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        int c;
        
        //penjumlahan
        c = a + b;
        System.out.println(a+ " + " + b + " = " + c);
        
        //pengurangan
        c = a - b;
        System.out.println(a+ " - " + b + " = " + c);
        
        //perkalian
        c = a * b;
        System.out.println(a+ " * " + b + " = " + c);
        
        //pembagian
        c = a / b;
        System.out.println(a+ " / " + b + " = " + c);
        
        //sisa pembagian
        c = a % b;
        System.out.println(a+ " % " + b + " = " + c);
     
    }
    
}
