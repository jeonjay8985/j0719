package j0719;

public class exam21 {

	public static void main(String[] args) {
		
		int i=1, sum=0;
		while(i<=10) {
			sum=sum+i;
			i++;
		}
		
		System.out.println("합계 : "+sum); // +sum을 붙여줘야
		System.out.printf("합계 : %d", sum);//%d자리에 sum들어감
		
		// while에선 i가 11이면 값 0로 끝남(i<=10) 조건이 만족하지 않아 그러나 do-while은 무조건 한번은 수행함.

	}

}
