package ExceptionHandling;

class YoungerAgeException extends RuntimeException
{

	public YoungerAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
public class Main {

public static void main(String[] args) {
 int age = 13; 
 try {
 if (age < 16) {
 throw new YoungerAgeException("Age is 16");
  } else {
  System.out.println("Age is  not valid");
       }
 } catch (YoungerAgeException e) {
 System.out.println(e);
            
        }
    }
}