package com.kwave.java.mybbs.model;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.kwave.java.main.domain.Bbs;

// 로컬 드라이브에 글을 읽고 쓰기
public class BbsLoader {

	final String DATABASENAME = "mybbs1.txt";	// 파일명
	final String DATABASE_DIR = "E:/workspaces/eclipse_java/Object_oriented/MakeBoard/src/com/kwave/java/mybbs/model/";
	// 구분자
	final String COLUMNG_SEPERATOR = "@";	// 한칸단위
	final String RECORD_SEPERATOR = "/r/n";	// 한줄단위
	/**
	 *  저장소에서 데이터를 읽어옴
	 * @return		반환값에 대한 설명
	 */
	
		public ArrayList<Bbs> read(){	// 저장소에서 읽어오기
			ArrayList<Bbs> result = new ArrayList<>();
			
			// TODO 로직
			// 1. 파일 존재 유무 검사
			File database = new File(DATABASE_DIR + DATABASENAME);
			if(database.exists()){
				// 2. 있으면 파일을 읽어서 줄단위로 Bbs에 저장하고
				// 2-1 파일에 빨대를 꽂아서 읽을 준비를 한다.
				BufferedReader br;
				try {
//					FileInputStream fos = new FileInputStream(database);
					br = new BufferedReader(		// 3. 버퍼를 씌운다(한번에 대량의 데이터를 읽어들인다) -  밥주걱 단위로 데이터를 읽는다
							new InputStreamReader(	// 2. 래퍼 클래스씌워준다(부가적인 동작). 캐릭터셋을 변경해주는 역할
									new FileInputStream(database),"UTF-8"));	// 1. 스트림 생성 - 숫가락을 생성해서 한글자씩 읽어들인다. 				 

					String temp = "";
					while((temp = br.readLine()) != null){	// 줄단위로 파일을 읽어와서 
						String[] bbsTemp = temp.split(COLUMNG_SEPERATOR);
						// Bbs에 담고
						Bbs bbs = new Bbs();
						bbs.setId(Long.parseLong(bbsTemp[0]));
						bbs.setTitle(bbsTemp[1]);
						bbs.setAuthor(bbsTemp[2]);
						bbs.setDate(bbsTemp[3]);
						bbs.setView(Integer.parseInt(bbsTemp[4]));
						bbs.setContent(bbsTemp[5]);
						result.add(bbs);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// 완성된 Bbs를 다시 result에 add한다.(반복)
			}
			
			
			return result;
		}
		
		/**
		 * 저장소에 데이터를 저장
		 * @param value		텍스트 데이터
		 */
		public void write(Bbs bbs){	// 새로 만든 것 - 실시간으로 파일 입출력
				// bbs에 있는 데이터를 텍스트 파일에 저장
				// 1. 텍스트 파일이 있는지 검사하고 없으면 생성
			File dir = new File(DATABASE_DIR);
			if(!dir.exists()){
				dir.mkdirs();	// 검사한 경로상의 모든 디렉토리를 생성해준다.
			}
			
				// 1-1. 없으면 생성 
					File database = new File(DATABASE_DIR+DATABASENAME);
					if(!database.exists()){
						try {
							database.createNewFile();
							
						} catch (IOException e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
					

				// 2. bbs에 내용을 database 파일에 저장을 한다
					
					
					
					
				// 2-1. 먼저 저장하는 데이터의 구조를 설계해야한다.
					
					
					
					
				// 2-1-1 구분자를 정의한다.
					
					
					
					
				// 2.2 bbs의 내용을 횡으로 펼친다.
		   String oneData = bbs.getId() + COLUMNG_SEPERATOR + 
							bbs.getTitle() + COLUMNG_SEPERATOR + 
							bbs.getAuthor() + COLUMNG_SEPERATOR + 
							bbs.getDate() + COLUMNG_SEPERATOR + 
							bbs.getView() + COLUMNG_SEPERATOR + 
							bbs.getContent() +RECORD_SEPERATOR;
				// 3. 횡으로 펼쳐진 데이터를 파일의 제일 마지막줄에 저장한다.
				// 3-1 FileWriter 객체를 사용해서 기존 데이터에 계속 더해쓴다
					Path path = Paths.get(DATABASE_DIR, DATABASENAME);
					
					try {
						
//						FileWriter writer = new FileWriter(database, true);	// 두번째 인자가 append 를 허용할것인지 여부
						Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(database),"UTF-8"));
						
						writer.append(oneData);	// 
						writer.close();	// 필수!!
					} catch (IOException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public void write1(Bbs bbs){	// 기존에 만든 것. - 배열 값이 arrayList에 올라가면 파일 입출력
			// bbs에 있는 데이터를 텍스트 파일에 저장
			// 1. 텍스트 파일이 있는지 검사하고 없으면 생성
		File dir = new File(DATABASE_DIR);
		if(!dir.exists()){
			dir.mkdirs();	// 검사한 경로상의 모든 디렉토리를 생성해준다.
		}
		
			// 1-1. 없으면 생성 
				File database = new File(DATABASE_DIR+DATABASENAME);
				if(!database.exists()){
					try {
						database.createNewFile();
						
					} catch (IOException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				

			// 2. bbs에 내용을 database 파일에 저장을 한다
				
				
				
				
			// 2-1. 먼저 저장하는 데이터의 구조를 설계해야한다.
				
				
				
				
			// 2-1-1 구분자를 정의한다.
				
				
				
				
			// 2.2 bbs의 내용을 횡으로 펼친다.
	   String oneData = bbs.getId() + COLUMNG_SEPERATOR + 
						bbs.getTitle() + COLUMNG_SEPERATOR + 
						bbs.getAuthor() + COLUMNG_SEPERATOR + 
						bbs.getDate() + COLUMNG_SEPERATOR + 
						bbs.getView() + COLUMNG_SEPERATOR + 
						bbs.getContent() +RECORD_SEPERATOR;
			// 3. 횡으로 펼쳐진 데이터를 파일의 제일 마지막줄에 저장한다.
			// 3-1 JAVA 7버전부터 파일을 다루는 새로운 API인 Path와 FILES를 제공한다.
				Path path = Paths.get(DATABASE_DIR, DATABASENAME);
				
				try {
					
					Files.write(path, oneData.getBytes());
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		
		
	}
}
