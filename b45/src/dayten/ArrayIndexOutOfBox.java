package dayten;

public class ArrayIndexOutOfBox {

	public static void main(String[] args) {
		int[] arr=new int[5];
		try
		{
			int i=arr[9];
		}catch(Exception e)
		{
		
			e.printStackTrace();
		}
		finally {
			System.out.println("whatever will happen this line will exwcute");
		}
		System.out.println("next line should execute");

	}

}
