package ExceptionHandling;
import java.io.FileInputStream;
public class Exception9 {

	public static void main(String[] args) {
		try 
		{
			int a=100,b=0,c;
			c=a/b; //exception
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
	
	}

}
