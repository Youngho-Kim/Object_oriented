package com.kwave.java.extend;

import com.kwave.java.extend.city.Police;
import com.kwave.java.extend.city.hospital.Doctor;
import com.kwave.java.extend.city.hospital.Hospital;
import com.kwave.java.extend.city.hospital.Nurse;
import com.kwave.java.extend.city.hospital.Patient;
import com.kwave.java.obj.Father;
import com.kwave.java.obj.Son;


public class ExtendMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Father fa = new  Father();  // 부모클래스의 속성을 가진 객체를 만듬
//		fa.lastname = "조던";			// 부모클래스 객체에서 lastname을 가져와 사용 
//		fa.name = "마이클";			// 부모클래스 객체에서 name을 가져와 사용
//		fa.car = "람보르기니";			// 부모클래스 객체에서 car를 가져와 사용
//		fa.money = 1000000000;		// 부모클래스 객체에서 money를 가져와 사용
//		fa.process();				// 부모클래스 객체에서 process메소드를 가져와 사용
		
		
		
//		Son son = new Son();		// 부모클래스의 속성을 가진 객체를 만듬
//		System.out.println(son.wife);
//		System.out.println(son.car);
//		
//		son.lastname = "조던";		// 아들클래스 객체에서 lastname을 가져와 사용
//		son.name = "쥬니어";			// 아들클래스 객체에서 name을 가져와 사용
//		son.car = "람보르기니";		// 아들클래스 객체에서 car를 가져와 사용
//		son.money = 1000000000;		// 아들클래스 객체에서 mone를 가져와 사용
//		son.wife = "Soyeon";		// 부모클래스에서 상속받은 아들 객체에서 wife를 가져와 사용
//		son.girlfriend = "Soyeon";	// 아들클래스 객체에서 girlfriend를 가져와 사용
//		System.out.println(son.wife);
//		System.out.println(son.car);
//		
//		son.goDestination();		// 아들클래스 객체에서 goDestination메소드를 가져와 사용
		
		
////////////////////////////////////////////////////////////////////////////////////		
		
		
		Police police = new Police();	// Police 클래스의 속성을 가진 Police 객체를 만듬	
		police.color = "파란색";			// police클래스 객체에서 color을 가져와 사용
		police.floor = "2F";			// police클래스 객체에서 floor을 가져와 사용
		
		
////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		// 병원을 하나 만들고
		Hospital hospital = new Hospital();
		
		
		// 간호사 6명 - 각각 다른 방향으로 한번씩 움직인다.
		Nurse nurse[] = new Nurse[6];	// 간호사 6명 생성
		for(int c = 0; c<nurse.length;c++)
		{
//			System.out.print(c+"번 간호사가 ");
			nurse[c] = new Nurse();		// nurse[c]에 Nurse 클래스의 속성 저장
			nurse[c].move_nurse((c+1)+"번 간호사가 ");	
			// Nurse 클래스에서 move_nurse를 가져와 사용
		}

			System.out.println(); // 위 아래 구분을 위한 띄어쓰기.
		//환자 21명 
			Patient patient[] = new Patient[21];	// 환자 21명 생성
			
				for(int i=0;i<patient.length;i++)
				{
					
					patient[i] = new Patient();		// patient[i]에 Patient 클래스의 속성 저장
					patient[i].setName((i+1)+"번 환자");// Patient 클래스에서 setName를 가져와 사용
//					System.out.println(patient[i]);
				}

		
				// 의사를 3명
				Doctor doctor[] = new Doctor[3];	// 의사 3명 생성
				
		// 각 의사가 환자를 7명씩 진찰하는 프로글매을 작성하세요
				for(int a=0;a<doctor.length;a++)
				{
					doctor[a] = new Doctor();		// doctor[a]에 Doctor 클래스의 속성 저장
					for(int b = 0; b<patient.length/doctor.length;b++)
					{ // 각 의사당 환자 7명씩 진찰
						System.out.print((a+1)+ "번 의사가 ");
						doctor[a].diagnosis(patient[b]);// Doctor 클래스에서 diagnosis를 가져와 사용
//					System.out.println(patient[i]);
						
					}
				}

		
		

		
		
		
		
		
		
	}


	
}
