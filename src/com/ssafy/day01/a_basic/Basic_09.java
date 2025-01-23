package com.ssafy.day01.a_basic;

public class Basic_09 {
	public static void main(String[] args) {
		switchSimple();

		switchCalendar();
		switchExpression();

		switchString();
	}

	private static void switchSimple() {
		int num = 3;

		switch (num) {
		case 1:
			System.out.println(num);
		case 2:
			System.out.println(num);
		case 3:
			System.out.println(num); // 여기서 부터 시작~
		case 4:
			System.out.println(num);
		case 5:
			break; // ~여기서 종료
		case 6:
			break;
		default:
			System.out.println(num);
		}
	}

	private static void switchCalendar() {
		System.out.println("달력 출력 1");
		int month = 2;
		int day = -1;
		// TODO: 월별 날의 수가 정확히 출력되도록 수정해보자. 단, 2월은 29일가지로 한다.
		switch (month) {
			case 2:
				day = 29; break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30; break;
			default:
				day = 31;
		}
		// END
		System.out.printf("%d월은 %d까지 있다.%n", month, day);
	}

	/**
	 * 문자열을 활용한 switch case 문장 주의 사항
	 * String에 null 값 들어갈 수 없다
	 */
	private static void switchString() {

		// String arg = null;
		String arg = new String("A");
		switch (arg) {
		case "A":
			System.out.println("A");
			break;
		default:
			System.out.println("default");
			break;
		}
	}

	private static void switchExpression() {
		System.out.println("달력 출력 1");
		int month = 2;
		// TODO: 위 switchCalendar을 switchExpression 형태로 변경해보자.
//		int day = -1;
//		switch (month) {
//			case 2:
//				day = 29;
//				break;
//			case 4:
//			case 6:
//			case 9:
//			case 11:
//				day = 30;
//				break;
//			default:
//				day = 31;
//		}
		
		// switch Expression
		int day = switch (month) {
			case 2 -> 29;
			case 4, 6, 9, 11 -> 30;
			default -> {
				yield 31;
			}
		};
		
		// END
		System.out.printf("%d월은 %d까지 있다.%n", month, day);

	}

}
