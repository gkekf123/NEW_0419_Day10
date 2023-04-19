package day10_0419;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		// 문자열 다루기
		// 문자열은 사실 배열이다. 인덱스가 있다
		
		String str = "안녕하세요~ 영어로하면 하이!";
//		안된다 -> System.out.println(str[0]);
		
		// 문자열을 다루는 다양한 메서드를 제공
		
		// charAt() - 문자열 한글자 자르기
		char c = str.charAt(4);
		System.out.println(c);
		System.out.println("===============================");
		
		// 문자열의 위치확인 indexOf, lastIndexOf
		// indexOf는 없는 인덱스 입력하면 -1을 반환
		int idx = str.indexOf("안");
		System.out.println("앞에서 찾은위치 : " + idx);
		System.out.println("===============================");
		
		// lastIndexOf
		int idx2 = str.lastIndexOf("하");
		System.out.println("뒤에서부터 찾은 위치 : " + idx2);
		System.out.println("===============================");
		
		// 문자열 변환 toUpperCase(영어 대문자로), toLowerCase(영어 소문자로)
		String s = "abcDEF";
		String result = s.toLowerCase();	//소문자로
		String result2 = s.toUpperCase();	//대문자로
		System.out.println("toLowerCase : " + result);
		System.out.println("원본 문자열 : " + s); // 원본 문자열은 그대로 유지
		System.out.println("toUpperCase : " + result2);
		System.out.println("===============================");
		
		// 문자열 변경 replace
		s = "abcdefaaa";
		String result3 = s.replace("a", "x");
		System.out.println("replace : " + result3);	// a -> x로 전부 변경
		System.out.println("원본 문자열 : " + s);
		
		String result4 = s.replaceFirst("a", "X");
		System.out.println( "" + result4);	// a -> x로 첫번째만 변경
		System.out.println("===============================");
		
		// 공백 제거 trim
		str = "  010-1111-2222  ";
		String result5 = str.trim();
		System.out.println(result5);	// 공백 제거 후 반환
		
		
		str = "   안녕 하세요? 오늘은 4월 19일 입니다.     ";
		str = str.replace(" ", "");	//공백을 전부 제거 하여 원본 문자열에 저장
		System.out.println("===============================");
		
		// 문자열 자르기
		// substring - 인덱스 기준으로 자름
		str = "010-1111-2222";
		String result6 = str.substring(8);	// 인덱스 번째 미만 절삭
		System.out.println(result6);
		
		
		String result7 = str.substring(4, 8);	// 4 <= x < 8 인덱스 추출
		System.out.println(result7);
		System.out.println(str);	// 원본 변함 없음
		System.out.println("===============================");
		
		
		//split() - 특정 문자를 기준으로 자름(정규 표현식 알아야 제대로 사용)
		String [] result8 = str.split("-");
		System.out.println(Arrays.toString(result8));
		
		String [] result9 = str.split("");
		System.out.println(Arrays.toString(result9));	// String 배열 - 한 글자 씩 // charAt() - 문자열 한글자 자르기
		
		//roCharArray - 한글자씩 char형으로 자름
		char[] result10 = str.toCharArray();
		System.out.println(Arrays.toString(result10));	// Char 배열 -  한 글자 씩
		System.out.println("===============================");
		
		// 문자열의 길이
		str = "안녕하세요";
		int len = str.length();
		System.out.println("문자열 길이 : " + len);
		
		System.out.println("===============================");
		
		// **************** 문자열 비교 equals() **************
		if(str.equals("안녕하세요")) {
			System.out.println("두 문자가 같음" );
		}
	
		System.out.println("===============================");
		//문자열의 포함여부 contains()	
		if(str.contains("녕")) {
			System.out.println("녕 이 포함되어 있다.");
		}
		
	}		

}
