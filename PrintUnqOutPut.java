package demoJava;


	import java.io.*;
	import java.util.*;

	import java.io.IOException;
	import java.lang.reflect.Method;
	class Printer
	{
	   //Write your code here
	 public static < E > void printArray( E[] inputArray )
	   {
	      // Display array elements              
	         for ( E element : inputArray ){        
	            System.out.println(element);
	         }
	    }
	}
	public class PrintUnqOutPut {


	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    	 Printer myPrinter = new Printer();
	         Integer[] intArray = { 1, 2, 3 };
	         String[] stringArray = {"Hello", "World"};
	         myPrinter.printArray(intArray);
	         myPrinter.printArray(stringArray);
	         int count = 0;

	         for (Method method : Printer.class.getDeclaredMethods()) {
	             String name = method.getName();

	             if(name.equals("printArray"))
	                 count++;
	         }

	         if(count > 1)System.out.println("Method overloading is not allowed!");
	       
	     }
	    
	    }
	