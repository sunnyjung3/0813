package board;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {

	ArrayList<Member> members = new ArrayList<>();
	Scanner s = new Sanner(System.in);
	
	void docommand(String cmd) {
		if (cmd.equals("signup")) {

			Member member = new Member();
			
			lastusernumber++;
			
			int usernum = 1;
			
			member.setlastuernumber();
			
	
			member.setUserNumber(loinId);

			System.out.println("아이디를 입력해주세요");
			member.setLoginId(sc.nextLine());

			System.out.println("비밀번호를 입력해주세요");
			member.setLoginPw(sc.nextLine());

			System.out.println("이름을 입력해주세요");
			member.setUserName(sc.nextLine());

			members.add(member);

	}

}
