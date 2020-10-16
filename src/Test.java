import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String title = "";
		String body = "";
		
		while(true) {
			System.out.print("명령어 입력 : ");
			String cmd = sc.next();
			if(cmd.equals("exit")) {
				System.out.println("종료");
				break;
			}
			if(cmd.equals("add")) {
				
				System.out.println("게시물 제목을 입력해주세요 :");
				title = sc.next();
				System.out.println("게시물 내용을 입력해주세요 :");
				body = sc.next();
				System.out.println("게시물이 등록되었습니다.");
			}
			if(cmd.equals("list")) {
				System.out.println("제목 : " + title);
				System.out.println("내용 : " + body);
			}
			
		}
		
		
	}

}
