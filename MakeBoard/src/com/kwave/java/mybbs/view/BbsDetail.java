package com.kwave.java.mybbs.view;

import com.kwave.java.main.domain.Bbs;

// �󼼺���
public class BbsDetail {
	public void showNo(long id){
		System.out.println("�۹�ȣ : "+id);
	}
	public void showTitle(String title){
		System.out.println("���� : "+title);
	}
	public void showAuthor(String author){
		System.out.println("�۾��� : "+author);
	}
	public void showDate(String date){
		System.out.println("��¥ : "+date);
	}
	public void showCount(int view){
		System.out.println("��ȸ�� : "+view);
	}
	public void showContent(String content){
		System.out.println("����"+content);
	}
	
	
	
	public void showDetail(Bbs bbs){
		
		System.out.println("����"+bbs.getTitle());
		System.out.println("�ۼ���"+bbs.getAuthor());
		System.out.println("�ۼ�����"+bbs.getDate());
		System.out.println("��ȸ��"+bbs.getView());
		System.out.println(bbs.getContent());
	}
	
	public void endDtail(){	// ���� �Ʒ��� ������ �׾��ش�.
		System.out.println("-----------------------------------------------------");
	}
}
