package com.kwave.java.mybbs.presenter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.kwave.java.main.domain.Bbs;
import com.kwave.java.mybbs.model.BbsLoader;
import com.kwave.java.mybbs.view.BbsDetail;
import com.kwave.java.mybbs.view.BbsInput;
import com.kwave.java.mybbs.view.BbsList;

// ��� ���� ó��
public class BbsPresenter {

	final boolean START = true;
	final boolean FINISH = false;
	
		boolean runFlag =  START;
	
		// ������ �ӽ� �����
		ArrayList<Bbs> datas;// ��Ͽ� ��Ÿ�� ������ ���� - id, ����, �۾��� ��
		Scanner scanner;
		BbsInput input;
		BbsList list;
		BbsDetail detail;
		BbsLoader bbsloader;
		long number = 0;
		
		public BbsPresenter(){	// ������
			init();
		}
		
		/**
		 * �ʱ�ȭ �Լ�, ����� ��ü���� �̸� �޸𸮿� �ε��صд�
		 */
		private void init(){	// �ʱ�ȭ �Լ�
			scanner = new Scanner(System.in);
			input = new BbsInput();	
			datas = new ArrayList<>();
			list = new BbsList();
			detail = new BbsDetail();
			bbsloader = new BbsLoader();
		}
		public void start(){	// ���� ȭ�� �� ���� ó��
			while(runFlag){
				System.out.println("��ɾ �Է��ϼ���");
				System.out.println("|l.��� | w. �۾��� | r. �󼼺���|");
				String command = scanner.nextLine();
				switch(command){
				case "l": 
					datas = bbsloader.read();
					list.showList(datas);
					break;
				case "w": 	// �۾���
//					list.showList(datas);
						write();
					break;
				case "r": //	 �󼼺���
					goDetail();
					
					break;
					
				case "a": 
//					bbsloader.read();
					// 
					
					break;
				}
			}
		}
		
		public void write(){
//			datas.add(input.process(scanner));
			Bbs bbs = input.process(scanner);
//			int number = datas.size()+1;	// array list�� �迭 ���� ���ϱ�
//			number +=1;			// id
			
			number = bbsloader.readCount();
			
			bbs.setId(number);	// �� ��ȣ
			bbs.setDate(""+getDate());	// ��¥
			
			bbsloader.write(bbs);
			
			
			datas.add(bbs);	// �Է��� bbs�� ��ü�� arrayList�� ����
			
		}
		
		private String getDate(){
			SimpleDateFormat sdf = new SimpleDateFormat("yy�� mm�� dd�� HH�� MM�� ss��");	// ���� �ý��� ���� �ð� ǥ�� ��ü ����
			String date = sdf.format(System.currentTimeMillis());	// ���� �ð� ���� ����
			return date;
		}
		
		// �󼼺��� �̵� : ����� �־�� �װ��� �޾Ƽ� �󼼺��⿡ ����
		public void goDetail(){
			System.out.println("�۹�ȣ�� �Է��ϼ���");
			String temp = scanner.nextLine();
			long id = Long.parseLong(temp);
			for(Bbs bbs : datas){
				if(bbs.getId() == id){
					
					detail.showNo(bbs.getId());
					detail.showTitle(bbs.getTitle());
					detail.showAuthor(bbs.getAuthor());
					detail.showDate(bbs.getDate());
					detail.showCount(bbs.getView());
					detail.showContent(bbs.getContent());
					detail.endDtail();	// ���� �Ʒ��� ������ �׾��ش�.
					
					break;	// ���ǹ��� ���յǸ� �ݺ����� �����Ѵ�
				}
			}
			
		}
		
		
		
		
		public void end(){
			runFlag = FINISH;
		}
}
