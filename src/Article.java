
public class Article {
	
	private int id;
	private String title;
	private String body;
	private String regDate;
	private String nickname;
	private int hit;
	
	
	public Article() {
		
	}
	
	public Article(int id, String title, String body, String nickname, String regDate) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.regDate = regDate;
		this.nickname = nickname;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getPropertiesByFlag(int flag) {
		String str = "";
		if(flag == 1) {
			 str = this.getTitle(); 
		} else if(flag == 2) {
			str = this.getBody();
		} else if(flag == 3) {
			str = this.getTitle() + this.getBody(); 
		} else {
			str = this.getNickname();
		}
		
		return str;
	}
}
