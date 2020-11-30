/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author Charlie
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Sorting s=new Sorting();
        int a[]=new int[10];
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        num=scan.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<num;i++)
        {
            a[i]=scan.nextInt();
        }
        s.quicksort(a,0,num-1);
        System.out.println("output");
         for(int i=0;i<num;i++)
        {
            System.out.print(a[i]+" ");
        }
        // TODO code application logic here
    }
    void quicksort(int a[],int beg,int end)
    {
        int loc;
        if(beg<end)
        {
            loc=partion(a,beg,end);
            quicksort(a,beg,loc-1);
            quicksort(a,loc+1,end);
            
        }
    }
    int  partion(int a[],int beg,int end)
    {
        int pivot=a[end];
        int i=beg-1;
        int temp=0;
        for(int j=beg;j<=end-1;j++)
        {
           if(a[j]<pivot)
           {
               i++;
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
               
           }
        }
        temp=a[i+1];
        a[i+1]=a[end];
        a[end]=temp;
        return (i+1);
        
    }

   
}
