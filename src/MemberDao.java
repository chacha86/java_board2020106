import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MemberDao {
	private ArrayList<Member> members;
	private int no = 1;

	public MemberDao() {
		members = new ArrayList<>();
		Member m1 = new Member(1, "hong123", "h1234", "홍길동", Util.getCurrentDate());
		Member m2 = new Member(2, "lee123", "l1234", "이순신", Util.getCurrentDate());
		Member m3 = new Member(3, "kim123", "k1234", "김서방", Util.getCurrentDate());

		members.add(m1);
		members.add(m2);
		members.add(m3);
	}

	public void insertMember(Member m) {
		m.setId(no);
		no++;
		m.setRegDate(Util.getCurrentDate());

		members.add(m);
	}
	
	public Member getMemberById(int id) {
		for(int i = 0; i < members.size(); i++) {
			Member m = members.get(i);
			if(m.getId() == id) {
				return m;
			}
		}
		
		return null;
	}

	public Member getMemberByLoginIdAndLoginPw(String id, String pw) {
		
		for(int i = 0; i < members.size(); i++) {
			Member m = members.get(i);
			if(m.getLoginId().equals(id) && m.getLoginPw().equals(pw)) {
				return m;
			}
		}
		
		return null;
		
	}
}
