package day10_0419;

import java.util.Arrays;

public class MethodEx06 {

	public static void main(String[] args) {
		
		//push
		push(1);
		push(2);
		push(3);
		push(4);
		System.out.println(Arrays.toString(arr));
		
		//pop
		for(int i = 1; i <= 5; i++) {
			pop();
			System.out.println(Arrays.toString(arr));
		}
		
	}
	static int[] arr = {};
	
	static void push(int data) {
		
		int[] temp = new int[arr.length + 1];
		
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[temp.length -1] = data;
		arr = temp;
		temp = null;
	}
	
	//배열의 맨 앞 요소부터 삭제 되도록 처리
	static int pop() {
		// 1. 삭제 할 데이터 백업
		if(arr.length > 0) {
		// 2. arr -1인 사본 배열 생성
			int del = arr[arr.length -1];
		// 3. 배열의 1번째 요소 ~ 마지막까지 옮겨 담는다
			int[] temp = new int[arr.length -1];
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i + 1];
			}
		// 4. 원본배열을 temp로 변경
			arr = temp;
			temp = null;
			
			return del;
		}
		return 0;
	}

}
