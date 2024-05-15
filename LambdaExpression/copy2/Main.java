package LambdaExpression.copy2;

public class Main {

	public static void main(String[] args) {
		Employee SE=()->"SoftwareEngineer";
		System.out.println(SE.getName());
		
		Employee editor=()->"Editor";
		System.out.println(editor.getName());
	}

}
