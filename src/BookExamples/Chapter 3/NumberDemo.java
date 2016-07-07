public class NumberDemo 
{
	public static void main (String ar[]) 
	{
		Boolean bool1 = new Boolean ("TRUE");
		Boolean bool2 = new Boolean ("FALSE");
		System.out.println ("The boolean values are;"+bool1.toString () +" or"+bool2.toString ()); 
		for (int j=0;j<16;++j)
		System.out.print (Character.forDigit (j, 16)); 
		System.out.println ();
		Integer intgr = new Integer(Integer.parseInt("AB",16)); 
		Long lng = new Long(Long.parseLong("ABC",16)); 
		long lngval=lng.longValue()*intgr.longValue();
		System.out.println (Long.toString (lngval, 8));
		System.out.println(Float.MIN_VALUE);
		System.out.println (Double.MAX_VALUE);
	}
}
