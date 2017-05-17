package com.kwave.java.mybbs;

import java.util.Scanner;

import com.kwave.java.mybbs.presenter.BbsPresenter;

public class MybbsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		내가 한것. 일단 수업중이므로 강사님 것으로 먼저 하기
		String name;
		int number = 0;
		System.out.println("안녕하세요. 게시판입니다.");
		System.out.print("이름을 입력해주세요");
		Scanner scan = new Scanner(System.in);
		name = scan.next();
		System.out.println("---------------------------------------------");
		
		System.out.println(name + "님 안녕하세요.");
		System.out.println("원하시는 기능을 입력해주세요.");
		System.out.println("----------");
		System.out.println("1. 목록보기");
		System.out.println("2. 글 쓰기");
		System.out.println("3. 상세보기");
		System.out.println("4. 수정하기");
		System.out.println("5. 삭제하기");
		System.out.println("6. 끝내기");
		System.out.println("---------");
		
		
		
		Scanner scan1 = new Scanner(System.in);
		number = scan1.nextInt();
		
		switch (number)
		  {
		  case 1 :		// 목록 보기
		   System.out.println("목록보기~");
		  break;

		  case 2 :		// 글쓰기
		   System.out.println("글쓰기");
		  break;

		  case 3 :		// 상세 보기
		   System.out.println("상세보기");
		  break;

		  case 4 :		// 수정하기
		   System.out.println("수정하기");
		  break;

		  case 5 :		// 삭제하기
		   System.out.println("삭제하기");
		  break;
		  
		  case 6 :		// 끝내기
			   System.out.println("끝내기");
			  break;
			  

		  } 
*/

		
		BbsPresenter presenter = new BbsPresenter();
		presenter.start();
		
		
		
		
		
		
	}

}
