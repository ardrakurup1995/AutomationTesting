import java.util.Scanner;
class Armstrong
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n,r,a=0;
System.out.print("enter a number");
n=sc.nextInt();
int temp=n;
while(n!=0)
{
r=n%10;
a=a+(r*r*r);
n=n/10;
}
if(temp==a)
{
System.out.println("given number is Armstrong");
}
else
{
System.out.println("given number is not an Armstrong");
}
}
}