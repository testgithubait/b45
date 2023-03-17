package dayten;

public class ExeptionHandling {

	public static void main(String[] args) {
		int number=50/5;
		System.out.println(number);
		
		int number2=50/10;
		System.out.println(number2);
		
		try {
			int number3=50/0;
			System.out.println(number3);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		int number4=50/25;
		System.out.println(number4);

	}

}
