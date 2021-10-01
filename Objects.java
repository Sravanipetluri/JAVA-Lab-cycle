import java.util.*;
class Objects
{
static int count=0;
static void incr()
{
count ++;
}
public static void main(String[] args)
{
Objects c1=new Objects();
incr();
Objects c2=new Objects();
incr();
Objects c3=new Objects();
incr();
Objects c4=new Objects();
incr();
System.out.println("number of objects :" +count);
}
}


output:
number of objects :4