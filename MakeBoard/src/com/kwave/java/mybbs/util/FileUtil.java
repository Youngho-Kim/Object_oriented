package com.kwave.java.mybbs.util;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	// 속성은 없고 기능만 있는 것들을 모음
	

	public static void makeDirectoryIfNotExist(String dirPath){
		File dir = new File(dirPath);
		if(!dir.exists()){
			dir.mkdirs();	// 검사한 경로상의 모든 디렉토리를 생성해준다.
		}
	}
	
	
	public static File getFile(String path) {
		File database = new File(path);	// 비어있는 파일 객체
		if(!database.exists()){
			makeFile(database);
			database = new File(path);	// 새로 입력된 파일 객체를 return으로 넘겨주기 위해 
		}
		return database;
	}
	
	public static void makeFile(File database) {
		try {
			database.createNewFile();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
}
