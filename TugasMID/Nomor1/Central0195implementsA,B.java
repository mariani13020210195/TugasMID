//Mariani 13020210195

interface A
{ public void aaa(); }
interface B extends A{
	public void aaa();
}
class Central0195 implements A,B{
	public void aaa(){
		System.out.println("aaa");
}
public static void main(String arg[]){
	System.out.println("main");
	this.aaa();
	}
}