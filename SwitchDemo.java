package demoJava;

public abstract class SwitchDemo {

	public abstract  void methodOne();
	public static void main(String[] args) {

		System.out.println("A class ");
		
	 }
		
}
 final class B extends SwitchDemo
 {
	 static int x=10;

	 public static void main(String[] args) {
		
		System.out.println(" class B :"+x);
		
		SwitchDemo s=new SwitchDemo() {
			
			@Override
			public void methodOne() {
				// TODO Auto-generated method stub
				System.out.println("switch..........");
			}
		};
		
		s.methodOne();
		
	}
	 static
	 {
		 x=999;
		 System.out.println(" class B :"+x);
	 }
	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		
	}
	 
 }

 class C 
 {
	 public static void main(String[] args) {
		System.out.println(" class C");
	}
 }
 
 class D
 {
	 public static void main(String[] args) {
		
		 System.out.println("class D");
	}
 }
