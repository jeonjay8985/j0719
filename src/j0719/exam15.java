package j0719;

import java.util.Scanner;

public class exam15 {

	public static void main(String[] args) {
		 Scanner s1 = new Scanner(System.in);
		 
		 
		 int sum=0;
		 System.out.print("출력할 단을 입력하세요 : "); 
		 sum=s1.nextInt();
	   	 for(int i=1; i<10; i++) {
	   		
			System.out.printf("%dX%d=%d\n", sum, i, sum*i );

		 


	}

}
}