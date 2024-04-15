package vaishuApplication;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		int c=10;
		int d=40;
		if(a>b&&a>c&&a>d)
		{
			System.out.println(a);
		}
		else if(b>c && b>d)
		{
			System.out.println(b);
		}
		else if(c>d)
		{
			System.out.println(c);
		}
		else
		{
			System.out.println(d);
		}
}

}
