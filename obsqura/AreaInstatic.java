class AreaInstatic
{
int rect;
public AreaInstatic(int l,int b)
{
rect=l*b;
System.out.println("area of rectangle is:"+ rect);
}
public static void main(String args[])
{
AreaInstatic ob=new AreaInstatic(4,3);
}
}