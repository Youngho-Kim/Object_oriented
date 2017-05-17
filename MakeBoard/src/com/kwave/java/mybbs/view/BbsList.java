package com.kwave.java.mybbs.view;

import java.util.ArrayList;

import com.kwave.java.main.domain.Bbs;

// 화면 입력 및 출력
public class BbsList {
//	// 리스트에서 보여줄 저장소
//	ArrayList<Bbs> datas = new ArrayList<>();	// 목록에 나타낼 값들을 넣음 - id, 제목, 글쓴이 등
//	
	
	
	// 목록 출력
	public void showList(ArrayList<Bbs> datas){
		for(Bbs bbs : datas){
			// ID | 제목 | 작성자 | 날짜 | 조회수|
			System.out.print(bbs.getId()+" | ");
			System.out.print(bbs.getTitle()+" | ");
			System.out.print(bbs.getAuthor()+" | ");
			System.out.print(bbs.getDate()+" | ");
			System.out.print(bbs.getView()+" | ");
		}
	}
	
	// 쓰기 이동
	public void goInput(){
		
		
	}
	

	
	// 검색
	public void search(String word){
		
	}
	
	
	// 삭제
	public void goDelete(){
		
	}
	
}
