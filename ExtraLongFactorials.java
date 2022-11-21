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

	class Result42 {

	    /*
	     * Complete the 'extraLongFactorials' function below.
	     *
	     * The function accepts INTEGER n as parameter.
	     */

	    public static void extraLongFactorials(int n) {
	    // Write your code here

	    	 BigInteger b = new BigInteger(String.valueOf(n));
	         System.out.print(fact(b, n));
	    }

	    static BigInteger fact(BigInteger n, int t){
	        BigInteger result = new BigInteger(String.valueOf(1));
	        for(int i = 1; i <= t; i++){
	            result = result.multiply(new BigInteger(String.valueOf(i)));
	        }
	        return result;
	    }

	}

	public class ExtraLongFactorials {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        Result42.extraLongFactorials(n);

	        bufferedReader.close();
	    
	       
	    }
	}
