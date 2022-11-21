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

	class Result31 {

	    /*
	     * Complete the 'climbingLeaderboard' function below.
	     *
	     * The function is expected to return an INTEGER_ARRAY.
	     * The function accepts following parameters:
	     *  1. INTEGER_ARRAY ranked
	     *  2. INTEGER_ARRAY player
	     */

	    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
	    
	    	int n = player.get(0);
	    	int md=0;
	    	List scores =new ArrayList();
	    	for(int i=0;i<n;i++)
	    	{
	    		 scores = ranked;
	    		if(scores.size()==0 || scores.get(scores.size()-1)!= scores)
	    		{
	    	       scores.add(scores);	
	    		}
	    		int m= player.get(0);
	    		
	    		for(int j=0; j< m;j++)
	    		{
	    			int score=player.get(0);
	    			int min =0;
	    			int max = scores.size();
	    			
	    			while (max >min)
	    			{
	    				int mid = (min + max)/2;
	    				
	    				if(scores.size()<= score)
	    				 max = mid;
	    				else
	    				 min = mid +1;
	    			}
	    	     md=min+1;	
	    		}
	    		
	    	}
			return  n;
	    	

	      
	    }
	    //return md;

	}

	public class ClimBoardJava {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> result = Result31.climbingLeaderboard(ranked, player);

	        bufferedWriter.write(
	            result.stream()
	                .map(Object::toString)
	                .collect(joining("\n"))
	            + "\n"
	        );

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
