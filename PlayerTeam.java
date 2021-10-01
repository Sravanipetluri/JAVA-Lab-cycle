import java.util.*;
class player
{
   int id;
   String name;
   player(int i,String n)
   {
     id=i;
     name=n;
   }
   void print()
   {
      System.out.println("player id is  "+id);
      System.out.println("player name is  "+name);
   }
}
class cricket extends player
{
   int age;
   cricket(int i,String n,int a)
   {
     super(i,n);
     age=a;
   }
   void print()
   {
     super.print();
     System.out.println("cricket player age is  "+age);
   }
}
class hockey extends player
{
  int weight;
  hockey(int i,String n,int w)
  {
    super(i,n);
    weight=w;
  }
  void print()
  {
   super.print();
   System.out.println("hockey player weight is  "+weight);
 
  }
}
class football extends player
{ 
   int height;
    football(int i,String n,int h)
    {
      super(i,n);
      height=h;
    }
    void print()
    {
     super.print();
     System.out.println("football player height is  "+height);
    }
}
class PlayerTeam
{
  public static void main(String args[])
  {
    cricket c=new cricket(1,"teja",24);
    c.print();
    hockey h=new hockey(2,"kavya",20);
    h.print();
    football f=new football(3,"sravani",23);
    f.print();
  }
}



output:
player id is  1
player name is  teja
cricket player age is  24
player id is  2
player name is  kavya
hockey player weight is  20
player id is  3
player name is  sravani
football player height is  23