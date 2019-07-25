
package person;

import java.util.Scanner;

public class Person {
    public static String firstName; // first name
    public static String secondName; // second name
    public static String phoneNum; // phone number
   
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in); 
       
       System.out.println("Hi! What is your first name?");
       firstName = keyboard.nextLine();
       
       System.out.println("Okay " + firstName + ", what is your last name?");
       secondName = keyboard.nextLine();
       
       System.out.println("Okay, now what's your phone number?");
       phoneNum = keyboard.nextLine();
       
       System.out.println("Your name is " + firstName + " " + secondName + " and your phone number is " + phoneNum);
       
       
       
        
    }
    class Phonebook{
    int[] pbLength = new int[0];
    
    
    
}
     
}

