
package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        
        
        System.out.println("Question 2: What does a loop do?");
        System.out.println("\tA) it loops");
        System.out.println("\tB) it returns something");
        System.out.println("\tC) it curses you");
        System.out.println("\tD) spaghetti");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, it actually loops!");
        }
       
        
        System.out.println("Question 3: What is my name?");
        System.out.println("\tA) my name jeff");
        System.out.println("\tB) thanos");
        System.out.println("\tC) eater of all worlds");
        System.out.println("\tD) addison");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("D")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, my name is addison!");
        }
        System.out.println("Question 4: whats the best game of all time?");
        System.out.println("\tA) fork knife");
        System.out.println("\tB) minecraft");
        System.out.println("\tC) mario");
        System.out.println("\tD) luigi's mansion 2?");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, minecraft is the goat!");
        }
        
        
        
        System.out.println("Question 5: what does it mean to defenestrate someone?");
        System.out.println("\tA) it means to eat spaghetti out of tuperware while crying");
        System.out.println("\tB) it means to put a table together");
        System.out.println("\tC) it means to throw someone out of a window");
        System.out.println("\tD) it means to zipline from a skyscraper to another skyscraper");
        String answer5 = keyboard.nextLine();
        if (answer5.equals("C")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, it means to throw someone out of a window!");
        }
        
        
        
        
        System.out.println("Question 6: what is my cats name?");
        System.out.println("\tA) Obsidian");
        System.out.println("\tB) Charles");
        System.out.println("\tC) Jeff");
        System.out.println("\tD) Silky");
        String answer6 = keyboard.nextLine();
        if (answer6.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, it's Obsidian!");
        }
       
        
        System.out.println("Your score is " + rightAnswers + " out of 6 questions.");
    }
    
}
