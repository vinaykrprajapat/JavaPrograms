class example6
{
public CreatedClass getNewObject()
{
return new CreatedClass();
}
}

class CreatedClass
{
public String tag = "This is the tag data.";
}

public class ObjectFactory
{
public static void main(String[] args)
{
example6 o = new example6();
CreatedClass c = o.getNewObject();
System.out.println(c.tag);	
}
}
