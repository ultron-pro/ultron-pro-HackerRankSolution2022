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

	class Result38 {

	    /*
	     * Complete the 'saveThePrisoner' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER n
	     *  2. INTEGER m
	     *  3. INTEGER s
	     */

	    public static int saveThePrisoner(int n, int m, int s) {
	    // Write your code here

	  int result = (m+s -1)%n;
	  if(result ==0)
	  result =n;
	  
	  return result;
	    }

	}

	public class SaveThePrisoner {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        int t = Integer.parseInt(bufferedReader.readLine().trim());

	        IntStream.range(0, t).forEach(tItr -> {
	            try {
	                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	                int n = Integer.parseInt(firstMultipleInput[0]);

	                int m = Integer.parseInt(firstMultipleInput[1]);

	                int s = Integer.parseInt(firstMultipleInput[2]);

	                int result = Result38.saveThePrisoner(n, m, s);

	                bufferedWriter.write(String.valueOf(result));
	                bufferedWriter.newLine();
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
