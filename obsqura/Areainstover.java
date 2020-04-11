class Areainstover
{
int rect;
int squ;
public int area(int l,int b)
{
rect=l*b;
System.out.println("area of rectangle is:"+rect);
return (rect);
}
public int area(int a)
{
squ=a*a;
System.out.println("area of square is:"+squ);
return(squ);
}
public static void main(String args[])
{
Areainstover ob1=new Areainstover();
int rect=ob1.area(4,3);
Areainstover ob2=new Areainstover();
int squ=ob2.area(3);

}
}


