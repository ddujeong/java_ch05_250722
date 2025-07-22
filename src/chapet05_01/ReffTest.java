package chapet05_01;

import java.util.Arrays;

public class ReffTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] numArr1 = null;
		// stack 영역에만 생성되고 heap 영역에는 번지수가 없는 상태
		// numArr1[0] =100;
		// NullPointException error -> 번지수가 없으니 존재하지 않음
		
		int[] numArr1 = null;
		int[] numArr2 = {10, 20, 30, 40, 50};
		numArr1 = numArr2;
		// 참조하는 번지수만 복사하게 됨(얕은 복사)
		// heap 영역에 복사 XXX
		
		numArr2[2] = 700;
		// numArr1[2] = 700
		
		System.out.println(numArr1[3]);
		// 40
		
		System.out.println(System.identityHashCode(numArr1));
		System.out.println(System.identityHashCode(numArr2));
		// hash 값이 같아짐
		
		System.out.println("========================================");
		
		int[] numArr3 = null;
		int[] numArr4 = {100, 200, 300};
		numArr3 = Arrays.copyOf(numArr4, 3);
		// 새로운 배열을 생성 (깊은 복사)
		numArr4[2] = 600;
		// numArr3[2] = 300
		for (int num : numArr3) {
			System.out.println(num);
			// 100, 200, 300
		}
		System.out.println(System.identityHashCode(numArr3));
		System.out.println(System.identityHashCode(numArr4));
		// 새로운 hash 값 생성
		
		
		String str = null;
		str = "kor";
		
		String str2 = "kor";
		str2 = null;
		// 쓸모 없어진 "kor" 은 자동 삭제됨 (garbage collector)
		System.out.println(str2);
		
	}

}
