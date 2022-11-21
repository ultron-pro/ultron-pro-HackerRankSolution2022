package demoJava;



	import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

	public class StdInput {

	    public static void main(String[] args) throws NumberFormatException, IOException {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    
//	    	Scanner scan = new Scanner(System.in);
//	        int i = scan.nextInt();
//	        double d = scan.nextDouble();
//	        String s="";
////	        while(scan.hasNext())
////	        {
////	            s=scan.nextLine();
////	        }
////	      
//	        while(scan.hasNextInt())
//	        {
//	        	s=scan.next();
//	        }
//	        System.out.println("String: " + s);
//	        System.out.println("Double: " + d);
//	        System.out.println("Int: " + i);
//	         
	    	
	    	 Scanner sc = new Scanner(System.in);
	         int i=1;
	         while (sc.hasNext()) {
	         	String s=sc.nextLine();
	         	System.out.println(i + " " + s);
	         	i++;
	         }
	    

	    }
	}
