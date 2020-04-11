class Average{
public static int aver(int a,int b,int c){
int d=a+b+c;
int e=d/3;
return e;
}
public static float aver(float f,float g,float h){
float i=f+g+h;
float j=i/3;
return j;
}
public static void main(String args[]){
int e=Average.aver(10,20,30);
float j=Average.aver(40.0f,50.0f,60.0f);
System.out.println("average of integer number" +e);
System.out.println("average of float number" +j);
}
}