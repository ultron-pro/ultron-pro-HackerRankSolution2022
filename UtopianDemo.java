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

	class Result33 {

	    /*
	     * Complete the 'utopianTree' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts INTEGER n as parameter.
	     */

	    public static int utopianTree(int n) {
	    // Write your code here
	      int h=1;
	      
	      for(int i=1; i<=n ; i++)
	      {
	          if(i %2 != 0)
	             h *=2;
	             else
	             h +=1;
	      }
	      return h;
	    }

	}

	public class UtopianDemo {
    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	         int t = Integer.parseInt(bufferedReader.readLine().trim());

	        IntStream.range(0, t).forEach(tItr -> {
	            try {
	                int n = Integer.parseInt(bufferedReader.readLine().trim());

	                int result = Result33.utopianTree(n);

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
