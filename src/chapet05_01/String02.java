package chapet05_01;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "kor";
		String str2 = "kor";  // 기존 문자열이 존재한다면 같은 번지수를 참조하여 생성
		String str3 = new String ("kor"); // 무조건 메모리에 새로운 문자열 생성
		
		// 문자열 변수는 참조타입으로 해당 조건식은 str1과 str2의 값을 비교 하는것이 아니고
		// str1 과 str2 가 가지고 있는 실제 문자열이 저장되어있는 메모리의 번지를 비교하는 것
		
		if (str1 == str2) {// 문자열 비교는 == 사용 XXXXX
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
			// 같다
		}
		if (str1.equals(str2)) {// 문자열 비교는 .equals() 사용
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
			// 같다
		}
		if (str1 == str3) {
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
			// 다르다
		}
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		// 문자열이 가지고 있는 고유의 hash 값 절대 변하지 않음(주민등록번호 같은 개념)
	}

}
