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
public class OperatorUnary{
  public static void main(String[] args) {
     int x = 1;
     int y = x;
     
     y = ++x;
     System.out.println("Nilai y sekarang : " + y);
     System.out.println("Nilai x sekarang : " + x);
   
  }   
}
