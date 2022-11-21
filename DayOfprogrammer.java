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

	class Result20 {

	    /*
	     * Complete the 'dayOfProgrammer' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts INTEGER year as parameter.
	     */
		 static boolean isLeap(int year){
		        if(year<1918){
		            if(year%4==0){
		                return true;
		            }else{
		                return false;
		            }
		        }else{
		            if(year%400==0 || (year%4==0 && year%100 != 0)){
		                return true;
		            }else{
		                return false;
		            }
		        }

		    }
	    public static String dayOfProgrammer(int year) {
	    // Write your code here
	    	 if(year == 1918){
	                return "26.09.1918";
	            }
	            if(isLeap(year)){
	                return "12.09." + year;
	            }else{
	                return "13.09." + year;

	    }
	}
	}
	public class DayOfprogrammer {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        int year = Integer.parseInt(bufferedReader.readLine().trim());

	        String result = Result20.dayOfProgrammer(year);

	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
