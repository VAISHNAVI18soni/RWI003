package CollectionFramework;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.push("vaishu");
		s.push("soni");
		s.push(200);
		s.push(100.10);
		
		System.out.println(s);
		//System.out.println(s.pop());
		//System.out.println(s);

		
		//System.out.println(s.peek());
		//System.out.println(s);


		
		//System.out.println(s.search("soni"));
		//System.out.println(s);
		
		System.out.println(s.empty());
		System.out.println(s);


	}

}
