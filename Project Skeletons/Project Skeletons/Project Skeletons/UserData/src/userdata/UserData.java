
package userdata;

import java.util.Scanner;
public class UserData {

    static String name;
    int year;
    static String month;
    int day; 
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println( "What is your name?" );
        String name = keyboard.nextLine();
        
        System.out.println( "Oh thats a good name! What year you born " + name + "? " );
        int year = keyboard.nextInt();
        
        System.out.println( "What month where you born?");
        String month = keyboard.nextLine();
        
        System.out.println( "Okay, and now what day?");
        int day = keyboard.nextInt();
        
        
    }
      }
