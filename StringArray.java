import java.util.*;
class StringArray
{
public static void main(String args[])
{
System.out.println("before sorting strings");
 for(int i=0;i<args.length;i++)
 System.out.println(args[i]);
 Arrays.sort(args);
 System.out.println("after sorting");
 for(int i=0;i<args.length;i++)
 System.out.println(args[i]);
}
}



output:
java StringArray c python java sql
before sorting strings
c
python
java
sql
after sorting
c
java
python
sql