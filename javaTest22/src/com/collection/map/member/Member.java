package com.collection.map.member;

import java.util.Objects;

public class Member {
	
	private String userId;		// 유저 id
	private String userPwd;		// 유저 password
	private String userName;	// 유저 이름
	private int age;			// 유저 나이
	private String phoneNumber;	// 유저 폰번호
	
	
	
	public Member() { super(); }
	public Member(String userId, String userPwd, String userName, int age, String phoneNumber) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.phoneNumber = phoneNumber;				// 생성자
	}
	
	
	
	public String getUserId() {					// 겟셋 메소드
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}											// 겟셋 메소드
	
	
	
	@Override
	public boolean equals(Object o) {		// equals 객체 오버라이딩
		
		if(this == o) return true;
		
		if(o == null) return false;
		
		if(!(o instanceof Member)) return false;
		
		Member other = (Member)o;
		if(age != other.age) return false;
		
		
		
		if(userId == null) {
			if(other.userId != null) return false;
		} else {
			if(!userId.equals(other.userId)) return false;
		}
		
		if(userPwd == null) {
			if(other.userPwd != null) return false;
		} else {
			if(!userPwd.equals(other.userPwd)) return false;
		}
		
		if(userName == null) {
			if(other.userName != null) return false;
		} else {
			if(!userName.equals(other.userName)) return false;
		}
		
		if(phoneNumber == null) {
			if(other.phoneNumber != null) return false;
		} else {
			if(!phoneNumber.equals(other.phoneNumber)) return false;
		}
		
		return true;
	}	// equals 괄호
	
	
	
	@Override
	public int hashCode() {		// hashcode 오버라이딩
		return Objects.hash(userId, userPwd, userName, age, phoneNumber);
	}
	
	
	
	@Override
	public String toString() {		// toString 오버라이딩
		return "Member [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", age=" + age
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
}
