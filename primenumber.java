package homework;

import java.util.Scanner;

public class primenumber {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=2,b=0;
		while(i<=a/2) {
			if(a%i==0) {
				b++;
			}
			i++;
		}
		if(b==0) {
			System.out.print(a+" is a prime number");
		}else {
			System.out.println(a+" is not a prime number");
		}
	}
}
