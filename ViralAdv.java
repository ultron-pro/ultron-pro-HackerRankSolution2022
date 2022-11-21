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

	class Result37 {

		public static final int INITIAL_AMOUNT_OF_PEOPLE = 5;
	    /*
	     * Complete the 'viralAdvertising' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts INTEGER n as parameter.
	     */

	    public static int viralAdvertising(int n) {
	    // Write your code here
	    	int currentAmt = INITIAL_AMOUNT_OF_PEOPLE;
	        int totalnum =0;
	    	for(int i=0; i<n; i++)
	{
		 currentAmt = currentAmt/2;
		 
		 totalnum += currentAmt;
		 currentAmt *=3;
		
	}
			return totalnum;
	    }

	     
	}

	public class ViralAdv {
		
    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        int result = Result37.viralAdvertising(n);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
