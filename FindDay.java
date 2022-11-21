package demoJava;


	import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

	class Result28 {

	    /*
	     * Complete the 'findDay' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts following parameters:
	     *  1. INTEGER month
	     *  2. INTEGER day
	     *  3. INTEGER year
	     */

	    public static String findDay(int month, int day, int year) {

	    	
	    	int d=Integer.valueOf(day);
	    	int m=Integer.valueOf(month);
	    	int y=Integer.valueOf(year);
	    	
	    	//LocalDate date= LocalDate.of(y,m,d);
	    	Calendar date=Calendar.getInstance();
//	    	LocalDate date = LocalDate.of(y, m, d);
	    	date.set(Calendar.MONTH,m-1);
	        date.set(Calendar.DAY_OF_MONTH,d);
	        date.set(Calendar.YEAR,y);
	    	
	    	//date.set(m,d,y);
//	        return date.getDayOfWeek().toString();
//	    	
	    	String week=date.getDisplayName(date.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
	       //String week=date.getDisplayName(date, style, locale)
	    	return week;
	    	



	    }

	}

	public class FindDay {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter =  new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int month = Integer.parseInt(firstMultipleInput[0]);

	        int day = Integer.parseInt(firstMultipleInput[1]);

	        int year = Integer.parseInt(firstMultipleInput[2]);

	        String res = Result28.findDay(month, day, year);

	        bufferedWriter.write(res);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}