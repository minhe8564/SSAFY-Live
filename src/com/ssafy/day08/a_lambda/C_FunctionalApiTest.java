package com.ssafy.day08.a_lambda;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public class C_FunctionalApiTest {
	private List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
	private Map<String, Integer> map = new HashMap<>(Map.of("hong", 100, "jang", 80, "lim", 95, "kim", 4));

	public void optTest1(String name) {
		if (name != null) {
			System.out.println(name + ": " + name.length());
		} else {
			System.out.println("null");
		}
	}

	// optional 사용, 더 효율적으로 사용 가능하다
	// null에 대한 대비 가능
	public void optTest2(Optional<String> name) {
		if (name.isPresent()) {
			System.out.println(name.get() + ": " + name.get().length());
		} else {
			System.out.println("null");
		}
	}

	public static void main(String[] args) {
		C_FunctionalApiTest fpt = new C_FunctionalApiTest();
//		fpt.consumerTest("hong");
//		fpt.supplierTest("hong");
//		fpt.functionTest();
//		fpt.operationTest();
		fpt.predicateTest();
//		fpt.optTest1(null);
	}

	public void consumerTest(String name) {
		// TODO: list와 map의 각 요소를 출력해보자. list는 단순 출력, map은 이름:점수 형태
		list.forEach(item -> System.out.println(item));
		map.forEach((k, v) -> System.out.println(k + ": " + v));
		// END

		Optional<Integer> optional = Optional.ofNullable(map.get(name));
		// TODO: map에서 name의 점수를 조회해서 값이 있을 80이상이면 우수, 미만이면 노력필요, 값 없으면 대상없음이라고 출력
		optional.ifPresentOrElse(
				score -> System.out.println(score >= 80 ? "우수" : "노력필요"),
				() -> System.out.println("대상없음")
		);
		// END
	}

	public void supplierTest(String name) {
		Optional<Integer> optional = Optional.ofNullable(map.get(name));
		// TODO: map에서 name의 성적을 조회하고 만약 score가 null이면 0~100 사이의 값을 설정해보자.
		int score = optional.orElseGet(() -> new Random().nextInt(101));
		System.out.println(name + "의 점수: " + score);
		// END
	}

	private Set<Integer> getLotto() {
		Set<Integer> set = new HashSet<>();
		Random rand = new Random();
		while (set.size() < 6) {
			set.add(rand.nextInt(45) + 1);
		}
		return set;
	}

	public void functionTest() {
		String name = "hong";
		// TODO: map에 name이 없었다면 score를 1로 추가하고 있었다면 +1 해주세요.(merge)
		map.merge(name, 1, (ov, nv) -> ov + nv);
		System.out.println(map);
		// END

		// TODO: map에 jang이 있다면 기존 점수에 100점을 더해서 값을 출력해주세요.
		map.computeIfPresent("jang", (k, v) -> v + 100);
		System.out.println(map);
		// END
	}

	public void operationTest() {
		// TODO: 위 배열의 요소를 2배씩으로 대체 하세요.
		list.replaceAll(n -> n * 2);
		// END
		System.out.println(list);
	}

	public void predicateTest() { // 많이 사용
		// TODO: map의 Entry 중 name이 3자 넘고 score가 90점 이상인 것들을 삭제 후 출력해보자.
		map.entrySet().removeIf(entry -> entry.getKey().length() > 3 
				&& entry.getValue() >= 90);
		// END
		System.out.println(map);
	}
}
