package com.kwave.java.exception;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[6];
		try {
			array[0] = 5;
			
			array[5] = 10;
			// 에러가 발생하더라도 결과값을 리턴해야한다.
//			array[6] = 11;
			
			
//			int x = 1/0;	// Exception은 에러가 발생하면 그 자리에서 프로그램을 멈춘다. 
							// - 다음에 에러가 있어도 거기까지 진행되지 않아 감지하지 못 함
//			String s = "a";	// "137"로 바꾸면 됨
//			int a = Integer.parseInt(s);
			
		} 
			catch (NumberFormatException e) {	// 새로운 오류가 늘어나면 catch를 늘려주면된다.
				// TODO: handle exception
//			String msg = e.toString();
//			System.out.println(msg);	// 프로그램을 진행하는데 영향을 미침
				e.printStackTrace();	// 프로그램을 진행하는데 영향을 미치지 않음
			}
		
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
//			String msg = e.toString();
//			System.out.println(msg);	// 프로그램을 진행하는데 영향을 미침
			e.printStackTrace();	// 프로그램을 진행하는데 영향을 미치지 않음
		}
		 catch (ArithmeticException e) {	// 새로운 오류가 늘어나면 catch를 늘려주면된다.
				// TODO: handle exception
//				String msg = e.toString();
//				System.out.println(msg);	// 프로그램을 진행하는데 영향을 미침
				e.printStackTrace();	// 프로그램을 진행하는데 영향을 미치지 않음
			}
		finally{
			System.out.println("다섯번째 값 = "+array[5]);
		}
		
		System.out.println("시스템이 완료되었습니다.");
	}

}
