import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] titles = new String[10];
		String[] bodies = new String[10];
		int size = 0;

		while (true) {
			System.out.print("명령어 입력 : ");
			String cmd = sc.next();
			if (cmd.equals("exit")) {
				System.out.println("종료");
				break;
			}
			if (cmd.equals("add")) {

				System.out.println("게시물 제목을 입력해주세요 :");
				titles[size] = sc.next();
				System.out.println("게시물 내용을 입력해주세요 :");
				bodies[size] = sc.next();
				System.out.println("게시물이 등록되었습니다.");
				size++;
			}
			if (cmd.equals("list")) {
				for (int i = 0; i < size; i++) {
					System.out.println("제목 : " + titles[i]);
					System.out.println("내용 : " + bodies[i]);
					System.out.println("===================");
				}

			}

		}

	}

}
