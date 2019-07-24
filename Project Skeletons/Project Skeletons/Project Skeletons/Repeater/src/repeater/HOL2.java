/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeater;
import java.util.Scanner;

public class HOL2 {
    static int r;
    static int input;
    
    
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       
        r = (int)(Math.random()*100+1);
        System.out.println("Im thinking of a number between 1 and 100. Can you guess it?");
        int input = keyboard.nextInt();
        
    while(r != input){
        
        if(r > input){
            System.out.println("The number im thinking of is larger");
            input = keyboard.nextInt();
        }
        if(r < input){
            System.out.println("The number im thinking of is smaller");
            input = keyboard.nextInt();
            
        }
        if(r == input){
           System.out.println("That's correct! The number I was thinking of was "+ r + "!");
            
        }
      }
    }
  }

