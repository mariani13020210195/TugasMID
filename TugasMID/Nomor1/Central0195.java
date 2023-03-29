interface A{ public void aaa(); }
interface B extends A{
public void aaa();
}
class Central0195{
public void aaa(){
System.out.println("aaa");
}
public static void main(String arg[]){
System.out.println("main");
this.aaa();
}
}