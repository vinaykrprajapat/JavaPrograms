class UseStringBuffer{

  public static void main(String args[]) {
// Creating first string object
StringBuffer sb = new StringBuffer("Deepak"); 
// appending String
sb.append("Gupta"); 
System.out.println("String sb after string appendation is:  " + sb); 

// Creating second string object	
StringBuffer sb2 = new StringBuffer("Numbers are : ");
// appending numbers
sb2.append(1234);
System.out.println("String sb2 after appending numbers is: "+ sb2);

// Creating third string object
StringBuffer sb3 = new StringBuffer("A bird is flying");
// Reversing the string object
sb3.reverse();
System.out.println("String sb3 after reverse is: " + sb3);
	
// Creating fourth string object
StringBuffer sb4 = new StringBuffer("A bird is flying");
// Applying toString() on string object
System.out.println( "String sb4 is: " + sb4.toString() );

// Creating fifth string object
StringBuffer sb5 = new StringBuffer("Hello");
sb5.insert(1, "ee");
System.out.println("String sb5 after  insertion is: " + sb5);

// Creating sixth string object
StringBuffer sb6 = new StringBuffer("we're not having a good time.");
sb6.delete(5, 9);
System.out.println("String sb6 after deletion is: " + sb6);
}

}
