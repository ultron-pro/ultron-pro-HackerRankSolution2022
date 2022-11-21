package demoJava;


	//Complete this code or write your own from scratch
	import java.util.*;
	import java.io.*;

	public class CheckFirstNameFormate {
		private static Scanner inputScanner;
		public static void main(String []argh)
		{
			Map database = new HashMap();
			Scanner in = new Scanner(System.in);
			int n=in.nextInt();
			in.nextLine();
			
			for(int i=0;i<n;i++)
		      {
		         String name=in.nextLine();
		         int phone=in.nextInt();
		         database.put(name,""+phone);
		         in.nextLine();
		      }
		      while(in.hasNext())
		      {
		         String s=in.nextLine();
		         String phone = (String)database.get(s); 
		         System.out.println(phone==null?"Not found":s+"="+phone);
		      }
			
			
//			for(int i=0;i<n;i++)
//			{
//				String name=in.nextLine();
//				int phone=in.nextInt();
//                in.nextLine();
//				phoneBook.put(name, phone);
//			}
//			while(in.hasNext())
//			{
//				String s=in.nextLine();
//				
//				String phone =(String)phoneBook.get(s);
//				
//			}
		}
	}



