package com.kwave.java.main.domain;

// 데이터 구조 정의
public class Bbs {

	private long id;			// 도메인, 모델, 데이터
	private String title;		// 제목
	private String content;		// 내용
	private String author;		// 글쓴이
	private String date;		// 날짜
	private int view;			// 조회수
	
	// getter, setter 만들기
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	
	
	
	
}
