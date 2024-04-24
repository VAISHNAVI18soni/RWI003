package ExceptionHandling;
import java.io.FileInputStream;
public class Exception5 {

	public static void main(String[] args) {
		try 
		{
			FileInputStream fis=new FileInputStream ("c:/abc.txt");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("hello");
	}

}
