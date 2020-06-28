/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String leftrotate(String str, int d) 
    { 
            String ans = str.substring(d) + str.substring(0, d); 
            return ans; 
    }
    static String rightrotate(String str, int d) 
    { 
            return leftrotate(str, str.length() - d); 
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
          String str = in.next();
          String str1=leftrotate(str,1);
          String str2=rightrotate(str,1);
          if(str1.equals(str2))
          {
              System.out.println("YES");
          }
          else{
              System.out.println("NO");
          }
          
        }
	}
}
