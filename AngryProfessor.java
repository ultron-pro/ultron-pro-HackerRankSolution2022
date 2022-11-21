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

	class Result34 {

	    /*
	     * Complete the 'angryProfessor' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts following parameters:
	     *  1. INTEGER k
	     *  2. INTEGER_ARRAY a
	     */

	    public static String angryProfessor(int k, List<Integer> a) {
	    // Write your code here
	    	int realcount = 0;
	        String yes = "YES";
	        String no = "NO";
	        for(int i=0; i<a.size(); i++){
	            if(a.get(i) <= 0){
	                realcount += 1;
	            }
	        }
	        if(realcount >= k){
	            return no;
	        }else{
	            return yes;
	        }
	    }

	}

	public class AngryProfessor {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	        int t = Integer.parseInt(bufferedReader.readLine().trim());

	        IntStream.range(0, t).forEach(tItr -> {
	            try {
	                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	                int n = Integer.parseInt(firstMultipleInput[0]);

	                int k = Integer.parseInt(firstMultipleInput[1]);

	                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                    .map(Integer::parseInt)
	                    .collect(toList());

	                String result = Result34.angryProfessor(k, a);

	                bufferedWriter.write(result);
	                bufferedWriter.newLine();
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
