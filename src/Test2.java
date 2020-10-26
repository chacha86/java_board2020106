public class Test2 {
	public static void main(String[] args) {
		
		//게시물 제목
		String str = "사과(apple) 가격은 개당 1,000원 입니다.";

		System.out.println(str.contains("aaa")); 
		// contains 사용
		if (str.contains("aaa")) {// 검색키워드와 비교
			System.out.println("contain - 포함");
		} else {
			System.out.println("contain - 미포함");
		}

		System.out.println(str.contains("APPLE")); // false
		System.out.println(str.contains("apple")); // true
	}
}