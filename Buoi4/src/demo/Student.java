package demo;

public class Student {
 private String name;
 private String GPA;
public Student(String name, String gPA) {
	super();
	this.name = name;
	GPA = gPA;
	
}
public Student() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGPA() {
	return GPA;
}
public void setGPA(String gPA) {
	GPA = gPA;
}
@Override
public String toString() {
	return "Student [name=" + name + ", GPA=" + GPA + "]";
}
 
 
}
