package com.kwave.java.mybbs.presenter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.kwave.java.main.domain.Bbs;
import com.kwave.java.mybbs.model.BbsLoader;
import com.kwave.java.mybbs.view.BbsDetail;
import com.kwave.java.mybbs.view.BbsInput;
import com.kwave.java.mybbs.view.BbsList;

// 모든 로직 처리
public class BbsPresenter {

	final boolean START = true;
	final boolean FINISH = false;
	
		boolean runFlag =  START;
	
		// 데이터 임시 저장소
		ArrayList<Bbs> datas;// 목록에 나타낼 값들을 넣음 - id, 제목, 글쓴이 등
		Scanner scanner;
		BbsInput input;
		BbsList list;
		BbsDetail detail;
		BbsLoader bbsloader;
		long number = 0;
		
		public BbsPresenter(){	// 생성자
			init();
		}
		
		/**
		 * 초기화 함수, 사용할 객체들을 미리 메모리에 로드해둔다
		 */
		private void init(){	// 초기화 함수
			scanner = new Scanner(System.in);
			input = new BbsInput();	
			datas = new ArrayList<>();
			list = new BbsList();
			detail = new BbsDetail();
			bbsloader = new BbsLoader();
		}
		public void start(){	// 시작 화면 및 로직 처리
			while(runFlag){
				System.out.println("명령어를 입력하세요");
				System.out.println("|l.목록 | w. 글쓰기 | r. 상세보기|");
				String command = scanner.nextLine();
				switch(command){
				case "l": 
					datas = bbsloader.read();
					list.showList(datas);
					break;
				case "w": 	// 글쓰기
//					list.showList(datas);
						write();
					break;
				case "r": //	 상세보기
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
//			int number = datas.size()+1;	// array list의 배열 길이 구하기
//			number +=1;			// id
			
			number = bbsloader.readCount();
			
			bbs.setId(number);	// 글 번호
			bbs.setDate(""+getDate());	// 날짜
			
			bbsloader.write(bbs);
			
			
			datas.add(bbs);	// 입력한 bbs값 전체를 arrayList에 저장
			
		}
		
		private String getDate(){
			SimpleDateFormat sdf = new SimpleDateFormat("yy년 mm월 dd일 HH시 MM분 ss초");	// 현재 시스템 내의 시간 표시 객체 생성
			String date = sdf.format(System.currentTimeMillis());	// 현재 시간 갖고 오기
			return date;
		}
		
		// 상세보기 이동 : 목록이 있어야 그것을 받아서 상세보기에 넣음
		public void goDetail(){
			System.out.println("글번호를 입력하세요");
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
					detail.endDtail();	// 가장 아래에 밑줄을 그어준다.
					
					break;	// 조건문에 부합되면 반복문을 중지한다
				}
			}
			
		}
		
		
		
		
		public void end(){
			runFlag = FINISH;
		}
}
