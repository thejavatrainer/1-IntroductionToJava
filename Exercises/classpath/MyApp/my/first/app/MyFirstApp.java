package my.first.app;
import my.second.app.MySecondClass;
public class MyFirstApp{
public static void main(String[] args){
	MySecondClass mySecondClass = new MySecondClass();
System.out.println("Hello from my first app, "+ mySecondClass.getName());
}
}