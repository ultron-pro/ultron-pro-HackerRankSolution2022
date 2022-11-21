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

	class Result41 {

	    /*
	     * Complete the 'permutationEquation' function below.
	     *
	     * The function is expected to return an INTEGER_ARRAY.
	     * The function accepts INTEGER_ARRAY p as parameter.
	     */

	    public static List<Integer> permutationEquation(List<Integer> p) {
	    // Write your code here
   
	    	int plength = p.size();
	    	Map<Integer, Integer> permut=new HashMap<Integer, Integer>();
	    	
	    	int [] result =new int[plength];
	    	
	    	List<Integer> list=new ArrayList<Integer>();
	    	for(int i=0; i<plength; i++)
	    	{
	    		permut.put(p.get(i), (i+1));
	    		
	    	}
	    	
	    	for(int i=0; i<plength;i++)
	    	{
	    		int x=i+1;
	    		int py= permut.get(x);
	    		result[i] = permut.get(py);
	    	}
	    	
	    	for(int j=0; j<result.length;j++)
	          {
	        	  list.add(result[j]);
	          }
		
	    	return list;
	    }

	}

	public class PermutationEquation {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> result = Result41.permutationEquation(p);

	        bufferedWriter.write(
	            result.stream()
	                .map(Object::toString)
	                .collect(joining("\n"))
	            + "\n"
	        );

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
