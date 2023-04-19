package day10_0419;

import java.util.Arrays;

public class MethodEx05 {

	public static void main(String[] args) {

		// 배열의 한계점 -> 크기가 정적
		// LIFO - Last In First Out = 마지막 push 먼저 pop 
		// ex)in -> {1,2,3} // out -> {3,2,1}
		// Stack
		
		//push
		push(4);
		push(5);
		push(6);
		push(7);
		System.out.println(Arrays.toString(arr));
		
		//pop
		
		pop();
		pop();
		int result = pop();	//삭제 된 데이터도 확인 가능함
		System.out.println("삭제 된 데이터 : " + result);
		System.out.println(Arrays.toString(arr));
	}
	static int[] arr = {1,2,3};
	
	//push -> 특정요소를 마지막에 추가
	static void push(int data) {
		 
		// 1. 배열의 크기를 +1 한 새로운 배열을 만듦
			int[] temp = new int[arr.length + 1];
		// 2. arr배열의 요소를 복사
			for(int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
		// 3. 마지막에 추가(배열의 마지막은 lenght -1 
			temp[temp.length - 1] = data;	// -> temp = {1,2,3,data}
		// 4. 원본배열을 temp로 변경
			arr = temp;
			temp = null; //temp 삭제
	}
	//pop -> 특정요소를 마지막에 삭제(반환 - 삭제 된 데이터)
	static int pop() {
		if(arr.length > 0) {
		// 1. 삭제 할 데이터를 백업
			int del = arr[arr.length - 1];
		// 2. arr보다 -1인 사본배열을 생성
			int[] temp = new int[arr.length -1];
		// 3. 원본배열을 사본으로 복사(맨 마지막 데이터만 제외)
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i];
			}
		// 4. 사본배열을 원본배열로 변경
			arr = temp;
			temp = null;
			
			return del;	//삭제 된 데이터 반환
		}
		return 0;	// return del 에서 리턴은 끝 마지막 리턴은 실행되지 않는다.
	}
}
