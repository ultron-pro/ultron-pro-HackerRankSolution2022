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

class Result18 {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    
//    	int n= arr.size();
//    	int[] types =new int[n];
//    	int []count = new int [6];
//    	int max=0;
//    	
//    	for(int i=0; i< n ; i++)
//    	{
//    		types[i]= arr.size();
//    		count[types[i]]++;
//    		if(count[types[i]]>max)
//    			max=count[types[i]];
//    	}
//    	System.out.println(max);
//    	return max;
    	
    	int count[] = new int[6];
    	int result = 1;
    	int max = 0;
    	for(int i=0; i<arr.size(); i++)
    	{
    		count[arr.get(i)]++;
    	}
    	
    	for(int i=0; i<=5; i++)
    	{
    		if(count[i]>max)
    		{
    			result = i;
    			max = count[i];
    		}
    	}
    	
    	return result;
    }

}

	public class MigretBird {

		public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = Result18.migratoryBirds(arr);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
