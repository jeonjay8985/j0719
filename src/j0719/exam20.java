package j0719;

import java.util.Scanner;

public class exam20 {

	public static void main(String[] args) {
		 Scanner s1 = new Scanner(System.in);
		 
		 int choice=1;
		 while(choice==1){
			 int a;
			 System.out.print("숫자를 입력 : ");
			 a=s1.nextInt();
					 if(a%2==0) {
						 System.out.printf("%d는 짝수입니다.\n", a);
					 }else {
						 System.out.printf("%d는 홀수입니다.\n", a); //반복문 끝내는 조건 없으면 무한루프
					 }
					 
					 System.out.print("계속하고 싶다면 예 1, 그만하고 싶다면 아니오 0을 입력하세요 : ");
					 choice=s1.nextInt();            //1이면 계속. 굳이 0 아니더라도 1아닌 다른숫자 입력해도 반복문 끝남
					 
		 }
		

	}

}
