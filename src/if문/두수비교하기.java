package if문;

import java.util.Scanner;

class 두수비교하기 {

	public static void main(String[] args) {
		
		//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		
		System.out.println("화면에 숫자를 입력해주세요 :)");
		
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		
		if(-10000<=A||A<=10000||-10000<=B||B<=10000) {
			if(A>B) {
				System.out.println(">");
			}else if (A<B) {
				System.out.println("<");
				
			}else {
				System.out.println("==");
			}
		}
	}
}
