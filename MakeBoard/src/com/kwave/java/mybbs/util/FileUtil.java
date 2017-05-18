package com.kwave.java.mybbs.util;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	// �Ӽ��� ���� ��ɸ� �ִ� �͵��� ����
	

	public static void makeDirectoryIfNotExist(String dirPath){
		File dir = new File(dirPath);
		if(!dir.exists()){
			dir.mkdirs();	// �˻��� ��λ��� ��� ���丮�� �������ش�.
		}
	}
	
	
	public static File getFile(String path) {
		File database = new File(path);	// ����ִ� ���� ��ü
		if(!database.exists()){
			makeFile(database);
			database = new File(path);	// ���� �Էµ� ���� ��ü�� return���� �Ѱ��ֱ� ���� 
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
