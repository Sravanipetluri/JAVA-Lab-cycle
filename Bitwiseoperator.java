import java.util.*;
class Bitwiseoperator
{
 public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   System.out.print("enter a value");
   int a=s.nextInt();
   System.out.print("enter b value");
   int b=s.nextInt();
   int ch;
   do
   {
    System.out.println("1.bitwise AND(&)");
    System.out.println ("2.bitwise OR(|)");
     System.out.println("3.bitwise EXCLUSIVE OR(^)");
     System.out.println("4.bitwise NEGATION(~)");
     System.out.println("5.bitwise LEFTSHIFT(<<)");
     System.out.println("6.bitwise RIGHTSHIFT(>>)");
     System.out.println ("7.bitwise ZEROFILLWITH RIGHTSHIFT(>>>)");
   System.out.println("enter choice");
   ch=s.nextInt();
   switch(ch)
   {
     case 1:System.out.println("a&b="+(a&b));
     break;
     case 2:System.out.println("a|b="+(a|b));
     break;
     case 3:System.out.println("a^b="+(a^b));
     break;
     case 4:System.out.println("~a="+(~a));
     break;
     case 5:System.out.println("a<<b="+(a<<b));
     break;
     case 6:System.out.println("a>>b="+(a>>b));
     break;
     case 7:System.out.println("a>>>b="+(a>>>b));
     break;
     default:System.out.println("invalid option");
   }
  }while(ch<=7);
 }
}


output:
enter a value5
enter b value6
1.bitwise AND(&)
2.bitwise OR(|)
3.bitwise EXCLUSIVE OR(^)
4.bitwise NEGATION(~)
5.bitwise LEFTSHIFT(<<)
6.bitwise RIGHTSHIFT(>>)
7.bitwise ZEROFILLWITH RIGHTSHIFT(>>>)
enter choice
1
a&b=4
1.bitwise AND(&)
2.bitwise OR(|)
3.bitwise EXCLUSIVE OR(^)
4.bitwise NEGATION(~)
5.bitwise LEFTSHIFT(<<)
6.bitwise RIGHTSHIFT(>>)
7.bitwise ZEROFILLWITH RIGHTSHIFT(>>>)
enter choice
5
a<<b=320
1.bitwise AND(&)
2.bitwise OR(|)
3.bitwise EXCLUSIVE OR(^)
4.bitwise NEGATION(~)
5.bitwise LEFTSHIFT(<<)
6.bitwise RIGHTSHIFT(>>)
7.bitwise ZEROFILLWITH RIGHTSHIFT(>>>)
enter choice
4
~a=-6
1.bitwise AND(&)
2.bitwise OR(|)
3.bitwise EXCLUSIVE OR(^)
4.bitwise NEGATION(~)
5.bitwise LEFTSHIFT(<<)
6.bitwise RIGHTSHIFT(>>)
7.bitwise ZEROFILLWITH RIGHTSHIFT(>>>)
enter choice
2
a|b=7
1.bitwise AND(&)
2.bitwise OR(|)
3.bitwise EXCLUSIVE OR(^)
4.bitwise NEGATION(~)
5.bitwise LEFTSHIFT(<<)
6.bitwise RIGHTSHIFT(>>)
7.bitwise ZEROFILLWITH RIGHTSHIFT(>>>)
enter choice
3
a^b=3
1.bitwise AND(&)
2.bitwise OR(|)
3.bitwise EXCLUSIVE OR(^)
4.bitwise NEGATION(~)
5.bitwise LEFTSHIFT(<<)
6.bitwise RIGHTSHIFT(>>)
7.bitwise ZEROFILLWITH RIGHTSHIFT(>>>)
