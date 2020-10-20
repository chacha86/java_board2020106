import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ids = new ArrayList<>();
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<String> bodies = new ArrayList<>();
		int size = 0;
		int no = 1;

		while (true) {
			System.out.print("명령어 입력 : ");
			String cmd = sc.next();
			if (cmd.equals("exit")) {
				System.out.println("종료");
				break;
			}
			if (cmd.equals("add")) {
				ids.add(no);
				no++;
				System.out.println("게시물 제목을 입력해주세요 :");
				String title = sc.next();
				titles.add(title);
				System.out.println("게시물 내용을 입력해주세요 :");
				String body = sc.next();
				bodies.add(body);
				System.out.println("게시물이 등록되었습니다.");
				size++;
			}
			if (cmd.equals("list")) {
				for (int i = 0; i < size; i++) {
					System.out.println("번호 : " + ids.get(i));
					System.out.println("제목 : " + titles.get(i));
					System.out.println("내용 : " + bodies.get(i));
					System.out.println("===================");
				}

			}
			if(cmd.equals("update")) {
				
				System.out.println("수정할 게시물 선택 : ");
				int targetId = sc.nextInt();
				
				for(int i = 0; i < ids.size(); i++) {
					int id = ids.get(i);
					if(id == targetId) {
						System.out.println("게시물 제목을 입력해주세요 :");
						String newTitle = sc.next();
						
						System.out.println("게시물 내용을 입력해주세요 :");
						String newBody = sc.next();
						
						titles.set(i, newTitle);
						bodies.set(i, newBody);
						break;
					}
				}
			}
		}
	}
}
