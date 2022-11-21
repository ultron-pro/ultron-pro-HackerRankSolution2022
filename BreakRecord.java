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

	class Result14 {

	    /*
	     * Complete the 'breakingRecords' function below.
	     *
	     * The function is expected to return an INTEGER_ARRAY.
	     * The function accepts INTEGER_ARRAY scores as parameter.
	     */

	    public static List<Integer> breakingRecords(List<Integer> scores) {
	    // Write your code here
//	    	 List<Integer> list = new ArrayList<>();
//	    	int minr =0;
//	    	int maxr = 0;
//	    	int min=scores.size();
//	    	int max=scores.size();
//	    	
//	    	for(int i=1; i<scores.size();i++)
//	    	{
//	    		if(scores.get(i)< min)
//	    		{
//	    			min = scores.get(i);
//	    			minr++;
//	    		}
//	    	
//	    	if(scores.get(i)>max)
//	    	{
//	    		max=scores.get(i);
//	    		maxr++;
//	    	}
//	    }
//
//	    int[] m=new int[2];
//	   // m[2] = minr;
//	    m[1] = minr;
//	    m[0] = maxr;
//	    
//	    for(int i : m)
//	    {
//	    	list.add(i);
//	    }
//	   
//	    return list;
//	}
	    List<Integer> list = new ArrayList<Integer>();
	    	int n = scores.size();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++)
	            a[i] = scores.get(i);
	        int min = a[0];
	        int max = a[0];
	        int res1 = 0, res2 =0;
	        
	        for (int i = 1; i < n; i++) {
	            if (a[i] > max) {
	                res1++;
	                max = a[i];
	            }
	            if (a[i] < min) {
	                res2++;
	                min = a[i];
	            }
	        }
	        
	        
	        int [] r=new int [2];
	        
	        r[0]= res1;
	        r[1]=res2;
	        
	        for(int i: r )
	        {
	        	list.add(i);
	        }
			return list;	
	    	
	    }
}
	public class BreakRecord {

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> result = Result14.breakingRecords(scores);

	        bufferedWriter.write(
	            result.stream()
	                .map(Object::toString)
	                .collect(joining(" "))
	            + "\n"
	        );

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
