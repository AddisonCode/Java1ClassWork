package mathoperations;

public class MathOperations {
     public static void main( String[] args ) {
         int p,q,r,s,t,u,aa,bb,cc,dd,ee,ff,i,f;
          double a,b,c;
          String first, second, together;
 
          p = 8;
          q = 25;
         System.out.println( "p is " + p + ", q is " + q );
 
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
         
         
         aa = 43;
         bb = 12;
         System.out.println( "aa is " + aa + ", bb is " + bb );
 
         cc = aa + bb;
         System.out.println( "aa+bb is " + cc );
         dd = aa - bb;
         System.out.println( "aa-bb is " + dd );
         ee = aa+bb*3;
         System.out.println( "aa+bb*3 is " + ee );
         ff = aa / 2;
         System.out.println( "aa/2 is " + ff );

         
        
        a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         System.out.println();

         first = "peanut butter";
         second = " and jelly";
         together = first + second;
         System.out.println( together );
         
         
         i=3;
         f=2;
        
         i +=4; 
         f -=17;
                 
         System.out.println("i+f = " + (i + f));
         
         
         
     }
}