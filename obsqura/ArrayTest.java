import java.util.Scanner;
import java.util.Arrays;
class ArrayTest{
public static void main(String arg[]){
	Scanner sc =new Scanner(System.in);
	int x[]=new int [5];
	for(int i=0;i<5;i++){
		x[i] = sc.nextInt();
	}
	System.out.println("Printing Values..");
	//System.out.println(Arrays.toString(x));//
	for(int temp:x){
		System.out.println(temp);
	}
	}
}