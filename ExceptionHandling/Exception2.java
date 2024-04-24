
package ExceptionHandling;
import java.io. FileInputStream ;  
import java.io.FileNotFoundException;
public class Exception2 {

	public static void main(String[] args) {
		try {
		FileInputStream fis=new FileInputStream("c:abc.txt");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
