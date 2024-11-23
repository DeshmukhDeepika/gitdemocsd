//This program demonstrates the difference between public and private
class Test
{
int a;//default access
public int b;//public access
private int c;//private access
//methods to access c
void setC(int i)
{
c=i;
}
int getC()
{
return c;
}
}
class AccessTest
{
public static void main(String args[])
{
Test ob=new Test();
ob.a=10;
ob.b=20;
//ob.c=100;
ob.setC(100);
System.out.println(ob.a+" "+ob.b+" " +ob.getC());
}
}
