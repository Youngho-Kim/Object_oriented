package com.kwave.java.mybbs.view;

import java.util.ArrayList;

import com.kwave.java.main.domain.Bbs;

// ȭ�� �Է� �� ���
public class BbsList {
//	// ����Ʈ���� ������ �����
//	ArrayList<Bbs> datas = new ArrayList<>();	// ��Ͽ� ��Ÿ�� ������ ���� - id, ����, �۾��� ��
//	
	
	
	// ��� ���
	public void showList(ArrayList<Bbs> datas){
		for(Bbs bbs : datas){
			// ID | ���� | �ۼ��� | ��¥ | ��ȸ��|
			System.out.print(bbs.getId()+" | ");
			System.out.print(bbs.getTitle()+" | ");
			System.out.print(bbs.getAuthor()+" | ");
			System.out.print(bbs.getDate()+" | ");
			System.out.print(bbs.getView()+" | ");
		}
	}
	
	// ���� �̵�
	public void goInput(){
		
		
	}
	

	
	// �˻�
	public void search(String word){
		
	}
	
	
	// ����
	public void goDelete(){
		
	}
	
}
