public class app2
{
public static void main(String[] args)
{
System.out.println ("Command line arguments ...");
for(int loop_index = 0; loop_index < args.length; loop_index++) 
{
System.out.println("Argument" + loop_index + " = " + args[loop_index]);
}
}
}
