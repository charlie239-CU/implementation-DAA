package knapsack;

import java.util.Scanner;

class Knapsack { 
	
	
	static int max(int a, int b) 
	{ 
		return (a > b) ? a : b; 
	} 

	// Prints the items which are put 
	// in a knapsack of capacity W 
	static void printknapSack(int W, int wt[], 
							int val[], int n) 
	{ 
		int i, w; 
		int K[][] = new int[n + 1][W + 1]; 

		
		for (i = 0; i <= n; i++) { 
			for (w = 0; w <= W; w++) { 
				if (i == 0 || w == 0) 
					K[i][w] = 0; 
				else if (wt[i - 1] <= w) 
					K[i][w] = max(val[i - 1] + 
							K[i - 1][w - wt[i - 1]], K[i - 1][w]); 
				else
					K[i][w] = K[i - 1][w]; 
			} 
		} 

		// stores the result of Knapsack 
		int res = K[n][W]; 
		System.out.println(res); 

		w = W; 
		for (i = n; i > 0 && res > 0; i--) { 

			
			if (res == K[i - 1][w]) 
				continue; 
			else { 

				// This item is included. 
				System.out.print(wt[i - 1] + " "); 

				// Since this weight is included its 
				// value is deducted 
				res = res - val[i - 1]; 
				w = w - wt[i - 1]; 
			} 
		} 
	} 

	
	public static void main(String arg[]) 
	{ 
            Scanner scan=new Scanner(System.in);
            int n;
            System.out.println("enter the number of items");
            n=scan.nextInt();
            int val[]=new int[n];
            int wt[]=new int[n];
            System.out.println("enter the value and weight of item");
            for(int i = 0;i < n; ++i){
            val[i]=scan.nextInt();
            wt[i]=scan.nextInt();
            }
                System.out.println("enter the weight");
		int W=scan.nextInt();
		 
                System.out.println("result:");
		printknapSack(W, wt, val, n); 
	} 
}
