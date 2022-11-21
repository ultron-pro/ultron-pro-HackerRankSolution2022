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

	class Result {

	    /*findDigits
	     * Complete the '' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts INTEGER n as parameter.
	     */

	    public static int findDigits(int n) {
	    	int t,ans,d;
	        int m;
	while(n-->0)
	{
	    ans=0;
	    t=n;
	    
	    m=t;
	    
	    while(m!=0)
	    {
	        d=(int)m%10;
	        m=m/10;
	        if(d==0)
	        continue ;
	        
	        if(n%d==0)
	        ans++;
	    }
	 
	    return ans;
	}
	

	  
	    }


	}


	public class FindDigits {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int t = Integer.parseInt(bufferedReader.readLine().trim());

	        IntStream.range(0, t).forEach(tItr -> {
	            try {
	                int n = Integer.parseInt(bufferedReader.readLine().trim());

	                int result = Result.findDigits(n);

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
