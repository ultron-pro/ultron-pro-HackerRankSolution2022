package demoJava;


	import java.util.*;
	import java.security.*;
	interface Food1 {
		 public String getType();
		}
		class Pizza1 implements Food1 {
		 public String getType() {
		 return "Someone ordered a Fast Food!";
		 }
		}

		class Cake1 implements Food1{

		 public String getType() {
		 return "Someone ordered a Dessert!";
		 }
		}
		class FoodFactory {
			public Food1 getFood(String order) {

				if(order.equals("cake")){
					 
				    return new Cake1();
				}else{
				    return new Pizza1();
				}

	}//End of getFood method

		}//End of factory class

		public class FoodHotelOrd {

		 public static void main(String args[]){
				Do_Not_Terminate1.forbidExit();

			try{

				Scanner sc=new Scanner(System.in);
				//creating the factory
				FoodFactory foodFactory = new FoodFactory();
		
				//factory instantiates an object
				Food1 food = (Food1) foodFactory.getFood(sc.nextLine());
		
				
				System.out.println("The factory returned "+food.getClass());
				System.out.println(food.getType());
			}
			catch (Do_Not_Terminate1.ExitTrappedException e) {
				System.out.println("Unsuccessful Termination!!");
			}
		 }

		}
		class Do_Not_Terminate1 {
			 
		    public static class ExitTrappedException extends SecurityException {

				private static final long serialVersionUID = 1L;
		    }
		 
		    public static void forbidExit() {
		        final SecurityManager securityManager = new SecurityManager() {
		            @Override
		            public void checkPermission(Permission permission) {
		                if (permission.getName().contains("exitVM")) {
		                    throw new ExitTrappedException();
		                }
		            }
		        };
		        System.setSecurityManager(securityManager);
		    }
		}	
			




