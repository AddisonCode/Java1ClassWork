/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphingformulas;

/**
 *
 * @author Education Unlimited
 */


import java.util.Scanner;

public class ForLoops {
    
public static void main(String[] args){
Scanner keyboard = new Scanner(System.in);
    int input;
    int endp;
    int count = 10;
    
    System.out.println("Hey, what number do you want me to start counting with?");
    input = keyboard.nextInt();
    System.out.println("Okay, and now a number to end at?");
    endp = keyboard.nextInt();
    
//    System.out.println("Good Choice! Okay, time to count!" + "\n " +input + ":" + endp);
    
       
//    for (int i = 0; (i > input) &&  (i < endp); i++){

    for (int i = input; i > endp; i++){
 
    System.out.println("Good Choice! Okay, time to count!" + "\n " +input + ":" + endp);
    
        
       System.out.println(i + "");
    
    
}
}
}

