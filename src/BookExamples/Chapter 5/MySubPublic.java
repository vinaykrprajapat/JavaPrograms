class MySuperPublic {
 	public String name = "User";
}

class MySubPublic extends MySuperPublic
{
 	public void displayName()
 	{
 		System.out.println ("Your name is:" + name);
 	}
}
