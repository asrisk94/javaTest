package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.model.vo.Vvip;

public class MemberManager {
	
	private static final int MAX_VALUE = 10;
	
	public Silver[] s = new Silver[MAX_VALUE];
	public Gold[] g = new Gold[MAX_VALUE];
	public Vip[] v = new Vip[MAX_VALUE];
	public Vvip[] vv = new Vvip[MAX_VALUE];
	
	
	
	public void silverInsert(Silver s) {	// 실버 입력
		
		for(int i=0; i<MAX_VALUE; i++) {
			if(this.s[i] == null) {
				this.s[i] = s;
				break;
			}
		}
	}
	public void goldInsert(Gold g) {
		for(int i=0; i<MAX_VALUE; i++) {	// 골드 입력
			if(this.g[i] == null) {
				this.g[i] = g;
				break;
			}
		}	
	}
	public void vipInsert(Vip v) {			// vip 입력
		for(int i=0; i<MAX_VALUE; i++) {
			if(this.v[i] == null) {
				this.v[i] = v;
				break;
			}
		}	
	}
	public void VvipInsert(Vvip vv) {		// vvip 입력
		for(int i=0; i<MAX_VALUE; i++) {
			if(this.vv[i] == null) {
				this.vv[i] = vv;
				break;
			}
		}	
	}
	
	
	
	public void printData() {
		System.out.println("-----------------------<<회원 정보>>-----------------------");
		System.out.println("이름\t\t등급\t\t포인트\t\t이자포인트");
		System.out.println("-------------------------------------------------------");
		
		printSilver();		// 메소드별로 분리
		printGold();
		printVip();
		printVvip();
		
	}
	
	
	
	public void printSilver() {				// 실버 출력
		for(int i=0; i<s.length; i++) {
			if(s[i] == null) break;
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n", 
					s[i].getName(), s[i].getGrade(), s[i].getPoint(), s[i].getInterPoint());
		}
	}
	public void printGold() {				// 골드 출력
		for(int i=0; i<g.length; i++) {
			if(g[i] == null) break;
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n", 
					g[i].getName(), g[i].getGrade(), g[i].getPoint(), g[i].getInterPoint());
		}
	}
	public void printVip() {				// vip 출력
		for(int i=0; i<v.length; i++) {
			if(v[i] == null) break;
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n", 
					v[i].getName(), v[i].getGrade(), v[i].getPoint(), v[i].getInterPoint());
		}
	}
	public void printVvip() {				// vvip 출력
		for(int i=0; i<vv.length; i++) {
			if(vv[i] == null) break;
			System.out.printf("%s\t\t%s\t\t%d\t\t%.2f%n", 
					vv[i].getName(), vv[i].getGrade(), vv[i].getPoint(), vv[i].getInterPoint());
		}
	}

}
