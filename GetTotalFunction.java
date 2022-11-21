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

class Result13 {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
     int no1= a.size();
     int no2= b.size();
     boolean var, var2 ;
     int i;
     int j;
      int m=0;
     for(i=a.get(a.size()-1);i<=b.get(0); i++)
     {
    	var = false;
    	
    	for(j=0;j<a.size();j++)
    	{
    		if(i%a.get(j)==0)
    		{
    			var = true;
    		}
    		else
    		{
    			var = false;
    			break;
    		}
    	}
    	if(var == true)
    	{
    		var2= false;
    		
    		for(int k= 0; k<b.size();k++)
    		{
    			if(b.get(k)%i==0)
    			{
    				var2=true;
    			}
    			else
    			{
    				var2=false;
    				break;
    			}
    		}
    		if(var2== true)
    		{
    			m++;
    		}
    	}
     }
    	
     return m;	
    }

}

public class GetTotalFunction {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result13.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

