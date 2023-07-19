package j0719;

import java.util.Scanner;

public class exam17 {

	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("출력할 단 입력 : ");
		int dan=s1.nextInt();
		int i=1;                                           //초기값이 while문 밖에 있음
		while(i<10) {
			System.out.printf("%d*%d=%d\n", dan,i, dan*i); //조건 
			i++;                                           //증감, 증감값이 조건위에 찍히면 2부터 10단까지로 나옴 
			
			 
		}
	}

}
