/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratical2;

/**
 *
 * @author tarumt
 */
public class Pratical2 {
  
    
    public static void main(String[] args) {
        P2Q1();
        // TODO code application logic here
    }
public static void P2Q1() {
    System.out.println("Number\t SquareRoot\t Cube \n");
    for (int i=0; i<=20; i=i+2){
        System.out.printf("%d \t %.4f \t %.4f\n", i,Math.sqrt(i), Math.pow(i,3));
     }
  }   
}
