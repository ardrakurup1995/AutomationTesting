class Averageinstance
{
float d;
int h;
public float Average(float a,float b,float c)
{
d=(a+b+c)/3;
return(d);
}
public int Average1(int e,int f,int g)
{
h=(e+f+g)/3;
return(h);
}
public static void main(String args[])
{
Averageinstance ob1=new Averageinstance();
float d=ob1.Average(4.4f,5.2f,2.3f);
System.out.println("average of three float no.s is"+d);
Averageinstance ob2=new Averageinstance();
int h=ob2.Average1(2,4,6);
System.out.println("average of three in no.s is"+h);
}
}