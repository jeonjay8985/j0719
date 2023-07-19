package j0719;

import java.util.Scanner;

public class exam14 {

	public static void main(String[] args) {
		 Scanner s1 = new Scanner(System.in);
		 int n, sum=10000;
		 System.out.printf("교통카드 잔액 : %d\n",sum);  // \n => 한 줄 내려오는거
		 for (int i=1; ; i++) {
			 System.out.print("요금을 입력하세요 : ");
			 
			 n=s1.nextInt()	;
			 sum= sum-n;
			 if(sum<1300) {
				 System.out.print("잔액이 부족해 교통카드를 사용할 수 없습니다");
				 break;
			 }

		 }

	}
	
}

