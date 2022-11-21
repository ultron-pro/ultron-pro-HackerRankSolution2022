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

class Result9 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
//    	 int a = (int)s.charAt(0)-'0';
//         int b = (int)s.charAt(1)-'0';
//         // - '0' is because ascii value of 0 which is 48 is added in variable a and b, so resolve this issue subtract '0' from a and b
//         int hh = a*10 + b%10;
//         if (s.charAt(8)=='A')
//         {
//             if (hh==12)
//             {
//             System.out.print("00");
//             for (int k = 2; k<8;k++)
//             System.out.print(s.charAt(k));
//             }
//             else
//             {
//             for (int l = 0; l<8;l++)
//             System.out.print(s.charAt(l));
//             }                
//             }
//
//         if (s.charAt(8)=='P')
//         {
//             if (hh==12)
//             {
//             for (int l = 0; l<8;l++)
//             System.out.print(s.charAt(l));
//             }                
//             else
//             {
//             hh = hh+12;
//             System.out.print(hh);
//             for (int k = 2; k<8;k++)
//             System.out.print(s.charAt(k));
//             }
//         }
//        String k = " ";
//         return k;
//     }
    	String t = s;
    	
        DateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");
        DateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");
        Date date = null;
        try {
            date = inFormat.parse(t); 
        }catch (ParseException e ){
            e.printStackTrace();
        }
        if( date != null ){
            String myDate = outFormat.format(date);
            //System.out.println(myDate);
            t=myDate;
        }
		return t;
    }
    	
}
public class TimeConversation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bufferedReader.readLine();

        String result = Result9.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
