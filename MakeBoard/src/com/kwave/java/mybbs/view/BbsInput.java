package com.kwave.java.mybbs.view;

import java.util.Scanner;

import com.kwave.java.main.domain.Bbs;

// �� ����
public class BbsInput {

	public Bbs process(Scanner scanner){	
		
		
		System.out.println("������ �Է��ϼ���");
		String title = scanner.nextLine();
		System.out.println("�ۼ��ڸ� �Է��ϼ���");
		String author = scanner.nextLine();
		System.out.println("������ �Է��ϼ���");
		String content = scanner.nextLine();
		
		
		
		Bbs bbs = new Bbs();
		bbs.setTitle(title);
		bbs.setAuthor(author);
		bbs.setContent(content);
//		bbs.setId(id);
		
		return bbs;
	}
	
}
