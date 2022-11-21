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

	class Result36 {

	    /*
	     * Complete the 'beautifulDays' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER i
	     *  2. INTEGER j
	     *  3. INTEGER k
	     */

	    public static int beautifulDays(int i, int j, int k) {
	    // Write your code here

	    	int count = 0;

	        for(int day = i; day <= j; day++)
	        {
	            if(Math.abs(day - Integer.parseInt(new StringBuilder().append(day).reverse().toString())) % k == 0)
	                count++;
	        }

	        return count;
	    }
	    }

	

	public class BeautifullMovies {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter =  new BufferedWriter(new OutputStreamWriter(System.out));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int i = Integer.parseInt(firstMultipleInput[0]);

	        int j = Integer.parseInt(firstMultipleInput[1]);

	        int k = Integer.parseInt(firstMultipleInput[2]);

	        int result = Result36.beautifulDays(i, j, k);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
