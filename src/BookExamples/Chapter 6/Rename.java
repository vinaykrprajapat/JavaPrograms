import java.io.*;
class Rename
{
 public static void main (String [] args) 
 {
  try 
  { 
    File dir1 = new File ("Company"); 
    dir1.mkdir ();// makes a directory
    System.out.println ("The existence of Company directory is: "+dir1.isDirectory ());
    File file1 = new File (dir1, "EmployeesDetail.txt"); 
    file1.createNewFile ();// creates a file in the directory
    System.out.println ("The existence of EmployeeDetail file is : "+file1.isFile ());
    File file2 = new File (dir1, "SalaryDetail.txt");
    file2.createNewFile ();// creates a file in the directory
    System.out.println ("The existence of SalaryDetail file is :  "+file2.isFile ());
    file2.delete ();  
    System.out.println ("The existence of SalaryDetail file is :  "+file2.isFile ());			    dir1.delete ();   // deletes a file
    System.out.println ("The existence of Company directory is : "+dir1.isDirectory ());   
    File file1Rename = new File (dir1, "IdentityDetail.txt"); // a new object
    file1.renameTo (file1Rename);// renames a file
    System.out.println ("The existence of IdentityDetail file is : "+file1Rename.isFile ()); 
    System.out.println ("The existence of EmployeeDetail file is :"+file1.isFile ());
    File dir1Rename = new File ("Kogent");
    dir1.renameTo(dir1Rename);// renames a directory
    System.out.println("The existence of Company directory is :"+dir1.isDirectory()); 
    System.out.println("The existence of Kogent directory is : "+dir1Rename.isDirectory()); 
  } 
  catch(IOException e) { }
 }
}
