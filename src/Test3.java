import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Article> articles = new ArrayList<Article>();
		Article article1 = new Article();
		article1.setId(1);
		article1.setTitle("제목1");
		article1.setBody("내용1");
		article1.setMid(1);
		article1.setRegDate("20200825");
		
		Article article2 = new Article();
		article2.setId(2);
		article2.setTitle("제목2");
		article2.setBody("내용2");
		article2.setMid(2);
		article2.setRegDate("20200825");
		
		Article article3 = new Article();
		article3.setId(3);
		article3.setTitle("제목3");
		article3.setBody("내용3");
		article3.setMid(3);
		article3.setRegDate("20200825");
		
		articles.add(article1);
		articles.add(article2);
		articles.add(article3);
		
		Sortor sortor = new Sortor();
		Comparator2 com = new Comparator2();
		sortor.sort(articles, com);
		
		for(int i = 0; i < articles.size(); i++) {
			System.out.println("번호 : " + articles.get(i).getId());
		}
		
	}
}

class Sortor {
	void sort(List<Article> arr, Comparator2 com) {
		for(int i = 0; i < arr.size() - 1; i++) { //n - 1 번
			for(int j = 0; j < arr.size() - 1; j++) {
				if(com.compare(arr.get(j), arr.get(j+1)) > 0) {
					Article tmp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j + 1, tmp);
				}
			}
		}
	}
}

interface ComparatorInterface {
	int compare(Article a1, Article a2);
}

class Comparator2 implements ComparatorInterface {
	public int compare(Article a1, Article a2) {
		if(a1.getId() < a2.getId()) {
			return 1;
		}
		return 0;
	}
}