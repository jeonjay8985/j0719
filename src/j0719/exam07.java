package j0719;

import java.util.Scanner;

public class exam07 {

	   public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
		
		System.out.print("실수1 입력 : "); 
		float num1=s1.nextFloat();
		System.out.print("실수2 입력 : "); 
		float num2=s1.nextFloat();
		
		float result=num1+num2;
		System.out.printf("%.2f+%.2f=%.2f\n", num1,num2,result);
		
		result=num1-num2;
		System.out.printf("%.2f-%.2f=%.2f\n", num1,num2,result);
		
		result=num1*num2;
		System.out.printf("%.2f*%.2f=%.2f\n", num1,num2,result);
		
		result=num1/num2;
		System.out.printf("%.2f/%.2f=%.2f\n", num1,num2,result);
		
		result=num1%num2;
		System.out.printf("%.2f%%%.2f=%.2f\n", num1,num2,result);


	}

}
