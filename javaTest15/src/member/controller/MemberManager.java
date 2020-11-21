package member.controller;

import member.model.vo.Member;



public class MemberManager {
	
	private static final int MAX_PERSON = 40;
	
	Member[] mb = new Member[MAX_PERSON];
	
	
	
	public void insertMember(Member m) {
		for(int i=0; i<MAX_PERSON; i++) {
			if(mb[i] == null) {
				mb[i] = m;
				break;
			}
		}
	}
	
	
	
	public void printData() {
		System.out.println("--------------------명단--------------------");

		for(int i=0; i<MAX_PERSON; i++) {
			if(mb[i] == null) {
				break;
			}
			System.out.println(mb[i].toString() + ", " + mb[i].interPoint());
		}
		
	}

}
