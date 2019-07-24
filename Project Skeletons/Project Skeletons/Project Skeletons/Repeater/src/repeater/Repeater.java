
package repeater;

import java.util.Scanner;

public class Repeater {

    
    static int d1;
    static int d2;
    static int input;
    public static void main(String[] args) {
        d1 = (int)(Math.random()*6+1);
        d2 = (int)(Math.random()*6+1);
        
        while(d1 != d2){
         d1 = (int)(Math.random()*6+1);
         d2 = (int)(Math.random()*6+1);
         System.out.println("Not yet! " + d1 +" "+ d2);
         
        
        }
        
        if(d1 == d2){
        System.out.println("Congrats! you rolled a double! " + d1 +" "+ d2);
    }
        
    }
    
}
