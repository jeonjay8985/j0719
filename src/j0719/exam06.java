package j0719;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int num= s1.nextInt();
		
		if(num % 7 ==0 && num!=0) {              //!= ~가 아니다
			System.out.println("7의 배수입니다.");
		}else {
			System.out.println("7의 배수가 아닙니다.");

     	}
	}
}
