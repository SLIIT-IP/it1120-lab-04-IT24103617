import java.util.Scanner;
public class IT24103617Lab4Q1{
	public static void main(String[] args){
		Scanner m=new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int n=m.nextInt();
		if(n>0){
			System.out.println("The number is:-" +' '+"Positive"); }
		else if(n<0){
			System.out.println("The number is:-" +' '+"Negative"); }
		else{
			System.out.println("The number is:-" +' '+"Zero"); }
	}
}
			

