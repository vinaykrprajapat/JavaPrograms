public class DemoFinally
{
	public static void main(String args[]){
		int input, result;
		try{
			input= 5;
			result= input * input;
			System.out.println(" Multiplication of " + input + " is " + result); 
		}catch (ArithmeticException a)
		{
			a.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(" Finally block must be executed"); 
		}
	}
}
