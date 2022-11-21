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

class Result8 {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
//  int max=candles.size();
//  
//  int tall=0;
//  int  nb=0;
//    //List<Integer> no;
//  System.out.println(max);
//  for(int i=0; i<max;i++)
//  {
//	  int height =candles.size();
//	if(height > tall)
//	{
//		System.out.println(height);
//		System.out.println(max);
//		max = height;
//		nb=1;
//	}
//	else if(max == tall) nb ++;
//  }
//  
//  return nb;
//    }

    	
    	int max = Integer.MIN_VALUE;
    	
    	for(Integer candle : candles)
    	{
    		if(candle >= max)
    		
    			max = candle;
    	
    	}
    	int result =0;
    	for(Integer candle1 : candles)
    	{
    		if(candle1== max)
    			
    			result ++;
    	}

    	return result;
    }
}
public class BirthdayCandle {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =  new BufferedWriter(new OutputStreamWriter(System.out));
        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result8.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
