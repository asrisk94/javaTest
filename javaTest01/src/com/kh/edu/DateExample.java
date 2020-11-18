package com.kh.edu;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이트 클래스 객체 생성
	      Date d = new Date();
	   
	      String dateString = d.toString();
	      
	      // 출력 위치를 슬라이싱하여 필요한 자료만 뽑아 변수 생성
	      String year = dateString.substring(24);
	      String month = dateString.substring(4, 7);
	      String day = dateString.substring(8, 10);
	      
	      // 달은 영어로 표기되고 있으므로 스위치 케이스 문법을 이용하여 모든 달에 대해 숫자로 변환 
	      switch(month) {
	      case "Jan":
	    	  month = "1";
	    	  break;
	      case "Feb":
	    	  month = "2";
	    	  break;
	      case "Mar":
	    	  month = "3";
	    	  break;
	      case "Apr":
	    	  month = "4";
	    	  break;
	      case "May":
	    	  month = "5";
	    	  break;
	      case "Jun":
	    	  month = "6";
	    	  break;
	      case "Jul":
	    	  month = "7";
	    	  break;
	      case "Aug":
	    	  month = "8";
	    	  break;
	      case "Sep":
	    	  month = "9";
	    	  break;
	      case "Oct":
	    	  month = "10";
	    	  break;
	      case "Nov":
	    	  month = "11";
	    	  break;
	    	  default:
	    	  month = "12";
	      }
	      
	      
	      System.out.println(year+"/"+month+"/"+day);
	}

}
