package if��;

import java.util.Scanner;

class �μ����ϱ� {

	public static void main(String[] args) {
		
		//�� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		System.out.println("ȭ�鿡 ���ڸ� �Է����ּ��� :)");
		
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
