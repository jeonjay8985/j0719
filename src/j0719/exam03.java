package j0719;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("원기둥의 밑면의 반지름은? : "); 
		float num1=s1.nextFloat();
		System.out.print("원기둥의 높이는? : "); 
		float num2=s1.nextFloat();
		float num3=3.14f;
		
		System.out.print("원기둥의 부피는 "+num1*num1*num2*num3+" "); 
		
		
		

	}

}
