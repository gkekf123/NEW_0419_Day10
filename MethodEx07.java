package day10_0419;

public class MethodEx07 {

	public static void main(String[] args) {

		// 메서드의 연쇄 호출 (돟기적 방식)
		// 메서드 안에서는 메서드를 호출이 가능 함
		//test01();
		
		// 메서드의 재귀 (안씀)
		recursive(1);
		
		//5 * 4 * 3 * 2 * 1
		System.out.println(fac(5));
		
	}
	
	static void test01() {
		System.out.println("1번 메서드 실행");
		test02();
		System.out.println("1번 메서드 종료");
	}
	
	static void test02() {
		System.out.println("2번 메서드 실행");
		
		System.out.println("2번 메서드 종료");
	}
	
	static void recursive(int a) {
		// 함수의 재귀는 언젠가 중단 할 수 있는 조건이 있어야 된다.
		if(a == 10) return; // 함수의 종료
		System.out.println(a + "호출");
		a++;
		recursive(a);
	}

	static int fac(int a) {
		if(a == 1) {
			return 1;
		}
		return a * fac(a-1);
	}
}
