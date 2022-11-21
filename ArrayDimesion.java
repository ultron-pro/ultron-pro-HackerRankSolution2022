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



	public class ArrayDimesion {
	     
		static int R = 6;
		static int C = 6;
		 
		
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        Scanner scan = new Scanner(System.in); 
	        int largestSum = 0;
	        int max = Integer.MIN_VALUE;
	        
	        
	        List<List<Integer>> arr = new ArrayList<>();

	        IntStream.range(0, 6).forEach(i -> {
	            try {
	                arr.add(
	                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                        .map(Integer::parseInt)
	                        .collect(toList())
	                );
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });
	        
	        
	        
	        
	        
	        
	        for (int i = 0; i <R-2; i++) {      
	            arr.add(new ArrayList<>());      //For every instance of row create an Arraylist
	            for (int j = 0; j <R-2; j++) {
	               // arr.get(i).add(j);   
	                
                //Specify values for each indices  
	            	int sum=0;
	            	
	               int firstTemp=arr.get(i).get(j)+//1
	            		   arr.get(i).get(j+1)+//2
	            		   arr.get(i).get(j+2);//3
	            		   
	              int secondtemp=arr.get(i+1).get(j+1);//4
	              
	              int thirdtemp=arr.get(i+2).get(j)+//5
	            		   arr.get(i+2).get(j+1)+//6
	            		   arr.get(i+2).get(j+2);//7
              
	             
	              sum = firstTemp + secondtemp + thirdtemp;
	             
		              
//	              max = sum>max?sum:max; 
	              max = Math.max(max, sum);
	              
	              if(i==0 && j==0)
		            {
		               largestSum =max;
		            }
		            else
		            {
		            	if(max > largestSum)
		            	{		            		
		            		
		            		largestSum =max;
		            	}
		            }
		            
	            }
	        }
	        System.out.println(largestSum);
	        

	        bufferedReader.close();
	    }
	    }
	
	
