package com.kwave.java.exception;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[6];
		try {
			array[0] = 5;
			
			array[5] = 10;
			// ������ �߻��ϴ��� ������� �����ؾ��Ѵ�.
//			array[6] = 11;
			
			
//			int x = 1/0;	// Exception�� ������ �߻��ϸ� �� �ڸ����� ���α׷��� �����. 
							// - ������ ������ �־ �ű���� ������� �ʾ� �������� �� ��
//			String s = "a";	// "137"�� �ٲٸ� ��
//			int a = Integer.parseInt(s);
			
		} 
			catch (NumberFormatException e) {	// ���ο� ������ �þ�� catch�� �÷��ָ�ȴ�.
				// TODO: handle exception
//			String msg = e.toString();
//			System.out.println(msg);	// ���α׷��� �����ϴµ� ������ ��ħ
				e.printStackTrace();	// ���α׷��� �����ϴµ� ������ ��ġ�� ����
			}
		
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
//			String msg = e.toString();
//			System.out.println(msg);	// ���α׷��� �����ϴµ� ������ ��ħ
			e.printStackTrace();	// ���α׷��� �����ϴµ� ������ ��ġ�� ����
		}
		 catch (ArithmeticException e) {	// ���ο� ������ �þ�� catch�� �÷��ָ�ȴ�.
				// TODO: handle exception
//				String msg = e.toString();
//				System.out.println(msg);	// ���α׷��� �����ϴµ� ������ ��ħ
				e.printStackTrace();	// ���α׷��� �����ϴµ� ������ ��ġ�� ����
			}
		finally{
			System.out.println("�ټ���° �� = "+array[5]);
		}
		
		System.out.println("�ý����� �Ϸ�Ǿ����ϴ�.");
	}

}
