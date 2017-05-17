package com.kwave.java.mybbs.view;

import java.util.Scanner;

import com.kwave.java.main.domain.Bbs;

// 글 쓰기
public class BbsInput {

	public Bbs process(Scanner scanner){	
		
		
		System.out.println("제목을 입력하세요");
		String title = scanner.nextLine();
		System.out.println("작성자를 입력하세요");
		String author = scanner.nextLine();
		System.out.println("내용을 입력하세요");
		String content = scanner.nextLine();
		
		
		
		Bbs bbs = new Bbs();
		bbs.setTitle(title);
		bbs.setAuthor(author);
		bbs.setContent(content);
//		bbs.setId(id);
		
		return bbs;
	}
	
}
