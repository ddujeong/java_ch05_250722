package chapter05_03;

public class Enum01 {
	
	enum Gender {
		MALE, FEMALE
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender g = Gender.FEMALE;
		
		if (g == Gender.MALE) {
			System.out.println("나는 남성입니다.");
		} else {
			System.out.println("나는 여성입니다.");
		}
		
		
	}

}
