# power.java
import java.io.*;
import java.util.*;
pubilc class power
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int p=s.nextInt();
int r=1;
if(n>=0 && p==0)
{
r=1;
}
else if(n==0 && p>=0)
{
r=0;
}
else
{
for(int i=0;i<=p;i++)
{
r=r*n;
}
}
System.out.println(n+"^"+p"="+r);



}
}
