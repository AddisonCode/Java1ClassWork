/*5
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphingformulas;

/**
 *
 * @author Education Unlimited
 */
public class ArrayFun {
    
    
    static int count = 9;
    public static void main(String[] arg){
        
        int[] arr = new int[9];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 9;
        arr[5] = 11;
        arr[6] = 13;
        arr[7] = 15;
        arr[8] = 17;
        arr[9] = 19;
        
        double[] arr2 = new double[9];
             while(arr2.length > count){
              arr2[count] = arr[count-1]*2;
              count++;
              System.out.println(arr2);
              
            
            }
        }
        
        
        
        }
    
    

