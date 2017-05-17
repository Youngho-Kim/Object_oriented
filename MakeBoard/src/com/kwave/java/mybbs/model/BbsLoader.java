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

// ���� ����̺꿡 ���� �а� ����
public class BbsLoader {

	final String DATABASENAME = "mybbs1.txt";	// ���ϸ�
	final String DATABASE_DIR = "E:/workspaces/eclipse_java/Object_oriented/MakeBoard/src/com/kwave/java/mybbs/model/";
	// ������
	final String COLUMNG_SEPERATOR = "@";	// ��ĭ����
	final String RECORD_SEPERATOR = "/r/n";	// ���ٴ���
	/**
	 *  ����ҿ��� �����͸� �о��
	 * @return		��ȯ���� ���� ����
	 */
	
		public ArrayList<Bbs> read(){	// ����ҿ��� �о����
			ArrayList<Bbs> result = new ArrayList<>();
			
			// TODO ����
			// 1. ���� ���� ���� �˻�
			File database = new File(DATABASE_DIR + DATABASENAME);
			if(database.exists()){
				// 2. ������ ������ �о �ٴ����� Bbs�� �����ϰ�
				// 2-1 ���Ͽ� ���븦 �ȾƼ� ���� �غ� �Ѵ�.
				BufferedReader br;
				try {
//					FileInputStream fos = new FileInputStream(database);
					br = new BufferedReader(		// 3. ���۸� �����(�ѹ��� �뷮�� �����͸� �о���δ�) -  ���ְ� ������ �����͸� �д´�
							new InputStreamReader(	// 2. ���� Ŭ���������ش�(�ΰ����� ����). ĳ���ͼ��� �������ִ� ����
									new FileInputStream(database),"UTF-8"));	// 1. ��Ʈ�� ���� - �������� �����ؼ� �ѱ��ھ� �о���δ�. 				 

					String temp = "";
					while((temp = br.readLine()) != null){	// �ٴ����� ������ �о�ͼ� 
						String[] bbsTemp = temp.split(COLUMNG_SEPERATOR);
						// Bbs�� ���
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
				
				// �ϼ��� Bbs�� �ٽ� result�� add�Ѵ�.(�ݺ�)
			}
			
			
			return result;
		}
		
		/**
		 * ����ҿ� �����͸� ����
		 * @param value		�ؽ�Ʈ ������
		 */
		public void write(Bbs bbs){	// ���� ���� �� - �ǽð����� ���� �����
				// bbs�� �ִ� �����͸� �ؽ�Ʈ ���Ͽ� ����
				// 1. �ؽ�Ʈ ������ �ִ��� �˻��ϰ� ������ ����
			File dir = new File(DATABASE_DIR);
			if(!dir.exists()){
				dir.mkdirs();	// �˻��� ��λ��� ��� ���丮�� �������ش�.
			}
			
				// 1-1. ������ ���� 
					File database = new File(DATABASE_DIR+DATABASENAME);
					if(!database.exists()){
						try {
							database.createNewFile();
							
						} catch (IOException e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
					

				// 2. bbs�� ������ database ���Ͽ� ������ �Ѵ�
					
					
					
					
				// 2-1. ���� �����ϴ� �������� ������ �����ؾ��Ѵ�.
					
					
					
					
				// 2-1-1 �����ڸ� �����Ѵ�.
					
					
					
					
				// 2.2 bbs�� ������ Ⱦ���� ��ģ��.
		   String oneData = bbs.getId() + COLUMNG_SEPERATOR + 
							bbs.getTitle() + COLUMNG_SEPERATOR + 
							bbs.getAuthor() + COLUMNG_SEPERATOR + 
							bbs.getDate() + COLUMNG_SEPERATOR + 
							bbs.getView() + COLUMNG_SEPERATOR + 
							bbs.getContent() +RECORD_SEPERATOR;
				// 3. Ⱦ���� ������ �����͸� ������ ���� �������ٿ� �����Ѵ�.
				// 3-1 FileWriter ��ü�� ����ؼ� ���� �����Ϳ� ��� ���ؾ���
					Path path = Paths.get(DATABASE_DIR, DATABASENAME);
					
					try {
						
//						FileWriter writer = new FileWriter(database, true);	// �ι�° ���ڰ� append �� ����Ұ����� ����
						Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(database),"UTF-8"));
						
						writer.append(oneData);	// 
						writer.close();	// �ʼ�!!
					} catch (IOException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public void write1(Bbs bbs){	// ������ ���� ��. - �迭 ���� arrayList�� �ö󰡸� ���� �����
			// bbs�� �ִ� �����͸� �ؽ�Ʈ ���Ͽ� ����
			// 1. �ؽ�Ʈ ������ �ִ��� �˻��ϰ� ������ ����
		File dir = new File(DATABASE_DIR);
		if(!dir.exists()){
			dir.mkdirs();	// �˻��� ��λ��� ��� ���丮�� �������ش�.
		}
		
			// 1-1. ������ ���� 
				File database = new File(DATABASE_DIR+DATABASENAME);
				if(!database.exists()){
					try {
						database.createNewFile();
						
					} catch (IOException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				

			// 2. bbs�� ������ database ���Ͽ� ������ �Ѵ�
				
				
				
				
			// 2-1. ���� �����ϴ� �������� ������ �����ؾ��Ѵ�.
				
				
				
				
			// 2-1-1 �����ڸ� �����Ѵ�.
				
				
				
				
			// 2.2 bbs�� ������ Ⱦ���� ��ģ��.
	   String oneData = bbs.getId() + COLUMNG_SEPERATOR + 
						bbs.getTitle() + COLUMNG_SEPERATOR + 
						bbs.getAuthor() + COLUMNG_SEPERATOR + 
						bbs.getDate() + COLUMNG_SEPERATOR + 
						bbs.getView() + COLUMNG_SEPERATOR + 
						bbs.getContent() +RECORD_SEPERATOR;
			// 3. Ⱦ���� ������ �����͸� ������ ���� �������ٿ� �����Ѵ�.
			// 3-1 JAVA 7�������� ������ �ٷ�� ���ο� API�� Path�� FILES�� �����Ѵ�.
				Path path = Paths.get(DATABASE_DIR, DATABASENAME);
				
				try {
					
					Files.write(path, oneData.getBytes());
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		
		
	}
}
