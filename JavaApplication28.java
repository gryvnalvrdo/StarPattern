/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

/**
 *
 * @author alver
 */
public class JavaApplication28
{
    public static void main(String[] args)
    {
        int n = 6;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                if (j==5)
                    System.out.print("  ");
                else if (j==1||j==4||i==1||i==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                    
            }
            for (int j = n; j <= 10; j++)
            {
                if (j==10)
                    System.out.print("  ");
                else if (i==6 || i==1 || i==3 || j==9 && j+i==11 || j==6 && j+i==10 || j==6 && j+i==11)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int j = 11; j <= 15; j++)
            {
                if(j==15)
                    System.out.print("  ");
                else if(i==1 || i==6|| j==11 || j==14 && j+i==18 || j==14 && j+i==19 || j==13 && j+i==16 || j== 14 && j+i==17)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
           
        }
       
        // TODO code application logic here
    }
    
}
