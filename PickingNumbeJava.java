package demoJava;


	import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

	class Result30 {

	    /*
	     * Complete the 'pickingNumbers' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts INTEGER_ARRAY a as parameter.
	     */

	    public static int pickingNumbers(List<Integer> a) {
	    	Collections.sort(a);
	        int start = 0;
	        int i = 0;
	        int max = 0;
	        while (i < a.size()) {
	          if (Math.abs(a.get(start) - a.get(i)) > 1) {
	            start = i;
	          }
	          max = Math.max(max, i - start + 1);
	          i++;
	        }
	        i--;

	        return Math.max(max, i - start + 1);
	      }

	}

	public class PickingNumbeJava {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = Result30.pickingNumbers(a);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
