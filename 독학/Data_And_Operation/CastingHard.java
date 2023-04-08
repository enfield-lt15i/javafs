
public class CastingHard {

	public static void main(String[] args) {
		
		double a = 1.1;
		System.out.println(a); // 1.1
		
		double b = 1;
		double b2 = (double) 1; // 정수는 실수에 포함되기 때문에 문제가 안 생김
		
		System.out.println(b); // 1.0
		System.out.println(b2); // 1.0
		
//		int c = 1.1; // 실수는 정수에 포함되지 않기 때문에 오류
		
		//solution
		double d = 1.1; // Change type of 'd' to 'double'
		System.out.println(d); // 1.1
		
		int e = (int) 1.1; // Add cast to 'int' (강제)
		System.out.println(e); // 0.1 손실
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f); // 1
		System.out.println(f.getClass()); // class java.lang.String

	}

}
