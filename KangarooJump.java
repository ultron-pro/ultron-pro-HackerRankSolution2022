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

	class Result12 {

	    /*
	     * Complete the 'kangaroo' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts following parameters:
	     *  1. INTEGER x1
	     *  2. INTEGER v1
	     *  3. INTEGER x2
	     *  4. INTEGER v2
	     */

	    public static String kangaroo(int x1, int v1, int x2, int v2) {
	    // Write your code here

	        if (x1 == x2) {
	            return "YES";
	        }
	        int diff = v1 > v2 ? v1 - v2 : v2 - v1;
	        if (diff == 0) {
	            return "NO";
	        }
	        
	        int xdiff = x1 - x2;
	        int vdiff = v2 - v1;
	        
	        if ((xdiff < 0 && vdiff < 0) || (xdiff > 0 && vdiff > 0)) {
	            int mod = xdiff % vdiff;
	            int mod2 = vdiff % xdiff;
	            if (mod == 0 || mod2 == 0) {
	                return "YES";
	            }
	        }
	        return "NO";
	    }

	}
	public class KangarooJump {
		
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int x1 = Integer.parseInt(firstMultipleInput[0]);

	        int v1 = Integer.parseInt(firstMultipleInput[1]);

	        int x2 = Integer.parseInt(firstMultipleInput[2]);

	        int v2 = Integer.parseInt(firstMultipleInput[3]);

	        String result = Result12.kangaroo(x1, v1, x2, v2);

	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
