/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i) {
          int n = in.nextInt();
          int arr[]=new int[n];
          int max=0;
          for (int j=0;j<n;j++)
          {
          int m = in.nextInt();
          arr[j]=m;
          if(m>max)
          {
              max=m;
          }
          }
          int arr1[]=new int[max];
          for(int j=1;j<=max; j++)
          {
              int count=0;
              int flag=0;
              for(int k=0;k<n;k++)
              {
                  if(flag==0 && arr[k]==j)
                  {
                      count++;
                      flag=1;
                  }
                  else{
                      flag=0;
                  }
              }
              arr1[j-1]=count;
          }
          int max1=0;
          int index=0;
          for(int j=0;j<max;j++)
          {
              if(arr1[j]>max1)
              {
                  max1=arr1[j];
                  index=j+1;
              }
          }
          System.out.println(index);
	}
}
}
