package demoJava;


import java.util.Arrays;
import java.util.Scanner;

	public class IsAnagaraDemo {

	    static boolean isAnagram(String a, String b) {
	        // Complete the function
//	       a=a.toLowerCase();
//	       b=b.toLowerCase();
//	       boolean f = false;
//	       char[] c = a.toCharArray();
//	       
//	       Arrays.sort(c);
//           char[] d = a.toCharArray();
//	       
//	       Arrays.sort(d);
//	       
//	       String a1 = new String (c);
//	       String b1=new String(d);
//	       
//	       if(a1.equals(b1))
//	       {
//	    	   f=true;
//	       }
//	       
//	       return f;
//	       
//	       
	       
	    	a=a.toUpperCase();
	        b=b.toUpperCase();
	        boolean ret = false;
	        StringBuilder c= new StringBuilder(b);

	        if(a.length()==b.length()){
	            for(int i=0; i<a.length();i++){
	                for(int j=0; j<c.length();j++){
	                    if(a.charAt(i)==c.charAt(j)){
	                            c.deleteCharAt(j);
	                        if(i==a.length()-1 && c.length()==0){
	                            ret=true;
	                            break;
	                        }
	                        break;

	                    }

	                }
	            }
	        }return ret;

	       
	    }

	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}
