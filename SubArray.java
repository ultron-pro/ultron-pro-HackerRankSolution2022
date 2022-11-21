package demoJava;


	import java.io.*;
	import java.util.*;

	public class SubArray {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    	 Scanner sc = new Scanner(System.in);
	         int num = sc.nextInt();
	         int[]numbers = new int[num];
	         for(int i = 0;i<num;i++){
	             numbers[i]=sc.nextInt();
	         }
	         int count = 0;
	         for(int i = 0;i<num;i++){
	             int sum = numbers[i];
	             if(sum<0) count++;
	             for(int j = i+1;j<num;j++){
	                 sum+=numbers[j];
	                 if(sum<0) count++;
	             }
	         }
	         System.out.println(count);
	     }
	}