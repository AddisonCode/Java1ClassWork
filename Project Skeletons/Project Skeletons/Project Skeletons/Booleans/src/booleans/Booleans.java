
package booleans;

public class Booleans {

   
    public static boolean main(String[] args) {
        int x,y;
        boolean a,b,c,d,e,f;
        x=5;
        y=5;
        a= x==y; // checks if x is equal to y
        b= x!=y; // checks if x is not equal to y
        c= x>y; // checks if x is greater than y
        d= x<y; // checks if x is less than y
        e= x>=y; // checks if x is greater than or equal to y
        f= x<=y; // checks if x is less than or equal to y
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        
        System.out.println( s1.compareTo(s2) );
        System.out.println( s2.equals(s3) );
        
    }
    
    public static String s1 = "Good Morning!"; 
    public static String s2 = "Hi there!";
    public static String s3 = "Howdy, partner!";
   
   
    
    
    
    
    
    
}
