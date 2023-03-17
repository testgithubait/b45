package dayten;

public class Students {

	
		void validation(int parent_income)
		{
			if(parent_income<5)
			{
				System.out.println("they are not elegible");
			}else
			{
				System.out.println("they are elegible");
			}
		}
		public static void main(String[] args) {
			Students obj=new Students();
			obj.validation(6);

	}

}
