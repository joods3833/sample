package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		
		int a;
		for( a=1; a<=100; a++) {
			
			if( a % 3 != 0) continue;
			
			System.out.println(a);
		}
		
	}
}
