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

class ResultDemo {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
  float p=0;
  float n=0;
  float z=0;
  int size =arr.size();
  List<Integer> no;
  
  for(int i=0; i<size;i++)
  {
      if(arr.get(i)==0)
      {
          z++;
      }
      else{
          if(arr.get(i)>0)
          {
              p++;
          }
          else{
              n++;
          }
      }
  }
  p/=arr.size();
  n/=arr.size();
  z/=arr.size();
  
  System.out.println(p);
        System.out.println(n);
        System.out.println(z);
    }

}

public class PlusMin {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        ResultDemo.plusMinus(arr);

        bufferedReader.close();
    }
}
