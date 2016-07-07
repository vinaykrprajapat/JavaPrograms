	public class ArrayExample1 {
 	public static void main(String args[]) 
 	{
		int x;
		int even[];
		even = new int[10];
		even [0]=121;
		even [1]=142;
		even [2]=145;
		even [3]=149;
		even [4]=163;
		even [5]=174;
		even [6]=126;
		even [7]=129;
		even [8]=138;
		even [9]=145;
		for(x=0;x<even.length;x++) 
		{
			if(even[x]%2==0)
			{
				System.out.println (even[x] + "is an even number");
			}
		}
 	}
}
