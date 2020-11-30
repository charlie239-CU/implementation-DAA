/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Scanner;

/**
 *
 * @author Charlie
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of array"); 
        int arr2[]=new int[scan.nextInt()];  // array with the given size
        
        System.out.println("enter elements to the array");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=scan.nextInt();  // element insertion tot the array
        }
        int arr[]=arr2;  // copy elements of array2 to array1
        int i,j;
        int min=0;
        for(i=0;i<arr.length;i++)          //selection sort
        {
            min=i;                      // taking mininum as i
            for(j=i;j<arr.length-1;j++)
            {
                if(arr[min]>arr[j+1])       // checking for other mininum values
                {
                    min=j+1;            // if found make new mininum
                }
            }
             
                int temp=arr[min];      //swap minimum value to i index value
                arr[min]=arr[i];
                arr[i]=temp;
            
       }
        
        for(i=0;i<arr2.length;i++)          //bubble sort
        {
            for(j=0;j<arr2.length-1;j++)
            {
                if(arr[j]>arr[j+1])         //checking if arr[j] greater then arr[j+1]
                {
                int temp=arr[min];          //swaping both element if greater
                arr[min]=arr[i];
                arr[i]=temp;
                }
            }
        }
        System.out.println("By selection sort");        
        for(int a:arr)
            System.out.print(a+" ");            //printing element sorted by selection sort
         System.out.println("\nBy bubble sort");
        for(int a:arr2)
            System.out.print(a+" ");               // printing element sorted by bubble sort
        // TODO code application logic here
    }
    
}
