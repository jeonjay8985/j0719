package j0719;

import java.util.Scanner;

public class exam13 {

	public static void main(String[] args) {
		 Scanner s1 = new Scanner(System.in);
		 int n, sum=0;
				 for (int i=1; ; i++) {
			 System.out.print("요금을 입력하세요 : ");
			 
			 n=s1.nextInt()	;
			 sum= sum+n;
			 if(sum>=100000) {
				 System.out.print("총수입은 "+sum+" 이다");
				 break;
			 }
			 }

	}

}
