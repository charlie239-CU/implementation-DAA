/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floydwarshall;

import java.util.Scanner;

/**
 *
 * @author vivek
 */
 class Algo
{
    int matrix[][];
    static int INF=9999;
    public void FloydCal(int graph[][],int n)
{
    matrix=graph;
    int i,j,k;
    
    for(k=0;k<n;k++)
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(matrix[i][j]>matrix[i][k]+matrix[k][j])
                {
                    matrix[i][j]=matrix[i][k]+matrix[k][j];
                }
            }
        }
    }
}
    void printMatrix(int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(matrix[i][j]==INF)
                    System.out.print("INF ");
                else
                    System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
public class FloydWarshall {
static int INF=9999;


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Algo alObj=new Algo();
        System.out.println("enter size");
        int n=scan.nextInt();
        int graph[][]=new int[n][n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                graph[i][j]=scan.nextInt();
            }
        }
        System.out.println("matrix before algorithm implementation");
        alObj.matrix=graph;
        alObj.printMatrix(n);
        System.out.println("matrix after algorithm implementation");
        alObj.FloydCal(graph, n);
        alObj.printMatrix(n);
    }
    
}
