import java.util.Scanner;
public Class Person
{
int id;
String name;
String course;
int sem;
Scanner s;
void input()
{
s = new Scanner(system.in)
System.out.println("Enter your name");
name = s.next();
System.out.println("Enter your Course");
course = s.next();
System.out.println("Enter your ID");
id = s.nextInt();
System.out.println("Enter your Sem");
sem = s.nextInt();
}
void output()
{
System.out.println("Name is " +name);
System.out.println("ID is " +id);
System.out.println("Course is " +course);
System.out.println("Sem is " +sem);
}
public static void main(String args[])
{
Person p = new Person();
p.input();
p.output();
