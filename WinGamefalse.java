package demoJava;


	import java.util.*;

	public class WinGamefalse {

//	    public static boolean canWin(int leap, int[] game) {
//	        // Return true if you can win the game; otherwise, return false.
////	        int i;
////	        if (i < 0 || game[i] == 1)
////	                 return false;
////	             if (i + 1 >= game.length || i + leap >= game.length)
////	                 return true;
////
////	             game[i] = 1; //flag
////
////	             return canWin(leap, game, i + leap)
////	                     || canWin(leap, game, i + 1)
////	                     || canWin(leap, game, i - 1);
//	    	return 12;
//	         }

	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }

	            //System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	        }
	        scan.close();
	    }
	}