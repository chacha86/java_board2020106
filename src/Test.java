import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Article> articles = new ArrayList<>();

		int no = 1;

		while (true) {
			System.out.print("명령어 입력 : ");
			String cmd = sc.next();
			if (cmd.equals("exit")) {
				System.out.println("종료");
				break;
			}
			if (cmd.equals("add")) {
				
				Article a = new Article();
			
				a.setId(no);
				no++;
				System.out.println("게시물 제목을 입력해주세요 :");
				String title = sc.next();
				a.setTitle(title);

				System.out.println("게시물 내용을 입력해주세요 :");
				String body = sc.next();
				a.setBody(body);
				
				articles.add(a);
				System.out.println("게시물이 등록되었습니다.");

			}
			if (cmd.equals("list")) {
				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);
					System.out.println("번호 : " + article.getId());
					System.out.println("제목 : " + article.getTitle());
					System.out.println("내용 : " + article.getBody());
					System.out.println("===================");
				}

			}
			if (cmd.equals("update")) {

				System.out.println("수정할 게시물 선택 : ");
				int targetId = sc.nextInt();

				for (int i = 0; i < articles.size(); i++) {
					
//					Article article = articles.get(i);
//					int id = article.getId();
					
					int id = articles.get(i).getId();
					
					if (id == targetId) {
						System.out.println("게시물 제목을 입력해주세요 :");
						String newTitle = sc.next();

						System.out.println("게시물 내용을 입력해주세요 :");
						String newBody = sc.next();

						Article newArticle = new Article();
						newArticle.setId(id);
						newArticle.setTitle(newTitle);
						newArticle.setBody(newBody);
						
						articles.set(i, newArticle);
						break;
					}
				}
			}
			if (cmd.equals("delete")) {
				System.out.print("몇번 게시물을 지우시겠습니까 :");
				int targetId = sc.nextInt();
				int existFlag = 2;// 1. 있음 2. 없음
				
				for (int i = 0; i < articles.size(); i++) {
					int id = articles.get(i).getId();
					if (id == targetId) {
						existFlag = 1;
						articles.remove(i);
						break;
					} 
				}
				
				if(existFlag == 2) {
					System.out.println("게시물이 존재하지 않습니다.");					
				} else {
					System.out.println(targetId + "번 게시물이 삭제되었습니다.");					
				}
				
			}
		}
	}
}
