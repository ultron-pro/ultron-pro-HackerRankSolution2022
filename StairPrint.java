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

class Result5 {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
 for(int i = 1; i<=n; i++)
 {
     for(int j=i;j<n; j++)
     {
         System.out.print(" ");
     }
     
     for( int  k = n-i ; k<n ; k++)
     {
         System.out.print("#");
     }
     System.out.println("");
 }
    }

}

public class StairPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result5.staircase(n);

        bufferedReader.close();
    }
}
