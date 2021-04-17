//A Java class to test the encapsulated class.  
package two;  
import one.*;
class Test{  
public static void main(String[] args){  
//creating instance of the encapsulated class  
Student s=new Student();  
//setting value in the name member  
s.setName("vijay");  
//getting value of the name member  
System.out.println(s.getName());  
}  
}  



// package com.javatpoint;
// class Test{
// 	public static void main(String[]args){
// 		Student s=new Student();
// 		s.setName("vijay");
// 		System.out.println(s.getName());
// 	}
// }