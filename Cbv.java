import java.util.Scanner;
import java.io.*;
class callbyvalue
{
	 void read(int x,int y)
	{
	x=x+10;
	y=y+10;
	}
}
class Cbv
{
public static void main(String args[])
{
int x,y;
Scanner s=new Scanner(System.in);
x=s.nextInt();
y=s.nextInt();
System.out.println("before the x and y values are"+x+","+y);
callbyvalue c=new callbyvalue();
c.read(x,y);
System.out.println("after the x and y values are"+x+","+y);
}
}




output:
3
2
before the x and y values are 3,2
after the x and y values are 3,2