/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Scanner;

/**
 *
 * @author Charlie
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter number of elements for array 1");
        int num1[]=new int[scan.nextInt()];
        System.out.println("enter elements");
        for(int i=0;i<num1.length;i++)
        {
            num1[i]=scan.nextInt();
        }
        System.out.println("enter number of elements for array 1");
        int num2[]=new int[scan.nextInt()];
        System.out.println("enter elements");
        for(int i=0;i<num2.length;i++)
        {
            num2[i]=scan.nextInt();
        }
       
        MergeSort a=new MergeSort();
        a.mergeSort(0,num1.length-1,num1); // sorting 1st array
        
        a.mergeSort(0,num2.length-1,num2); // sorting 2nd array
        
        int merged[]=a.mergingTwo(num1,num2);  // creating array of size array1+array2 and calling merging method
        System.out.println(" merged array1 and array2");
        for(int i=0;i<merged.length;i++)
            System.out.print(merged[i]+" ");
        
        // TODO code application logic here
    }
    void mergeSort(int l,int r,int arr[])
    {
        if(l<r)
        {
            int mid = l + (r - l) / 2; 
           
            mergeSort(l,mid,arr);
            mergeSort(mid+1,r,arr);
            
            merge(arr,l,r,mid);
        }
    }
    void merge(int arr[],int l,int r,int mid)
    {
        int i,j,k;
        int n1=mid-l+1;
        int n2=r-mid;
        
        int L[]=new int[n1];
        int R[]=new int[n2];
        for( i=0;i<n1;i++)
        {
            L[i]=arr[l+i];
            
        }
        for(j=0;j<n2;j++)
        {
            R[j]=arr[j+mid+1];
        }
        i=0;j=0;k=l;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                arr[k]=L[i];
                i++;
            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    int  [] mergingTwo(int arr1[],int arr2[])
    {
        int length1=arr1.length;
        int length2=arr2.length;
        int combined[]=new int[length1+length2];
        int i=0,j=0,k=0;
        
        while(k<length1+length2)
        {
            if(arr1[i]<arr2[j] && i<length1 && j<length2)
            {
                combined[k]=arr1[i];
                i++;
            }
            else
            {
                combined[k]=arr2[j];
                j++;
            }
            k++;
            if(i==length1)
            {
                for(;j<length2;j++)
                {
                    combined[k]=arr2[j];
                    k++;
                }
            }
            if(j==length2)
            {
                for(;i<length1;i++)
                {
                    combined[k]=arr1[i];
                    k++;
                }
            }
            
        }
    
    return combined;
    
    }
}