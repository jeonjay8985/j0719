package j0719;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("주행거리를 입력하세요 : ");
		float num1=s1.nextFloat();
		System.out.print("사용한 휘발유 값을 입력하세요 : ");
		float num2=s1.nextFloat();
		double num3=num1/num2;
		System.out.print("연비 : "+num3+" ");
		
		
        }
        
}


