package demoJava;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) 
    {
		
    	  int alice = 0;
    	  int bob = 0;
    	  
    	  List<Integer> answer = new  ArrayList<Integer>();
    	  
    	  for(int i=0; i<3 ; i++)
    	  {
    		  answer.add(0,alice);
    		  answer.add(1,bob);
    		  
    	  }
    	
    	
    	  return answer;
      
      
      }
    

}

public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }
        for (int j = 0; j < bTemp.length; j++) {
			System.out.println(j);
		}

//        List<Integer> result = Result.compareTriplets(a, b);
//
//        for (int i = 0; i < result.size(); i++) {
//            bufferedWriter.write(String.valueOf(result.get(i)));
//
//            if (i != result.size() - 1) {
//                bufferedWriter.write(" ");
//            }
//        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
