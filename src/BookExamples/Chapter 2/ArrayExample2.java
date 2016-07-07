public class ArrayExample2
{
 	public static void main(String args[])
 	{
 		int [][] muld= new int [2] [3];
 		int i, j;
		int k=1;
		for (i=0;i<2;i++)
 		{
 			for (j=0;j<3;j++)
 			{
				muld[i][j]=k;
				k=k+2;
 			}
 		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println(muld[i][j]+"");
			}
		}
	}
}
