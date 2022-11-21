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

class Result6 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here

   Collections.sort(arr);
  long min =0;
  long max =0;
  int count =0;
  
  int l = arr.size();
 
  
   do{
	   min +=arr.get(count);
	   max +=arr.get(l-1);
	   
	   count ++;
	   
	   l--;
   }while(count <4);
   System.out.println(min + " " + max);
    }

}

public class SumOfNo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result6.miniMaxSum(arr);

        bufferedReader.close();
    }
}
