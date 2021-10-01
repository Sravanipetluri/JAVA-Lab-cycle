import java.util.*;
interface Student
{
 void name(int no,String name,int age);
}
interface Depertment
{
 void cource(String cource);
}
interface Attandance extends Student,Depertment
{
 void Attand(int attandance);
}
class StudentDetails implements Attandance
{
 public void name(int no,String name,int age)
 {
  System.out.println("roll no :  "+no);
  System.out.println("student name :  "+name);
  System.out.println("student age : "+age);
 }
 public void cource(String cource)
 {
  System.out.println("student cource :  "+cource);
 }
 public void Attand(int attandance)
 {
  System.out.println("attandance is : "+attandance);
  if(attandance>=75)
  System.out.println("she is eligible for exams");
  else
  System.out.println("she is not eligible for exams");
 }
 public static void main(String args[])
 {
  StudentDetails e=new StudentDetails();
  e.name(84,"Sravani",20);
  e.cource("mca");
  e.Attand(80);
  StudentDetails e1=new StudentDetails();
  e1.name(1,"Kavya",21);
  e1.cource("mca");
  e1.Attand(60);
 }
}


output:

C:\Sravani>java StudentDetails
roll no :  84
student name :  Sravani
student age : 20
student cource :  mca
attandance is : 80
she is eligible for exams
roll no :  1
student name :  Kavya
student age : 21
student cource :  mca
attandance is : 60
she is not eligible for exams