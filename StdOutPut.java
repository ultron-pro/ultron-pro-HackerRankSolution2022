package demoJava;



	import java.io.*;
	import java.util.*;

	public class StdOutPut {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
//	        char charA[] =A.toCharArray();
//	        
//	        
//	        Arrays.sort(charA);
//	        char charB[]=B.toCharArray();
//	        Arrays.sort(charB);
//	        System.out.println(new String(charA));
//	        System.out.println(new String(charB));
	        
	        
	        System.out.println(A.length()+B.length());
	        int i = A.compareTo(B);
	        if(i>0){
	             System.out.println("Yes");
	        } else{
	             System.out.println("No");
	        }
	        String atemp = A.substring(0,1).toUpperCase()+A.substring(1);
	        String btemp = B.substring(0,1).toUpperCase()+B.substring(1);
	        
	        String btemp2 = B.substring(0,2).toUpperCase()+B.substring(2);
	        System.out.println(atemp+" "+btemp);
	        System.out.println(btemp2);
	    }
	}