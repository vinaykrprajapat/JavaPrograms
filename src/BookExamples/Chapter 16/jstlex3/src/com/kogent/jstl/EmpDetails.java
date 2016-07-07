package com.kogent.jstl;
import java.io.*;

public class EmpDetails implements Serializable {

	public EmpDetails (){}
	public EmpDetails (int i, String s, int j, int d){
		empno=i; name=s; deptno=j; sal=d;
	}

	public void setEmpNo(int i){empno=i;}
	public int getEmpNo(){return empno;}

	public void setName(String s){name=s;}
	public String getName(){return name;}

	public void setDeptNo(int i){deptno=i;}
	public int getDeptNo(){return deptno;}

	public void setSal(int d){sal=d;}
	public int getSal(){return sal;}

	String name; 
	int empno,deptno, sal;

}//class