class StringConstructor
{
 	public static void main(String args[])
 	{
 		String str= new String();
 		str=" Deepak";
 		System.out.println(" The value stored in str is " + str);
 		String str1= new String ("Gupta");
 		System.out.println(" The value stored in str1 is " + str1);
 		char ch []= {'T','W'};
 		String str2 = new String(ch);
 		System.out.println(" The value stored in str2 is " + str2);
 		byte byteArr[]={95,65,74};
 		String str3=new String (byteArr);
 		System.out.println (" The value stored in str3 is " + str3);
 	}
}
