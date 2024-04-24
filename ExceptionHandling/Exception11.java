package ExceptionHandling;

public class Exception11 {

	public static void main(String[] args) {
		try
		{
			int a=100,b=2,c;
			c=a/b;
			System.out.println(c);
		}
		
		finally
		{
			System.out.println("i am in finaaly block");
		}

	}

}
