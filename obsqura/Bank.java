class Bank{
public static void main(String args[]){
int a=2500;
int b=Bank.deposit(a);
int c=Bank.withdraw(a,b);
int d=Bank.current(b,c);
}
public static int deposit(int e)
{
int f=5000;
int total=e+f;
System.out.println("balance after deposition="+total);
return(total);
}
public static int withdraw(int g,int h);
{
if(h>g)
{int cash=h-g;
System.out.println("amount that can be withdraw="+cash);
return(1);}
else{
cash=g;
System.out.println("Minimum balance="+cash);
return(0);}
}
public static int current(int i,int j)
{int balance=i-j;
System.out.println("current balance="+balance);
return(balance);
}
}