/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iteration;
import java.util.*;
/**
 * This class prints numbers in iteration
 * @author Meeth
 * @version 1
 */
public class Iteration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int op=thisIsIterative(n);
        System.out.println(op);
    }
    
    /**
     *It is an iterative method
     * @param n is an integer that is passed to method thisIsIterative
     * @return temp an integer 
     */
    public static int thisIsIterative( int n)
{
    int x=5;int y=2;int temp=0;
    if(n<0)
    {
        return -10;
    }
    else if(n==0)
    {
        return 2;
    }
    else if(n==1)
    {
        return 5;
    }
    else if(n>1){
        for( int i=2; i<=n; i++)
        {
            temp= x + 3*y + 2*i;
            y=x;
            x=temp;
           
        }
    }
    return temp;
    }
}
