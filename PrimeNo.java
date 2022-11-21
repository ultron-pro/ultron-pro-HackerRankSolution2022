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
	import java.math.BigInteger;  



	public class PrimeNo {

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        String n = bufferedReader.readLine();
	        int number = Integer.parseInt(n);
          //  int val =Integer.parseInt(n);
          //  BigInteger n = in.nextBigInteger();
	        bufferedReader.close();
	        
//	        int i,m=0,flag=0;
//	        
//	        m=val/2;
//	        if(val==0||val==1){
//	        System.out.println("prime");
//	        }
//	        else{
//	        for(i=2;i<=m;i++){
//	        if(val%i==0){
//	        System.out.println("not prime");
//	        flag=1;
//	        break;
//	        }
//	        }
//	        if(flag==0) { System.out.println("prime"); }
//	        
	        //int number = Integer.parseInt(n);
	        BigInteger bi = new BigInteger(n);
	        System.out.println(bi.isProbablePrime(10) ? "prime" : "not prime");
	        bufferedReader.close();
	        
	    }
	}