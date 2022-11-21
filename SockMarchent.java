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

	class Result22 {

	    /*
	     * Complete the 'sockMerchant' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER n
	     *  2. INTEGER_ARRAY ar
	     */

	    public static int sockMerchant(int n, List<Integer> ar) {
	    // Write your code here
           int s=ar.size();
	    	if(n==0)
	    	{
	    		return 0;
	    	}
	    	if(s == 0)
	    	{
	    		return 0;
	    	}
	    
	    int pair =0;
	    
	    List<Integer> array= new ArrayList<Integer>();
	    
	    for(int i=0; i<n; i++)
	    {
	    	array.add(ar.get(i));
	    }
	    while(!array.isEmpty())
	    {
	    	Integer x= array.get(0);
	    	array.remove(x);
	    	
	    	for(Integer y:array)
	    	{
	    		if(x==y)
	    		{
	    			pair++;
	    			array.remove(y);
	    			break;
	    		}
	    	}
	    }

	    return pair;
	}
	}

	public class SockMarchent {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = Result22.sockMerchant(n, ar);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
