package stack;
import java.util.Stack;
public class App {
	public static void main(String[] args) {
		Stack<Integer> demo = new Stack<Integer>();
		demo.push(10);
		demo.push(20);
		demo.push(30);
		demo.push(40);
		//demo.push(20); we can add duplicate
		demo.push(50);
		System.out.println(demo);
		//demo.pop();
		System.out.println(demo.peek());
		for(Integer i:demo)
		{
			System.out.println(i);
		}
		if(demo.isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
		System.out.println(demo.search(10));
	}
}