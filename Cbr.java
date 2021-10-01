import java.util.Scanner;
import java.io.*;
class callbyreference
{
int a,b;
	 void read(callbyreference c)
	{
	c.a=c.a+10;
        c.b=c.b+10;
	}
}
class  Cbr
{
public static void main(String... ar)
{
callbyreference c=new callbyreference();
Scanner s=new Scanner(System.in);
c.a=s.nextInt();
c.b=s.nextInt();
System.out.println("before the a and b values are"+c.a+","+c.b);
c.read(c);
System.out.println("after the a and  b values are"+c.a+","+c.b);
}
}


output:
4
5
before the a and b values are 4,5
after the a and  b values are 14,15