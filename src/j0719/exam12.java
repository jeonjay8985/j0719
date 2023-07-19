package j0719;

import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("시험 점수를 입력하세요 : ");
		int num1=s1.nextInt();
		System.out.print("면접 점수를 입력하세요 : ");
		int num2=s1.nextInt();
		
		if(num1>=80 && num2>=60 ) {
			System.out.println("합격을 축하합니다");
		
		}else {
			System.out.println("아쉽지만 불합격입니다");

	}

}
	
}
