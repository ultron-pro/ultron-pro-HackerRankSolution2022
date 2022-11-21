package demoJava;


	import java.io.*;
	import java.util.*;

	public class SplitStringDemo {

	    public static void main(String[] args) {
	    	System.out.println("start.");
	        Scanner scan = new Scanner(System.in);
	        if (!scan.hasNext()){
	            System.out.println(0);
	        }else {
	             String input=scan.nextLine();
	            String[]a = input.trim().split("[ !,?._'@]+");
	            ArrayList<String>listOfStrings =new ArrayList<String>(Arrays.asList(a));
	            System.out.println(listOfStrings.size());
	      
	          for(String str:listOfStrings){
	            System.out.println(str);
	          }    
	        }
	        
	        
	        
	    }
	}