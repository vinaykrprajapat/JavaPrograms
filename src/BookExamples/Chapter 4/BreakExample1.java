public class BreakExample1{
	public static void main(String[] args) {
		int i = 1;
		breaking:while (true) 
		{
			if (i >10) 
			{
				break breaking;
			}
			System.out.println(i);

			i=i+2; 
		}
	}
}
