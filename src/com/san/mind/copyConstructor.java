package com.san.mind;

//*Copy constructor is a constructor which is used to construct an object by copying the state from another object*//
//*of same class. Java does'nt create a default copy constructor*//

public class copyConstructor {
int marks;
int rollno;
String name;

copyConstructor(int marks, int rollno, String name)
{
	this.marks = marks;
	this.rollno = rollno;
	this.name = name;
	
}

copyConstructor(copyConstructor ct)
{
	marks = ct.marks;
	rollno = ct.rollno;
	name = ct.name;
}

void displayobjectstate()
{
	System.out.println("I am "+name+" with "+ rollno+" got marks of " + marks);
}
	public static void main(String[] args) {
	copyConstructor ct = new copyConstructor(888,190185,"Santhan");
	copyConstructor ct2 = new copyConstructor(ct);
	ct.displayobjectstate();
	ct2.displayobjectstate();
	}

}
