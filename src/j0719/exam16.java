package j0719;

public class exam16 {

/*
 vFor구문 복습v	
 */
	
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10 ; i=i+1){ //조건 i<=10을 sum<=40, 조건이 비어있을때;;는 무한루프. int 범위(21억)를 벗어나게 되면  
			                           
			System.out.println(i); 
			sum=sum+i;
			System.out.println(sum); 
			
			
			
		}
	}

}
