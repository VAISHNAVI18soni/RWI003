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
    int age = 15; 
        
   try {
   if (age < 18) {
   throw new YoungerAgeException("Age must be 18 or older.");
    } else {
    System.out.println("Age is valid.");
       
  }
   } catch (YoungerAgeException e) {
  System.out.println("Exception: " + e.getMessage());
            
        }
    }
}