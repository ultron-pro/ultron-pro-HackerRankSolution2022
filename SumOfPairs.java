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

	class Result16 {

	    /*
	     * Complete the 'divisibleSumPairs' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER n
	     *  2. INTEGER k
	     *  3. INTEGER_ARRAY ar
	     */

	    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
	    // Write your code here
          int m=0;
          
          for(int i=0; i<n ; i++)
          {
        	  ar.get(i);
          }
          int result = 0;
          
          for(int i=0; i<ar.size();i++)
          {
        	  for(int j=i; j<ar.size();j++)
        	  {
        		  if(i != j && (ar.get(i)+ar.get(j))% k == 0)
        		  {
        			  result++;
        		  }
        	  }
          }
          return result;
	    }

	}

	public class SumOfPairs {
		
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int n = Integer.parseInt(firstMultipleInput[0]);

	        int k = Integer.parseInt(firstMultipleInput[1]);

	        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = Result16.divisibleSumPairs(n, k, ar);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
