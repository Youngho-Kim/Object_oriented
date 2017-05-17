package com.kwave.java.mybbs.view;

import com.kwave.java.main.domain.Bbs;

// 상세보기
public class BbsDetail {
	public void showNo(long id){
		System.out.println("글번호 : "+id);
	}
	public void showTitle(String title){
		System.out.println("제목 : "+title);
	}
	public void showAuthor(String author){
		System.out.println("글쓴이 : "+author);
	}
	public void showDate(String date){
		System.out.println("날짜 : "+date);
	}
	public void showCount(int view){
		System.out.println("조회수 : "+view);
	}
	public void showContent(String content){
		System.out.println("내용"+content);
	}
	
	
	
	public void showDetail(Bbs bbs){
		
		System.out.println("제목"+bbs.getTitle());
		System.out.println("작성자"+bbs.getAuthor());
		System.out.println("작성일자"+bbs.getDate());
		System.out.println("조회수"+bbs.getView());
		System.out.println(bbs.getContent());
	}
	
	public void endDtail(){	// 가장 아래에 밑줄을 그어준다.
		System.out.println("-----------------------------------------------------");
	}
}
