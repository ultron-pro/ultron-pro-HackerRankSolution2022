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

	class Result32 {

	    /*
	     * Complete the 'designerPdfViewer' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER_ARRAY h
	     *  2. STRING word
	     */

	    public static int designerPdfViewer(List<Integer> h, String word) {
	    // Write your code here
	   int area;
	   
	   int maxh= h.get(0);
	   int wlength = word.length();
	   
	   for(int i=0; i<wlength;i++)
	   {
	       maxh = (maxh < h.get(word.charAt(i)%97))? h.get(word.charAt(i)%97) : maxh;
	   }
	   
	   area = wlength * maxh;
	   return area;
	   
	    }

	}

	public class MaxHeightDemo {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	         List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        String word = bufferedReader.readLine();

	        int result = Result32.designerPdfViewer(h, word);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
