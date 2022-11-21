package demoJava;


	import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result24 {

	    /*
	     * Complete the 'pageCount' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER n
	     *  2. INTEGER p
	     */

	    public static int pageCount(int n, int p) {
	    // Write your code here

	    	int s=0;
	    	
	    	if(p <= n/2)
	    	{
	    		for(int i=1; i<=p; i++)
	    		{
	    			if(i%2 == 0)
	    			{
	    				s++;
	    			}
	    		}
	    	}
	    	else
	    	{
	    		if(n%2 == 1)
	    		{
	    			s--;
	    		}
	    		 for(int j =n;j>=p;j--){
	                 if(j%2==1){
	                     s++;
	                 }
	             } 
	         }
	         return s;
	    }

	}

	public class BookPageCount {
    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	
	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        int p = Integer.parseInt(bufferedReader.readLine().trim());

	        int result = Result24.pageCount(n, p);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
