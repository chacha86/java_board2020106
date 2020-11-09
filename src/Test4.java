import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		
		ArrayList<Article> articles = new ArrayList<>();
		
		for(int i = 1; i <= 50 ; i++) {
			Article a1 = new Article();
			a1.setId(i);
			a1.setTitle("제목" + i);
			a1.setBody("내용" + i);
			
			articles.add(a1);
		}
		
		Scanner sc = new Scanner(System.in);
		int currentPageNo = 16; // 현재 페이지
		int totalCntOfItems = articles.size(); // 전체 게시물 개수
		int startPageNo = 1; // 시작 페이지 번호
		int itemsCntPerPage = 3; // 페이지당 출력 게시물 개수
		int pageCntPerBlock = 5; // 한 페이지 블록 당 페이지 개수
		int endPageNo = (int)Math.ceil((double)totalCntOfItems / itemsCntPerPage); // 마지막 페이지 번호
		int currentPageBlock = (int)Math.ceil((double)currentPageNo / pageCntPerBlock) ; // 현재 페이지 블록
		
		int startPageNoInBlock = (currentPageBlock - 1) * pageCntPerBlock + 1 ; // 현재 페이지 블록의 시작 페이지 번호
		int endPageNoInBlock = startPageNoInBlock + pageCntPerBlock - 1;// // 현재 페이지 블록의 마지막 페이지 번호
		
		// 현재 페이지가 시작페이지보다 작으면 안됨
		if (startPageNoInBlock < startPageNo) {
			startPageNoInBlock = startPageNo;
		}
		
		// 현재 페이지가 마지막페이지보다 크면 안됨
		if (endPageNoInBlock > endPageNo) {
			endPageNoInBlock = endPageNo; 
		}
		
		// 해당 페이지의 게시물 목록의 첫 인덱스
		int startIndex = (currentPageNo - 1) * itemsCntPerPage;
		
		// 해당 페이지의 게시물 목록의 마지막 인덱스
		int endIndex = startIndex + itemsCntPerPage;
		
		// 페이지의 마지막 인덱스가 저장소의 마지막 인덱스보다 크면 안됨
		if(endIndex > totalCntOfItems) {
			endIndex = totalCntOfItems;
		}
		// 페이지별 게시물 출력
		for(int i = startIndex; i < endIndex; i++) {
			System.out.println("번호 : " + articles.get(i).getId());
			System.out.println("제목 : " + articles.get(i).getTitle());
			System.out.println("내용 : " + articles.get(i).getBody());
			System.out.println("======================================");
		}
		
		for(int i = startPageNoInBlock ; i <= endPageNoInBlock; i++ ) {
			
			if(i == currentPageNo) {
				System.out.print("[" + i+ "] ");
			} else {
				System.out.print(i+ " ");
			}
		}
	}

}
