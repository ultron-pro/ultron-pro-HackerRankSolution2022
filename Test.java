package demoJava;
interface one
{
	int x=100;
	public void methodone(int i);
	public void method2(int i);
	public void method3(int i);
	public void method4(int i);
	public void method5(int i);
}
abstract class AbDemo implements one
{
 
	public void methodone(int i) {
	}
	public void method2(int i) {
	}
	public void method3(int i) {
	}
	public void method4(int i) {
	}
	public void method5(int i) {
	}
}
interface two
{
	int y=200;
	public void methodone(int i);
}
public class Test extends AbDemo  implements two{
	int i ;

 static public void main(String[] args) {
	
	Test s=new Test();
//	one d=new one();
	s.methodone(10);
}

@Override
public void methodone(int i) {
	
	
}
}
