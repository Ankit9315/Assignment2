package homework;

import java.util.Scanner;

public class primenumberusingfor {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				b++;
			}
		}
		if(b==0) {
			System.out.print(a+" is a prime number");
		}else {
			System.out.println(a+" is not a prime number");
		}
	}
}
